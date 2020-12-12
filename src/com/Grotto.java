package com;

public class Grotto extends Place{
    private final String name = "Грот";

    public String getName(){
        return this.name;
    }

    public Grotto(StatusGrotto statusGrottoFirst, StatusGrotto statusGrottoSecond, StatusGrotto statusGrottoThird){
        this.statusGrottoFirst = statusGrottoFirst;
        this.statusGrottoSecond = statusGrottoSecond;
        this.statusGrottoThird = statusGrottoThird;
    }

    private StatusGrotto statusGrottoFirst;
    private StatusGrotto statusGrottoSecond;
    private StatusGrotto statusGrottoThird;

    public String getStatusGrottoFirst(){
        return this.statusGrottoFirst.getStatusGrotto();
    }

    public String getStatusGrottoSecond(){
        return  this.statusGrottoSecond.getStatusGrotto();
    }

    public String getStatusGrottoThird(){
        return  this.statusGrottoThird.getStatusGrotto();
    }

    public void changeStatusGrottoFirst(StatusGrotto statusGrottoFirst){
        this.statusGrottoFirst = statusGrottoFirst;
        System.out.println(this.getName() + " теперь " + statusGrottoFirst.getStatusGrotto());
    }

    public void changeStatusGrottoSecond(StatusGrotto statusGrottoSecond){
        this.statusGrottoSecond = statusGrottoSecond;
        System.out.println(this.getName() + " теперь еще " + statusGrottoSecond.getStatusGrotto());
    }

    public void changeStatusGrottoThird(StatusGrotto statusGrottoThird){
        this.statusGrottoThird = statusGrottoThird;
        System.out.println(this.getName() + " теперь еще " + statusGrottoThird.getStatusGrotto());
    }

}
