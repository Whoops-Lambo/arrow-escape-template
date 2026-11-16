package androidx.compose.runtime.saveable;

import defpackage.wr0;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/runtime/saveable/SaverKt$Saver$1", "Landroidx/compose/runtime/saveable/Saver;", "runtime-saveable_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SaverKt$Saver$1 implements Saver<Object, Object> {
    public final /* synthetic */ zr0 a;
    public final /* synthetic */ wr0 b;

    @Override // androidx.compose.runtime.saveable.Saver
    public final Object b(Object obj) {
        return this.b.invoke(obj);
    }

    public SaverKt$Saver$1(zr0 zr0Var, wr0 wr0Var) {
        this.a = zr0Var;
        this.b = wr0Var;
    }

    @Override // androidx.compose.runtime.saveable.Saver
    public final Object a(SaverScope saverScope, Object obj) {
        saverScope.getClass();
        return this.a.invoke(saverScope, obj);
    }
}
