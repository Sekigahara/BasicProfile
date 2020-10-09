package com.example.myprofile.base.profile;

import com.example.myprofile.base.BasePresenter;
import com.example.myprofile.base.BaseView;

public interface ProfileContract {
    interface View extends BaseView<Presenter> {
        void returnLogin();

        void setProfile();
    }

    interface Presenter extends BasePresenter {
        void getProfile();
    }
}
