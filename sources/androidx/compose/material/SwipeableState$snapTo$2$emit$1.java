package androidx.compose.material;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.dy;
import defpackage.fy;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@t50(c = "androidx.compose.material.SwipeableState$snapTo$2", f = "Swipeable.kt", l = {Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE}, m = "emit")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class SwipeableState$snapTo$2$emit$1 extends fy {
    public Object r;
    public /* synthetic */ Object s;
    public final /* synthetic */ SwipeableState$snapTo$2 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$snapTo$2$emit$1(SwipeableState$snapTo$2 swipeableState$snapTo$2, dy dyVar) {
        super(dyVar);
        this.t = swipeableState$snapTo$2;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        this.t.a(null, this);
        throw null;
    }
}
