package com.google.android.gms.internal.ads;

import defpackage.pv1;
import defpackage.rl3;
import io.p071bidmachine.protobuf.EventTypeExtended;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzalj {
    public final int a;
    public final int b;
    public final float c;

    public static /* synthetic */ zzalj a(int i) {
        int i2 = i >> 13;
        if (i2 == 0) {
            return null;
        }
        return new zzalj(i2, (i >> 10) & 7, ((i & EventTypeExtended.EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE) * ((i & 512) != 0 ? -1 : 1)) / 10.0f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzalj)) {
            return false;
        }
        zzalj zzaljVar = (zzalj) obj;
        return this.a == zzaljVar.a && this.b == zzaljVar.b && Float.compare(this.c, zzaljVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        int length2 = String.valueOf(i2).length();
        float f = this.c;
        StringBuilder sb = new StringBuilder(rl3.v(length, 28, length2, 7, String.valueOf(f).length()) + 1);
        pv1.s(i, i2, "GainField{name=", ", originator=", sb);
        sb.append(", gain=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }

    public zzalj(int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }
}
