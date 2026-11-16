package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionHandleInfo;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class CoreTextFieldKt$TextFieldCursorHandle$2$1 extends rc1 implements wr0 {
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$TextFieldCursorHandle$2$1(long j) {
        super(1);
        this.i = j;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        semanticsPropertyReceiver.getClass();
        semanticsPropertyReceiver.a(SelectionHandlesKt.a, new SelectionHandleInfo(Handle.a, this.i));
        return az2.a;
    }
}
