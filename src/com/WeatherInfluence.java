package com;

public enum WeatherInfluence {
    FAVOURABLY("благоприятно"),
    BADLY("плохо"),
    DEPRESSINGLY("удручающе"),
    WELL("хорошо"),
    WONDERFUL("чудесно"),
    DISGUSTING("ужасно"),
    WHATEVER("никак не");

    private final String weatherInfluence;

    WeatherInfluence(String weatherInfluence){
        this.weatherInfluence = weatherInfluence;
    }

    public String getWeatherInfluence(){
        return weatherInfluence;
    }
}
