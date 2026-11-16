package androidx.compose.foundation.layout;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.fy;
import defpackage.j32;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@t50(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection", f = "WindowInsetsConnection.android.kt", l = {Sdk.SDKError.Reason.AD_EXPIRED_VALUE, 330, 355}, m = "fling-huYlsQE")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class WindowInsetsNestedScrollConnection$fling$1 extends fy {
    public Object r;
    public j32 s;
    public long t;
    public float u;
    public /* synthetic */ Object v;
    public final /* synthetic */ WindowInsetsNestedScrollConnection w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$1(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, fy fyVar) {
        super(fyVar);
        this.w = windowInsetsNestedScrollConnection;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.f(0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, this);
    }
}
