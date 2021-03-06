package com.espaciounido.unadcalendar.utils.job;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.espaciounido.unadcalendar.MainApp;


public class JobBootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {
            int hourOfDay = MainApp.getPreferenceModel().getNotiActiveFrequency();
            new JobAlarmDaily(context).startAlarm(hourOfDay, 0);
        }
    }
}
