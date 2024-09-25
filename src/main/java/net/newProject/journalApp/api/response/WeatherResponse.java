package net.newProject.journalApp.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WeatherResponse{
    public Current current;

    @Getter
    @Setter
    public class Current{

        private int temperature;

        @JsonProperty("weather_descriptions")   //imp, cuz json returns snake case and in java its good practice
        private List<String> weatherDescriptions;  // to use camel case,therefore we need to inform json while parsing

        private int feelslike;
    }
}


//Steps: For making this oop schema type of API to handle json, do following:
// Basically, first check the api content, then copy the api content which will be in json.
// Convert the json into pojo (Plain old java object) using any json to pojo online convertor.
// It will give you a class structured that maps the attributes of json.
// But note that, there will be multiple classes created as per json, so the main class will be "root".
// Copy all other class into root class, and make attributes present in each class as private.
// Change the name of root class with your current class.
// And use the elements that are needed, no need to parse whole json unless needed.




