package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzsf {
    public final zzv a;
    public final zzhcn b;
    public final zzbf c;
    public final zzxt d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzsf)) {
            return false;
        }
        zzsf zzsfVar = (zzsf) obj;
        return this.a.equals(zzsfVar.a) && Objects.equals(this.b, zzsfVar.b) && this.c.equals(zzsfVar.c) && Objects.equals(this.d, zzsfVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 961;
        zzhcn zzhcnVar = this.b;
        int iHashCode2 = this.c.hashCode() + ((iHashCode + (zzhcnVar == null ? 0 : zzhcnVar.hashCode())) * 31);
        zzxt zzxtVar = this.d;
        return (iHashCode2 * 31) + (zzxtVar != null ? zzxtVar.hashCode() : 0);
    }

    public /* synthetic */ zzsf(zzse zzseVar) {
        this.a = zzseVar.a;
        this.b = zzseVar.b;
        this.c = zzseVar.c;
        this.d = zzseVar.d;
    }
}
