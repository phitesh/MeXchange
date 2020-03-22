package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Menu extends AppCompatActivity {
    private Button bg_give;
    private Button bg_get;
    private ImageButton profile_;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        bg_give=(Button)findViewById(R.id.Badminton_Give);
        bg_give.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_bg_form();
            }
        });
        bg_get=(Button)findViewById(R.id.Badminton_Get);
        bg_get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_bg_get();
            }
        });
        profile_=(ImageButton)findViewById(R.id.ProfileButton);
        profile_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_profile();
            }
        });
    }
    public void open_bg_form(){
        Intent intent=new Intent(this,BadmintonGet.class);
        startActivity(intent);
    }
    public void open_bg_get(){
        Intent intent=new Intent(this,BadmintonGive.class);
        startActivity(intent);
    }
    public void open_profile(){
        Intent intent = new Intent(this, User_Profile.class);
        startActivity(intent);
    }
}
