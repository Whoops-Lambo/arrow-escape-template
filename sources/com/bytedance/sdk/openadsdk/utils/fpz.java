package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class fpz {
    public static boolean kgy(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    public static boolean kgy() {
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            return i >= 32 && kgy(RequestConfiguration.MAX_AD_CONTENT_RATING_T, Build.VERSION.CODENAME);
        }
        return true;
    }
}
