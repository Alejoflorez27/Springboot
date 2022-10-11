package com.example.loguin;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Dashboard extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        ImageButton boton1 = (ImageButton) findViewById(R.id.imageButton3);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(Dashboard.this, "comunicacion", Toast.LENGTH_SHORT);
                notificacion.show();
                Intent intent= new Intent(getApplicationContext(), MenuSlideActivity.class);
                startActivity(intent);
            }
        });

        ImageButton boton2 = (ImageButton) findViewById(R.id.imageButton);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(Dashboard.this, "idea", Toast.LENGTH_SHORT);
                notificacion.show();
                Intent intent= new Intent(getApplicationContext(), MenuSlideActivity.class);
                startActivity(intent);
            }
        });

        ImageButton boton3 = (ImageButton) findViewById(R.id.imageButton4);
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(Dashboard.this, "grafico", Toast.LENGTH_SHORT);
                notificacion.show();
                Intent intent= new Intent(getApplicationContext(), MenuSlideActivity.class);
                startActivity(intent);
            }
        });

        ImageButton boton4 = (ImageButton) findViewById(R.id.imageButton5);
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(Dashboard.this, "trabajo", Toast.LENGTH_SHORT);
                notificacion.show();
                Intent intent= new Intent(getApplicationContext(), MenuSlideActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onClick(View view) {

    }
}
