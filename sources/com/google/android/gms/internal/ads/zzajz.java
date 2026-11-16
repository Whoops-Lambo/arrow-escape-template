package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzajz extends zzakg {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final zzakg[] f;

    public zzajz(String str, boolean z, boolean z2, String[] strArr, zzakg[] zzakgVarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = zzakgVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzajz.class != obj.getClass()) {
            return false;
        }
        zzajz zzajzVar = (zzajz) obj;
        return this.c == zzajzVar.c && this.d == zzajzVar.d && this.b.equals(zzajzVar.b) && Arrays.equals(this.e, zzajzVar.e) && Arrays.equals(this.f, zzajzVar.f);
    }

    public final int hashCode() {
        return this.b.hashCode() + (((((this.c ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.d ? 1 : 0)) * 31);
    }
}
