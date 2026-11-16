package io.p071bidmachine.media3.common;

import com.vungle.ads.internal.protos.Sdk;
import io.p071bidmachine.media3.common.util.x;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class b1 {
    public static final b1 d = new b1(0, 0, 1.0f);
    public final int a;
    public final int b;
    public final float c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.a == b1Var.a && this.b == b1Var.b && this.c == b1Var.c) {
                return true;
            }
        }
        return false;
    }

    static {
        x.G(0);
        x.G(1);
        x.G(3);
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.c) + ((((Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + this.a) * 31) + this.b) * 31);
    }

    public b1(int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }
}
