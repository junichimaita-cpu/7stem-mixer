package com.example.stemmixer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    private boolean isPlaying = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPlay = findViewById(R.id.btnPlay);
        btnPlay.setOnClickListener(v -> {
            isPlaying = !isPlaying;
            if (isPlaying) {
                btnPlay.setText("停止中...");
                Toast.makeText(MainActivity.this, "ミキサーを開始しました", Toast.LENGTH_SHORT).show();
            } else {
                btnPlay.setText("再生 / 停止");
                Toast.makeText(MainActivity.this, "ミキサーを停止しました", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
