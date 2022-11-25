package com.example.project_efatawww;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import java.util.Date;

@SuppressWarnings("ALL")
public class VideoActivity extends AppCompatActivity {

    Button btnPlay,btnPause;
    VideoView videoView;
    Date d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_video);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        getSupportActionBar().hide();
        videoView = findViewById(R.id.video_view);
        btnPlay = findViewById(R.id.btn_play);
        btnPause = findViewById(R.id.btn_pause);

        videoView = (VideoView) findViewById(R.id.video_view);
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.intro));
        videoView.setMediaController(new MediaController(this));
        videoView.requestFocus();

        d=new Date();

        int waktu;
        final int[] menitMulai = new int[1];
        final int[] menitAkhir = new int[1];

        int a = d.getMinutes();
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.start();
                menitMulai[0] = d.getMinutes();
            }
        });

        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.pause();
            }
        });

        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                menitAkhir[0] = d.getMinutes();

                 final int a = menitAkhir[0]-menitMulai[0];
                 int point = 5*a;
                 int pointAwal = getSharedPreferences("headerTime",MODE_PRIVATE).getInt("point",0);
                 getSharedPreferences("headerTime",MODE_PRIVATE).edit().putInt("point",point+pointAwal);
            }
        });
    }
}