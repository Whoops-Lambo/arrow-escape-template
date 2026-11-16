package io.p071bidmachine.media3.common;

import com.unity3d.services.UnityAdsConstants;
import io.p071bidmachine.media3.common.util.x;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class u {
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.a == uVar.a && this.b == uVar.b && this.c == uVar.c && this.d == uVar.d && this.e == uVar.e;
    }

    static {
        new t().a();
        x.G(0);
        x.G(1);
        x.G(2);
        x.G(3);
        x.G(4);
    }

    public u(t tVar) {
        long j = tVar.a;
        long j2 = tVar.b;
        long j3 = tVar.c;
        float f = tVar.d;
        float f2 = tVar.e;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = f;
        this.e = f2;
    }

    public final t a() {
        t tVar = new t();
        tVar.a = this.a;
        tVar.b = this.b;
        tVar.c = this.c;
        tVar.d = this.d;
        tVar.e = this.e;
        return tVar;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.c;
        int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
        float f = this.d;
        int iFloatToIntBits = (i2 + (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.e;
        return iFloatToIntBits + (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f2) : 0);
    }
}
