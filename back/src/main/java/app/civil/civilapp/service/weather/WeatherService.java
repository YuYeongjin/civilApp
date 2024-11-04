package app.civil.civilapp.service.weather;

import java.util.Map;

public interface WeatherService {
    Map<String,String> main();

    Map<String,String> getInfo();
}
