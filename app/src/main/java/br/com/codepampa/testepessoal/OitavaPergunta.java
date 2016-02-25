package br.com.codepampa.testepessoal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OitavaPergunta extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oitava_pergunta);
    }

    public void irParaProximaPergunta8(View view){
        Intent intent = new Intent(this, NonaPergunta.class);
        startActivity(intent);

    }
}
