package com.example.jatin.fmfp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.leo.simplearcloader.ArcConfiguration;
import com.leo.simplearcloader.SimpleArcLoader;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
         ImageView suar= (ImageView) findViewById(R.id.logo);
         Animation an= AnimationUtils.loadAnimation(getBaseContext(), R.anim.rotate);
        suar.startAnimation(an);
        an.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                finish();
                Intent i = new Intent(getBaseContext(), MainActivity.class);
                startActivity(i);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        ArcConfiguration configuration = new ArcConfiguration(getBaseContext());
        configuration.setLoaderStyle(SimpleArcLoader.STYLE.COMPLETE_ARC);
        configuration.setText("Please wait..");
        int[] ring={0xfff,0xfff};
        configuration.setColors(ring);
    }
}
