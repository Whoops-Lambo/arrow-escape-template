package com.google.android.gms.internal.ads;

import defpackage.h42;
import defpackage.k92;
import defpackage.wx2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdwu implements zzbrm {
    public final zzdfj a;
    public final zzcdf b;
    public final String c;
    public final String d;

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void O(zzcdf zzcdfVar) {
        int i;
        String str;
        zzcdf zzcdfVar2 = this.b;
        if (zzcdfVar2 != null) {
            zzcdfVar = zzcdfVar2;
        }
        if (zzcdfVar != null) {
            str = zzcdfVar.a;
            i = zzcdfVar.b;
        } else {
            i = 1;
            str = "";
        }
        zzccq zzccqVar = new zzccq(str, i);
        zzdfj zzdfjVar = this.a;
        zzdfjVar.getClass();
        zzdfjVar.k0(new wx2(24, zzccqVar, this.c, this.d));
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zza() {
        this.a.k0(h42.s);
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzc() {
        this.a.k0(k92.s);
    }

    public zzdwu(zzdfj zzdfjVar, zzflq zzflqVar) {
        this.a = zzdfjVar;
        this.b = zzflqVar.l;
        this.c = zzflqVar.j;
        this.d = zzflqVar.k;
    }
}
