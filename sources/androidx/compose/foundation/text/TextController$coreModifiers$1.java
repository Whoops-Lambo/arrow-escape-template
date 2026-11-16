package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "it", "Laz2;", "invoke", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class TextController$coreModifiers$1 extends rc1 implements wr0 {
    public final /* synthetic */ TextController i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextController$coreModifiers$1(TextController textController) {
        super(1);
        this.i = textController;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        SelectionRegistrar selectionRegistrar;
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
        layoutCoordinates.getClass();
        TextController textController = this.i;
        TextState textState = textController.a;
        textState.e = layoutCoordinates;
        if (SelectionRegistrarKt.a(textController.b, textState.b)) {
            long j = layoutCoordinates.j(Offset.b);
            if (!Offset.a(j, textState.g) && (selectionRegistrar = textController.b) != null) {
                selectionRegistrar.b(textState.b);
            }
            textState.g = j;
        }
        return az2.a;
    }
}
