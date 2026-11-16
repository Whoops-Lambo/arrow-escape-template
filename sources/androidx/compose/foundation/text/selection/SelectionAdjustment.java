package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import defpackage.dk2;
import defpackage.tb5;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "", "Companion", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface SelectionAdjustment {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public static final SelectionAdjustment$Companion$Character$1 a = new SelectionAdjustment$Companion$Character$1();
        public static final SelectionAdjustment$Companion$Word$1 b = new SelectionAdjustment$Companion$Word$1();
        public static final SelectionAdjustment$Companion$CharacterWithWordAccelerate$1 c = new SelectionAdjustment$Companion$CharacterWithWordAccelerate$1();

        public static final long a(TextLayoutResult textLayoutResult, long j, wr0 wr0Var) {
            TextLayoutInput textLayoutInput = textLayoutResult.a;
            if (textLayoutInput.a.a.length() == 0) {
                return TextRange.b;
            }
            int iT = dk2.T(textLayoutInput.a);
            int i = TextRange.c;
            long j2 = ((TextRange) wr0Var.invoke(Integer.valueOf(tb5.g((int) (j >> 32), 0, iT)))).a;
            long j3 = ((TextRange) wr0Var.invoke(Integer.valueOf(tb5.g((int) (j & 4294967295L), 0, iT)))).a;
            return TextRangeKt.a((int) (TextRange.e(j) ? j2 & 4294967295L : j2 >> 32), (int) (TextRange.e(j) ? j3 >> 32 : j3 & 4294967295L));
        }
    }

    long a(TextLayoutResult textLayoutResult, long j, int i, boolean z, TextRange textRange);
}
