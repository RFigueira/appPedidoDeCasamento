package br.com.codepampa.testepessoal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BoasVindas extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boas_vindas);
        Intent intent = getIntent();
        String message ="  Seja Bem-Vindo(a) " + intent.getStringExtra(Principal.EXTRA_MESSAGE);
        TextView textView = (TextView) findViewById(R.id.Teste1);
        textView.setText(message);
    }


    public void irParaPrimeiraPergunta(View view){
        Intent intent = new Intent(this, PrimeiraPergunta.class);
        startActivity(intent);

    }

}
