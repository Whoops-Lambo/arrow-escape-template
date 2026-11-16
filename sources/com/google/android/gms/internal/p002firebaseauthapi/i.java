package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class i extends zzah {
    public static final i e = new i(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final int i() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final int d() {
        return this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzu.a(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzah, com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final Object[] n() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public i(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }
}
