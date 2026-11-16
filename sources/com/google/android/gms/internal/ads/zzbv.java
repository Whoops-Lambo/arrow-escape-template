package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzbv {
    public static final zzbv d = new zzbv(0, 0, 1.0f);
    public final int a;
    public final int b;
    public final float c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbv) {
            zzbv zzbvVar = (zzbv) obj;
            if (this.a == zzbvVar.a && this.b == zzbvVar.b && this.c == zzbvVar.c) {
                return true;
            }
        }
        return false;
    }

    static {
        String str = zzfq.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.c) + ((((this.a + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31) + this.b) * 31);
    }

    public zzbv(int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }
}
