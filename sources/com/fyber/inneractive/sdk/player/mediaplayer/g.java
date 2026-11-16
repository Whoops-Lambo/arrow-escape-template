package com.fyber.inneractive.sdk.player.mediaplayer;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class g implements Runnable {
    public final /* synthetic */ p a;

    public g(p pVar) {
        this.a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.b(this.a);
        Handler handler = this.a.o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.a.o = null;
        }
        this.a.n = null;
        Looper.myLooper().quit();
    }
}
