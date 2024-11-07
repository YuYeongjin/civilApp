package app.civil.civilapp.connection;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WeatherGovernmentApi {

    // WebUI Login

    public static Object getBlockWithAPI(String primaryServerUri, String api, String path, Class<?> clazz) {
        return NetBackupWebClient.createWithAPI(primaryServerUri, api)
                .get()
                .uri(path)
                .retrieve()
                .bodyToMono(clazz)
                .block()
                ;
    }


}
