package com.unity.androidnotifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import defpackage.mz1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class UnityNotificationRestartReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Log.d("UnityNotifications", "Rescheduling notifications after restart");
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            AsyncTask.execute(new mz1(context, 3));
        }
    }
}
