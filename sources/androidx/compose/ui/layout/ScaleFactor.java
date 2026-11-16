package androidx.compose.ui.layout;

import androidx.compose.runtime.Immutable;
import defpackage.e32;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Immutable
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/layout/ScaleFactor;", "", "Companion", "packedValue", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ScaleFactor {
    public static final long a = ScaleFactorKt.a(Float.NaN, Float.NaN);
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/ScaleFactor$Companion;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public final boolean equals(Object obj) {
        return obj instanceof ScaleFactor;
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScaleFactor(");
        long j = a;
        if (0 == j) {
            e32.i("ScaleFactor is unspecified");
            return null;
        }
        float fIntBitsToFloat = Float.intBitsToFloat(0) * 10.0f;
        int i = (int) fIntBitsToFloat;
        if (fIntBitsToFloat - i >= 0.5f) {
            i++;
        }
        sb.append(i / 10.0f);
        sb.append(", ");
        if (0 == j) {
            e32.i("ScaleFactor is unspecified");
            return null;
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(0) * 10.0f;
        int i2 = (int) fIntBitsToFloat2;
        if (fIntBitsToFloat2 - i2 >= 0.5f) {
            i2++;
        }
        sb.append(i2 / 10.0f);
        sb.append(')');
        return sb.toString();
    }
}
