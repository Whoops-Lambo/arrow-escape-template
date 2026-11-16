package com.inmobi.media;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import com.inmobi.media.core.config.models.RootConfig;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class Ki {
    public static final boolean a = ((RootConfig) AbstractC4563z4.a.a(RootConfig.class)).getReducedUserAgentInfoEnabled();

    public static String a() {
        try {
            PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
            if (currentWebViewPackage != null) {
                return currentWebViewPackage.versionName;
            }
            return null;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    public static String b() {
        if (Build.VERSION.SDK_INT >= 26) {
            return a();
        }
        return null;
    }
}
