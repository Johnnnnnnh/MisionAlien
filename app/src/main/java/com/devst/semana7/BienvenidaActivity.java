package com.devst.semana7;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BienvenidaActivity extends AppCompatActivity {

    Button btnContinuar;
    Button btnCerrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);

        // Conectar componentes del XML
        btnContinuar = findViewById(R.id.btnContinuar);
        btnCerrar = findViewById(R.id.btnCerrar);

        // =========================================
        // NAVEGAR A PANTALLA PRINCIPAL (INTENT EXPLÍCITO)
        // =========================================
        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BienvenidaActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // =========================================
        // CERRAR LA APLICACIÓN
        // =========================================
        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity(); // Cierra completamente la app
            }
        });
    }
}