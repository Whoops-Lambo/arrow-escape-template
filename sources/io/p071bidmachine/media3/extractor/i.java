package io.p071bidmachine.media3.extractor;

import io.p071bidmachine.media3.common.util.x;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class i implements z {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    @Override // io.p071bidmachine.media3.extractor.z
    public final boolean isSeekable() {
        return true;
    }

    @Override // io.p071bidmachine.media3.extractor.z
    public final long getDurationUs() {
        return this.f;
    }

    @Override // io.p071bidmachine.media3.extractor.z
    public final y getSeekPoints(long j) {
        long[] jArr = this.e;
        int iE = x.e(jArr, j, true);
        long j2 = jArr[iE];
        long[] jArr2 = this.c;
        a0 a0Var = new a0(j2, jArr2[iE]);
        if (j2 >= j || iE == this.a - 1) {
            return new y(a0Var, a0Var);
        }
        int i = iE + 1;
        return new y(a0Var, new a0(jArr[i], jArr2[i]));
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }

    public i(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
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
