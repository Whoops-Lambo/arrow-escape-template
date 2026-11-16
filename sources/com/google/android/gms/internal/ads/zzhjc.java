package com.google.android.gms.internal.ads;

import defpackage.n30;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhjc extends zzhhq {
    public final int a;
    public final zzhjb b;

    @Override // com.google.android.gms.internal.ads.zzhgt
    public final boolean a() {
        return this.b != zzhjb.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhjc)) {
            return false;
        }
        zzhjc zzhjcVar = (zzhjc) obj;
        return zzhjcVar.a == this.a && zzhjcVar.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(zzhjc.class, Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        int length = strValueOf.length();
        int i = this.a;
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(i).length() + 10);
        n30.t(i, "AesGcmSiv Parameters (variant: ", strValueOf, ", ", sb);
        sb.append("-byte key)");
        return sb.toString();
    }

    public /* synthetic */ zzhjc(int i, zzhjb zzhjbVar) {
        this.a = i;
        this.b = zzhjbVar;
    }
}
