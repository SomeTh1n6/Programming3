package com;

public enum StatusGrotto {
    SUBLUNARY("подлунный"),
    HUGE("огромный"),
    UNDERGROUND("подземный"),
    NONE("none");

    private final String statusGrotto;

    StatusGrotto(String statusGrotto){
        this.statusGrotto = statusGrotto;
    }

    public String getStatusGrotto(){
        return statusGrotto;
    }
}
