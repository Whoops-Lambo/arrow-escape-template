package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzrm {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final zzd e;
    public final int f;
    public final int g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzrm.class == obj.getClass()) {
            zzrm zzrmVar = (zzrm) obj;
            if (this.a == zzrmVar.a && this.b == zzrmVar.b && this.c == zzrmVar.c && this.d == zzrmVar.d && this.f == zzrmVar.f && this.g == zzrmVar.g && this.e.equals(zzrmVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.a);
        Integer numValueOf2 = Integer.valueOf(this.b);
        Integer numValueOf3 = Integer.valueOf(this.c);
        Boolean bool = Boolean.FALSE;
        return Objects.hash(numValueOf, numValueOf2, numValueOf3, bool, bool, Integer.valueOf(this.d), this.e, Integer.valueOf(this.f), Integer.valueOf(this.g), bool, bool);
    }

    public /* synthetic */ zzrm(zzrl zzrlVar) {
        this.a = zzrlVar.a;
        this.b = zzrlVar.b;
        this.c = zzrlVar.c;
        this.d = zzrlVar.d;
        this.e = zzrlVar.e;
        this.f = zzrlVar.f;
        this.g = zzrlVar.g;
    }
}
