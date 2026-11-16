package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzbd {
    public Object a;
    public Object b;
    public int c;
    public long d;
    public boolean e;
    public zzc f = zzc.b;

    static {
        String str = zzfq.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public final void a(Object obj, Object obj2, int i, long j, boolean z) {
        zzc zzcVar = zzc.b;
        this.a = obj;
        this.b = obj2;
        this.c = i;
        this.d = j;
        this.f = zzcVar;
        this.e = z;
    }

    public final long b(int i, int i2) {
        zza zzaVarA = this.f.a(i);
        if (zzaVarA.a != -1) {
            return zzaVarA.e[i2];
        }
        return -9223372036854775807L;
    }

    public final void c(int i) {
        this.f.a(i).getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !zzbd.class.equals(obj.getClass())) {
            return false;
        }
        zzbd zzbdVar = (zzbd) obj;
        return Objects.equals(this.a, zzbdVar.a) && Objects.equals(this.b, zzbdVar.b) && this.c == zzbdVar.c && this.d == zzbdVar.d && this.e == zzbdVar.e && Objects.equals(this.f, zzbdVar.f);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        int i = com.explorestack.protobuf.z.i(iHashCode, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 31, obj2 != null ? obj2.hashCode() : 0, 31) + this.c;
        long j = this.d;
        return this.f.hashCode() + (((((i * 31) + ((int) (j ^ (j >>> 32)))) * 961) + (this.e ? 1 : 0)) * 31);
    }
}
