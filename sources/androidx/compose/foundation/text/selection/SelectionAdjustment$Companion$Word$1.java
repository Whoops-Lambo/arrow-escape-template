package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/text/selection/SelectionAdjustment$Companion$Word$1", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SelectionAdjustment$Companion$Word$1 implements SelectionAdjustment {
    @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
    public final long a(TextLayoutResult textLayoutResult, long j, int i, boolean z, TextRange textRange) {
        return SelectionAdjustment.Companion.a(textLayoutResult, j, new SelectionAdjustment$Companion$Word$1$adjust$1(1, textLayoutResult, TextLayoutResult.class, "getWordBoundary", "getWordBoundary--jx7JFs(I)J", 0));
    }
}
