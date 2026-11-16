package com.google.android.gms.auth.api;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public final class zbd implements Api.ApiOptions.Optional {
    public static final zbd c = new zbd(new zbc());
    public final boolean a;
    public final String b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zbd)) {
            return false;
        }
        zbd zbdVar = (zbd) obj;
        return Objects.equal(null, null) && this.a == zbdVar.a && Objects.equal(this.b, zbdVar.b);
    }

    public final int hashCode() {
        return Objects.hashCode(null, Boolean.valueOf(this.a), this.b);
    }

    public zbd(zbc zbcVar) {
        this.a = zbcVar.a.booleanValue();
        this.b = zbcVar.b;
    }
}
