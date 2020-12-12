package com;

public enum Location {
    GROTTO("грот"), // грот
    CAVE("пещера"), // пещера
    TUNNEL("тунель"),
    CAVE_ENTRANCE("вход в пещеру");

    private final  String location;

    Location(String location){
        this.location = location;
    }

    public String getLocation(){
        return location;
    }
}
