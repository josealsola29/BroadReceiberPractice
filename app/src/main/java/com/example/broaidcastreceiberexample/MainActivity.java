package com.example.broaidcastreceiberexample;

import android.Manifest;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String CUSTOM_INTENT = "com.example.broaidcastreceiberexample";
    Button btnVibracion;

    private final IntentFilter intentFilter = new IntentFilter(CUSTOM_INTENT);
    private final VibrateReceiver vibrateReceiver = new VibrateReceiver();

    private LocalBroadcastManager localBroadcastManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        localBroadcastManager = LocalBroadcastManager.getInstance(getApplicationContext());
        localBroadcastManager.registerReceiver(vibrateReceiver, intentFilter);

        btnVibracion = findViewById(R.id.btnVibracion);
        btnVibracion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendBroadcast(new Intent(CUSTOM_INTENT));
            }
        });
    }

}
