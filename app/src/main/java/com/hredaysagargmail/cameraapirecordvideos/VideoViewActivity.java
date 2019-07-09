package com.hredaysagargmail.cameraapirecordvideos;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class VideoViewActivity extends AppCompatActivity {
    private VideoView videoView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);

        videoView=findViewById(R.id.videoviewId);


        Uri uri = Uri.parse(getIntent().getExtras().getString("videoView"));

        videoView.setVideoURI(uri);
        videoView.start();
    }
}
