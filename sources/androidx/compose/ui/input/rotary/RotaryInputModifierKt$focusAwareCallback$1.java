package androidx.compose.ui.input.rotary;

import androidx.compose.ui.input.focus.FocusAwareEvent;
import com.singular.sdk.internal.Constants;
import defpackage.e32;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "Landroidx/compose/ui/input/focus/FocusAwareEvent;", "invoke", "(Landroidx/compose/ui/input/focus/FocusAwareEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class RotaryInputModifierKt$focusAwareCallback$1 extends rc1 implements wr0 {
    public final /* synthetic */ wr0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RotaryInputModifierKt$focusAwareCallback$1(wr0 wr0Var) {
        super(1);
        this.i = wr0Var;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        FocusAwareEvent focusAwareEvent = (FocusAwareEvent) obj;
        focusAwareEvent.getClass();
        if (focusAwareEvent instanceof RotaryScrollEvent) {
            return (Boolean) this.i.invoke(focusAwareEvent);
        }
        e32.i("FocusAwareEvent is dispatched to the wrong FocusAwareParent.");
        return null;
    }
}
