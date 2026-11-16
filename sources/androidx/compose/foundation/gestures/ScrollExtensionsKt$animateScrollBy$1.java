package androidx.compose.foundation.gestures;

import com.unity3d.services.UnityAdsConstants;
import defpackage.fy;
import defpackage.j32;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@t50(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", l = {40}, m = "animateScrollBy")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class ScrollExtensionsKt$animateScrollBy$1 extends fy {
    public j32 r;
    public /* synthetic */ Object s;
    public int t;

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.t |= Integer.MIN_VALUE;
        return ScrollExtensionsKt.a(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, this);
    }
}
