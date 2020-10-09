package com.example.myprofile.base.profile;

import android.content.Context;
import android.content.SharedPreferences;

public class ProfilePresenter implements ProfileContract.Presenter {

    private final ProfileContract.View view;

    public ProfilePresenter(ProfileContract.View view, Context context){
        this.view = view;
    }

    public void start(){ getProfile(); }

    public void getProfile(){
        view.setProfile();
    }
}