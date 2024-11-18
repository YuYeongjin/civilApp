package app.civil.civilapp.connection;


import app.civil.civilapp.connection.meta.dto.ConfigMeta;
import app.civil.civilapp.connection.meta.dto.InMemoryMetaConfig;
import io.netty.channel.ChannelOption;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.WriteTimeoutHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.*;

import reactor.netty.http.client.HttpClient;
import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.TimeUnit;


@Slf4j
public class WeatherWebClient {
    private static HttpHeaders createHeadersWithAPI(String api) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", "application/json");
        headers.add("Content-Type", "application/json");
        return headers;
    }

    private static HttpHeaders createHeadersWithAuth(String type, String bearer) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", "application/vnd.weather+json;version=11.0");
        headers.add("Content-Type", "application/vnd.weather+json;version=11.0");
        headers.add("Authorization", String.format("%s %s", type, bearer));

        return headers;
    }

    private static HttpHeaders createHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", "application/json");
        headers.add("Content-Type", "application/json");
        return headers;
    }

    private static HttpClient httpOptions() {
        SslContext context = null;
        try {
            context = SslContextBuilder.forClient()
                    .trustManager(InsecureTrustManagerFactory.INSTANCE)
                    .build();
        } catch (Exception e) {
            e.printStackTrace();
        }

        int timeout = Integer.parseInt(timeoutConfig.getValue());

        return HttpClient.create()
       //         .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, timeout)
                .responseTimeout(Duration.ofSeconds(15))
                .secure(t -> t.sslContext(finalContext))
                .doOnConnected(conn -> {
                    conn.addHandlerLast(new ReadTimeoutHandler(timeout, TimeUnit.MILLISECONDS));
                    conn.addHandlerLast(new WriteTimeoutHandler(timeout, TimeUnit.MILLISECONDS));
                })
                .disableRetry(true)
                .doOnRequestError((req, err) -> log.error("request Error : {}", err.getMessage()))
                .doOnResponseError((res, err) -> log.error("response Error : {}", err.getMessage()))
                ;
    }

    private static ExchangeStrategies setStrategies() {
        return ExchangeStrategies.builder()
                .codecs(config -> config.defaultCodecs().maxInMemorySize(16 * 1024 * 1024))
                .build();
    }

    public static WebClient createWithAPI(String primaryServer, String api) {
        return WebClient.builder()
                .baseUrl(primaryServer)
                .defaultHeaders(it -> it.addAll(createHeadersWithAPI(api)))
                .filter(((request, next) -> {
                    log.info(">> {} : {}", request.method(), request.url());
                    log.info(">> {}", request.headers());
                    if ( request.method() == HttpMethod.POST) {
                        log.info(">> {}", request.body());
                    }
                  return next.exchange(request);
                }))
                .exchangeStrategies(setStrategies())
                .clientConnector(new ReactorClientHttpConnector(httpOptions()))
                .build();
    }

    public static WebClient create(String primaryServer) {
        return WebClient.builder()
                .baseUrl(primaryServer)
                .defaultHeaders(it -> it.addAll(createHeaders()))
                .filter(((request, next) -> {
                    log.info(">> {} : {}", request.method(), request.url());
                    log.info(">> {}", request.headers());
                    return next.exchange(request);
                }))
                .exchangeStrategies(setStrategies())
                .clientConnector(new ReactorClientHttpConnector(httpOptions()))
                .build();
    }

    public static WebClient createWithAuth(String primaryServer, String type, String bearer) {
        return WebClient.builder()
                .baseUrl(primaryServer)
                .defaultHeaders(it -> it.addAll(createHeadersWithAuth(type, bearer)))
                .filter(((request, next) -> {
                    log.info(">> {} : {}", request.method(), request.url());
                    log.info(">> {}", request.headers());
                    return next.exchange(request);
                }))
                .exchangeStrategies(setStrategies())
                .clientConnector(new ReactorClientHttpConnector(httpOptions()))
                .build();
    }
}
