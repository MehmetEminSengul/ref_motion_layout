package com.example.ref_motion_layout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    boolean opened;
    LinearLayout view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = findViewById(R.id.view);
        view.setVisibility(View.INVISIBLE);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!opened){
                    view.setVisibility(View.VISIBLE);
                    TranslateAnimation animate = new TranslateAnimation(
                            0,
                            0,
                            view.getHeight(),
                            -200);
                    animate.setDuration(500);
                    animate.setFillAfter(true);
                    view.startAnimation(animate);
                } else {
                    view.setVisibility(View.INVISIBLE);
                    TranslateAnimation animate = new TranslateAnimation(
                            0,
                            0,
                            -200,
                            view.getHeight());
                    animate.setDuration(500);
                    animate.setFillAfter(true);
                    view.startAnimation(animate);
                }
                opened = !opened;
            }
        });
    }
}