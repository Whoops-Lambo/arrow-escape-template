package defpackage;

import android.view.Surface;
import androidx.annotation.DoNotInline;
import com.google.android.exoplayer2.util.Log;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class j53 {
    @DoNotInline
    public static void a(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : 1);
        } catch (IllegalStateException e) {
            Log.e("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
