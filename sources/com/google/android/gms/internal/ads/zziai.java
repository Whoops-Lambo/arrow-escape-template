package com.google.android.gms.internal.ads;

import defpackage.nj;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zziai extends zziac {
    public final zziaf a = zziaf.a;
    public final zziag b = zziag.a;
    public final zziah c;

    @Override // com.google.android.gms.internal.ads.zzhgt
    public final boolean a() {
        return this.c != zziah.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zziai)) {
            return false;
        }
        zziai zziaiVar = (zziai) obj;
        return zziaiVar.a == this.a && zziaiVar.b == this.b && zziaiVar.c == this.c;
    }

    public final int hashCode() {
        return Objects.hash(zziai.class, this.a, 64, this.b, this.c);
    }

    public final String toString() {
        this.a.getClass();
        this.b.getClass();
        String str = this.c.a;
        return nj.q(new StringBuilder(37 + str.length()), "SLH-DSA-SHA2-128S instance, variant: ", str);
    }

    public zziai(zziah zziahVar) {
        this.c = zziahVar;
    }
}
