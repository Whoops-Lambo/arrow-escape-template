package androidx.compose.animation;

import androidx.compose.ui.layout.Placeable;
import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Laz2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class AnimatedEnterExitMeasurePolicy$measure$1 extends rc1 implements wr0 {
    public final /* synthetic */ ArrayList i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedEnterExitMeasurePolicy$measure$1(ArrayList arrayList) {
        super(1);
        this.i = arrayList;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        ((Placeable.PlacementScope) obj).getClass();
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Placeable.PlacementScope.c((Placeable) arrayList.get(i), 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        return az2.a;
    }
}
