package androidx.compose.material.ripple;

import com.ironsource.C5073y1;
import defpackage.fy;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@t50(c = "androidx.compose.material.ripple.RippleAnimation", f = "RippleAnimation.kt", l = {C5073y1.c, 82, 83}, m = "animate")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class RippleAnimation$animate$1 extends fy {
    public RippleAnimation r;
    public /* synthetic */ Object s;
    public final /* synthetic */ RippleAnimation t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleAnimation$animate$1(RippleAnimation rippleAnimation, fy fyVar) {
        super(fyVar);
        this.t = rippleAnimation;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.a(this);
    }
}
