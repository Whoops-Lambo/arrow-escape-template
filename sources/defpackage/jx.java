package defpackage;

import androidx.compose.ui.layout.Placeable;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class jx extends rc1 implements wr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Placeable j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jx(int i, Placeable placeable) {
        super(1);
        this.i = i;
        this.j = placeable;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        int i = this.i;
        az2 az2Var = az2.a;
        Placeable placeable = this.j;
        switch (i) {
            case 0:
                ((Placeable.PlacementScope) obj).getClass();
                Placeable.PlacementScope.c(placeable, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            default:
                Placeable.PlacementScope.e((Placeable.PlacementScope) obj, placeable, 0, 0);
                break;
        }
        return az2Var;
    }
}
