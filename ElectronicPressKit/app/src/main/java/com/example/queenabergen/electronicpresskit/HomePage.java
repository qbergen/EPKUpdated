package com.example.queenabergen.electronicpresskit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;

import com.squareup.picasso.Picasso;

public class HomePage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        videoPlay();
        //        ImageView soLit = (ImageView) findViewById(R.id.solitbanner);
//        Picasso.with(getApplicationContext()).load(R.drawable.solitsoundcloud)
//                .resize(800, 800)
//                .onlyScaleDown()
//                .into(soLit);

        final ImageView musicbutton = (ImageView) findViewById(R.id.music_btn);
        Picasso.with(getApplicationContext()).load(R.drawable.musicbutton).into(musicbutton);
        musicbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this, MusicPage.class);
                startActivity(intent);
            }
        });


        ImageView bennie4 = (ImageView) findViewById(R.id.bennievideophoto);
        Picasso.with(getApplicationContext()).load(R.drawable.bennie4170)
                .resize(1100, 800)
                .onlyScaleDown()
                .into(bennie4);

        ImageView secondBennie = (ImageView) findViewById(R.id.secondbenniephoto);
        Picasso.with(getApplicationContext()).load(R.drawable.bennie32)
                .resize(1060, 1158)
                .onlyScaleDown()
                .into(secondBennie);


        final ImageView videobutton = (ImageView) findViewById(R.id.video_btn);
        videobutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this, viewpage.class);
                startActivity(intent);
            }
        });


        final ImageView pressbutton = (ImageView) findViewById(R.id.press_btn);
        pressbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this, PressPage.class);
                startActivity(intent);
            }
        });
    }

    public void videoPlay(){
        final VideoView videoView = (VideoView)findViewById(R.id.mvideoView3);
        Uri videopath = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.handslikevideo720);
        videoView.setVideoURI(videopath);
        videoView.start();
    }
}
