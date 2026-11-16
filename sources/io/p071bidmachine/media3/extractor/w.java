package io.p071bidmachine.media3.extractor;

import com.facebook.appevents.t;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.x;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class w implements z {
    public final t a;
    public final t b;
    public long c;

    @Override // io.p071bidmachine.media3.extractor.z
    public final long getDurationUs() {
        return this.c;
    }

    @Override // io.p071bidmachine.media3.extractor.z
    public final y getSeekPoints(long j) {
        t tVar = this.b;
        if (tVar.a == 0) {
            a0 a0Var = a0.c;
            return new y(a0Var, a0Var);
        }
        int iB = x.b(tVar, j);
        long jI = tVar.i(iB);
        t tVar2 = this.a;
        a0 a0Var2 = new a0(jI, tVar2.i(iB));
        if (jI == j || iB == tVar.a - 1) {
            return new y(a0Var2, a0Var2);
        }
        int i = iB + 1;
        return new y(a0Var2, new a0(tVar.i(i), tVar2.i(i)));
    }

    @Override // io.p071bidmachine.media3.extractor.z
    public final boolean isSeekable() {
        return this.b.a > 0;
    }

    public w(long[] jArr, long[] jArr2, long j) {
        boolean z;
        if (jArr.length == jArr2.length) {
            z = true;
        } else {
            z = false;
        }
        a.c(z);
        int length = jArr2.length;
        if (length > 0 && jArr2[0] > 0) {
            int i = length + 1;
            t tVar = new t(i);
            this.a = tVar;
            t tVar2 = new t(i);
            this.b = tVar2;
            tVar.d(0L);
            tVar2.d(0L);
        } else {
            this.a = new t(length);
            this.b = new t(length);
        }
        this.a.e(jArr);
        this.b.e(jArr2);
        this.c = j;
    }
}
