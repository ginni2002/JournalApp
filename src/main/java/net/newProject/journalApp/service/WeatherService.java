package net.newProject.journalApp.service;

import net.newProject.journalApp.api.response.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherService {
    private static final String apiKey = "9bb759cb94850e3be1296696bf676d50";

    private static final String API = "http://api.weatherstack.com/current?access_key=API_KEY&query=CITY";

    @Autowired
    private RestTemplate restTemplate;

    public WeatherResponse getWeather(String city){
        String finalAPI = API.replace("CITY", city).replace("API_KEY",apiKey);
       ResponseEntity<WeatherResponse> response = restTemplate.exchange(finalAPI, HttpMethod.GET, null, WeatherResponse.class);
        // The process of converting json to java object is called deserialization like parsing.
        // Similarly pojo to json is called serialization
      return response.getBody();
    }
}
