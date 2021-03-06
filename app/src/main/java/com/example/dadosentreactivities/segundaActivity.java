package com.example.dadosentreactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class segundaActivity extends AppCompatActivity {

    private TextView textNome, textIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textNome = findViewById(R.id.textNome);
        textIdade = findViewById(R.id.textIdade);

        Bundle dados = getIntent().getExtras();

        String nomeIntent = dados.getString("nome");
        int idadeIntent = dados.getInt("idade");
        Usuario usuario = (Usuario) dados.getSerializable("obj"); //casting de Serialazible para Usuario

        textNome.setText(usuario.getNome() + " - " + usuario.getEmail());
        textIdade.setText(String.valueOf(idadeIntent));


    }
}