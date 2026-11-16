package com.google.android.gms.internal.identity_googleid;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends zzj {
    public static final a d = new a(new Object[0]);
    public final transient Object[] c;

    @Override // com.google.android.gms.internal.identity_googleid.zzf
    public final int d() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zza.a(i, 0);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.identity_googleid.zzf
    public final int h() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }

    @Override // com.google.android.gms.internal.identity_googleid.zzj, com.google.android.gms.internal.identity_googleid.zzf
    public final void a(Object[] objArr) {
        System.arraycopy(this.c, 0, objArr, 0, 0);
    }

    @Override // com.google.android.gms.internal.identity_googleid.zzf
    public final Object[] k() {
        return this.c;
    }

    public a(Object[] objArr) {
        this.c = objArr;
    }
}
