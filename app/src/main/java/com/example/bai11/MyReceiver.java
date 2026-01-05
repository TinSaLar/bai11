package com.example.bai11;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        boolean isAirplaneOn = intent.getBooleanExtra("state", false);
        String msg = isAirplaneOn ? "Chế độ máy bay: BẬT" : "Chế độ máy bay: TẮT";
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}

