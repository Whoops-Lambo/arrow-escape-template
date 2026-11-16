package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@RestrictTo
public final class zznb {
    public final Object a;
    public Looper b;
    public HandlerThread c;
    public int d;

    public final void a() {
        HandlerThread handlerThread;
        synchronized (this.a) {
            try {
                zzgvz.f(this.d > 0);
                int i = this.d - 1;
                this.d = i;
                if (i == 0 && (handlerThread = this.c) != null) {
                    handlerThread.quit();
                    this.c = null;
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zznb(int i) {
        this.a = new Object();
        this.b = null;
        this.c = null;
        this.d = 0;
    }

    public zznb() {
        throw null;
    }
}
