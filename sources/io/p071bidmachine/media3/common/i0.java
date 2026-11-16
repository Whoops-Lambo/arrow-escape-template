package io.p071bidmachine.media3.common;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.x;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class i0 {
    public static final i0 d = new i0(1.0f, 1.0f);
    public final float a;
    public final float b;
    public final int c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i0.class == obj.getClass()) {
            i0 i0Var = (i0) obj;
            if (this.a == i0Var.a && this.b == i0Var.b) {
                return true;
            }
        }
        return false;
    }

    static {
        x.G(0);
        x.G(1);
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.b)};
        int i = x.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public i0(float f, float f2) {
        boolean z;
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            z = true;
        } else {
            z = false;
        }
        a.c(z);
        a.c(f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.a = f;
        this.b = f2;
        this.c = Math.round(f * 1000.0f);
    }
}
