package com.google.android.gms.internal.ads;

import defpackage.jc1;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhxu extends zziac {
    public final zzhxt a;

    @Override // com.google.android.gms.internal.ads.zzhgt
    public final boolean a() {
        return this.a != zzhxt.e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhxu) && ((zzhxu) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(zzhxu.class, this.a);
    }

    public final String toString() {
        String str = this.a.a;
        return jc1.o("Ed25519 Parameters (variant: ", str, new StringBuilder(str.length() + 30), ")");
    }

    public zzhxu(zzhxt zzhxtVar) {
        this.a = zzhxtVar;
    }
}
