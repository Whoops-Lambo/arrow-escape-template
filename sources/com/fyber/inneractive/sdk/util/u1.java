package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class u1 extends Handler {
    public final WeakReference a;

    public u1(w1 w1Var) {
        super(Looper.getMainLooper());
        this.a = new WeakReference(w1Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        super.handleMessage(message);
        w1 w1Var = (w1) this.a.get();
        if (w1Var != null && message.what == 1932593528 && !w1Var.d) {
            w1Var.a(message.getWhen());
        }
    }
}
