package com.google.android.gms.internal.tasks;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zza extends Handler {
    public zza() {
        Looper.getMainLooper();
    }

    public zza(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}
