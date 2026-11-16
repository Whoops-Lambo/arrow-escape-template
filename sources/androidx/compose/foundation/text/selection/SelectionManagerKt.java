package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class SelectionManagerKt {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            iArr[1] = 1;
            iArr[2] = 2;
            iArr[0] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean b(long j, Rect rect) {
        float f = rect.a;
        float f2 = rect.c;
        float fC = Offset.c(j);
        if (f > fC || fC > f2) {
            return false;
        }
        float f3 = rect.b;
        float f4 = rect.d;
        float fD = Offset.d(j);
        return f3 <= fD && fD <= f4;
    }

    public static final Selection c(Selection selection, Selection selection2) {
        if (selection == null) {
            return selection2;
        }
        if (selection2 == null) {
            return selection;
        }
        return selection.c ? Selection.a(selection, selection2.a, null, 6) : Selection.a(selection, null, selection2.b, 5);
    }

    public static final long a(SelectionManager selectionManager, long j, Selection.AnchorInfo anchorInfo, boolean z) {
        Selectable selectableB = selectionManager.b(anchorInfo);
        if (selectableB == null) {
            return Offset.d;
        }
        if (selectionManager.b == null) {
            return Offset.d;
        }
        if (selectableB.a() == null) {
            return Offset.d;
        }
        throw null;
    }

    public static final Rect d(LayoutCoordinates layoutCoordinates) {
        layoutCoordinates.getClass();
        Rect rectC = LayoutCoordinatesKt.c(layoutCoordinates);
        long jX = layoutCoordinates.x(OffsetKt.a(rectC.a, rectC.b));
        long jX2 = layoutCoordinates.x(OffsetKt.a(rectC.c, rectC.d));
        return new Rect(Offset.c(jX), Offset.d(jX), Offset.c(jX2), Offset.d(jX2));
    }
}
