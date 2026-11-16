package com.google.android.gms.internal.ads;

import defpackage.s71;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class x extends zzgzl {
    public static final Object[] i;
    public static final x j;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int g;
    public final transient int h;

    static {
        Object[] objArr = new Object[0];
        i = objArr;
        j = new x(0, 0, 0, objArr, objArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgyx, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int iJ = s71.J(obj);
                while (true) {
                    int i2 = iJ & this.g;
                    Object obj2 = objArr[i2];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iJ = i2 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final int i() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final boolean o() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final int r(Object[] objArr, int i2) {
        Object[] objArr2 = this.d;
        int i3 = this.h;
        System.arraycopy(objArr2, 0, objArr, i2, i3);
        return i2 + i3;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object[] h() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final int k() {
        return this.h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final zzgzb z() {
        return zzgzb.D(this.h, this.d);
    }

    public x(int i2, int i3, int i4, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i2;
        this.f = objArr2;
        this.g = i3;
        this.h = i4;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    /* JADX INFO: renamed from: d */
    public final zzhbp iterator() {
        return n().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, com.google.android.gms.internal.ads.zzgyx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return n().listIterator(0);
    }
}
