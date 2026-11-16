package androidx.compose.ui;

import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusRequesterModifier;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/Modifier$Element;", "invoke", "(Landroidx/compose/ui/Modifier$Element;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class ComposedModifierKt$materialize$1 extends rc1 implements wr0 {
    public static final ComposedModifierKt$materialize$1 i = new ComposedModifierKt$materialize$1(1);

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        Modifier.Element element = (Modifier.Element) obj;
        element.getClass();
        return Boolean.valueOf(((element instanceof ComposedModifier) || (element instanceof FocusEventModifier) || (element instanceof FocusRequesterModifier)) ? false : true);
    }
}
