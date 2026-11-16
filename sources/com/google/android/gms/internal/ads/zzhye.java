package com.google.android.gms.internal.ads;

import defpackage.jc1;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhye extends zziac {
    public final zzhyc a = zzhyc.a;
    public final zzhyd b;

    @Override // com.google.android.gms.internal.ads.zzhgt
    public final boolean a() {
        return this.b != zzhyd.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhye)) {
            return false;
        }
        zzhye zzhyeVar = (zzhye) obj;
        return zzhyeVar.a == this.a && zzhyeVar.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(zzhye.class, this.a, this.b);
    }

    public final String toString() {
        this.a.getClass();
        String str = this.b.a;
        return jc1.o("ML-DSA Parameters (ML-DSA instance: ML_DSA_65, variant: ", str, new StringBuilder(str.length() + 57), ")");
    }

    public zzhye(zzhyd zzhydVar) {
        this.b = zzhydVar;
    }
}
