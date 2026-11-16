package androidx.compose.animation.core;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002\"\b\b\u0002\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "R", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "V", "Landroidx/compose/animation/core/AnimationVector;", "it", "", "invoke", "(J)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class SuspendAnimationKt$callWithFrameNanos$2 extends rc1 implements wr0 {
    public final /* synthetic */ wr0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$callWithFrameNanos$2(wr0 wr0Var) {
        super(1);
        this.i = wr0Var;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        return this.i.invoke(Long.valueOf(((Number) obj).longValue()));
    }
}
