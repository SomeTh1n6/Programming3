package com;

public enum WeatherNow {
    FRESH("прохлада"),
    FROST("холод"),
    SNOWFALL("снегопад"),
    RAIN("дождь"),
    HEAT("жара"),
    SUNNY("солнечно");

    private final String weatherNow;

    WeatherNow(String weatherNow){
        this.weatherNow = weatherNow;
    }

    public String getWeatherNow(){
        return weatherNow;
    }
}
