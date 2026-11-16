package androidx.compose.foundation.lazy;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import defpackage.fy;
import defpackage.t50;
import defpackage.y62;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@t50(c = "androidx.compose.foundation.lazy.AwaitFirstLayoutModifier", f = "LazyListState.kt", l = {TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME}, m = "waitForFirstLayout")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class AwaitFirstLayoutModifier$waitForFirstLayout$1 extends fy {
    public y62 r;
    public /* synthetic */ Object s;
    public final /* synthetic */ AwaitFirstLayoutModifier t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwaitFirstLayoutModifier$waitForFirstLayout$1(AwaitFirstLayoutModifier awaitFirstLayoutModifier, fy fyVar) {
        super(fyVar);
        this.t = awaitFirstLayoutModifier;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.b(this);
    }
}
