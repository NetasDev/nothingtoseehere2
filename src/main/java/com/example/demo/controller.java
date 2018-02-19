package com.example.demo;


import com.example.demo.model.Data;
import com.example.demo.model.Personprofil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping(value="")
public class controller {


    @RequestMapping(value="")
    public String startsite(){
        Data.addProfil(Data.netas);
        return "Startsite";
    }
    @RequestMapping(value="/signup",method = RequestMethod.GET)
    public String signup(Model model){
        model.addAttribute("personprofil", new Personprofil());
        return "SignUp";
    }
    @RequestMapping(value="/signup",method = RequestMethod.POST)
    public String DoSignup(@ModelAttribute @Valid Personprofil newProfil, Errors errors, Model model){
        if(errors.hasErrors()){
            return "SignUp";
        }
        else {
            Data.Accounts.add(newProfil);
            return "redirect:/profiles";
        }
    }
    @RequestMapping(value="/profiles")
    public String showProfiles(Model model){
        model.addAttribute("profillist",Data.Accounts);
        return "Profiles";
    }
    @RequestMapping(value="/profil/{name}")
    public String showYourProfil(@PathVariable String name,Model model){
        Personprofil mensch = new Personprofil();
        mensch = Personprofil.findProfilByName(name);
        model.addAttribute("profil",mensch);
        return "profil";
    }
    @RequestMapping(value="index")
    public String returnIndex(){
        return"index";
    }
    @RequestMapping(value="groupes")
    public String returnGroupsite(){
        return "Groupsite";
    }


}
