package androidx.compose.foundation.text;

import androidx.compose.animation.core.KeyframesSpec;
import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "", "Laz2;", "invoke", "(Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class TextFieldCursorKt$cursorAnimationSpec$1 extends rc1 implements wr0 {
    public static final TextFieldCursorKt$cursorAnimationSpec$1 i = new TextFieldCursorKt$cursorAnimationSpec$1(1);

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = (KeyframesSpec.KeyframesSpecConfig) obj;
        keyframesSpecConfig.getClass();
        keyframesSpecConfig.a = 1000;
        Float fValueOf = Float.valueOf(1.0f);
        keyframesSpecConfig.a(fValueOf, 0);
        keyframesSpecConfig.a(fValueOf, 499);
        Float fValueOf2 = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        keyframesSpecConfig.a(fValueOf2, 500);
        keyframesSpecConfig.a(fValueOf2, 999);
        return az2.a;
    }
}
