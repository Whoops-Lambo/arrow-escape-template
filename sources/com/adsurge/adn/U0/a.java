package com.adsurge.adn.U0;

import android.graphics.Color;
import com.unity3d.services.UnityAdsConstants;
import defpackage.d;
import defpackage.nj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static final ThreadLocal a = new ThreadLocal();

    public static void a(int i, int i2, int i3, double[] dArr) {
        if (dArr.length != 3) {
            d.r("outXyz must have a length of 3.");
            return;
        }
        double d = ((double) i) / 255.0d;
        double dPow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = ((double) i2) / 255.0d;
        double dPow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = ((double) i3) / 255.0d;
        double dPow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        dArr[1] = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
    }

    public static int b(int i, int i2) {
        return 255 - (((255 - i) * (255 - i2)) / 255);
    }

    public static int d(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        d.r("alpha must be between 0 and 255.");
        return 0;
    }

    public static int c(int i, int i2) {
        int iAlpha = Color.alpha(i2);
        int iAlpha2 = Color.alpha(i);
        int iB = b(iAlpha2, iAlpha);
        return Color.argb(iB, a(Color.red(i), iAlpha2, Color.red(i2), iAlpha, iB), a(Color.green(i), iAlpha2, Color.green(i2), iAlpha, iB), a(Color.blue(i), iAlpha2, Color.blue(i2), iAlpha, iB));
    }

    public static int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((255 - i2) * (i3 * i4)) + ((i * 255) * i2)) / (i5 * 255);
    }

    public static double a(int i) {
        double[] dArrA = a();
        a(i, dArrA);
        return dArrA[1] / 100.0d;
    }

    public static double a(int i, int i2) {
        if (Color.alpha(i2) == 255) {
            if (Color.alpha(i) < 255) {
                i = c(i, i2);
            }
            double dA = a(i) + 0.05d;
            double dA2 = a(i2) + 0.05d;
            return Math.max(dA, dA2) / Math.min(dA, dA2);
        }
        d.r(nj.m(i2, new StringBuilder("background can not be translucent: #")));
        return 0.0d;
    }

    public static int a(int i, int i2, float f) {
        int i3 = 255;
        if (Color.alpha(i2) != 255) {
            d.r(nj.m(i2, new StringBuilder("background can not be translucent: #")));
            return 0;
        }
        double d = f;
        if (a(d(i, 255), i2) < d) {
            return -1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
            int i6 = (i4 + i3) / 2;
            if (a(d(i, i6), i2) < d) {
                i4 = i6;
            } else {
                i3 = i6;
            }
        }
        return i3;
    }

    public static void a(int i, int i2, int i3, float[] fArr) {
        float f;
        float fAbs;
        float f2 = i / 255.0f;
        float f3 = i2 / 255.0f;
        float f4 = i3 / 255.0f;
        float fMax = Math.max(f2, Math.max(f3, f4));
        float fMin = Math.min(f2, Math.min(f3, f4));
        float f5 = fMax - fMin;
        float f6 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            f = 0.0f;
            fAbs = 0.0f;
        } else {
            if (fMax == f2) {
                f = ((f3 - f4) / f5) % 6.0f;
            } else {
                f = fMax == f3 ? ((f4 - f2) / f5) + 2.0f : 4.0f + ((f2 - f3) / f5);
            }
            fAbs = f5 / (1.0f - Math.abs((2.0f * f6) - 1.0f));
        }
        float f7 = (f * 60.0f) % 360.0f;
        if (f7 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f7 += 360.0f;
        }
        fArr[0] = a(f7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 360.0f);
        fArr[1] = a(fAbs, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        fArr[2] = a(f6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
    }

    public static void a(int i, float[] fArr) {
        a(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    public static void a(int i, double[] dArr) {
        a(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    public static float a(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    public static double[] a() {
        ThreadLocal threadLocal = a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }
}
