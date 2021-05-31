package com.example.bouttefeux;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView TV1;
    private Button BT1;
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
        ET1 = findViewById(R.id.Main_ET1);
    }
    //Parametre par défaut pour les attributs de l'activité
    protected void defaut()
    {
        BT1.setEnabled(false);
    }

    protected void listener()
    {
        ET1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                BT1.setEnabled(s.toString().length() != 0);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }
}