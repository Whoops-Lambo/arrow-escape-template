package androidx.compose.animation;

import androidx.compose.ui.layout.Placeable;
import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Laz2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class AnimatedContentScope$SizeModifier$measure$1 extends rc1 implements wr0 {
    public final /* synthetic */ Placeable i;
    public final /* synthetic */ long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentScope$SizeModifier$measure$1(Placeable placeable, long j) {
        super(1);
        this.i = placeable;
        this.j = j;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        ((Placeable.PlacementScope) obj).getClass();
        Placeable.PlacementScope.d(this.i, this.j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        return az2.a;
    }
}
