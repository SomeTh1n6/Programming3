package com;

public enum FlashlightStatusNow {
    ON("включен"),
    OFF("выключен");

    private final  String status;

    FlashlightStatusNow(String status){
        this.status = status;
    }

    public String getStatusFlashlightNow(){
        return status;
    }
}
