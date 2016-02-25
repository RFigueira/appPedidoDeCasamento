package br.com.codepampa.testepessoal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SegundaPergunta extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pergunta);
    }

    public void irParaProximaPergunta2(View view) {
        EditText editTextMeses = (EditText) findViewById(R.id.txt_tempo_namoro);

        if (editTextMeses.length() == 0 ) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setIcon(android.R.drawable.ic_dialog_info);
            builder.setTitle("Ops! Algo aconteceu.");
            builder.setMessage(" "+ Principal.USER_NAME + ":\n\n" +
                    " - Por favor um valor válido.");
            editTextMeses.requestFocus();
            AlertDialog dialog = builder.create();
            dialog.show();
        } else {
            Intent intent = new Intent(this, TerceiraPergunta.class);
            startActivity(intent);
        }

    }
}
