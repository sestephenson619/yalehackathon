package com.yalehackation.yalehackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //declares button
    public static Button cont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contToFile();
    }

    //if continued is clicked go to patient file
    public void contToFile(){
        cont = (Button)findViewById(R.id.cont_button);
        cont.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent screen = new Intent(MainActivity.this, patient_file.class);
                        startActivity(screen);
                    }
                });
    }
}
