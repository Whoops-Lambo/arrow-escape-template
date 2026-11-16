package com.google.android.gms.internal.ads;

import defpackage.jc1;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhle extends zzhhq {
    public final zzhld a;

    @Override // com.google.android.gms.internal.ads.zzhgt
    public final boolean a() {
        return this.a != zzhld.d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhle) && ((zzhle) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(zzhle.class, this.a);
    }

    public final String toString() {
        String str = this.a.a;
        return jc1.o("XChaCha20Poly1305 Parameters (variant: ", str, new StringBuilder(str.length() + 40), ")");
    }

    public zzhle(zzhld zzhldVar) {
        this.a = zzhldVar;
    }
}
