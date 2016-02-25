package br.com.codepampa.testepessoal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PrimeiraPergunta extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira_pergunta);
    }

    public void irParaProximaPergunta(View view){
        Intent intent = new Intent(this, SegundaPergunta.class);
        startActivity(intent);

    }
}
