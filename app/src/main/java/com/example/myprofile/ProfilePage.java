package com.example.myprofile;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class ProfilePage extends AppCompatActivity {
    private String PROFILE_NAME = "Tobiichi Origami";
    private String PROFILE_BIRTH = "Tokyo, 08-04-2000";
    private String PROFILE_BLOOD_TYPE = "AB";

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_page);

        Intent intent = getIntent();
        setText(intent.getStringArrayExtra("account"));
    }

    private void setText(String[] account){
        TextView usernameText = findViewById(R.id.username_display);
        EditText nameText = findViewById(R.id.nameText);
        EditText birthText = findViewById(R.id.birthText);
        EditText bloodText = findViewById(R.id.bloodText);

        usernameText.setText("Logged in as : " + account[0], TextView.BufferType.NORMAL);
        nameText.setText(PROFILE_NAME, TextView.BufferType.NORMAL);
        birthText.setText(PROFILE_BIRTH, TextView.BufferType.NORMAL);
        bloodText.setText(PROFILE_BLOOD_TYPE, TextView.BufferType.NORMAL);
    }
}