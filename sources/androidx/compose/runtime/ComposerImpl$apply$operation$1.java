package androidx.compose.runtime;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.as0;
import defpackage.az2;
import defpackage.nj;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "<anonymous parameter 1>", "Landroidx/compose/runtime/RememberManager;", "<anonymous parameter 2>", "Laz2;", "invoke", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class ComposerImpl$apply$operation$1 extends rc1 implements as0 {
    public final /* synthetic */ zr0 i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerImpl$apply$operation$1(Object obj, zr0 zr0Var) {
        super(3);
        this.i = zr0Var;
        this.j = obj;
    }

    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Applier applier = (Applier) obj;
        nj.y(applier, (SlotWriter) obj2, (RememberManager) obj3);
        this.i.invoke(applier.getC(), this.j);
        return az2.a;
    }
}
