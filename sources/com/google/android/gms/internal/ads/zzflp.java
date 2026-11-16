package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzflp {
    public final Clock a;
    public final zzeaw b;
    public final Object c = new Object();
    public volatile int e = 1;
    public volatile long d = 0;

    public final void a(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.ff)).booleanValue()) {
            zzeav zzeavVarA = this.b.a();
            zzeavVarA.b("action", "mbs_state");
            zzeavVarA.b("mbs_state", true != z ? "0" : "1");
            zzeavVarA.c();
        }
        if (z) {
            c(1, 2);
        } else {
            c(2, 1);
        }
    }

    public final void b() {
        long jCurrentTimeMillis = this.a.currentTimeMillis();
        synchronized (this.c) {
            try {
                if (this.e == 3) {
                    if (this.d + ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.h7)).longValue() <= jCurrentTimeMillis) {
                        this.e = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzflp(Clock clock, zzeaw zzeawVar) {
        this.a = clock;
        this.b = zzeawVar;
    }

    public final void c(int i, int i2) {
        b();
        Object obj = this.c;
        long jCurrentTimeMillis = this.a.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.e != i) {
                    return;
                }
                this.e = i2;
                if (this.e == 3) {
                    this.d = jCurrentTimeMillis;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
