package androidx.compose.runtime;

import defpackage.as0;
import defpackage.az2;
import defpackage.rc1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/runtime/Applier;", "<anonymous parameter 0>", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "<anonymous parameter 2>", "Laz2;", "invoke", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class ComposerImpl$recordInsert$1 extends rc1 implements as0 {
    public final /* synthetic */ SlotTable i;
    public final /* synthetic */ Anchor j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerImpl$recordInsert$1(SlotTable slotTable, Anchor anchor) {
        super(3);
        this.i = slotTable;
        this.j = anchor;
    }

    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SlotWriter slotWriter = (SlotWriter) obj2;
        ((Applier) obj).getClass();
        slotWriter.getClass();
        ((RememberManager) obj3).getClass();
        slotWriter.e();
        Anchor anchor = this.j;
        anchor.getClass();
        SlotTable slotTable = this.i;
        slotTable.getClass();
        slotWriter.t(slotTable, slotTable.a(anchor));
        slotWriter.j();
        return az2.a;
    }
}
