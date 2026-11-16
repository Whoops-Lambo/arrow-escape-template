package com.lessmore.anrforcer;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import defpackage.w;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class ANRForcer {
    public static void triggerANR() {
        Log.d("ANRForcer", "Triggering ANR");
        new Handler(Looper.getMainLooper()).post(new w(0));
    }
}
