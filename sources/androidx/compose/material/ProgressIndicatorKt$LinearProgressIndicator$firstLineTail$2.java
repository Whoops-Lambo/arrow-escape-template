package androidx.compose.material;

import androidx.compose.animation.core.KeyframesSpec;
import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2 extends rc1 implements wr0 {
    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = (KeyframesSpec.KeyframesSpecConfig) obj;
        keyframesSpecConfig.getClass();
        keyframesSpecConfig.a = 1800;
        keyframesSpecConfig.a(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), 333).b = ProgressIndicatorKt.b;
        keyframesSpecConfig.a(Float.valueOf(1.0f), 1183);
        return az2.a;
    }
}
