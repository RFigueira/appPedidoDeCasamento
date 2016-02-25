package br.com.codepampa.testepessoal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NonaPergunta extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nona_pergunta);
    }

    public void irParaProximaPergunta9(View view){
        Intent intent = new Intent(this, Video.class);
        startActivity(intent);

    }
}
