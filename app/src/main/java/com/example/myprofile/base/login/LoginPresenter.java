package com.example.myprofile.base.login;

import android.content.Context;
import android.content.SharedPreferences;

public class LoginPresenter implements LoginContract.Presenter{
    private final LoginContract.View view;
    public LoginPresenter(LoginContract.View view){
        this.view = view;
    }

    public void start(){}

    public void performLogin(String username, String password){
        if(username.equals("origami") && password.equals("origami")) {
            view.redirectToProfile(username);
        }
    }
}