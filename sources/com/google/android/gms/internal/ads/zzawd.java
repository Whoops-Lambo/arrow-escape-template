package com.google.android.gms.internal.ads;

import defpackage.dr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzawd implements zzawb {
    public int a = -1;
    public final byte[] b = new byte[8];
    public final zzawf c;

    @Override // com.google.android.gms.internal.ads.zzawb
    public final zzawn a(zzawn zzawnVar, int i, int i2) {
        if (i < 0 || i > i2 || i2 > zzawnVar.a.length) {
            dr0.b();
            return null;
        }
        byte[] bArr = new byte[i2 - i];
        int i3 = 0;
        while (i < i2) {
            bArr[i3] = b(zzawnVar, i);
            i++;
            i3++;
        }
        return zzawn.e(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzawb
    public final byte b(zzawn zzawnVar, int i) {
        int i2 = i >>> 3;
        int i3 = this.a;
        byte[] bArr = this.b;
        if (i2 != i3) {
            this.c.a(i2, bArr);
            this.a = i2;
        }
        return (byte) (((zzawnVar.b(i) ^ bArr[i % 8]) << 24) >> 24);
    }

    @Override // com.google.android.gms.internal.ads.zzawb
    public final /* bridge */ /* synthetic */ zzawb zzc() {
        return new zzawd(this.c);
    }

    public zzawd(zzawf zzawfVar) {
        this.c = zzawfVar;
    }
}
