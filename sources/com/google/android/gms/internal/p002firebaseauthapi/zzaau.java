package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.d;
import defpackage.pv1;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaau {
    public final byte[] a;

    public static zzaau a(byte[] bArr) {
        if (bArr == null) {
            d.w("data must be non-null");
            return null;
        }
        int length = bArr.length;
        if (length > bArr.length) {
            length = bArr.length;
        }
        return new zzaau(bArr, length);
    }

    public final byte[] b() {
        byte[] bArr = this.a;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzaau) {
            return Arrays.equals(((zzaau) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return pv1.n("Bytes(", zzaaf.a(this.a), ")");
    }

    public zzaau(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }
}
