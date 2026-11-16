package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class a extends zzdv {
    public static final a e = new a(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    public final int h() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdv, com.google.android.gms.internal.consent_sdk.zzds
    public final void a(Object[] objArr) {
        System.arraycopy(this.c, 0, objArr, 0, this.d);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    public final int d() {
        return this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzdj.a(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    public final Object[] k() {
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
