package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzej {
    public int a;
    public int b;
    public int c;
    public long[] d;
    public int e;

    public zzej() {
        throw null;
    }

    public final long a() {
        int i = this.c;
        if (i == 0) {
            defpackage.d.v();
            return 0L;
        }
        long[] jArr = this.d;
        int i2 = this.a;
        long j = jArr[i2];
        this.a = this.e & (i2 + 1);
        this.c = i - 1;
        return j;
    }
}
