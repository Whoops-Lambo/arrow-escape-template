package com.google.android.gms.internal.ads;

import defpackage.q63;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhkc extends zzhhq {
    public final zzhkb a;
    public final String b;
    public final zzhka c;
    public final zzhhq d;

    @Override // com.google.android.gms.internal.ads.zzhgt
    public final boolean a() {
        return this.a != zzhkb.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhkc)) {
            return false;
        }
        zzhkc zzhkcVar = (zzhkc) obj;
        return zzhkcVar.c.equals(this.c) && zzhkcVar.d.equals(this.d) && zzhkcVar.b.equals(this.b) && zzhkcVar.a.equals(this.a);
    }

    public final int hashCode() {
        return Objects.hash(zzhkc.class, this.b, this.c, this.d, this.a);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        String strValueOf3 = String.valueOf(this.a);
        String str = this.b;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        StringBuilder sb = new StringBuilder(length + 64 + length2 + 27 + strValueOf2.length() + 11 + strValueOf3.length() + 1);
        q63.y(sb, "LegacyKmsEnvelopeAead Parameters (kekUri: ", str, ", dekParsingStrategy: ", strValueOf);
        q63.y(sb, ", dekParametersForNewKeys: ", strValueOf2, ", variant: ", strValueOf3);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ zzhkc(zzhkb zzhkbVar, String str, zzhka zzhkaVar, zzhhq zzhhqVar) {
        this.a = zzhkbVar;
        this.b = str;
        this.c = zzhkaVar;
        this.d = zzhhqVar;
    }
}
