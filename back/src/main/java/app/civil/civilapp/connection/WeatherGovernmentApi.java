package app.civil.civilapp.connection;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WeatherGovernmentApi {

    // WebUI Login

    public static Object getBlockWithAPI(String primaryServerUri, String api, String path, Class<?> clazz) {
        return WeatherWebClient.createWithAPI(primaryServerUri, api)
                .get()
                .uri(path)
                .retrieve()
                .bodyToMono(clazz)
                .block()
                ;
    }


}
