package app.civil.civilapp.util;

import app.civil.civilapp.connection.WeatherGovernmentApi;
import app.civil.civilapp.connection.WeatherWebClient;
import app.civil.civilapp.dto.weather.WeatherContents;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
public class WeatherAPI {
    private final ObjectMapper objectMapper = new ObjectMapper();
    public WeatherContents parseWeatherJson(String json) throws Exception {
        return objectMapper.readValue(json, WeatherContents.class);
    }
    public static String getGroundInfo(String tm, String stn, String help,String authKey ) {
   //     String path =  "api/typ01/url/kma_sfctm2.php?tm="+tm+"&stn="+stn+"&help="+help+"&authKey="+authKey;
        String path = "https://apihub.kma.go.kr/api/typ01/url/kma_sfctm2.php?tm="+tm+"&stn="+stn+"&help="+help+"&authKey="+authKey;
        System.out.println("PATH : "+path);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(path, String.class);
       // WeatherContents weather = restTemplate.getForObject(path, WeatherContents.class);
        /*
        WeatherContents weather = (WeatherContents) WeatherGovernmentApi.getBlockWithAPI("https://apihub.kma.go.kr/","https://apihub.kma.go.kr/"+path,path,WeatherContents.class);
        System.out.println(WeatherGovernmentApi.getBlockWithAPI("https://apihub.kma.go.kr/","https://apihub.kma.go.kr/"+path,path,String.class));
       System.out.println("@@@@@@@@@@@@@@@@@@@2");
        System.out.println(weather);

         */

        return response.getBody();
    }

}

