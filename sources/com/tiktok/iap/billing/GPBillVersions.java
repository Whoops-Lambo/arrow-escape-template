package com.tiktok.iap.billing;

import android.app.Application;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.t;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.util.TTReflect;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class GPBillVersions {
    private static volatile String sVersion;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum GPBillingVer {
        NONE,
        V1,
        V2_V4,
        V5_V8
    }

    private static String readFromBuildConfig() {
        try {
            String str = (String) TTReflect.on("com.android.billingclient.BuildConfig").findField(t.f).getValue(null);
            if (str == null || str.length() <= 2) {
                return null;
            }
            return str;
        } catch (Throwable unused) {
        }
    }

    private static String readFromMeta() {
        try {
            Application applicationContext = TikTokBusinessSdk.getApplicationContext();
            if (applicationContext != null) {
                applicationContext.getPackageManager().getInstallerPackageName("");
                String string = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128).metaData.getString("com.google.android.play.billingclient.version", null);
                if (string != null && string.length() > 2) {
                    return string;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String getVersion() {
        if (!TextUtils.isEmpty(sVersion)) {
            return sVersion;
        }
        sVersion = readFromMeta();
        if (!TextUtils.isEmpty(sVersion)) {
            return sVersion;
        }
        sVersion = readFromBuildConfig();
        return !TextUtils.isEmpty(sVersion) ? sVersion : "";
    }

    public static GPBillingVer getMajorVersion() {
        try {
            String version = getVersion();
            if (version != null) {
                int i = Integer.parseInt(version.split("\\.")[0]);
                if (i == 1) {
                    return GPBillingVer.V1;
                }
                if (i > 1 && i < 5) {
                    return GPBillingVer.V2_V4;
                }
                return GPBillingVer.V5_V8;
            }
        } catch (Throwable unused) {
        }
        return GPBillingVer.NONE;
    }
}
