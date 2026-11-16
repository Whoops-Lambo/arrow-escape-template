package androidx.compose.ui.platform;

import androidx.compose.runtime.MonotonicFrameClockKt;
import defpackage.az2;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.t50;
import defpackage.ul2;
import defpackage.wr0;
import defpackage.wz2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@t50(c = "androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {65}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\u008a@"}, d2 = {"<anonymous>", "R"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2 extends ul2 implements wr0 {
    public int r;
    public final /* synthetic */ wr0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(wr0 wr0Var, dy dyVar) {
        super(1, dyVar);
        this.s = wr0Var;
    }

    @Override // defpackage.ph
    public final dy create(dy dyVar) {
        return new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(this.s, dyVar);
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        return ((InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2) create((dy) obj)).invokeSuspend(az2.a);
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        if (i != 0) {
            if (i == 1) {
                wz2.a0(obj);
                return obj;
            }
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        wz2.a0(obj);
        this.r = 1;
        Object objD = MonotonicFrameClockKt.a(getContext()).d(this.s, this);
        dz dzVar = dz.a;
        return objD == dzVar ? dzVar : objD;
    }
}
