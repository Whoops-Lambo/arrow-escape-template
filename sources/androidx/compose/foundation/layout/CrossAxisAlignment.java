package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Immutable
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment;", "", "AlignmentLineCrossAxisAlignment", "CenterCrossAxisAlignment", "Companion", "EndCrossAxisAlignment", "HorizontalCrossAxisAlignment", "StartCrossAxisAlignment", "VerticalCrossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment$CenterCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment$StartCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment$EndCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment$AlignmentLineCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment$VerticalCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment$HorizontalCrossAxisAlignment;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class CrossAxisAlignment {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;", "", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public abstract int a(int i, LayoutDirection layoutDirection, Placeable placeable, int i2);

    public Integer b(Placeable placeable) {
        return null;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$AlignmentLineCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class AlignmentLineCrossAxisAlignment extends CrossAxisAlignment {
        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final Integer b(Placeable placeable) {
            throw null;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final int a(int i, LayoutDirection layoutDirection, Placeable placeable, int i2) {
            layoutDirection.getClass();
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$CenterCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class CenterCrossAxisAlignment extends CrossAxisAlignment {
        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final int a(int i, LayoutDirection layoutDirection, Placeable placeable, int i2) {
            layoutDirection.getClass();
            return i / 2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$EndCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class EndCrossAxisAlignment extends CrossAxisAlignment {
        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final int a(int i, LayoutDirection layoutDirection, Placeable placeable, int i2) {
            layoutDirection.getClass();
            if (layoutDirection == LayoutDirection.a) {
                return i;
            }
            return 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$HorizontalCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class HorizontalCrossAxisAlignment extends CrossAxisAlignment {
        public final Alignment.Horizontal a;

        public HorizontalCrossAxisAlignment(Alignment.Horizontal horizontal) {
            horizontal.getClass();
            this.a = horizontal;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final int a(int i, LayoutDirection layoutDirection, Placeable placeable, int i2) {
            layoutDirection.getClass();
            return this.a.a(0, i, layoutDirection);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$StartCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class StartCrossAxisAlignment extends CrossAxisAlignment {
        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final int a(int i, LayoutDirection layoutDirection, Placeable placeable, int i2) {
            layoutDirection.getClass();
            if (layoutDirection == LayoutDirection.a) {
                return 0;
            }
            return i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$VerticalCrossAxisAlignment;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class VerticalCrossAxisAlignment extends CrossAxisAlignment {
        public final Alignment.Vertical a;

        public VerticalCrossAxisAlignment(Alignment.Vertical vertical) {
            vertical.getClass();
            this.a = vertical;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final int a(int i, LayoutDirection layoutDirection, Placeable placeable, int i2) {
            layoutDirection.getClass();
            return this.a.a(0, i);
        }
    }
}
