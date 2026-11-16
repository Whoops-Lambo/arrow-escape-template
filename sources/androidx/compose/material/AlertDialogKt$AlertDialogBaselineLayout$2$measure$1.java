package androidx.compose.material;

import androidx.compose.ui.layout.Placeable;
import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class AlertDialogKt$AlertDialogBaselineLayout$2$measure$1 extends rc1 implements wr0 {
    public final /* synthetic */ Placeable i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Placeable k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$AlertDialogBaselineLayout$2$measure$1(Placeable placeable, int i, Placeable placeable2, int i2) {
        super(1);
        this.i = placeable;
        this.j = i;
        this.k = placeable2;
        this.l = i2;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        ((Placeable.PlacementScope) obj).getClass();
        Placeable placeable = this.i;
        if (placeable != null) {
            Placeable.PlacementScope.c(placeable, 0, this.j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        Placeable placeable2 = this.k;
        if (placeable2 != null) {
            Placeable.PlacementScope.c(placeable2, 0, this.l, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        return az2.a;
    }
}
