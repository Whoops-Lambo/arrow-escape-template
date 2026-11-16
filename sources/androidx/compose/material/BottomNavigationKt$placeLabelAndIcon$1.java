package androidx.compose.material;

import androidx.compose.ui.layout.Placeable;
import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Laz2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class BottomNavigationKt$placeLabelAndIcon$1 extends rc1 implements wr0 {
    public final /* synthetic */ float i;
    public final /* synthetic */ Placeable j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ Placeable n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomNavigationKt$placeLabelAndIcon$1(float f, Placeable placeable, int i, int i2, int i3, Placeable placeable2, int i4, int i5) {
        super(1);
        this.i = f;
        this.j = placeable;
        this.k = i;
        this.l = i2;
        this.m = i3;
        this.n = placeable2;
        this.o = i4;
        this.p = i5;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        placementScope.getClass();
        float f = this.i;
        int i = this.m;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            Placeable.PlacementScope.e(placementScope, this.j, this.k, this.l + i);
        }
        Placeable.PlacementScope.e(placementScope, this.n, this.o, this.p + i);
        return az2.a;
    }
}
