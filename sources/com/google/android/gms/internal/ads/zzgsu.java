package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import defpackage.e32;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgsu {
    public final zzgic a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public long c = -1;
    public long d = -1;
    public Throwable e = null;
    public final int f;

    public final void c() {
        AtomicBoolean atomicBoolean = this.b;
        if (atomicBoolean.getAndSet(true)) {
            e32.i("Finished trace.");
            return;
        }
        this.d = SystemClock.uptimeMillis();
        this.a.b(null, this.e, this.f - 1, atomicBoolean.get() ? this.d - this.c : -1L);
    }

    public final void a() {
        if (this.b.get()) {
            e32.i("Finished trace.");
        } else {
            this.c = SystemClock.uptimeMillis();
        }
    }

    public final void b(Throwable th) {
        if (this.b.get()) {
            e32.i("Finished trace.");
        } else {
            this.e = th;
        }
    }

    public zzgsu(int i, zzgic zzgicVar) {
        this.f = i;
        this.a = zzgicVar;
    }
}
