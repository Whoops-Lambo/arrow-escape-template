package com.bytedance.adsdk.ahm;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;
import com.unity3d.services.UnityAdsConstants;
import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
class dg implements Interpolator {
    private final float[] ahm;
    private final float[] kgy;

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        float[] fArr;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int length = this.kgy.length - 1;
        int i = 0;
        while (true) {
            int i2 = length - i;
            fArr = this.kgy;
            if (i2 <= 1) {
                break;
            }
            int i3 = (i + length) / 2;
            if (f < fArr[i3]) {
                length = i3;
            } else {
                i = i3;
            }
        }
        float f2 = fArr[length];
        float f3 = fArr[i];
        float f4 = f2 - f3;
        float[] fArr2 = this.ahm;
        if (f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return fArr2[i];
        }
        float f5 = fArr2[i];
        return h50.c(fArr2[length], f5, (f - f3) / f4, f5);
    }

    private static Path kgy(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        return path;
    }

    public dg(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = (int) (length / 0.002f);
        int i2 = i + 1;
        this.kgy = new float[i2];
        this.ahm = new float[i2];
        float[] fArr = new float[2];
        for (int i3 = 0; i3 < i2; i3++) {
            pathMeasure.getPosTan((i3 * length) / i, fArr, null);
            this.kgy[i3] = fArr[0];
            this.ahm[i3] = fArr[1];
        }
    }

    public dg(float f, float f2, float f3, float f4) {
        this(kgy(f, f2, f3, f4));
    }
}
