package io.p071bidmachine.media3.extractor;

import io.p071bidmachine.media3.common.d0;
import io.p071bidmachine.media3.common.f0;
import io.p071bidmachine.media3.common.m;
import io.p071bidmachine.media3.common.n;
import io.p071bidmachine.media3.common.util.p;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.exoplayer.offline.b;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class r {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final b k;
    public final d0 l;

    public final n c(byte[] bArr, d0 d0Var) {
        bArr[4] = -128;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        d0 d0Var2 = this.l;
        if (d0Var2 != null) {
            d0Var = d0Var2.b(d0Var);
        }
        m mVar = new m();
        mVar.m = f0.p("audio/flac");
        mVar.n = i;
        mVar.C = this.g;
        mVar.D = this.e;
        mVar.E = x.y(this.h);
        mVar.p = Collections.singletonList(bArr);
        mVar.k = d0Var;
        return new n(mVar);
    }

    public static int a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.e);
    }

    public r(byte[] bArr, int i) {
        p pVar = new p(bArr, bArr.length);
        pVar.q(i * 8);
        this.a = pVar.i(16);
        this.b = pVar.i(16);
        this.c = pVar.i(24);
        this.d = pVar.i(24);
        int i2 = pVar.i(20);
        this.e = i2;
        this.f = d(i2);
        this.g = pVar.i(3) + 1;
        int i3 = pVar.i(5) + 1;
        this.h = i3;
        this.i = a(i3);
        this.j = pVar.k(36);
        this.k = null;
        this.l = null;
    }

    public static int d(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public r(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, b bVar, d0 d0Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = d(i5);
        this.g = i6;
        this.h = i7;
        this.i = a(i7);
        this.j = j;
        this.k = bVar;
        this.l = d0Var;
    }
}
