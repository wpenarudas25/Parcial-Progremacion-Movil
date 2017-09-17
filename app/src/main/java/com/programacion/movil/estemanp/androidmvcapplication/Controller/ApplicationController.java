package com.programacion.movil.estemanp.androidmvcapplication.Controller;

import android.app.Application;


import com.programacion.movil.estemanp.androidmvcapplication.Domain.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wilmar Peña on 12/09/2017.
 */
public class ApplicationController extends Application {

    private List<User> users;

    public  ApplicationController(){
        users= new ArrayList<>();
        fillDateBases();
    }

    private void fillDateBases(){
        //Add users
        fillUsers();
    }

    private void fillUsers() {
        User person1 = new User("Wilmar", "Peña", "wilmar", "1234", 23);
        users.add(person1);

        User person2 = new User("David", "Ramos", "david", "1234", 34);
        users.add(person2);

        User person3 = new User("Andres", "Perez", "estemanp", "1234", 24);
        users.add(person3);
    }

    public boolean isValidUser(String username, String password){
        Boolean resp=false;
        for (User person:users) {
            if(username.equals(person.getUserName())){
                if(password.equals(person.getPassword())){
                    resp=true;
                }
            }
        }
        return resp;
    }
}