package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzrn {
    public static final Object a = new Object();
    public static Thread b;
    public static volatile Handler c;

    public static boolean a(Thread thread) {
        if (b == null) {
            b = Looper.getMainLooper().getThread();
        }
        return thread == b;
    }

    public static Handler b() {
        if (c == null) {
            synchronized (a) {
                try {
                    if (c == null) {
                        c = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }
}
