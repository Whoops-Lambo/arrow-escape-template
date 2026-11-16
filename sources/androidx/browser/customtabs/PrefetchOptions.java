package androidx.browser.customtabs;

import android.os.Build;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@ExperimentalPrefetch
public final class PrefetchOptions {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @ExperimentalPrefetch
    public static final class Builder {
    }

    public static void a(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 33) {
        }
        bundle.getBoolean("androidx.browser.customtabs.PrefetchOptions.KEY_REQUIRES_ANONYMOUS_IP_WHEN_CROSS_ORIGIN");
    }
}
