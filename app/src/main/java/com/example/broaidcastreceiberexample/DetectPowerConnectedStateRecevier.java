package com.example.broaidcastreceiberexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import java.util.Objects;

public class DetectPowerConnectedStateRecevier extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(Objects.requireNonNull(intent.getAction()).equals(Intent.ACTION_POWER_CONNECTED)){
            Toast.makeText(context, "Conectado", Toast.LENGTH_SHORT).show();
        }else
            Toast.makeText(context, "Desconectado", Toast.LENGTH_SHORT).show();
    }
}
