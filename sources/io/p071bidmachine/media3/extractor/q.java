package io.p071bidmachine.media3.extractor;

import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.exoplayer.offline.b;
import io.p071bidmachine.media3.extractor.avi.e;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class q implements z {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public q(long j, long j2) {
        this.a = 1;
        this.b = j;
        a0 a0Var = j2 == 0 ? a0.c : new a0(0L, j2);
        this.c = new y(a0Var, a0Var);
    }

    @Override // io.p071bidmachine.media3.extractor.z
    public final long getDurationUs() {
        switch (this.a) {
            case 0:
                return ((r) this.c).b();
            case 1:
                return this.b;
            default:
                return this.b;
        }
    }

    @Override // io.p071bidmachine.media3.extractor.z
    public final y getSeekPoints(long j) {
        int i = this.a;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                r rVar = (r) obj;
                a.j(rVar.k);
                b bVar = rVar.k;
                long[] jArr = (long[]) bVar.b;
                long[] jArr2 = (long[]) bVar.c;
                int iE = x.e(jArr, x.i((((long) rVar.e) * j) / 1000000, 0L, rVar.j - 1), false);
                long j2 = iE == -1 ? 0L : jArr[iE];
                long j3 = iE != -1 ? jArr2[iE] : 0L;
                int i3 = rVar.e;
                long j4 = (j2 * 1000000) / ((long) i3);
                long j5 = this.b;
                a0 a0Var = new a0(j4, j3 + j5);
                if (j4 == j || iE == jArr.length - 1) {
                    return new y(a0Var, a0Var);
                }
                int i4 = iE + 1;
                return new y(a0Var, new a0((jArr[i4] * 1000000) / ((long) i3), j5 + jArr2[i4]));
            case 1:
                return (y) obj;
            default:
                io.p071bidmachine.media3.extractor.avi.b bVar2 = (io.p071bidmachine.media3.extractor.avi.b) obj;
                y yVarB = bVar2.i[0].b(j);
                while (true) {
                    e[] eVarArr = bVar2.i;
                    if (i2 >= eVarArr.length) {
                        return yVarB;
                    }
                    y yVarB2 = eVarArr[i2].b(j);
                    if (yVarB2.a.b < yVarB.a.b) {
                        yVarB = yVarB2;
                    }
                    i2++;
                }
                break;
        }
    }

    @Override // io.p071bidmachine.media3.extractor.z
    public final boolean isSeekable() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(long j) {
        this(j, 0L);
        this.a = 1;
    }

    public /* synthetic */ q(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
