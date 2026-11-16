package com.google.android.gms.internal.ads;

import defpackage.nj;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzalk implements zzao {
    public final float a;
    public final zzalj b;
    public final zzalj c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzalk)) {
            return false;
        }
        zzalk zzalkVar = (zzalk) obj;
        return Float.compare(this.a, zzalkVar.a) == 0 && Objects.equals(this.b, zzalkVar.b) && Objects.equals(this.c, zzalkVar.c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.a) * 31;
        zzalj zzaljVar = this.b;
        int iHashCode2 = (iHashCode + (zzaljVar != null ? zzaljVar.hashCode() : 0)) * 31;
        zzalj zzaljVar2 = this.c;
        return iHashCode2 + (zzaljVar2 != null ? zzaljVar2.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(this.c);
        float f = this.a;
        int length = String.valueOf(f).length();
        StringBuilder sb = new StringBuilder(length + 37 + strValueOf.length() + 10 + strValueOf2.length());
        sb.append("ReplayGain Xing/Info: peak=");
        sb.append(f);
        sb.append(", field 1=");
        sb.append(strValueOf);
        return nj.q(sb, ", field 2=", strValueOf2);
    }

    public zzalk(float f, zzalj zzaljVar, zzalj zzaljVar2) {
        this.a = f;
        this.b = zzaljVar;
        this.c = zzaljVar2;
    }
}
