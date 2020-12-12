package com;

public class Road {
    private final String Name = "Дорога";
    private StatusRoad statusRoadFirst;
    private StatusRoad statusRoadSecond;

    public Road(StatusRoad statusRoadFirst, StatusRoad statusRoadSecond){
        this.statusRoadFirst = statusRoadFirst;
        this.statusRoadSecond = statusRoadSecond;
    }

    public String getName(){
        return this.Name;
    }

    public String getStatusRoadFirst(){
        return this.statusRoadFirst.getStatusRoad();
    }

    public String getStatusRoadSecond(){
        return  this.statusRoadSecond.getStatusRoad();
    }

    public void changeStatusRoadFirst(StatusRoad statusRoadFirst){
        this.statusRoadFirst = statusRoadFirst;
        System.out.println(this.getName() + " теперь " + statusRoadFirst.getStatusRoad());
    }

    public void changeStatusRoadSecond(StatusRoad statusRoadSecond){
        this.statusRoadSecond = statusRoadSecond;
        System.out.println(this.getName() + " теперь еще и " + statusRoadSecond.getStatusRoad());
    }

    public void goOnTheRoad(Korotyshka korotyshka){
        korotyshka.goAhead();
        System.out.println(" по " +
               statusRoadFirst.getStatusRoad() + " и " + statusRoadSecond.getStatusRoad() + " " + this.getName());
    }
}
