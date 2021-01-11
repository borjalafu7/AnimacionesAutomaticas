package com.borjalapa.animacionesautomaticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    //poner en el .xml la linea android:animateLayoutChanges="true" para que anime solo los cambios en el layout

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.tvInfo);
    }

    public void cambiarVisibilidad(View view) {
        if(textView.getVisibility() == View.VISIBLE){
            //INVISIBLE SIN ESTAR NI OCUPAR
            textView.setVisibility(View.GONE);
        }else{
            textView.setVisibility(View.VISIBLE);
        }
    }
}