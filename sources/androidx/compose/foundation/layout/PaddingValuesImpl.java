package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.n30;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesImpl;", "Landroidx/compose/foundation/layout/PaddingValues;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PaddingValuesImpl implements PaddingValues {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getD() {
        return this.d;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PaddingValuesImpl)) {
            return false;
        }
        PaddingValuesImpl paddingValuesImpl = (PaddingValuesImpl) obj;
        return Dp.a(this.a, paddingValuesImpl.a) && Dp.a(this.b, paddingValuesImpl.b) && Dp.a(this.c, paddingValuesImpl.c) && Dp.a(this.d, paddingValuesImpl.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + n30.b(this.c, n30.b(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) Dp.b(this.a)) + ", top=" + ((Object) Dp.b(this.b)) + ", end=" + ((Object) Dp.b(this.c)) + ", bottom=" + ((Object) Dp.b(this.d)) + ')';
    }

    public PaddingValuesImpl(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    public final float b(LayoutDirection layoutDirection) {
        layoutDirection.getClass();
        if (layoutDirection == LayoutDirection.a) {
            return this.a;
        }
        return this.c;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    public final float c(LayoutDirection layoutDirection) {
        layoutDirection.getClass();
        if (layoutDirection == LayoutDirection.a) {
            return this.c;
        }
        return this.a;
    }
}
