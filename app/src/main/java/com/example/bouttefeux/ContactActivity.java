package com.example.bouttefeux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactActivity extends AppCompatActivity {
    private Button BT1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        initialisation();
        defaut();
        listener();
    }

    protected void initialisation()
    {
        BT1 = findViewById(R.id.contact_BT1);
    }

    protected void defaut(){}

    protected void listener()
    {
        BT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main= new Intent(ContactActivity.this, MainActivity.class);
                startActivity(main);

            }
        });
    }

}