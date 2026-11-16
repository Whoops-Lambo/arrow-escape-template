package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.platform.InfiniteAnimationPolicy;
import defpackage.fy;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation-core_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class InfiniteAnimationPolicyKt {
    public static final Object a(wr0 wr0Var, fy fyVar) {
        InfiniteAnimationPolicy infiniteAnimationPolicy = (InfiniteAnimationPolicy) fyVar.getContext().get(InfiniteAnimationPolicy.Key.a);
        if (infiniteAnimationPolicy == null) {
            return MonotonicFrameClockKt.a(fyVar.getContext()).d(wr0Var, fyVar);
        }
        new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(wr0Var, null);
        return infiniteAnimationPolicy.k();
    }
}
