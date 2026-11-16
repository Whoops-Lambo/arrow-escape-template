package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class b {
    public final y a;
    public final int b;
    public final int[] c;
    public final o[] d;
    public final long[] e;
    public int f;

    public abstract int a();

    public abstract Object b();

    public abstract int c();

    public abstract void d();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.a == bVar.a && Arrays.equals(this.c, bVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f;
    }

    public b(y yVar, int... iArr) {
        o[] oVarArr;
        if (iArr.length > 0) {
            yVar.getClass();
            this.a = yVar;
            int length = iArr.length;
            this.b = length;
            this.d = new o[length];
            int i = 0;
            int i2 = 0;
            while (true) {
                int length2 = iArr.length;
                oVarArr = this.d;
                if (i2 >= length2) {
                    break;
                }
                oVarArr[i2] = yVar.b[iArr[i2]];
                i2++;
            }
            Arrays.sort(oVarArr, new a());
            this.c = new int[this.b];
            while (true) {
                int i3 = this.b;
                if (i < i3) {
                    this.c[i] = yVar.a(this.d[i]);
                    i++;
                } else {
                    this.e = new long[i3];
                    return;
                }
            }
        } else {
            io.p071bidmachine.media3.extractor.ts.y.b();
            throw null;
        }
    }

    public final boolean a(int i) {
        boolean z;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.e[i] > jElapsedRealtime) {
            z = true;
        } else {
            z = false;
        }
        for (int i2 = 0; i2 < this.b && !z; i2++) {
            if (i2 != i && this.e[i2] <= jElapsedRealtime) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            return false;
        }
        long[] jArr = this.e;
        jArr[i] = Math.max(jArr[i], jElapsedRealtime + 60000);
        return true;
    }
}
