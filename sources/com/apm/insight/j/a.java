package com.apm.insight.j;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements Runnable {
    private Handler a;
    private final long b = 0;
    private final long c;

    public final void a(long j) {
        Handler handler = this.a;
        if (j > 0) {
            handler.postDelayed(this, j);
        } else {
            handler.post(this);
        }
    }

    public final long b() {
        return this.c;
    }

    public a(Handler handler, long j) {
        this.a = handler;
        this.c = j;
    }

    public final void a() {
        this.a.post(this);
    }
}
