package androidx.compose.material;

import androidx.compose.animation.core.KeyframesSpec;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class ProgressIndicatorKt$CircularProgressIndicator$endAngle$2 extends rc1 implements wr0 {
    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = (KeyframesSpec.KeyframesSpecConfig) obj;
        keyframesSpecConfig.getClass();
        keyframesSpecConfig.a = 1332;
        keyframesSpecConfig.a(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), 0).b = ProgressIndicatorKt.e;
        keyframesSpecConfig.a(Float.valueOf(290.0f), TTAdConstant.STYLE_SIZE_RADIO_2_3);
        return az2.a;
    }
}
