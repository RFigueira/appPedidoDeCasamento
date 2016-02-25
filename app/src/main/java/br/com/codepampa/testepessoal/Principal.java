package br.com.codepampa.testepessoal;

import android.app.Activity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Principal extends Activity {
    public final static String EXTRA_MESSAGE = "br.com.codepampa.testepessoal.MESSAGE";
    public static String USER_NAME = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void logar1(View view) {
        Intent intent = new Intent(this, BoasVindas.class);
        startActivity(intent);
    }

    public void logar(View view) {
        EditText editText = (EditText) findViewById(R.id.txt_name);
        EditText editTextIdade = (EditText) findViewById(R.id.txt_idade);

        if (editText.length() <= 1 || editTextIdade.length() == 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(Principal.this);
            builder.setIcon(android.R.drawable.ic_dialog_info);
            builder.setTitle("Ops! Algo aconteceu.");

            if (editText.length() <= 1 && editTextIdade.length() == 0) {
                builder.setMessage(" - Por favor digite seu nome.\n\n" +
                        " - Por favor digite sua idade.");
                editText.requestFocus();
            }
            else if (editText.length() <= 1 && editTextIdade.length() > 0) {
                builder.setMessage("Por favor digite seu nome.");
                editText.requestFocus();
            }
            else {
                builder.setMessage("Olá " + editText.getText() + ". \n\n" +
                        " - Por favor digite sua idade.");
                editTextIdade.requestFocus();
            }
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else {
            Intent intent = new Intent(this, BoasVindas.class);
            String message = editText.getText().toString();
            USER_NAME = message;
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }
    }

}
