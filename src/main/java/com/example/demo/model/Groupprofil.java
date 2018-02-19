package com.example.demo.model;

import java.util.ArrayList;

public class Groupprofil {

    private String name;
    private Rules rules;
    private ArrayList<Personprofil> members;
    private String groupIntrotext;

    public Groupprofil(String name, Rules rules, ArrayList<Personprofil> members, String groupIntrotext) {
        this.name = name;
        this.rules = rules;
        this.members = members;
        this.groupIntrotext = groupIntrotext;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rules getRules() {
        return rules;
    }

    public void setRules(Rules rules) {
        this.rules = rules;
    }

    public ArrayList<Personprofil> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Personprofil> members) {
        this.members = members;
    }

    public String getGroupIntrotext() {
        return groupIntrotext;
    }

    public void setGroupIntrotext(String groupIntrotext) {
        this.groupIntrotext = groupIntrotext;
    }


}
