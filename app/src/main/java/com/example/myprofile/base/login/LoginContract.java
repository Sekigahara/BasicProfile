package com.example.myprofile.base.login;

import com.example.myprofile.base.BasePresenter;
import com.example.myprofile.base.BaseView;

public interface LoginContract {
    interface View extends BaseView<Presenter> {
        void redirectToProfile(String[] account);
    }

    interface Presenter extends BasePresenter {
        void performLogin(String username, String password);
    }
}