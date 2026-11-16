package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import defpackage.n30;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class Z1 {
    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.i);
        p0.startActivity(p1);
    }

    public static boolean a(Context context, String str, Ji ji, String str2, Y9 y9) {
        context.getClass();
        str.getClass();
        ji.getClass();
        str2.getClass();
        if (y9 != null) {
            ((Z9) y9).c("AppstoreLinkHandler", "In appStoreLinkHandled");
        }
        if (str.length() != 0) {
            Uri uri = Uri.parse(str);
            if ("market".equals(uri.getScheme()) || "play.google.com".equals(uri.getHost()) || "market.android.com".equals(uri.getHost())) {
                Uri uri2 = Uri.parse(str);
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    if (!ji.c()) {
                        ji.a("EX_".concat(str2));
                        return false;
                    }
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW", uri2);
                        intent.setPackage("com.android.vending");
                        intent.addFlags(268435456);
                        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                        if (y9 != null) {
                            ((Z9) y9).c("AppstoreLinkHandler", "Playstore link handled successfully");
                        }
                        return true;
                    } catch (IllegalArgumentException e) {
                        if (y9 != null) {
                            ((Z9) y9).c("AppstoreLinkHandler", n30.y("IllegalArgumentException: Processing appStoreLinkHandling: ", e.getMessage()));
                        }
                        return false;
                    } catch (Exception e2) {
                        if (y9 != null) {
                            ((Z9) y9).c("AppstoreLinkHandler", n30.y("ActivityNotFoundException: Processing appStoreLinkHandling: ", e2.getMessage()));
                        }
                        return false;
                    }
                } catch (PackageManager.NameNotFoundException e3) {
                    e3.printStackTrace();
                    int iA = M5.a(context, str, ji, str2, y9);
                    if (iA != 0 && iA != 1) {
                        return false;
                    }
                    if (y9 != null) {
                        ((Z9) y9).c("AppstoreLinkHandler", "Playstore link handled successfully");
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
