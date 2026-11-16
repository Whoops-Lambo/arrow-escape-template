package com.google.android.gms.internal.ads;

import defpackage.pv1;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzei {
    public int a;
    public long[] b;

    public final void a() {
        int i = this.a;
        long[] jArr = this.b;
        if (i == jArr.length) {
            this.b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        jArr2[i2] = 0;
    }

    public final void b(long[] jArr) {
        int i = this.a;
        int length = jArr.length;
        int i2 = i + length;
        long[] jArr2 = this.b;
        int length2 = jArr2.length;
        if (i2 > length2) {
            this.b = Arrays.copyOf(jArr2, Math.max(length2 + length2, i2));
        }
        System.arraycopy(jArr, 0, this.b, this.a, length);
        this.a = i2;
    }

    public final long c(int i) {
        if (i >= 0 && i < this.a) {
            return this.b[i];
        }
        int i2 = this.a;
        io.p071bidmachine.media3.extractor.ts.y.p(pv1.j(i, i2, "Invalid index ", ", size is ", new StringBuilder(String.valueOf(i).length() + 24 + String.valueOf(i2).length())));
        return 0L;
    }

    public zzei(int i) {
        this.b = new long[i];
    }

    public zzei() {
        this(32);
    }
}
