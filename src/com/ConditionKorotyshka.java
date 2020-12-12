package com;

public enum ConditionKorotyshka {
    UNDESIRABLY("нежелательно"),
    WITH_PLEASURE("с удовольствием"),
    SUPPRESSED("подавлено"),
    CAREFULLY("внимательно"),
    EASY("легко");

    private String conditionKorotyshka;

    ConditionKorotyshka(String conditionKorotyshka) {
        this.conditionKorotyshka = conditionKorotyshka;
    }

    public String getConditionKorotyshka(){
        return conditionKorotyshka;
    }
}
