package com;

public class Weather {
    private WeatherNow weatherNow;
    private WeatherStatusNow weatherStatusNow;
    private WeatherInfluence weatherInfluence;

    public Weather(WeatherNow weatherNow , WeatherStatusNow weatherStatusNow){
        this.weatherNow = weatherNow;
        this.weatherStatusNow = weatherStatusNow;
    }

    public String getWeatherNow(){
        return this.weatherNow.getWeatherNow();
    }

    public String getWeatherStatusNow(){
        return this.weatherStatusNow.getWeatherStatusNow();
    }

    public void changeWeatherNow(WeatherNow weatherNow){
        System.out.println(this.weatherNow.getWeatherNow() + " сменяется на " + weatherNow.getWeatherNow());
        this.weatherNow = weatherNow;
    }

    public void changeWeatherStatusNow(WeatherStatusNow weatherStatusNow){
        WeatherStatusNow pastWeatherStatusNow = this.weatherStatusNow;
        this.weatherStatusNow = weatherStatusNow;
        System.out.println(pastWeatherStatusNow.getWeatherStatusNow() + " " + this.weatherNow.getWeatherNow()
                + " сменяется на " + this.weatherStatusNow.getWeatherStatusNow() + " " + this.weatherNow.getWeatherNow());
    }

    public void changeWeatherInfluence(WeatherInfluence weatherInfluence){
        this.weatherInfluence = weatherInfluence;
        //System.out.println(this.getName() + " теперь испытывает " + this.weatherInfluence.getWeatherInfluence());
    }

    public void WeatherActionFor(Korotyshka korotyshka){
        System.out.println(this.weatherStatusNow.getWeatherStatusNow() + " " + this.weatherNow.getWeatherNow()
                + " " + this.weatherInfluence.getWeatherInfluence() + " влияет на персонажа " + korotyshka.getName());
    }
}
