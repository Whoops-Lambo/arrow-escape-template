package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Immutable
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/unit/TextUnit;", "", "Companion", "packedValue", "", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TextUnit {
    public static final TextUnitType[] b = {new TextUnitType(0), new TextUnitType(4294967296L), new TextUnitType(8589934592L)};
    public static final long c = TextUnitKt.e(0, Float.NaN);
    public final long a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/unit/TextUnit$Companion;", "", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TextUnit) {
            return this.a == ((TextUnit) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return d(this.a);
    }

    public static String d(long j) {
        long jB = b(j);
        if (TextUnitType.a(jB, 0L)) {
            return "Unspecified";
        }
        if (TextUnitType.a(jB, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (TextUnitType.a(jB, 8589934592L)) {
            return c(j) + ".em";
        }
        return "Invalid";
    }

    public static final long b(long j) {
        return b[(int) ((j & 1095216660480L) >>> 32)].a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
