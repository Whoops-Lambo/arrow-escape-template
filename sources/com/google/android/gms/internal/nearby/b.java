package com.google.android.gms.internal.nearby;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class b extends zzss {
    public static final Object[] h;
    public static final b i;
    public final transient Object[] c;
    public final transient int d;
    public final transient Object[] e;
    public final transient int f;
    public final transient int g;

    static {
        Object[] objArr = new Object[0];
        h = objArr;
        i = new b(0, 0, 0, objArr, objArr);
    }

    @Override // com.google.android.gms.internal.nearby.zzsn
    public final void a(Object[] objArr) {
        System.arraycopy(this.c, 0, objArr, 0, this.g);
    }

    @Override // com.google.android.gms.internal.nearby.zzsn
    public final int h() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.e;
        if (objArr.length == 0) {
            return false;
        }
        int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
        while (true) {
            int i2 = iRotateLeft & this.f;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i2 + 1;
        }
    }

    @Override // com.google.android.gms.internal.nearby.zzsn
    public final int d() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.nearby.zzss, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.nearby.zzsn
    public final Object[] o() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.nearby.zzss
    public final a t() {
        return zzsq.t(this.g, this.c);
    }

    public b(int i2, int i3, int i4, Object[] objArr, Object[] objArr2) {
        this.c = objArr;
        this.d = i2;
        this.e = objArr2;
        this.f = i3;
        this.g = i4;
    }

    @Override // com.google.android.gms.internal.nearby.zzss, com.google.android.gms.internal.nearby.zzsn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return i().listIterator(0);
    }

    @Override // com.google.android.gms.internal.nearby.zzsn
    /* JADX INFO: renamed from: k */
    public final zzsy iterator() {
        return i().listIterator(0);
    }
}
