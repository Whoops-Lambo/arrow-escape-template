package androidx.compose.foundation;

import androidx.compose.runtime.saveable.SaverScope;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/foundation/ScrollState;", "invoke", "(Landroidx/compose/runtime/saveable/SaverScope;Landroidx/compose/foundation/ScrollState;)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
public final class ScrollState$Companion$Saver$1 extends rc1 implements zr0 {
    public static final ScrollState$Companion$Saver$1 i = new ScrollState$Companion$Saver$1(2);

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        ScrollState scrollState = (ScrollState) obj2;
        ((SaverScope) obj).getClass();
        scrollState.getClass();
        return Integer.valueOf(scrollState.d());
    }
}
