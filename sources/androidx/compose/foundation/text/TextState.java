package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import defpackage.az2;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/TextState;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TextState {
    public TextDelegate a;
    public final long b;
    public Selectable d;
    public LayoutCoordinates e;
    public TextLayoutResult f;
    public wr0 c = TextState$onTextLayout$1.i;
    public long g = Offset.b;
    public long h = Color.i;
    public final ParcelableSnapshotMutableState i = SnapshotStateKt.c(az2.a, SnapshotStateKt.e());

    public TextState(TextDelegate textDelegate, long j) {
        this.a = textDelegate;
        this.b = j;
    }
}
