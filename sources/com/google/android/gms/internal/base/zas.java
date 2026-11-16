package com.google.android.gms.internal.base;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class zas extends Handler {
    private final Looper zaa;

    public zas() {
        this.zaa = Looper.getMainLooper();
    }

    public zas(Looper looper) {
        super(looper);
        this.zaa = Looper.getMainLooper();
    }

    public zas(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.zaa = Looper.getMainLooper();
    }
}
