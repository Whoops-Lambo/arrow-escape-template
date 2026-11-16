package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.unity3d.services.UnityAdsConstants;
import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class e implements b {
    public final long a;
    public final long b;
    public final long c;
    public final long[] d;
    public final long e;
    public final int f;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b
    public final long b(long j) {
        long j2 = 0;
        if (a()) {
            long j3 = this.a;
            if (j >= j3) {
                double d = ((j - j3) * 256.0d) / this.e;
                int iA = z.a(this.d, (long) d, false);
                int i = iA + 1;
                long j4 = this.b;
                long j5 = (((long) i) * j4) / 100;
                long j6 = i == 0 ? 0L : this.d[iA];
                long j7 = i == 99 ? 256L : this.d[i];
                long j8 = (j4 * ((long) (iA + 2))) / 100;
                if (j7 != j6) {
                    j2 = (long) (((d - j6) * (j8 - j5)) / (j7 - j6));
                }
                return j5 + j2;
            }
        }
        return 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.b;
    }

    public e(long j, long j2, long j3, long[] jArr, long j4, int i) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = jArr;
        this.e = j4;
        this.f = i;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j) {
        long j2;
        if (!a()) {
            return this.a;
        }
        float f = (j * 100.0f) / this.b;
        float fC = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f2 = 256.0f;
            if (f >= 100.0f) {
                fC = 256.0f;
            } else {
                int i = (int) f;
                if (i != 0) {
                    fC = this.d[i - 1];
                }
                if (i < 99) {
                    f2 = this.d[i];
                }
                fC = h50.c(f, i, f2 - fC, fC);
            }
        }
        long jRound = Math.round(((double) fC) * 0.00390625d * this.e);
        long j3 = this.a;
        long j4 = jRound + j3;
        long j5 = this.c;
        if (j5 != -1) {
            j2 = j5 - 1;
        } else {
            j2 = ((j3 - ((long) this.f)) + this.e) - 1;
        }
        return Math.min(j4, j2);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return this.d != null;
    }
}
