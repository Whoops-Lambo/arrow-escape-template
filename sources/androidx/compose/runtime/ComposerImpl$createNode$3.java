package androidx.compose.runtime;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.as0;
import defpackage.az2;
import defpackage.nj;
import defpackage.rc1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "<anonymous parameter 2>", "Laz2;", "invoke", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class ComposerImpl$createNode$3 extends rc1 implements as0 {
    public final /* synthetic */ Anchor i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerImpl$createNode$3(Anchor anchor, int i) {
        super(3);
        this.i = anchor;
        this.j = i;
    }

    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Applier applier = (Applier) obj;
        SlotWriter slotWriter = (SlotWriter) obj2;
        nj.y(applier, slotWriter, (RememberManager) obj3);
        int iO = slotWriter.o(slotWriter.c(this.i));
        Object obj4 = SlotTableKt.d(iO, slotWriter.b) ? slotWriter.c[slotWriter.h(slotWriter.g(iO, slotWriter.b))] : null;
        applier.h();
        applier.f(this.j, obj4);
        return az2.a;
    }
}
