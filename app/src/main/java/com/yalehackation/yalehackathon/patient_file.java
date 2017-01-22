package com.yalehackation.yalehackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class patient_file extends AppCompatActivity {

    //declares button
    public static Button newPatient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_file);

        backToMain();
    }

    //go back to main file
    public void backToMain(){
        newPatient = (Button)findViewById(R.id.new_patient_button);
        newPatient.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent screen = new Intent(patient_file.this, patient_picture.class);
                        startActivity(screen);
                    }
                });
    }

}
