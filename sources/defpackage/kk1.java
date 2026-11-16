package defpackage;

import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class kk1 {
    public final MediaSource.MediaPeriodId a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kk1.class == obj.getClass()) {
            kk1 kk1Var = (kk1) obj;
            if (this.b == kk1Var.b && this.c == kk1Var.c && this.d == kk1Var.d && this.e == kk1Var.e && this.f == kk1Var.f && this.g == kk1Var.g && this.h == kk1Var.h && this.i == kk1Var.i && Util.areEqual(this.a, kk1Var.a)) {
                return true;
            }
        }
        return false;
    }

    public kk1(MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        Assertions.checkArgument(!z4 || z2);
        Assertions.checkArgument(!z3 || z2);
        if (z && (z2 || z3 || z4)) {
            z5 = false;
        }
        Assertions.checkArgument(z5);
        this.a = mediaPeriodId;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final kk1 a(long j) {
        if (j == this.c) {
            return this;
        }
        return new kk1(this.a, this.b, j, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final kk1 b(long j) {
        if (j == this.b) {
            return this;
        }
        return new kk1(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
