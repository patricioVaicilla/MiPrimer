package com.example.miprimer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.VerifiedInputEvent;
import android.view.View;
import android.widget.TextView;

public class Bienvenido extends AppCompatActivity {

    private TextView mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);
    mensaje= findViewById(R.id.txtSaludo);
    }
    public void saludar(View v){
        mensaje.setText("Hola Papucho");
    }
}