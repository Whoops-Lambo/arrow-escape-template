package androidx.compose.foundation;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/unit/IntSize;", "size", "Laz2;", "invoke-ozmzZPI", "(J)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class AndroidEdgeEffectOverscrollEffect$onNewSize$1 extends rc1 implements wr0 {
    public final /* synthetic */ AndroidEdgeEffectOverscrollEffect i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEdgeEffectOverscrollEffect$onNewSize$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect) {
        super(1);
        this.i = androidEdgeEffectOverscrollEffect;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        long j = ((IntSize) obj).a;
        long jB = IntSizeKt.b(j);
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.i;
        boolean zA = Size.a(jB, androidEdgeEffectOverscrollEffect.n);
        androidEdgeEffectOverscrollEffect.n = IntSizeKt.b(j);
        if (!zA) {
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            androidEdgeEffectOverscrollEffect.b.setSize(i, i2);
            androidEdgeEffectOverscrollEffect.c.setSize(i, i2);
            androidEdgeEffectOverscrollEffect.d.setSize(i2, i);
            androidEdgeEffectOverscrollEffect.e.setSize(i2, i);
            androidEdgeEffectOverscrollEffect.g.setSize(i, i2);
            androidEdgeEffectOverscrollEffect.h.setSize(i, i2);
            androidEdgeEffectOverscrollEffect.i.setSize(i2, i);
            androidEdgeEffectOverscrollEffect.j.setSize(i2, i);
        }
        if (!zA) {
            androidEdgeEffectOverscrollEffect.k();
            androidEdgeEffectOverscrollEffect.g();
        }
        return az2.a;
    }
}
