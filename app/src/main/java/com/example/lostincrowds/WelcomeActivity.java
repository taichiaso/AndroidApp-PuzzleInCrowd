/******************************************************************************
 * Copyright (c) 2019. Xiang Li From Australian National University CECS  All Rights Reserved. FileName: HandlePuzzle.java@author: jack@date: 5/21/19 2:10 PM@version: 1.0
 ******************************************************************************/

package com.example.lostincrowds;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import me.wangyuwei.particleview.ParticleView;

/**
 * The type Welcome activity.
 */
public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_welcome);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ParticleView particleView = findViewById(R.id.ParticleView);
        particleView.startAnim();
        particleView.setOnParticleAnimListener(new ParticleView.ParticleAnimListener() {
            @Override
            public void onAnimationEnd () {
                Intent intent = new Intent();
                intent.setClass(WelcomeActivity.this , LoginActivity.class);
                finish();
                startActivity(intent);

            }
        });


    }
}
