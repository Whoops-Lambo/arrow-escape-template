package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzsq {
    public static final zzsq e = new zzsq(new int[0], new Object[0], false);
    public final int[] a;
    public final Object[] b;
    public int c;
    public boolean d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzsq)) {
            return false;
        }
        return true;
    }

    public zzsq(int[] iArr, Object[] objArr, boolean z) {
        this.c = -1;
        this.a = iArr;
        this.b = objArr;
        this.d = z;
    }

    public final int hashCode() {
        return 506991;
    }

    private zzsq() {
        this(new int[8], new Object[8], true);
    }
}
