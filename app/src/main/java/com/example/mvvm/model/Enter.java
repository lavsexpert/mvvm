package com.example.mvvm.model;

import org.jetbrains.annotations.NotNull;

public class Enter {
    public String login;
    public String password;

    public Enter(String login, String password){
        this.login = login;
        this.password = password;
    }

    @NotNull
    @Override
    public String toString(){
        return "Hello, "+login+"!";
    }
}
