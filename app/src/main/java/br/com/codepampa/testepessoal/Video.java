package br.com.codepampa.testepessoal;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        VideoView videoView = (VideoView)findViewById(R.id.video_view);
        videoView.setMediaController(new MediaController(this));
        Uri uri = Uri.parse("android.resource://"+ getPackageName() +
                "/" + R.raw.fim );
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
    }
}
