package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhov extends zzhgt {
    public final zzhgz a;

    @Override // com.google.android.gms.internal.ads.zzhgt
    public final boolean a() {
        return this.a.c != zzhgw.e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzhov) {
            zzhgz zzhgzVar = ((zzhov) obj).a;
            zzhgz zzhgzVar2 = this.a;
            if (zzhgzVar2.c == zzhgzVar.c && zzhgzVar2.b.equals(zzhgzVar.b) && zzhgzVar2.a.equals(zzhgzVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        zzhgz zzhgzVar = this.a;
        return Objects.hash(zzhgzVar.b, zzhgzVar.a, zzhgzVar.c);
    }

    public final String toString() {
        zzhgz zzhgzVar = this.a;
        return "(typeUrl=" + zzhgzVar.b + ", outputPrefixType=" + zzhgzVar.c + ")";
    }

    public zzhov(zzhgz zzhgzVar) {
        this.a = zzhgzVar;
    }
}
