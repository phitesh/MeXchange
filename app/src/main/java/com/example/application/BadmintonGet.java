package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BadmintonGet extends AppCompatActivity {
    private Button bg_form_submit;
    private EditText form_name;
    private EditText form_id;
    private EditText form_number;
    private EditText form_desc;

    String confirm="Submitted!";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badminton_get);
        bg_form_submit=(Button)findViewById(R.id.bg_form_submit);
        form_name=(EditText)findViewById(R.id.bg_name);
        form_id=(EditText)findViewById(R.id.bg_id);
        form_number=(EditText)findViewById(R.id.bg_number);
        form_desc=(EditText)findViewById(R.id.bg_description);
        form_name.addTextChangedListener(form);
        form_id.addTextChangedListener(form);
        form_number.addTextChangedListener(form);
        form_desc.addTextChangedListener(form);
        bg_form_submit.setEnabled(false);
        bg_form_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit();
            }
        });
    }
    private TextWatcher form=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
                String f_name=form_name.getText().toString().trim();
                String f_id=form_id.getText().toString().trim();
                String f_number=form_number.getText().toString().trim();
                String f_description=form_desc.getText().toString().trim();
                bg_form_submit.setEnabled(!f_name.isEmpty() && !f_id.isEmpty() && !f_number.isEmpty() && !f_description.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
    public void submit(){
        Toast.makeText(getApplicationContext(),confirm,Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,Menu.class);
        startActivity(intent);
    }
}
