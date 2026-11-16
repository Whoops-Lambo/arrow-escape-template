package io.p071bidmachine.media3.common;

import com.explorestack.protobuf.z;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class p0 {
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public b g = b.c;

    static {
        z.p(0, 1, 2, 3, 4);
    }

    public final long a(int i, int i2) {
        a aVarA = this.g.a(i);
        if (aVarA.a != -1) {
            return aVarA.f[i2];
        }
        return -9223372036854775807L;
    }

    public final int b(long j) {
        a aVarA;
        int i;
        b bVar = this.g;
        long j2 = this.d;
        int i2 = bVar.a;
        if (j != Long.MIN_VALUE && (j2 == -9223372036854775807L || j < j2)) {
            int i3 = 0;
            while (i3 < i2) {
                bVar.a(i3).getClass();
                bVar.a(i3).getClass();
                if (0 > j && ((i = (aVarA = bVar.a(i3)).a) == -1 || aVarA.a(-1) < i)) {
                    break;
                }
                i3++;
            }
            if (i3 < i2) {
                return i3;
            }
        }
        return -1;
    }

    public final int c(long j) {
        b bVar = this.g;
        int i = bVar.a;
        int i2 = i - 1;
        if (i2 == i - 1) {
            bVar.a(i2).getClass();
        }
        while (i2 >= 0 && j != Long.MIN_VALUE) {
            bVar.a(i2).getClass();
            if (j >= 0) {
                break;
            }
            i2--;
        }
        if (i2 >= 0) {
            a aVarA = bVar.a(i2);
            int i3 = aVarA.a;
            if (i3 != -1) {
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = aVarA.e[i4];
                    if (i5 != 0 && i5 != 1) {
                    }
                }
            }
            return i2;
        }
        return -1;
    }

    public final long d(int i) {
        this.g.a(i).getClass();
        return 0L;
    }

    public final int e(int i) {
        return this.g.a(i).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p0.class.equals(obj.getClass())) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return Objects.equals(this.a, p0Var.a) && Objects.equals(this.b, p0Var.b) && this.c == p0Var.c && this.d == p0Var.d && this.e == p0Var.e && this.f == p0Var.f && Objects.equals(this.g, p0Var.g);
    }

    public final boolean f(int i) {
        b bVar = this.g;
        int i2 = bVar.a;
        if (i != i2 - 1 || i != i2 - 1) {
            return false;
        }
        bVar.a(i).getClass();
        return false;
    }

    public final boolean g(int i) {
        this.g.a(i).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i, long j, long j2, b bVar, boolean z) {
        this.a = obj;
        this.b = obj2;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.g = bVar;
        this.f = z;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
        long j = this.d;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.e;
        return this.g.hashCode() + ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
    }
}
