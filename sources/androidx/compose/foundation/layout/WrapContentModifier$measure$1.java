package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Laz2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class WrapContentModifier$measure$1 extends rc1 implements wr0 {
    public final /* synthetic */ WrapContentModifier i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Placeable k;
    public final /* synthetic */ int l;
    public final /* synthetic */ MeasureScope m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapContentModifier$measure$1(WrapContentModifier wrapContentModifier, int i, Placeable placeable, int i2, MeasureScope measureScope) {
        super(1);
        this.i = wrapContentModifier;
        this.j = i;
        this.k = placeable;
        this.l = i2;
        this.m = measureScope;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        ((Placeable.PlacementScope) obj).getClass();
        zr0 zr0Var = this.i.c;
        Placeable placeable = this.k;
        Placeable.PlacementScope.d(placeable, ((IntOffset) zr0Var.invoke(new IntSize(IntSizeKt.a(this.j - placeable.a, this.l - placeable.b)), this.m.getA())).a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        return az2.a;
    }
}
