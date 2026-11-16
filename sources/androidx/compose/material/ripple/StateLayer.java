package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.runtime.MutableState;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/ripple/StateLayer;", "", "material-ripple_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class StateLayer {
    public final boolean a;
    public final MutableState b;
    public final Animatable c = AnimatableKt.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public final ArrayList d = new ArrayList();
    public Interaction e;

    public StateLayer(MutableState mutableState, boolean z) {
        this.a = z;
        this.b = mutableState;
    }
}
