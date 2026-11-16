package com.google.android.gms.internal.common;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class zzh extends Handler {
    private final Looper zza;

    public zzh() {
        this.zza = Looper.getMainLooper();
    }

    public zzh(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }

    public zzh(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.zza = Looper.getMainLooper();
    }
}
