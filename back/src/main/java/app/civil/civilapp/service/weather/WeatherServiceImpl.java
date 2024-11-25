package app.civil.civilapp.service.weather;

import app.civil.civilapp.util.WeatherAPI;
import app.civil.civilapp.util.WeatherConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Value("${weather.authKey}")
    private String authKey;

    @Override
    public Map<String, String> main() {
        Map<String,String> result=new HashMap<>();

        result.put("result","ok");
        return result;
    }

    @Override
    public Map<String, String> getInfo() {
        Map<String,String> result=new HashMap<>();

        Map<String, String> test = new  HashMap<>();

        String tm = "202411040900"; // 년월일시분
        String stn = ""; // 지점번호 0이거나 없으면 전체지점
        String help = "0"; // 1이면 DTO 값 도움말 표시
        test.put("test" ,WeatherAPI.getGroundInfo(tm, stn, help,authKey));

        System.out.println(test);
        System.out.println(        WeatherConverter.convert(test));
        result.put("result","ok");
        return result;
    }
}
