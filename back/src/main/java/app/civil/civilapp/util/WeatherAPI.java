package app.civil.civilapp.util;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
public class WeatherAPI {

    public static String getGroundInfo(String tm, String stn, String help,String authKey ) {
        String path = "https://apihub.kma.go.kr/api/typ01/url/kma_sfctm2.php?tm="+tm+"&stn="+stn+"&help="+help+"&authKey="+authKey;
        System.out.println("PATH : "+path);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(path, String.class);

        return response.getBody();
    }
}
