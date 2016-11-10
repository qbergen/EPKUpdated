package com.example.queenabergen.electronicpresskit;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

public class so_lit extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_so_lit);
        final VideoView videoView = (VideoView)findViewById(R.id.mvideoView);
        Uri videopath = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.solitvideo);
        videoView.setVideoURI(videopath);
        videoView.start();

    }
}
