package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class SelectionAdjustmentKt {
    public static final long a(int i, int i2, boolean z, boolean z2) {
        if (i2 == 0) {
            return TextRangeKt.a(i, i);
        }
        if (i == 0) {
            return z ? TextRangeKt.a(1, 0) : TextRangeKt.a(0, 1);
        }
        if (i == i2) {
            return z ? TextRangeKt.a(i2 - 1, i2) : TextRangeKt.a(i2, i2 - 1);
        }
        if (z) {
            return !z2 ? TextRangeKt.a(i - 1, i) : TextRangeKt.a(i + 1, i);
        }
        return !z2 ? TextRangeKt.a(i, i + 1) : TextRangeKt.a(i, i - 1);
    }
}
