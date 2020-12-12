package com;

public enum StatusFlashlight {
    ELECTRIC("электрический"),
    OIL("маслянный"),
    GAS("газовый"),
    MERCURIAL("ртутный"),
    NEON("неоновый"),
    UNKNOWN("неизвестный");

    private final  String status;

    StatusFlashlight(String status){
        this.status = status;
    }

    public String getStatusFlashlight(){
        return status;
    }
}
