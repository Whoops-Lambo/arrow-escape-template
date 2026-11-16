package com.google.android.gms.internal.ads;

import defpackage.n30;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhkx extends zzhhq {
    public final zzhkw a;
    public final int b;

    public static zzhkx b(zzhkw zzhkwVar, int i) throws GeneralSecurityException {
        if (i >= 8 && i <= 12) {
            return new zzhkx(zzhkwVar, i);
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.d("Salt size must be between 8 and 12 bytes");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhgt
    public final boolean a() {
        return this.a != zzhkw.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhkx)) {
            return false;
        }
        zzhkx zzhkxVar = (zzhkx) obj;
        return zzhkxVar.a == this.a && zzhkxVar.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(zzhkx.class, this.a, Integer.valueOf(this.b));
    }

    public final String toString() {
        String str = this.a.a;
        int length = str.length();
        int i = this.b;
        StringBuilder sb = new StringBuilder(length + 48 + String.valueOf(i).length() + 1);
        n30.t(i, "X-AES-GCM Parameters (variant: ", str, "salt_size_bytes: ", sb);
        sb.append(")");
        return sb.toString();
    }

    public zzhkx(zzhkw zzhkwVar, int i) {
        this.a = zzhkwVar;
        this.b = i;
    }
}
