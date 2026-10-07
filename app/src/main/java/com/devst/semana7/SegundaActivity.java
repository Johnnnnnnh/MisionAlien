package com.devst.semana7;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SegundaActivity extends AppCompatActivity {

    Button btnVolver;
    TextView txtMensajeRecibido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        // Conectar los componentes según el XML
        btnVolver = findViewById(R.id.btnVolver);
        txtMensajeRecibido = findViewById(R.id.txtMensajeRecibido);

        // =========================================
        // RECIBIR EL INTENT Y SU EXTRA
        // =========================================
        Intent intentRecibido = getIntent();

        if (intentRecibido != null && intentRecibido.hasExtra("MENSAJE")) {
            String mensaje = intentRecibido.getStringExtra("MENSAJE");
            txtMensajeRecibido.setText("Mensaje recibido: " + mensaje);
        }

        // =========================================
        // INTENT EXPLÍCITO / RETORNO
        // =========================================
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                 * Cierra esta Activity y regresa
                 * automáticamente a MainActivity.
                 */
                finish();
            }
        });
    }
}