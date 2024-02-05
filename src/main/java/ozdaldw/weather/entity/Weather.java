package ozdaldw.weather.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Weather {

    @Id
    private long id;
    private String city;
    private String description;
    private Double temperature;
    private String timestamp;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTemperature() {
        return temperature.intValue();
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }



}
