package androidx.compose.runtime.saveable;

import defpackage.d;
import defpackage.rc1;
import defpackage.zr0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "Original", "Saveable", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "invoke", "(Landroidx/compose/runtime/saveable/SaverScope;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class ListSaverKt$listSaver$1 extends rc1 implements zr0 {
    public final /* synthetic */ zr0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListSaverKt$listSaver$1(zr0 zr0Var) {
        super(2);
        this.i = zr0Var;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        SaverScope saverScope = (SaverScope) obj;
        saverScope.getClass();
        List list = (List) this.i.invoke(saverScope, obj2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj3 = list.get(i);
            if (obj3 != null && !saverScope.a(obj3)) {
                d.r("Failed requirement.");
                return null;
            }
        }
        List list2 = list;
        if (list2.isEmpty()) {
            return null;
        }
        return new ArrayList(list2);
    }
}
