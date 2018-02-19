package com.example.demo.model;

public class Rules {

    private String AcceptanceRules;
    private String KickRules;

    public Rules(String acceptanceRules, String kickRules) {
        AcceptanceRules = acceptanceRules;
        KickRules = kickRules;
    }

    public String getAcceptanceRules() {
        return AcceptanceRules;
    }

    public void setAcceptanceRules(String acceptanceRules) {
        AcceptanceRules = acceptanceRules;
    }

    public String getKickRules() {
        return KickRules;
    }

    public void setKickRules(String kickRules) {
        KickRules = kickRules;
    }
}
