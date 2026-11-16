package com.google.android.gms.internal.ads;

import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzckq implements zzmg {
    public final zzacb a;
    public long b;
    public long c;
    public long d;
    public long e;
    public int f;
    public boolean g;

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void b(zzqn zzqnVar) {
        this.f = 0;
        this.g = false;
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void c(zzqn zzqnVar) {
        this.f = 0;
        this.g = false;
        zzacb zzacbVar = this.a;
        synchronized (zzacbVar) {
            zzacbVar.a(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void d(zzqn zzqnVar) {
        this.f = 0;
        this.g = false;
        zzacb zzacbVar = this.a;
        synchronized (zzacbVar) {
            zzacbVar.a(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void f(zzmf zzmfVar, zzabk[] zzabkVarArr) {
        int i;
        this.f = 0;
        for (zzabk zzabkVar : zzabkVarArr) {
            if (zzabkVar != null) {
                int i2 = this.f;
                int i3 = zzabkVar.zza().c;
                if (i3 == 0) {
                    i = 144310272;
                } else if (i3 == 1) {
                    i = 13107200;
                } else if (i3 != 2) {
                    i = 131072;
                    if (i3 != 3 && i3 != 5 && i3 != 6) {
                        e32.a();
                        return;
                    }
                } else {
                    i = 131072000;
                }
                this.f = i2 + i;
            }
        }
        this.a.a(this.f);
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final zzabv a(zzqn zzqnVar) {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final boolean e(zzmf zzmfVar) {
        long j = zzmfVar.f ? this.e : this.d;
        return j <= 0 || zzmfVar.d >= j;
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final boolean g(zzmf zzmfVar) {
        char c;
        int i;
        long j = zzmfVar.d;
        boolean z = true;
        if (j > this.c) {
            c = 0;
        } else {
            c = j < this.b ? (char) 2 : (char) 1;
        }
        zzacb zzacbVar = this.a;
        synchronized (zzacbVar) {
            i = zzacbVar.b * 65536;
        }
        int i2 = this.f;
        if (c != 2 && (c != 1 || !this.g || i >= i2)) {
            z = false;
        }
        this.g = z;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final long zzf() {
        return 0L;
    }

    public zzckq(int i) {
        this.a = new zzacb();
        this.b = 15000000L;
        this.c = 30000000L;
        this.d = 2500000L;
        this.e = 5000000L;
    }

    public zzckq() {
        throw null;
    }
}
