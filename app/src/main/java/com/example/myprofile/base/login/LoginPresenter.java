package com.example.myprofile.base.login;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.example.myprofile.ProfilePage;
import com.example.myprofile.R;

public class LoginPresenter implements LoginContract.Presenter{
    private final LoginContract.View view;
    public LoginPresenter(LoginContract.View view){
        this.view = view;
    }

    public void start(){}

    public void performLogin(String username, String password){
        if(username.equals("origami") && password.equals("origami")) {
            String[] account = {"origami", "origami"};

            view.redirectToProfile(account);
        }
    }
}