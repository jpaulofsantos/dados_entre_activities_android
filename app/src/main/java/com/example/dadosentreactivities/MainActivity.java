package com.example.dadosentreactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.buttonEnviar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), segundaActivity.class);

                Usuario usuario = new Usuario("JP", "email@emailcom");

                intent.putExtra("nome", "JP");
                intent.putExtra("idade", 35);
                intent.putExtra("obj", usuario); //recebe o objeto usuario pois a classe Usuario implementou o Serializable

                startActivity(intent);

            }
        });
    }
}