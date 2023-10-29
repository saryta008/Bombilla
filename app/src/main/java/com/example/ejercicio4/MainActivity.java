package com.example.ejercicio4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    ImageView apagada, encendida;

    ToggleButton conmutador;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apagada=findViewById(R.id.bomApagada);
        apagada.setImageResource(R.drawable.bombilla_apagada);
        encendida=findViewById(R.id.bomEncendida);
        encendida.setImageResource(R.drawable.bombilla_encendida);
        conmutador=findViewById(R.id.toggleButton);

        conmutador.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true){
                    apagada.setVisibility(View.GONE);
                    encendida.setVisibility(View.VISIBLE);
                }else{
                    apagada.setVisibility(View.VISIBLE);
                    encendida.setVisibility(View.GONE);
                }
            }
        });


    }
}