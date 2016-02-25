package br.com.codepampa.testepessoal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SextaPergunta extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sexta_pergunta);
    }

    public void irParaProximaPergunta6(View view){
        EditText editTextMelhorLugar = (EditText) findViewById(R.id.txt_melhor_lugar);

        if (editTextMelhorLugar.length() == 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setIcon(android.R.drawable.ic_dialog_info);
            builder.setTitle("Ops! Algo aconteceu.");
            builder.setMessage(" " + Principal.USER_NAME + ":\n\n" +
                    " - Por favor digite um valor válido.");
            editTextMelhorLugar.requestFocus();
            AlertDialog dialog = builder.create();
            dialog.show();
        } else {
            Intent intent = new Intent(this, SetimaPergunta.class);
            startActivity(intent);
        }

    }
}
