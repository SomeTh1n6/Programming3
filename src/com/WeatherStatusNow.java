package com;

public enum WeatherStatusNow {
    TERRIBLE("жуткий(ая)"),
    PlEASANT("приятный(ая)"),
    WARM("теплый(ая)"),
    DULL("пасмурный(ая)"),
    WINDY("ветренный(ая)"),
    RAINY("дождливый(ая)"),
    INCLEMENT("ненастный(ая)");

    private final String weatherStatusNow;

    WeatherStatusNow(String weatherStatusNow){
        this.weatherStatusNow = weatherStatusNow;
    }

    public String getWeatherStatusNow(){
        return weatherStatusNow;
    }
}
