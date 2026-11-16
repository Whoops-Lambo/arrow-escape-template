package com.google.android.gms.internal.ads;

import android.net.Uri;
import defpackage.m34;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzhr extends zzho {
    public final m34 e;
    public Uri f;
    public byte[] g;
    public int h;
    public int i;
    public boolean j;

    public zzhr(byte[] bArr) {
        m34 m34Var = new m34(bArr);
        super(false);
        this.e = m34Var;
        zzgvz.a(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int i(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.i;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.g;
        bArr2.getClass();
        System.arraycopy(bArr2, this.h, bArr, i, iMin);
        this.h += iMin;
        this.i -= iMin;
        m(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final Uri zzc() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void zzd() {
        if (this.j) {
            this.j = false;
            n();
        }
        this.f = null;
        this.g = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final long e(zzia zziaVar) throws zzhx {
        k(zziaVar);
        this.f = zziaVar.a;
        byte[] bArr = this.e.a;
        this.g = bArr;
        long j = zziaVar.c;
        int length = bArr.length;
        if (j <= length) {
            int i = (int) j;
            this.h = i;
            int i2 = length - i;
            this.i = i2;
            long j2 = zziaVar.d;
            if (j2 != -1) {
                this.i = (int) Math.min(i2, j2);
            }
            this.j = true;
            l(zziaVar);
            if (j2 != -1) {
                return j2;
            }
            return this.i;
        }
        throw new zzhx(2008);
    }
}
