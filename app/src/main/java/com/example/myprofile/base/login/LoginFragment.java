package com.example.myprofile.base.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.myprofile.R;
import com.example.myprofile.base.BaseFragment;
import com.example.myprofile.base.profile.ProfileActivity;

public class LoginFragment extends BaseFragment<LoginActivity, LoginContract.Presenter> implements LoginContract.View{
    EditText etUsername;
    EditText etPassword;
    Button btnLogin;

    public LoginFragment(){

    }

    public android.view.View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.fragment_login, container, false);
        mPresenter = new LoginPresenter(this);
        mPresenter.start();

        etUsername = fragmentView.findViewById(R.id.login_username);
        etPassword = fragmentView.findViewById(R.id.login_password);
        btnLogin = fragmentView.findViewById(R.id.login_button);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                loginRedirect();
            }
        });

        setTitle("Login Page");

        return fragmentView;
    }

    public void loginRedirect(){
        String username = etUsername.getText().toString();
        String password = etPassword.getText().toString();
        mPresenter.performLogin(username, password);
    }

    public void setPresenter(LoginContract.Presenter presenter){
        mPresenter = presenter;
    }

    public void redirectToProfile(String username){
        Intent intent = new Intent(activity, ProfileActivity.class);
        intent.putExtra("USERNAME_KEY", username);
        startActivity(intent);
        activity.finish();
    }
}
