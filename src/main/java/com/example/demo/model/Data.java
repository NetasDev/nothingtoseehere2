package com.example.demo.model;

import java.util.ArrayList;

public class Data {

    public static ArrayList<Personprofil> Accounts = new ArrayList<>();
    public static ArrayList<Groupprofil> Groups = new ArrayList<>();
    public static Personprofil netas = new Personprofil("netas",2377414,"NetasDev" ,
            "dieses hier","Hallo Leute");
    public static void addProfil(Personprofil person){
        Accounts.add(person);
    }
    public static void addGroupProfil(Groupprofil groupprofil){
        Groups.add(groupprofil);
    }
}
