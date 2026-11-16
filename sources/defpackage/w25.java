package defpackage;

import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzxt;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class w25 {
    public final zzxt a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w25.class == obj.getClass()) {
            w25 w25Var = (w25) obj;
            if (this.b == w25Var.b && this.d == w25Var.d && this.e == w25Var.e && this.f == w25Var.f && this.g == w25Var.g && this.h == w25Var.h && Objects.equals(this.a, w25Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final w25 a(long j, long j2) {
        return (j == this.b && j2 == this.c) ? this : new w25(this.a, j, j2, this.d, this.e, this.f, this.g, this.h);
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.b)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 961) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }

    public w25(zzxt zzxtVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        boolean z4;
        if (!z3 || z) {
            z4 = true;
        } else {
            z4 = false;
        }
        zzgvz.a(z4);
        zzgvz.a(!z2 || z);
        this.a = zzxtVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }
}
