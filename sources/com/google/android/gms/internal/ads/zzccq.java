package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzccq extends zzccs {
    public final String a;
    public final int b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzccq)) {
            return false;
        }
        zzccq zzccqVar = (zzccq) obj;
        if (Objects.equals(this.a, zzccqVar.a)) {
            if (Integer.valueOf(this.b).equals(Integer.valueOf(zzccqVar.b))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final String zza() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final int zzb() {
        return this.b;
    }

    public zzccq(String str, int i) {
        this.a = str;
        this.b = i;
    }
}
