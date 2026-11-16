package androidx.core.location;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.TimeUtils;
import com.unity3d.services.UnityAdsConstants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class LocationRequestCompat {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Api19Impl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api31Impl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Quality {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocationRequestCompat) && Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request[@");
        Object obj = TimeUtils.a;
        synchronized (obj) {
            if (TimeUtils.b.length < 0) {
                TimeUtils.b = new char[0];
            }
            char[] cArr = TimeUtils.b;
            cArr[0] = '0';
            sb.append(cArr, 0, 1);
        }
        sb.append(", duration=");
        synchronized (obj) {
            if (TimeUtils.b.length < 0) {
                TimeUtils.b = new char[0];
            }
            char[] cArr2 = TimeUtils.b;
            cArr2[0] = '0';
            sb.append(cArr2, 0, 1);
        }
        sb.append(", maxUpdates=0]");
        return sb.toString();
    }
}
