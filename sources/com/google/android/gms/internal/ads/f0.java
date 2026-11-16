package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class f0 extends zzxg {
    public static final Object e = new Object();
    public final Object c;
    public final Object d;

    @Override // com.google.android.gms.internal.ads.zzxg, com.google.android.gms.internal.ads.zzbf
    public final zzbe b(int i, zzbe zzbeVar, long j) {
        this.b.b(i, zzbeVar, j);
        if (Objects.equals(zzbeVar.a, this.c)) {
            zzbeVar.a = zzbe.m;
        }
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxg, com.google.android.gms.internal.ads.zzbf
    public final zzbd d(int i, zzbd zzbdVar, boolean z) {
        this.b.d(i, zzbdVar, z);
        if (Objects.equals(zzbdVar.b, this.d) && z) {
            zzbdVar.b = e;
        }
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxg, com.google.android.gms.internal.ads.zzbf
    public final int e(Object obj) {
        Object obj2;
        if (e == obj && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return this.b.e(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzxg, com.google.android.gms.internal.ads.zzbf
    public final Object f(int i) {
        Object objF = this.b.f(i);
        return Objects.equals(objF, this.d) ? e : objF;
    }

    public f0(zzbf zzbfVar, Object obj, Object obj2) {
        super(zzbfVar);
        this.c = obj;
        this.d = obj2;
    }
}
