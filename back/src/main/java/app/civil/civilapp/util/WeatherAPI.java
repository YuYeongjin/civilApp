package app.civil.civilapp.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class WeatherAPI {


    @Value("${weather.authKey}")
    private static String authKey;

    public static String getGroundInfo() {
        String path = "https://apihub.kma.go.kr/api/typ01/url/kma_sfctm2.php?tm=202211300900&stn=0&help=0&authKey="+authKey;



        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(path, String.class);



        return response.getBody();
    }
}
