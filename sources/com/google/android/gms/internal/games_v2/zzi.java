package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzi implements Api.ApiOptions.Optional {
    public final int a;
    public final String b;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzi)) {
            return false;
        }
        zzi zziVar = (zzi) obj;
        return this.a == zziVar.a && Objects.equal(this.b, zziVar.b);
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.a), this.b);
    }

    public /* synthetic */ zzi(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
