package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.fy;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@t50(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", l = {Sdk.SDKError.Reason.TPAT_ERROR_VALUE}, m = "bringIntoView")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class BringIntoViewRequesterImpl$bringIntoView$1 extends fy {
    public Rect r;
    public Object[] s;
    public int t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ BringIntoViewRequesterImpl w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewRequesterImpl$bringIntoView$1(BringIntoViewRequesterImpl bringIntoViewRequesterImpl, fy fyVar) {
        super(fyVar);
        this.w = bringIntoViewRequesterImpl;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.a(null, this);
    }
}
