package com.myproject.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import android.app.ActionBar;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_play, btn_previous, btn_next, btn_shuffle, btn_repeat;
    TextView tv_title_song;
    TextView tv_artist;
    SeekBar time_play;
    TextView tv_start, tv_end;
    MediaPlayer mediaPlayer;
    Animation roating;
    de.hdodenhof.circleimageview.CircleImageView img_disc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        init();
    }

    // Add control
    private void init() {
        btn_play = (Button) findViewById(R.id.btn_play);
        btn_next = (Button) findViewById(R.id.btn_next);
        btn_previous = (Button) findViewById(R.id.btn_previous);
        btn_repeat = (Button) findViewById(R.id.btn_repeat);
        btn_shuffle = (Button) findViewById(R.id.btn_shuffle);
        tv_title_song = (TextView) findViewById(R.id.tv_tittle_song);
        tv_artist =(TextView) findViewById(R.id.tv_artist);
        time_play =(SeekBar) findViewById(R.id.time_play);
        tv_start =(TextView) findViewById(R.id.tv_time_start);
        tv_end =(TextView) findViewById(R.id.tv_time_end);
        img_disc = (de.hdodenhof.circleimageview.CircleImageView) findViewById(R.id.imv_disc_icon);
        roating = AnimationUtils.loadAnimation(this, R.anim.rotation);

    }

    public void play_click(View view) {
        img_disc.startAnimation(roating);
    }
}