package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class m {
    private static volatile p a;
    private static volatile Handler b;

    public static p a() {
        if (a == null) {
            b();
        }
        return a;
    }

    private static HandlerThread b() {
        if (a == null) {
            synchronized (m.class) {
                try {
                    if (a == null) {
                        p pVar = new p("default_npth_thread");
                        a = pVar;
                        pVar.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return a.c();
    }
}
