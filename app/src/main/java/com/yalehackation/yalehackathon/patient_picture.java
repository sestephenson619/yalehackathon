package com.yalehackation.yalehackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class patient_picture extends AppCompatActivity {

    //declares button
    public static Button photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_picture);

        contToInput();
    }

    //if continued is clicked go to patient file
    public void contToInput(){
        photo = (Button)findViewById(R.id.photo_button);
        photo.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent screen = new Intent(patient_picture.this, MainActivity.class);
                        startActivity(screen);
                    }
                });
    }
}

