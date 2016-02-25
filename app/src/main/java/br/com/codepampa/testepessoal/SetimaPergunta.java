package br.com.codepampa.testepessoal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SetimaPergunta extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setima_pergunta);
    }

    public void irParaProximaPergunta7(View view){
        Intent intent = new Intent(this, OitavaPergunta.class);
        startActivity(intent);

    }
}
