package com;

public enum ConditionWall {
    EASY("Легко"),
    SUDDENLY("Неожиданно"),
    BEAUTIFULLY("Красиво"),
    TERRIBLY("Ужасно"),
    EMPTY("");

    private String conditionWall;

    ConditionWall(String conditionWall) {
        this.conditionWall = conditionWall;
    }

    public String getConditionWall(){
        return conditionWall;
    }
}
