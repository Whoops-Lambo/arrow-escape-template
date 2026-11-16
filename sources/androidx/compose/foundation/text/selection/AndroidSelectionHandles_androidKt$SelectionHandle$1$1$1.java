package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1 extends rc1 implements wr0 {
    public final /* synthetic */ boolean i;
    public final /* synthetic */ long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1(boolean z, long j) {
        super(1);
        this.i = z;
        this.j = j;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        semanticsPropertyReceiver.getClass();
        semanticsPropertyReceiver.a(SelectionHandlesKt.a, new SelectionHandleInfo(this.i ? Handle.b : Handle.c, this.j));
        return az2.a;
    }
}
