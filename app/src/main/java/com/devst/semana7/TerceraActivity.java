package com.devst.semana7;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TerceraActivity extends AppCompatActivity {

    Button btnVolverTercera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera);

        // Conectar componente del XML
        btnVolverTercera = findViewById(R.id.btnVolverTercera);

        // =========================================
        // INTENT EXPLÍCITO / RETORNO
        // =========================================
        btnVolverTercera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                 * Cierra esta Activity y regresa
                 * a la pantalla principal.
                 */
                finish();
            }
        });
    }
}