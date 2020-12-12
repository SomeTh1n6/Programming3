package com;

import java.util.Objects;

public class Neznaika extends Korotyshka {
    private Location location = Location.CAVE;
    private Status status = Status.INTEREST;
    private Status statusSecond = Status.UNUNFATIGUE;
    private String name = "Незнайка";
    private ConditionKorotyshka conditionKorotyshka = ConditionKorotyshka.WITH_PLEASURE;

    public Neznaika(Location location, Status status, Status statusSecond, String name, ConditionKorotyshka conditionKorotyshka) {
        super(location, status, statusSecond , name, conditionKorotyshka);
    }
}