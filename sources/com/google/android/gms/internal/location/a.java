package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends zzbs {
    public static final a e = new a(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    @Override // com.google.android.gms.internal.location.zzbp
    public final int i() {
        return 0;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final boolean o() {
        return false;
    }

    @Override // com.google.android.gms.internal.location.zzbs, com.google.android.gms.internal.location.zzbp
    public final void r(Object[] objArr) {
        System.arraycopy(this.c, 0, objArr, 0, this.d);
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzbm.a(i, this.d);
        return this.c[i];
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final Object[] h() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final int k() {
        return this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public a(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }
}
