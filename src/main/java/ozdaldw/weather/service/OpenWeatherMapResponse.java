package ozdaldw.weather.service;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class OpenWeatherMapResponse {

    private String name;

    private List<WeatherInfo> weather;

    private MainInfo main;

    // Getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<WeatherInfo> getWeather() {
        return weather;
    }

    public void setWeather(List<WeatherInfo> weather) {
        this.weather = weather;
    }

    public MainInfo getMain() {
        return main;
    }

    public void setMain(MainInfo main) {
        this.main = main;
    }

    public static class WeatherInfo {
        private String description;

        // Getters and setters

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    public static class MainInfo {
        private Double temp;

        // Getters and setters

        public Double getTemp() {
            return temp;
        }

        public void setTemp(Double temp) {
            this.temp = temp;
        }
    }
}
