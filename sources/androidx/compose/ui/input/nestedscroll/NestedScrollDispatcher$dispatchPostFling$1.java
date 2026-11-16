package androidx.compose.ui.input.nestedscroll;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.fy;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@t50(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE}, m = "dispatchPostFling-RZ2iAVY")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class NestedScrollDispatcher$dispatchPostFling$1 extends fy {
    public /* synthetic */ Object r;
    public final /* synthetic */ NestedScrollDispatcher s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollDispatcher$dispatchPostFling$1(NestedScrollDispatcher nestedScrollDispatcher, fy fyVar) {
        super(fyVar);
        this.s = nestedScrollDispatcher;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.a(0L, 0L, this);
    }
}
