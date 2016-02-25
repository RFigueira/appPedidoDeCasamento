package br.com.codepampa.testepessoal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TerceiraPergunta extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira_pergunta);
    }

    public void irParaProximaPergunta3(View view){
        Intent intent = new Intent(this, QuartaPergunta.class);
        startActivity(intent);

    }
}
