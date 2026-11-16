package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import com.unity3d.services.UnityAdsConstants;
import defpackage.e32;
import defpackage.rd1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/Density;", "", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface Density {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    float getDensity();

    float getFontScale();

    /* JADX INFO: renamed from: toDp-u2uoSUM */
    default float mo4toDpu2uoSUM(int i) {
        return i / getDensity();
    }

    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    default long mo11toSpkPz2Gy4(int i) {
        return TextUnitKt.e(4294967296L, i / (getDensity() * getFontScale()));
    }

    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    default long mo5toDpSizekrfVVM(long j) {
        return j != Size.c ? DpKt.b(mo3toDpu2uoSUM(Size.d(j)), mo3toDpu2uoSUM(Size.b(j))) : DpSize.c;
    }

    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    default long mo8toSizeXkaWNTQ(long j) {
        return j != DpSize.c ? SizeKt.a(mo7toPx0680j_4(DpSize.b(j)), mo7toPx0680j_4(DpSize.a(j))) : Size.c;
    }

    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    default int mo0roundToPxR2X_6o(long j) {
        return rd1.p(mo6toPxR2X_6o(j));
    }

    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    default int mo1roundToPx0680j_4(float f) {
        float fMo7toPx0680j_4 = mo7toPx0680j_4(f);
        if (Float.isInfinite(fMo7toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return rd1.p(fMo7toPx0680j_4);
    }

    /* JADX INFO: renamed from: toDp-GaN1DYA */
    default float mo2toDpGaN1DYA(long j) {
        if (TextUnitType.a(TextUnit.b(j), 4294967296L)) {
            return getFontScale() * TextUnit.c(j);
        }
        e32.i("Only Sp can convert to Px");
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    /* JADX INFO: renamed from: toPx--R2X_6o */
    default float mo6toPxR2X_6o(long j) {
        if (TextUnitType.a(TextUnit.b(j), 4294967296L)) {
            return getDensity() * getFontScale() * TextUnit.c(j);
        }
        e32.i("Only Sp can convert to Px");
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    /* JADX INFO: renamed from: toPx-0680j_4 */
    default float mo7toPx0680j_4(float f) {
        return getDensity() * f;
    }

    default Rect toRect(DpRect dpRect) {
        dpRect.getClass();
        return new Rect(mo7toPx0680j_4(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), mo7toPx0680j_4(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), mo7toPx0680j_4(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), mo7toPx0680j_4(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    }

    /* JADX INFO: renamed from: toSp-0xMU5do */
    default long mo9toSp0xMU5do(float f) {
        return TextUnitKt.e(4294967296L, f / getFontScale());
    }

    /* JADX INFO: renamed from: toDp-u2uoSUM */
    default float mo3toDpu2uoSUM(float f) {
        return f / getDensity();
    }

    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    default long mo10toSpkPz2Gy4(float f) {
        return TextUnitKt.e(4294967296L, f / (getDensity() * getFontScale()));
    }
}
