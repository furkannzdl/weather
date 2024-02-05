package ozdaldw.weather.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ozdaldw.weather.entity.Weather;
import ozdaldw.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private final WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/{city}")
    @ResponseBody
    public Weather getWeather(@PathVariable String city) {
        return weatherService.fetchAndSaveWeatherData(city);
    }

    @GetMapping("/")
    public String home() {
        return "index"; // Assuming you have an "index.html" file in src/main/resources/templates
    }




}
