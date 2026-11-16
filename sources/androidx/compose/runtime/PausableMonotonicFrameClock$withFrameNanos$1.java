package androidx.compose.runtime;

import defpackage.fy;
import defpackage.t50;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@t50(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", l = {62, 63}, m = "withFrameNanos")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class PausableMonotonicFrameClock$withFrameNanos$1<R> extends fy {
    public PausableMonotonicFrameClock r;
    public wr0 s;
    public /* synthetic */ Object t;
    public final /* synthetic */ PausableMonotonicFrameClock u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PausableMonotonicFrameClock$withFrameNanos$1(PausableMonotonicFrameClock pausableMonotonicFrameClock, fy fyVar) {
        super(fyVar);
        this.u = pausableMonotonicFrameClock;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.d(null, this);
    }
}
