package com.example.onclicklistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvfirst,tvway,second,secondway,third,thirdway;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvfirst= findViewById(R.id.first);
        tvway=findViewById(R.id.way);
        second=findViewById(R.id.second);
        secondway=findViewById(R.id.secondway);
        third=findViewById(R.id.third);
        thirdway=findViewById(R.id.thirdway);


        tvfirst.setOnClickListener(view -> {

            Toast.makeText(MainActivity.this,"Hey ! How are you?",Toast.LENGTH_SHORT).show();
        });
        tvway.setOnClickListener(view -> {
            Toast.makeText(MainActivity.this,"I am proud of you :)",Toast.LENGTH_SHORT).show();

        });
        second.setOnClickListener(view -> {
            Toast.makeText(MainActivity.this,"You have so beautiful eyes !",Toast.LENGTH_SHORT).show();

        });
        secondway.setOnClickListener(view -> {
            Toast.makeText(MainActivity.this,"Trust the timing of your life :)",Toast.LENGTH_SHORT).show();

        });
        third.setOnClickListener(view -> {
            Toast.makeText(MainActivity.this,"I MISS YOU BADLY :( ",Toast.LENGTH_SHORT).show();

        });
        thirdway.setOnClickListener(view -> {
            Toast.makeText(MainActivity.this,"You are a blessing to me !",Toast.LENGTH_SHORT).show();

        });
    }
}