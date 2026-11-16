package defpackage;

import android.content.Context;
import android.graphics.Color;
import androidx.core.graphics.ColorUtils;
import com.ecffri.arrows.R;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zf0 {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public zf0(Context context) {
        boolean zB = wh1.b(context, false, R.attr.elevationOverlayEnabled);
        int iA = ki1.a(R.attr.elevationOverlayColor, context, 0);
        int iA2 = ki1.a(R.attr.elevationOverlayAccentColor, context, 0);
        int iA3 = ki1.a(R.attr.colorSurface, context, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = zB;
        this.b = iA;
        this.c = iA2;
        this.d = iA3;
        this.e = f2;
    }

    public final int a(float f2, int i) {
        int i2;
        if (!this.a || ColorUtils.f(i, 255) != this.d) {
            return i;
        }
        float f3 = this.e;
        float fMin = (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? 0.0f : Math.min(((((float) Math.log1p(f2 / f3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iD = ki1.d(fMin, ColorUtils.f(i, 255), this.b);
        if (fMin > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (i2 = this.c) != 0) {
            iD = ColorUtils.d(ColorUtils.f(i2, f), iD);
        }
        return ColorUtils.f(iD, iAlpha);
    }
}
