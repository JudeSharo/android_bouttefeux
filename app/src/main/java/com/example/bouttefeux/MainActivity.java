package com.example.bouttefeux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView TV1;
    private Button BT1;
    private Button BT2;
    private EditText ET1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialiser();
        defaut();
        listener();
    }
    //Initialisation des variables
    protected void initialiser()
    {
        TV1 = findViewById(R.id.Main_TV1);
        BT1 = findViewById(R.id.Main_BT1);
        BT2 = findViewById(R.id.Main_BT2);
        ET1 = findViewById(R.id.Main_ET1);
    }
    //Parametre par défaut pour les attributs de l'activité
    protected void defaut()
    {
        BT1.setEnabled(false);
        BT2.setEnabled(false);
    }

    protected void listener()
    {
        ET1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                BT1.setEnabled(s.toString().length() != 0);
                BT2.setEnabled(s.toString().length() != 0);
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });

        BT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent contact = new Intent(MainActivity.this, ContactActivity.class);
                startActivity(contact);
            }
        });
        BT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent chantier = new Intent(MainActivity.this, ChantierActivity.class);
                startActivity(chantier);
            }
        });

    }

}