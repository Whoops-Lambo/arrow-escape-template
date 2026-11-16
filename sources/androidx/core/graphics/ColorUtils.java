package androidx.core.graphics;

import android.graphics.Color;
import androidx.annotation.RequiresApi;
import defpackage.d;
import defpackage.nj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ColorUtils {
    public static final ThreadLocal a = new ThreadLocal();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api26Impl {
    }

    public static double c(int i) {
        ThreadLocal threadLocal = a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        if (dArr.length != 3) {
            d.r("outXyz must have a length of 3.");
            return 0.0d;
        }
        double d = ((double) iRed) / 255.0d;
        double dPow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = ((double) iGreen) / 255.0d;
        double dPow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = ((double) iBlue) / 255.0d;
        double dPow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d4 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d4;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d4 / 100.0d;
    }

    public static int e(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((255 - i2) * (i3 * i4)) + ((i * 255) * i2)) / (i5 * 255);
    }

    public static int f(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        d.r("alpha must be between 0 and 255.");
        return 0;
    }

    public static double b(int i, int i2) {
        if (Color.alpha(i2) == 255) {
            if (Color.alpha(i) < 255) {
                i = d(i, i2);
            }
            double dC = c(i) + 0.05d;
            double dC2 = c(i2) + 0.05d;
            return Math.max(dC, dC2) / Math.min(dC, dC2);
        }
        d.r(nj.m(i2, new StringBuilder("background can not be translucent: #")));
        return 0.0d;
    }

    public static int d(int i, int i2) {
        int iAlpha = Color.alpha(i2);
        int iAlpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
        return Color.argb(i3, e(Color.red(i), iAlpha2, Color.red(i2), iAlpha, i3), e(Color.green(i), iAlpha2, Color.green(i2), iAlpha, i3), e(Color.blue(i), iAlpha2, Color.blue(i2), iAlpha, i3));
    }

    public static int a(double d, double d2, double d3) {
        double dPow;
        double dPow2;
        double dPow3;
        int iMin;
        int iMin2;
        double d4 = (((-0.4986d) * d3) + (((-1.5372d) * d2) + (3.2406d * d))) / 100.0d;
        double d5 = ((0.0415d * d3) + ((1.8758d * d2) + ((-0.9689d) * d))) / 100.0d;
        double d6 = ((1.057d * d3) + (((-0.204d) * d2) + (0.0557d * d))) / 100.0d;
        if (d4 > 0.0031308d) {
            dPow = (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            dPow = d4 * 12.92d;
        }
        if (d5 > 0.0031308d) {
            dPow2 = (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            dPow2 = d5 * 12.92d;
        }
        if (d6 > 0.0031308d) {
            dPow3 = (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            dPow3 = d6 * 12.92d;
        }
        int iRound = (int) Math.round(dPow * 255.0d);
        int iMin3 = 0;
        if (iRound < 0) {
            iMin = 0;
        } else {
            iMin = Math.min(iRound, 255);
        }
        int iRound2 = (int) Math.round(dPow2 * 255.0d);
        if (iRound2 < 0) {
            iMin2 = 0;
        } else {
            iMin2 = Math.min(iRound2, 255);
        }
        int iRound3 = (int) Math.round(dPow3 * 255.0d);
        if (iRound3 >= 0) {
            iMin3 = Math.min(iRound3, 255);
        }
        return Color.rgb(iMin, iMin2, iMin3);
    }
}
