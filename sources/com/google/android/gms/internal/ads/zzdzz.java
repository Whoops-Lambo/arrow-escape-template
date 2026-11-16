package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdzz implements zzfqw {
    public final Map a;
    public final zzbiq b;

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final void H(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final void K(zzfqp zzfqpVar, String str, Throwable th) {
        Map map = this.a;
        if (map.containsKey(zzfqpVar)) {
            this.b.c(((zzdzy) map.get(zzfqpVar)).c);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final void f(zzfqp zzfqpVar, String str) {
        Map map = this.a;
        if (map.containsKey(zzfqpVar)) {
            this.b.c(((zzdzy) map.get(zzfqpVar)).a);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final void n(zzfqp zzfqpVar, String str) {
        Map map = this.a;
        if (map.containsKey(zzfqpVar)) {
            this.b.c(((zzdzy) map.get(zzfqpVar)).b);
        }
    }

    public zzdzz(zzbiq zzbiqVar, Map map) {
        this.a = map;
        this.b = zzbiqVar;
    }
}
