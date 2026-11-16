package androidx.core.content;

import android.content.Intent;
import android.net.Network;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.RequiresApi;
import androidx.browser.customtabs.CustomTabsIntent;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class IntentCompat {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api33Impl {
        public static ArrayList a(Intent intent) {
            return intent.getParcelableArrayListExtra(CustomTabsIntent.EXTRA_CUSTOM_CONTENT_ACTIONS, Bundle.class);
        }

        public static Object b(Intent intent) {
            return intent.getParcelableExtra(CustomTabsIntent.EXTRA_NETWORK, Network.class);
        }
    }

    public static ArrayList a(Intent intent) {
        return Build.VERSION.SDK_INT >= 34 ? Api33Impl.a(intent) : intent.getParcelableArrayListExtra(CustomTabsIntent.EXTRA_CUSTOM_CONTENT_ACTIONS);
    }

    public static Object b(Intent intent) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api33Impl.b(intent);
        }
        Parcelable parcelableExtra = intent.getParcelableExtra(CustomTabsIntent.EXTRA_NETWORK);
        if (Network.class.isInstance(parcelableExtra)) {
            return parcelableExtra;
        }
        return null;
    }
}
