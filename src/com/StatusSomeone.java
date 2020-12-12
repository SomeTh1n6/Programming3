package com;

public enum StatusSomeone {
    SUDDENLY("неожиданно"); // неожиданно (стены раздвинулись)


    private final String statusSomeone;

    StatusSomeone(String statusSomeone) {
        this.statusSomeone = statusSomeone;
    }

    public String getStatusSomeone(){
        return statusSomeone;
    }
}
