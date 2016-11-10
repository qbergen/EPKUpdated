package com.example.queenabergen.electronicpresskit;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class igotthebag extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_igotthebag);
        final VideoView videoView = (VideoView)findViewById(R.id.mvideoView2);
        Uri videopath = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.igotthebag);
        videoView.setVideoURI(videopath);
        videoView.start();

    }
}
