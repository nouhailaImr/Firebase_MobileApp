package com.example.firebase_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private Button msavebtn;
    FirebaseDatabase database;
    DatabaseReference ref;
    private Button x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msavebtn = findViewById(R.id.savebtn);
        // name =  findViewById(R.id.edNme);

        msavebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                database = FirebaseDatabase.getInstance();
                ref = database.getReference("users");


                User helperClass = new User();

                ref.setValue("First data storage");


            }
        });


    }
}