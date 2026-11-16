package io.p071bidmachine.media3.extractor.mp3;

import io.p071bidmachine.media3.extractor.a0;
import io.p071bidmachine.media3.extractor.y;
import io.p071bidmachine.media3.extractor.z;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements f, z {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;
    public final long h;
    public final int i;
    public final int j;
    public final boolean k;
    public final long l;

    @Override // io.p071bidmachine.media3.extractor.mp3.f
    public final int getAverageBitrate() {
        return this.i;
    }

    @Override // io.p071bidmachine.media3.extractor.mp3.f
    public final long getDataEndPosition() {
        return this.l;
    }

    @Override // io.p071bidmachine.media3.extractor.z
    public final long getDurationUs() {
        return this.f;
    }

    @Override // io.p071bidmachine.media3.extractor.z
    public final y getSeekPoints(long j) {
        long j2 = this.d;
        long j3 = this.b;
        if (j2 == -1 && !this.g) {
            a0 a0Var = new a0(0L, j3);
            return new y(a0Var, a0Var);
        }
        int i = this.e;
        long j4 = this.c;
        long jMin = (((((long) i) * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - j4);
        }
        long jMax = Math.max(jMin, 0L) + j3;
        long jMax2 = (Math.max(0L, jMax - j3) * 8000000) / ((long) i);
        a0 a0Var2 = new a0(jMax2, jMax);
        if (j2 != -1 && jMax2 < j) {
            long j5 = jMax + j4;
            if (j5 < this.a) {
                return new y(a0Var2, new a0((Math.max(0L, j5 - j3) * 8000000) / ((long) i), j5));
            }
        }
        return new y(a0Var2, a0Var2);
    }

    @Override // io.p071bidmachine.media3.extractor.mp3.f
    public final long getTimeUs(long j) {
        return (Math.max(0L, j - this.b) * 8000000) / ((long) this.e);
    }

    @Override // io.p071bidmachine.media3.extractor.z
    public final boolean isSeekable() {
        return this.d != -1 || this.g;
    }

    public a(long j, long j2, int i, int i2, boolean z) {
        int i3;
        this.a = j;
        this.b = j2;
        if (i2 == -1) {
            i3 = 1;
        } else {
            i3 = i2;
        }
        this.c = i3;
        this.e = i;
        this.g = z;
        if (j == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.d = j3;
            this.f = (Math.max(0L, j3) * 8000000) / ((long) i);
        }
        this.h = j2;
        this.i = i;
        this.j = i2;
        this.k = z;
        this.l = j == -1 ? -1L : j;
    }
}
