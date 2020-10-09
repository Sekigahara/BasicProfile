package com.example.myprofile.base.profile;

import android.content.Intent;
import android.view.View;

import com.example.myprofile.base.BaseFragmentHolderActivity;

public class ProfileActivity extends BaseFragmentHolderActivity {
    private ProfileFragment profileFragment;

    protected void initializeFragment(){
        initializeView();

        btBack.setVisibility(View.VISIBLE);
        btOptionMenu.setVisibility(View.GONE);
        ivIcon.setVisibility(View.VISIBLE);

        Intent intent = getIntent();
        String[] account = intent.getStringArrayExtra("USERNAME_KEY");

        profileFragment = new ProfileFragment();
        profileFragment.setAccountString(account);

        btBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                profileFragment.returnLogin();
            }
        });
        setCurrentFragment(profileFragment, true);
    }
}
