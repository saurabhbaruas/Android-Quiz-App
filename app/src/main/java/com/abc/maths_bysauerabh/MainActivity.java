package com.abc.maths_bysauerabh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private int second=30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton btnAction = findViewById(R.id.btnAction);
        btnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //custom code
                Intent i = new Intent(MainActivity.this, score.class);
                startActivity(i);
            }
        });
    }
    private void timer(){
        final Handler handler= new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                if(second>0){
                    second--;
                    handler.postDelayed(this,1000);
                }
                else{
                    //Timer Complete
                }
            }
        });
    }
}
