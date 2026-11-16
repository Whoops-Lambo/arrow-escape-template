package com.google.android.gms.internal.ads;

import defpackage.jc1;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhji extends zzhhq {
    public final zzhjh a;

    @Override // com.google.android.gms.internal.ads.zzhgt
    public final boolean a() {
        return this.a != zzhjh.d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhji) && ((zzhji) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(zzhji.class, this.a);
    }

    public final String toString() {
        String str = this.a.a;
        return jc1.o("ChaCha20Poly1305 Parameters (variant: ", str, new StringBuilder(str.length() + 39), ")");
    }

    public zzhji(zzhjh zzhjhVar) {
        this.a = zzhjhVar;
    }
}
