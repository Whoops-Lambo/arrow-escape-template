package defpackage;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class y6 {
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final FastOutSlowInInterpolator b = new FastOutSlowInInterpolator();
    public static final FastOutLinearInInterpolator c = new FastOutLinearInInterpolator();
    public static final LinearOutSlowInInterpolator d = new LinearOutSlowInInterpolator();
    public static final DecelerateInterpolator e = new DecelerateInterpolator();

    public static int c(float f, int i, int i2) {
        return Math.round(f * (i2 - i)) + i;
    }

    public static float b(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f3) {
            return f;
        }
        return f5 >= f4 ? f2 : a(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static float a(float f, float f2, float f3) {
        return h50.c(f2, f, f3, f);
    }
}
