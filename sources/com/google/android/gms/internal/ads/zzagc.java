package com.google.android.gms.internal.ads;

import defpackage.jc1;
import defpackage.q63;
import defpackage.rl3;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzagc implements zzahr {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    @Override // com.google.android.gms.internal.ads.zzahr
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final zzahp a(long j) {
        long[] jArr = this.e;
        int iS = zzfq.s(jArr, j, true);
        long j2 = jArr[iS];
        long[] jArr2 = this.c;
        zzahs zzahsVar = new zzahs(j2, jArr2[iS]);
        if (j2 >= j || iS == this.a - 1) {
            return new zzahp(zzahsVar, zzahsVar);
        }
        int i = iS + 1;
        return new zzahp(zzahsVar, new zzahs(jArr[i], jArr2[i]));
    }

    public final String toString() {
        String string = Arrays.toString(this.b);
        String string2 = Arrays.toString(this.c);
        String string3 = Arrays.toString(this.e);
        String string4 = Arrays.toString(this.d);
        int i = this.a;
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(string).length();
        int length3 = String.valueOf(string2).length();
        StringBuilder sb = new StringBuilder(length + 26 + length2 + 10 + length3 + 9 + String.valueOf(string3).length() + 14 + String.valueOf(string4).length() + 1);
        rl3.m(i, "ChunkIndex(length=", ", sizes=", string, sb);
        q63.y(sb, ", offsets=", string2, ", timeUs=", string3);
        return jc1.o(", durationsUs=", string4, sb, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final long zza() {
        return this.f;
    }

    public zzagc(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
        } else {
            this.f = 0L;
        }
    }
}
