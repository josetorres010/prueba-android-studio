package com.example.photostudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    // agrego los componentes necesarios para la interfaz como la clase Button e ImageView
    Button button;
    ImageView BoxImage;
    boolean statusButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // variable boolean para declarar al botón encendido
        statusButton = true;
        // ubica el nombre del id button en resources
        BoxImage = findViewById(R.id.imageView);
        BoxImage.setImageResource(R.drawable.rx5700xt_gpu);
        // ubica el nombre del id button en resources
        button = findViewById(R.id.button);

    }
    // method button
    public void activeButton(View view){
        if (statusButton == true){
            //cambia la imagen 1 por imagen 2
            BoxImage.setImageResource(R.drawable.radeon);
            // estado del botón
            statusButton = false;

        }else{
            //cambia la imagen 2 por imagen 1
            BoxImage.setImageResource(R.drawable.rx5700xt_gpu);
            // estado del botón
            statusButton = true;
        }
    }
}
