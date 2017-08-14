package com.example.ccy.bounceballview;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private BounceBallView bbv1;
    private BounceBallView bbv2;
    private BounceBallView bbv3;
    private BounceBallView bbv4;
    private Button b1;
    private BallDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dialog = new BallDialog();
        bbv1 = (BounceBallView) findViewById(R.id.bbv1);
//        bbv2 = (BounceBallView) findViewById(R.id.bbv2);
//        bbv3 = (BounceBallView) findViewById(R.id.bbv3);
        bbv4 = (BounceBallView) findViewById(R.id.bbv4);
        bbv1.start();
//        bbv2.start();
//        bbv3.start();
        bbv4.start();

        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.show(getFragmentManager(),"1");
            }
        });
    }

}
