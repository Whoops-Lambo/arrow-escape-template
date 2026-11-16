package io.p071bidmachine.media3.common;

import android.net.Uri;
import com.explorestack.protobuf.z;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.d31;
import defpackage.y32;
import defpackage.z21;
import io.p071bidmachine.media3.common.util.x;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class q0 {
    public static final Object p = new Object();
    public static final y q;
    public Object a = p;
    public y b = q;
    public Object c;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public boolean h;
    public u i;
    public boolean j;
    public long k;
    public long l;
    public int m;
    public int n;
    public long o;

    static {
        q qVar = new q();
        z21 z21Var = d31.b;
        y32 y32Var = y32.e;
        List list = Collections.EMPTY_LIST;
        y32 y32Var2 = y32.e;
        t tVar = new t();
        w wVar = w.a;
        Uri uri = Uri.EMPTY;
        q = new y("io.bidmachine.media3.common.Timeline", new s(qVar), uri != null ? new v(uri, null, null, list, y32Var2, -9223372036854775807L) : null, new u(tVar), b0.B, wVar);
        z.p(1, 2, 3, 4, 5);
        z.p(6, 7, 8, 9, 10);
        x.G(11);
        x.G(12);
        x.G(13);
    }

    public final boolean a() {
        return this.i != null;
    }

    public final void b(y yVar, Object obj, long j, long j2, long j3, boolean z, boolean z2, u uVar, long j4, long j5, int i, long j6) {
        this.a = p;
        this.b = yVar != null ? yVar : q;
        if (yVar != null) {
            v vVar = yVar.b;
        }
        this.c = obj;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = z;
        this.h = z2;
        this.i = uVar;
        this.k = j4;
        this.l = j5;
        this.m = 0;
        this.n = i;
        this.o = j6;
        this.j = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !q0.class.equals(obj.getClass())) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Objects.equals(this.a, q0Var.a) && Objects.equals(this.b, q0Var.b) && Objects.equals(this.c, q0Var.c) && Objects.equals(this.i, q0Var.i) && this.d == q0Var.d && this.e == q0Var.e && this.f == q0Var.f && this.g == q0Var.g && this.h == q0Var.h && this.j == q0Var.j && this.k == q0Var.k && this.l == q0Var.l && this.m == q0Var.m && this.n == q0Var.n && this.o == q0Var.o;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + ((this.a.hashCode() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31)) * 31;
        Object obj = this.c;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        u uVar = this.i;
        int iHashCode3 = (iHashCode2 + (uVar != null ? uVar.hashCode() : 0)) * 31;
        long j = this.d;
        int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.e;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31;
        long j4 = this.k;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.l;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.m) * 31) + this.n) * 31;
        long j6 = this.o;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
