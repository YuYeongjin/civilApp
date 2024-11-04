package app.civil.civilapp.controller.weather;

import app.civil.civilapp.service.weather.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weather")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;


    @PostMapping("/getInfo")
    public ResponseEntity<?> getInfo(){
        return ResponseEntity.ok(weatherService.getInfo());
    }
}
