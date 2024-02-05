package ozdaldw.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ozdaldw.weather.entity.Weather;
import ozdaldw.weather.repository.WeatherRepository;

import java.text.SimpleDateFormat;

@Service
public class WeatherService {

    private final WeatherRepository weatherRepository;

    @Autowired
    public WeatherService(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    @Value("${weather.api.url}")
    private String apiUrl;

    @Value("${weather.api.key}")
    private String apiKey;


    public Weather fetchAndSaveWeatherData(String city) {
  //      System.out.println("Fetching weather data for city: " + city);
        String fullUrl = apiUrl + "?q=" + city + "&appid=" + apiKey;

        // Use RestTemplate to fetch data from OpenWeatherMap
        RestTemplate restTemplate = new RestTemplate();
        OpenWeatherMapResponse response = restTemplate.getForObject(fullUrl, OpenWeatherMapResponse.class);
        // Map OpenWeatherMap response to your Weather entity
        Weather weather = new Weather();
        weather.setCity(response.getName());
        weather.setDescription(response.getWeather().get(0).getDescription());
        weather.setTemperature(response.getMain().getTemp() - 273);
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
        weather.setTimestamp(timeStamp);

        // Save weather data to the database
        weatherRepository.save(weather);
        System.out.println("OpenWeatherMap API Response: " + response.getName());
        System.out.println("Weather Description: " + response.getWeather().get(0).getDescription());
        System.out.println("Temperature: " + weather.getTemperature());

        //       System.out.println("Weather data fetched successfully");
        return weather;
    }




}
