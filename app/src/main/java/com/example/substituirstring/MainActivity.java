package com.example.substituirstring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText idFrase;
    EditText idPalavra;
    Button bProcurar;
    TextView idResultadoProcura;
    EditText idSubstituicao;
    Button bTrocar;
    TextView idFraseNova;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idFrase=findViewById(R.id.idFrase);
        idPalavra=findViewById(R.id.idPalavra);
        bProcurar=findViewById(R.id.bProcurar);
        idResultadoProcura=findViewById(R.id.idResultadoProcura);
        idSubstituicao=findViewById(R.id.idSubstituicao);
        bTrocar=findViewById(R.id.bTrocar);
        idFraseNova=findViewById(R.id.idFraseNova);

        bProcurar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String idPegaFrase = idFrase.getText().toString();
                String idPegaPalavra = idPalavra.getText().toString();

                int testeProcurar = idPegaFrase.indexOf(idPegaPalavra);

                if (testeProcurar==-1){
                    idResultadoProcura.setText("Não encontrado!");
                }
                else {
                    idResultadoProcura.setText("Encontrado!");
                }
            }
        });

        bTrocar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String idPegaFrase = idFrase.getText().toString();
                String idPegaPalavra = idPalavra.getText().toString();
                String idSubstituirPor = idSubstituicao.getText().toString();



                String charNovaFrase = idPegaFrase.replace(idPegaPalavra,idSubstituirPor);

                idFraseNova.setText(String.valueOf(charNovaFrase));
            }
        });


    }
}