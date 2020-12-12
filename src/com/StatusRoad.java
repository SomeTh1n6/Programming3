package com;

public enum StatusRoad {
    UNKNOWN("неизвестная"),
    WIDE("широкая"),
    ENLIGHTENED("просветленная"),
    NARROW("узкая"),
    STRAIGHT("прямая"),
    WINDING("извилистая"),
    DARK("темная");

    private final String statusRoad;

    StatusRoad(String statusRoad){
        this.statusRoad = statusRoad;
    }

    public String getStatusRoad(){
        return statusRoad;
    }

}
