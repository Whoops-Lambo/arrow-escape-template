package com.google.android.gms.internal.ads;

import defpackage.q63;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhjs extends zzhhq {
    public final String a;
    public final zzhjr b;

    @Override // com.google.android.gms.internal.ads.zzhgt
    public final boolean a() {
        return this.b != zzhjr.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhjs)) {
            return false;
        }
        zzhjs zzhjsVar = (zzhjs) obj;
        return zzhjsVar.a.equals(this.a) && zzhjsVar.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(zzhjs.class, this.a, this.b);
    }

    public final String toString() {
        String str = this.b.a;
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 45 + str.length() + 1);
        q63.y(sb, "LegacyKmsAead Parameters (keyUri: ", str2, ", variant: ", str);
        sb.append(")");
        return sb.toString();
    }

    public zzhjs(String str, zzhjr zzhjrVar) {
        this.a = str;
        this.b = zzhjrVar;
    }
}
