package com.example.queenabergen.electronicpresskit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;

import com.squareup.picasso.Picasso;

import static com.example.queenabergen.electronicpresskit.R.id.igotthe_bag;
import static com.example.queenabergen.electronicpresskit.R.id.solit_banner;

public class viewpage extends AppCompatActivity {


    VideoView videoview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpage);
//        mediaC = new MediaController(this);
//        mediaC.setAnchorView(videoview);


        ImageView watchsolit = (ImageView) findViewById(solit_banner);
        Picasso.with(getApplicationContext()).load(R.drawable.solitvideobannermin)
                .resize(1100, 900)
                .onlyScaleDown()
                .into(watchsolit);
        watchsolit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(viewpage.this, so_lit.class);
                startActivity(intent);
            }
        });


        ImageView watchigotthebag = (ImageView) findViewById(igotthe_bag);
        Picasso.with(getApplicationContext()).load(R.drawable.igotthebag2452)
                .resize(1100, 900)
                .onlyScaleDown()
                .into(watchigotthebag);
        watchigotthebag.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(viewpage.this, igotthebag.class);
                startActivity(intent);
            }
        });
        ImageView watchthebag = (ImageView) findViewById(R.id.whois_bennie);
        Picasso.with(getApplicationContext()).load(R.drawable.whoisbennie)
                .resize(1100, 900)
                .onlyScaleDown()
                .into(watchthebag);

        ImageView watchhandslike = (ImageView) findViewById(R.id.handslike_banner);
        Picasso.with(getApplicationContext()).load(R.drawable.handslikebanner174min)
                .resize(1100, 900)
                .onlyScaleDown()
                .into(watchhandslike);


    }


}
