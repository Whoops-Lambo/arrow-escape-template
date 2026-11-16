package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import com.unity3d.services.UnityAdsConstants;
import defpackage.e32;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Stable
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface LazyLayoutMeasureScope extends MeasureScope {
    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    default float mo4toDpu2uoSUM(int i) {
        return i / getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    default long mo11toSpkPz2Gy4(int i) {
        return TextUnitKt.e(4294967296L, i / (getDensity() * getFontScale()));
    }

    Placeable[] y(int i, long j);

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    default long mo5toDpSizekrfVVM(long j) {
        return j != Size.c ? DpKt.b(mo3toDpu2uoSUM(Size.d(j)), mo3toDpu2uoSUM(Size.b(j))) : DpSize.c;
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    default long mo8toSizeXkaWNTQ(long j) {
        return j != DpSize.c ? SizeKt.a(mo7toPx0680j_4(DpSize.b(j)), mo7toPx0680j_4(DpSize.a(j))) : Size.c;
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    default float mo2toDpGaN1DYA(long j) {
        if (TextUnitType.a(TextUnit.b(j), 4294967296L)) {
            return getFontScale() * TextUnit.c(j);
        }
        e32.i("Only Sp can convert to Px");
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-0xMU5do */
    default long mo9toSp0xMU5do(float f) {
        return TextUnitKt.e(4294967296L, f / getFontScale());
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    default float mo3toDpu2uoSUM(float f) {
        return f / getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    default long mo10toSpkPz2Gy4(float f) {
        return TextUnitKt.e(4294967296L, f / (getDensity() * getFontScale()));
    }
}
