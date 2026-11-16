package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Offset;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class NestedScrollInteropConnectionKt {
    public static final int b(float f) {
        return ((int) (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Math.ceil(f) : Math.floor(f))) * (-1);
    }

    public static final void a(long j) {
        Math.abs(Offset.c(j));
        Math.abs(Offset.d(j));
    }
}
