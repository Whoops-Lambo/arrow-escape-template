package androidx.compose.foundation.text.selection;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/HandlePositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HandlePositionProvider implements PopupPositionProvider {
    public final HandleReferencePoint a;
    public final long b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HandleReferencePoint.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HandlePositionProvider(HandleReferencePoint handleReferencePoint, long j) {
        this.a = handleReferencePoint;
        this.b = j;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    public final long a(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        intRect.getClass();
        int i = intRect.b;
        int i2 = intRect.a;
        layoutDirection.getClass();
        int iOrdinal = this.a.ordinal();
        long j3 = this.b;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    int i3 = IntOffset.c;
                    return IntOffsetKt.a((i2 + ((int) (j3 >> 32))) - (((int) (j2 >> 32)) / 2), i + ((int) (j3 & 4294967295L)));
                }
                e.b();
                return 0L;
            }
            int i4 = IntOffset.c;
            return IntOffsetKt.a((i2 + ((int) (j3 >> 32))) - ((int) (j2 >> 32)), i + ((int) (j3 & 4294967295L)));
        }
        int i5 = IntOffset.c;
        return IntOffsetKt.a(i2 + ((int) (j3 >> 32)), i + ((int) (j3 & 4294967295L)));
    }
}
