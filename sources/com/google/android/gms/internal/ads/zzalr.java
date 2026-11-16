package com.google.android.gms.internal.ads;

import defpackage.h50;
import defpackage.rl3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzalr implements zzahv {
    public final int a;
    public final long b;
    public final int c;

    public final String toString() {
        String strA = zzfq.a(this.a);
        int length = strA.length();
        long j = this.b;
        int length2 = String.valueOf(j).length();
        int i = this.c;
        StringBuilder sb = new StringBuilder(rl3.v(length, 29, length2, 16, String.valueOf(i).length()) + 1);
        h50.x("AtomSizeTooSmall{type=", strA, sb, ", size=");
        sb.append(j);
        sb.append(", minHeaderSize=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    public zzalr(int i, long j, int i2) {
        this.a = i;
        this.b = j;
        this.c = i2;
    }
}
