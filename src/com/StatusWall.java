package com;

public enum StatusWall {
    UNKNOWN("неизвестная"),
    LEFT("левая"),
    RIGHT("правая"),
    BACK("задняя"),
    FRONT("передняя");

    private final  String statusWall;

    StatusWall(String statusWall){
        this.statusWall = statusWall;
    }

    public String getStatusWall(){
        return statusWall;
    }
}
