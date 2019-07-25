package com.example.broaidcastreceiberexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootRecevier extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent nuevoIntent = new Intent(context,MainActivity.class);
        nuevoIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(nuevoIntent);
    }
}
