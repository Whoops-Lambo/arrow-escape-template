package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzagl implements zzaia {
    public final byte[] a = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzaia
    public final void e(long j, int i, int i2, int i3, zzahz zzahzVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaia
    public final void f(zzv zzvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaia
    public final int c(zzj zzjVar, int i, boolean z) throws EOFException {
        int i2 = zzjVar.i(this.a, 0, Math.min(4096, i));
        if (i2 != -1) {
            return i2;
        }
        if (z) {
            return -1;
        }
        defpackage.d.s();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaia
    public final void g(zzey zzeyVar, int i, int i2) {
        zzeyVar.G(i);
    }
}
