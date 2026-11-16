package androidx.compose.ui.graphics.colorspace;

import com.unity3d.services.UnityAdsConstants;
import defpackage.tb5;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Lab extends ColorSpace {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab$Companion;", "", "", "A", "F", "B", "C", "D", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float[] e(float[] fArr) {
        fArr[0] = tb5.f(fArr[0], UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 100.0f);
        fArr[1] = tb5.f(fArr[1], -128.0f, 128.0f);
        float f = tb5.f(fArr[2], -128.0f, 128.0f);
        fArr[2] = f;
        float f2 = (fArr[0] + 16.0f) / 116.0f;
        float f3 = (fArr[1] * 0.002f) + f2;
        float f4 = f2 - (f * 0.005f);
        float f5 = f3 > 0.20689656f ? f3 * f3 * f3 : (f3 - 0.13793103f) * 0.12841855f;
        float f6 = f2 > 0.20689656f ? f2 * f2 * f2 : (f2 - 0.13793103f) * 0.12841855f;
        float f7 = f4 > 0.20689656f ? f4 * f4 * f4 : (f4 - 0.13793103f) * 0.12841855f;
        float[] fArr2 = Illuminant.e;
        fArr[0] = f5 * fArr2[0];
        fArr[1] = f6 * fArr2[1];
        fArr[2] = f7 * fArr2[2];
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float b(int i) {
        return i == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float c(int i) {
        if (i == 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return -128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float[] a(float[] fArr) {
        float fPow;
        float fPow2;
        float fPow3;
        fArr.getClass();
        float f = fArr[0];
        float[] fArr2 = Illuminant.e;
        float f2 = f / fArr2[0];
        float f3 = fArr[1] / fArr2[1];
        float f4 = fArr[2] / fArr2[2];
        if (f2 > 0.008856452f) {
            fPow = (float) Math.pow(f2, 0.3333333432674408d);
        } else {
            fPow = (f2 * 7.787037f) + 0.13793103f;
        }
        if (f3 > 0.008856452f) {
            fPow2 = (float) Math.pow(f3, 0.3333333432674408d);
        } else {
            fPow2 = (f3 * 7.787037f) + 0.13793103f;
        }
        if (f4 > 0.008856452f) {
            fPow3 = (float) Math.pow(f4, 0.3333333432674408d);
        } else {
            fPow3 = (f4 * 7.787037f) + 0.13793103f;
        }
        fArr[0] = tb5.f((116.0f * fPow2) - 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 100.0f);
        fArr[1] = tb5.f((fPow - fPow2) * 500.0f, -128.0f, 128.0f);
        fArr[2] = tb5.f((fPow2 - fPow3) * 200.0f, -128.0f, 128.0f);
        return fArr;
    }
}
