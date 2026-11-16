package androidx.compose.animation.core;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.az2;
import defpackage.rc1;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "Laz2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class SuspendAnimationKt$animate$7 extends rc1 implements sr0 {
    public final /* synthetic */ AnimationState i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$animate$7(AnimationState animationState) {
        super(0);
        this.i = animationState;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        this.i.f = false;
        return az2.a;
    }
}
