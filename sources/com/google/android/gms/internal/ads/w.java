package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class w extends zzgzb {
    public static final w e = new w(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final int i() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final boolean o() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgzb, com.google.android.gms.internal.ads.zzgyx
    public final int r(Object[] objArr, int i) {
        Object[] objArr2 = this.c;
        int i2 = this.d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzgvz.i(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object[] h() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final int k() {
        return this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public w(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }
}
