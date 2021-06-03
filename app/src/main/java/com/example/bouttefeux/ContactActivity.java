package com.example.bouttefeux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ContactActivity extends AppCompatActivity {
    private Button BT1;
    private TextView lienFB;
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
        lienFB = findViewById(R.id.lienFacebook);
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

        lienFB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lienFacebook();
            }

        });
    }

    private void lienFacebook() {
        try{
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Bouttefeux-yohan-321817244628825"));
            startActivity(intent);
        }
        catch(ActivityNotFoundException e){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com"));
            startActivity(intent);
        }
    }

}