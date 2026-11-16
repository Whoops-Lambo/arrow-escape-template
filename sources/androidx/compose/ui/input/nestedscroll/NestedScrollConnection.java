package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import defpackage.fy;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface NestedScrollConnection {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    default long b(int i, long j) {
        int i2 = Offset.e;
        return Offset.b;
    }

    default long c(int i, long j, long j2) {
        int i2 = Offset.e;
        return Offset.b;
    }

    default Object d(long j, long j2, fy fyVar) {
        return new Velocity(Velocity.b);
    }

    default Object e(long j, fy fyVar) {
        return new Velocity(Velocity.b);
    }
}
