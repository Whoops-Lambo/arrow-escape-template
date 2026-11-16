package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzahz {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzahz.class != obj.getClass()) {
            return false;
        }
        zzahz zzahzVar = (zzahz) obj;
        return this.a == zzahzVar.a && this.c == zzahzVar.c && this.d == zzahzVar.d && Arrays.equals(this.b, zzahzVar.b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }

    public zzahz(int i, byte[] bArr, int i2, int i3) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }
}
