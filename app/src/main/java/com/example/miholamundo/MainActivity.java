package com.example.miholamundo;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.miholamundo.R;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private TextView helloText;
    private Button versionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencias a los elementos de la UI
        helloText = findViewById(R.id.helloText);
        versionButton = findViewById(R.id.versionButton);

        // Configuración del botón para mostrar "Versión 2024"
        versionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String versionText = "Versión 2024";
                helloText.setText(versionText);
                Log.d(TAG, versionText);  // Envía "Versión 2024" al Logcat
            }
        });
    }
}
