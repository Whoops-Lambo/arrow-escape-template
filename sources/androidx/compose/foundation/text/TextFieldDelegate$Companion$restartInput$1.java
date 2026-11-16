package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.EditProcessor;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Landroidx/compose/ui/text/input/EditCommand;", "it", "Laz2;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class TextFieldDelegate$Companion$restartInput$1 extends rc1 implements wr0 {
    public final /* synthetic */ EditProcessor i;
    public final /* synthetic */ wr0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDelegate$Companion$restartInput$1(EditProcessor editProcessor, wr0 wr0Var) {
        super(1);
        this.i = editProcessor;
        this.j = wr0Var;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        List list = (List) obj;
        list.getClass();
        this.j.invoke(this.i.a(list));
        return az2.a;
    }
}
