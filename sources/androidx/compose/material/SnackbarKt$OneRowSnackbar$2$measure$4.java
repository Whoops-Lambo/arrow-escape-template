package androidx.compose.material;

import androidx.compose.ui.layout.Placeable;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class SnackbarKt$OneRowSnackbar$2$measure$4 extends rc1 implements wr0 {
    public final /* synthetic */ Placeable i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Placeable k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$OneRowSnackbar$2$measure$4(Placeable placeable, int i, Placeable placeable2, int i2, int i3) {
        super(1);
        this.i = placeable;
        this.j = i;
        this.k = placeable2;
        this.l = i2;
        this.m = i3;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        placementScope.getClass();
        Placeable.PlacementScope.e(placementScope, this.i, 0, this.j);
        Placeable.PlacementScope.e(placementScope, this.k, this.l, this.m);
        return az2.a;
    }
}
