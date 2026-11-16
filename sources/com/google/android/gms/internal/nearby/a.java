package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends zzsq {
    public static final a e = new a(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    @Override // com.google.android.gms.internal.nearby.zzsq, com.google.android.gms.internal.nearby.zzsn
    public final void a(Object[] objArr) {
        System.arraycopy(this.c, 0, objArr, 0, this.d);
    }

    @Override // com.google.android.gms.internal.nearby.zzsn
    public final int h() {
        return 0;
    }

    @Override // com.google.android.gms.internal.nearby.zzsn
    public final boolean n() {
        return false;
    }

    @Override // com.google.android.gms.internal.nearby.zzsn
    public final int d() {
        return this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzsg.a(i, this.d);
        Object obj = this.c[i];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.nearby.zzsn
    public final Object[] o() {
        return this.c;
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
