package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zztw {
    public final zzcp[] a;
    public final zzuj b;
    public final zzcv c;

    public zztw(zzcp... zzcpVarArr) {
        zzuj zzujVar = new zzuj();
        zzujVar.m = 0;
        zzujVar.o = 0;
        zzujVar.p = 0;
        byte[] bArr = zzfq.b;
        zzujVar.n = bArr;
        zzujVar.q = bArr;
        zzcv zzcvVar = new zzcv();
        zzcp[] zzcpVarArr2 = {zzujVar, zzcvVar};
        this.a = zzcpVarArr2;
        System.arraycopy(zzcpVarArr, 0, zzcpVarArr2, 0, 0);
        this.b = zzujVar;
        this.c = zzcvVar;
    }
}
