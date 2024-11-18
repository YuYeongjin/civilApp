package app.civil.civilapp.connection;

import app.civil.civilapp.dto.weather.WeatherContents;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.nio.charset.Charset;

@Slf4j
@RequiredArgsConstructor
public class WeatherGovernmentApi {
    private final ObjectMapper objectMapper;


    // WebUI Login

    public Object getBlockWithAPI(String primaryServerUri, String api, String path, Class<?> clazz) {
try{


        String res = WeatherWebClient.createWithAPI(primaryServerUri, api)
                .get()
                .uri(path)
                .retrieve()
                .bodyToMono(String.class)
                .map(body -> new String(body.getBytes(Charset.forName("ISO-8859-1")), Charset.forName("EUC-KR"))) // Decode EUC-KR

                .block()
                ;
        return objectMapper.readValue(res, WeatherContents.class);
}catch (Exception e){
    e.printStackTrace();
    return null;
}
     }


}
