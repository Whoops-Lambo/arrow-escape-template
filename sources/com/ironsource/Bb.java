package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class Bb {
    private final a a;
    protected long b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends Thread {
        private Handler a;

        private a() {
        }

        public Handler a() {
            return this.a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Looper.prepare();
            this.a = new Handler();
            Looper.loop();
        }

        public /* synthetic */ a(Bb bb, int i) {
            this();
        }
    }

    public void a(Runnable runnable) {
        Handler handlerA;
        a aVar = this.a;
        if (aVar == null || (handlerA = aVar.a()) == null) {
            return;
        }
        handlerA.post(runnable);
    }

    public Bb() {
        a aVar = new a(this, 0);
        this.a = aVar;
        aVar.start();
        this.b = new Date().getTime();
    }

    public boolean a(Object obj) {
        return (obj == null || this.a == null) ? false : true;
    }
}
