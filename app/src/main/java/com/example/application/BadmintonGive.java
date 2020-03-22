package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BadmintonGive extends AppCompatActivity {
    private Button bg_get1;
    private Button bg_get2;
    String request="Your request has been sent.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badminton_give);
        bg_get1=(Button)findViewById(R.id.bg_p_button1);
        bg_get2=(Button)findViewById(R.id.bg_p_button2);
        bg_get1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message_and_menu1();
            }
        });
        bg_get2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message_and_menu1();
            }
        });
    }
    public void message_and_menu1(){
        Toast.makeText(getApplicationContext(),request,Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,Menu.class);
        startActivity(intent);
    }
}
