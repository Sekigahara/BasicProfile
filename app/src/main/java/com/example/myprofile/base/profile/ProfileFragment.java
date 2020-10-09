package com.example.myprofile.base.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myprofile.base.login.LoginActivity;
import com.example.myprofile.base.BaseFragment;

import java.util.zip.Inflater;
import com.example.myprofile.R;

public class ProfileFragment extends BaseFragment<ProfileActivity, ProfileContract.Presenter> implements ProfileContract.View{

    private String[] account;
    private TextView tvUsername;
    private EditText etName;
    private EditText etBirth;
    private EditText etBloodType;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.fragment_profile,container,false);
        mPresenter = new ProfilePresenter(this, requireContext());

        tvUsername = fragmentView.findViewById(R.id.username_display);
        etName = fragmentView.findViewById(R.id.nameText);
        etBirth = fragmentView.findViewById(R.id.birthText);
        etBloodType = fragmentView.findViewById(R.id.bloodText);

        setTitle("Profile");
        mPresenter.start();

        return fragmentView;
    }

    public void setAccountString(String[] account){
        this.account = account;
    }

    public void returnLogin(){
        Intent intent = new Intent(activity, LoginActivity.class);
        startActivity(intent);
        activity.finish();
    }

    public void setProfile(){
        tvUsername.setText(account[0]);
        etName.setText("Tobiichi Origami");
        etBirth.setText("Tokyo, 08-04-2000");
        etBloodType.setText("B");
    }

    public void setPresenter(ProfileContract.Presenter presenter) { this.mPresenter = presenter; }

}
