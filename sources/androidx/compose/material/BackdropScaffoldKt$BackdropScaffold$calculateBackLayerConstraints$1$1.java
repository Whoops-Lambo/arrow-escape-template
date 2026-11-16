package androidx.compose.material;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import com.unity3d.services.UnityAdsConstants;
import defpackage.rc1;
import defpackage.rd1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1 extends rc1 implements wr0 {
    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        return new Constraints(ConstraintsKt.i(0, -rd1.p(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), 1, Constraints.a(0, ((Constraints) obj).a, 0, 0, 0, 10)));
    }
}
