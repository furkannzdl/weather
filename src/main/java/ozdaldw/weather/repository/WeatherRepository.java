package ozdaldw.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ozdaldw.weather.entity.Weather;

public interface WeatherRepository extends JpaRepository<Weather, Long> {
}
