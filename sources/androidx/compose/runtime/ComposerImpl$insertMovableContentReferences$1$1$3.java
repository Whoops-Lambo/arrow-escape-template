package androidx.compose.runtime;

import defpackage.as0;
import defpackage.az2;
import defpackage.k32;
import defpackage.nj;
import defpackage.rc1;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "<anonymous parameter 1>", "Landroidx/compose/runtime/RememberManager;", "<anonymous parameter 2>", "Laz2;", "invoke", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class ComposerImpl$insertMovableContentReferences$1$1$3 extends rc1 implements as0 {
    public final /* synthetic */ k32 i;
    public final /* synthetic */ ArrayList j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerImpl$insertMovableContentReferences$1$1$3(k32 k32Var, ArrayList arrayList) {
        super(3);
        this.i = k32Var;
        this.j = arrayList;
    }

    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Applier applier = (Applier) obj;
        nj.y(applier, (SlotWriter) obj2, (RememberManager) obj3);
        int i = this.i.a;
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj4 = arrayList.get(i2);
            int i3 = i + i2;
            applier.f(i3, obj4);
            applier.d(i3, obj4);
        }
        return az2.a;
    }
}
