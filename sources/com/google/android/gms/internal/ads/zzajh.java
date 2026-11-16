package com.google.android.gms.internal.ads;

import android.util.Pair;
import defpackage.ar3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzajh implements zzago {
    public final zzaht a;
    public final ar3 b;
    public zzagr c;
    public zzago d;
    public Pair e;

    @Override // com.google.android.gms.internal.ads.zzago
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzago
    public final void a(long j, long j2) {
        zzago zzagoVar = this.d;
        if (zzagoVar != null) {
            zzagoVar.a(j, j2);
        } else {
            this.e = Pair.create(Long.valueOf(j), Long.valueOf(j2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzago
    public final boolean b(zzagp zzagpVar) {
        if (this.b.b(zzagpVar)) {
            return true;
        }
        ((zzagf) zzagpVar).f = 0;
        return this.a.b(zzagpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzago
    public final int c(zzagp zzagpVar, zzaho zzahoVar) {
        if (this.d == null) {
            zzago zzagoVar = this.b;
            if (!zzagoVar.b(zzagpVar)) {
                zzagoVar = this.a;
            }
            this.d = zzagoVar;
            zzagpVar.zzl();
            Pair pair = this.e;
            if (pair != null) {
                this.d.a(((Long) pair.first).longValue(), ((Long) this.e.second).longValue());
                this.e = null;
            }
            zzago zzagoVar2 = this.d;
            zzagr zzagrVar = this.c;
            zzagrVar.getClass();
            zzagoVar2.d(zzagrVar);
        }
        return this.d.c(zzagpVar, zzahoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzago
    public final void d(zzagr zzagrVar) {
        this.c = zzagrVar;
    }

    public zzajh(int i) {
        this.a = new zzaht(65496, 2, "image/jpeg");
        this.b = new ar3();
    }

    public zzajh() {
        this(0);
    }
}
