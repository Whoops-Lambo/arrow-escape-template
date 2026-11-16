package androidx.compose.ui.node;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\b\u0083@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/DistanceAndInLayer;", "", "packedValue", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class DistanceAndInLayer {
    public final boolean equals(Object obj) {
        return obj instanceof DistanceAndInLayer;
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    public final String toString() {
        return "DistanceAndInLayer(packedValue=0)";
    }

    public static final int a(long j, long j2) {
        boolean z;
        boolean z2 = false;
        if (((int) (j & 4294967295L)) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (((int) (4294967295L & j2)) != 0) {
            z2 = true;
        }
        if (z != z2) {
            if (!z) {
                return 1;
            }
            return -1;
        }
        return (int) Math.signum(Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32)));
    }
}
