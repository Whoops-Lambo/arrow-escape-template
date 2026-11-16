package androidx.transition;

import android.graphics.Path;
import com.unity3d.services.UnityAdsConstants;
import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class ArcMotion extends PathMotion {
    @Override // androidx.transition.PathMotion
    public final Path a(float f, float f2, float f3, float f4) {
        float fC;
        float fC2;
        Path path = new Path();
        path.moveTo(f, f2);
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = (f6 * f6) + (f5 * f5);
        float f8 = (f + f3) / 2.0f;
        float f9 = (f2 + f4) / 2.0f;
        float f10 = 0.25f * f7;
        boolean z = f2 > f4;
        if (Math.abs(f5) < Math.abs(f6)) {
            float fAbs = Math.abs(f7 / (f6 * 2.0f));
            if (z) {
                fC2 = fAbs + f4;
                fC = f3;
            } else {
                fC2 = fAbs + f2;
                fC = f;
            }
        } else {
            float f11 = f7 / (f5 * 2.0f);
            if (z) {
                fC2 = f2;
                fC = f11 + f;
            } else {
                fC = f3 - f11;
                fC2 = f4;
            }
        }
        float f12 = f10 * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f13 = f8 - fC;
        float f14 = f9 - fC2;
        float f15 = (f14 * f14) + (f13 * f13);
        float f16 = f10 * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f15 >= f12) {
            f12 = f15 > f16 ? f16 : 0.0f;
        }
        if (f12 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float fSqrt = (float) Math.sqrt(f12 / f15);
            fC = h50.c(fC, f8, fSqrt, f8);
            fC2 = h50.c(fC2, f9, fSqrt, f9);
        }
        path.cubicTo((f + fC) / 2.0f, (f2 + fC2) / 2.0f, (fC + f3) / 2.0f, (fC2 + f4) / 2.0f, f3, f4);
        return path;
    }

    static {
        Math.tan(Math.toRadians(35.0d));
    }
}
