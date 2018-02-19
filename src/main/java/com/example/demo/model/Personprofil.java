package com.example.demo.model;

import org.springframework.stereotype.Service;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Personprofil {
    @NotNull
    @Size(min=3,max=20, message ="Bitte gib einen tatsächlichen Namen an")
    private String name;
    @Min(2000000)
    @Max(4000000)
    private int matrikelnumber;
    @NotNull
    @Size(min=1,message ="Bitte gib deinen Githubname an. Solltest du keinen Account haben ist es höchste Zeit einen zu erstellen =)")
    private String githubName;
    @NotNull
    @Size(max=50)
    private String workprobe;
    @NotNull
    @Size(max=500)
    private String introtext;



    public Personprofil(String name,int matrikelnumber, String githubName, String workprobe, String introtext) {
        this();
        this.name = name;
        this.matrikelnumber = matrikelnumber;
        this.githubName = githubName;
        this.workprobe = workprobe;
        this.introtext = introtext;
    }
    public Personprofil(){

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGithubName() {
        return githubName;
    }

    public void setGithubName(String githubName) {
        this.githubName = githubName;
    }

    public String getWorkprobe() {
        return workprobe;
    }

    public void setWorkprobe(String workprobe) {
        this.workprobe = workprobe;
    }

    public String getIntrotext() {
        return introtext;
    }

    public void setIntrotext(String introtext) {
        this.introtext = introtext;
    }

    public int getMatrikelnumber() {
        return matrikelnumber;
    }

    public void setMatrikelnumber(int matrikelnumber) {
        this.matrikelnumber = matrikelnumber;
    }

    public static Personprofil findProfilByName(String name){
        for(Personprofil profil : Data.Accounts){
            if(name.equals(profil.getName())){
                return profil;
            }
        }
        return null;
    }
}
