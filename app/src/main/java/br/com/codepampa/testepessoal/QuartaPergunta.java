package br.com.codepampa.testepessoal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class QuartaPergunta extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarta_pergunta);
    }

    public void irParaProximaPergunta4(View view){
        Intent intent = new Intent(this, QuintaPergunta.class);
        startActivity(intent);

    }
}
