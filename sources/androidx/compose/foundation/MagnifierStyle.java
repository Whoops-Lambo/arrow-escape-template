package androidx.compose.foundation;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import defpackage.jc1;
import defpackage.n30;
import defpackage.pv1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Stable
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/MagnifierStyle;", "", "Companion", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class MagnifierStyle {
    public static final MagnifierStyle c;
    public static final MagnifierStyle d;
    public final boolean a;
    public final long b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/MagnifierStyle$Companion;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MagnifierStyle) {
            MagnifierStyle magnifierStyle = (MagnifierStyle) obj;
            if (this.a == magnifierStyle.a && this.b == magnifierStyle.b && Dp.a(Float.NaN, Float.NaN) && Dp.a(Float.NaN, Float.NaN)) {
                return true;
            }
        }
        return false;
    }

    static {
        long j = DpSize.c;
        c = new MagnifierStyle(false, j);
        d = new MagnifierStyle(true, j);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        int i = DpSize.d;
        return Boolean.hashCode(false) + jc1.f(n30.b(Float.NaN, n30.b(Float.NaN, pv1.d(iHashCode, 31, this.b), 31), 31), 31, true);
    }

    public final String toString() {
        if (this.a) {
            return "MagnifierStyle.TextDefault";
        }
        return "MagnifierStyle(size=" + ((Object) DpSize.d(this.b)) + ", cornerRadius=" + ((Object) Dp.b(Float.NaN)) + ", elevation=" + ((Object) Dp.b(Float.NaN)) + ", clippingEnabled=true, fishEyeEnabled=false)";
    }

    public MagnifierStyle(boolean z, long j) {
        this.a = z;
        this.b = j;
    }
}
