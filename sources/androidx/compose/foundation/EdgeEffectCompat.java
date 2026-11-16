package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/EdgeEffectCompat;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class EdgeEffectCompat {
    public static EdgeEffect a(Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.a.a(context, null);
        }
        return new EdgeEffect(context);
    }

    public static float b(EdgeEffect edgeEffect) {
        edgeEffect.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.a.b(edgeEffect);
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public static void c(EdgeEffect edgeEffect, int i) {
        edgeEffect.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i);
        }
    }

    public static float d(EdgeEffect edgeEffect, float f, float f2) {
        edgeEffect.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.a.c(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }
}
