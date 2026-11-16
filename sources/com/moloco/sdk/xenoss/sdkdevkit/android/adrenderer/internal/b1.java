package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import com.moloco.sdk.internal.MolocoLogger;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class b1 implements a1 {
    public final Context a;

    public static void safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(CustomTabsIntent p0, Context p1, Uri p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/browser/customtabs/CustomTabsIntent;->launchUrl(Landroid/content/Context;Landroid/net/Uri;)V");
        if (p2 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p2, com.safedk.android.utils.h.D);
        p0.launchUrl(p1, p2);
    }

    public b1(Context context) {
        this.a = context;
    }

    public final boolean a(String str) {
        str.getClass();
        Context context = this.a;
        try {
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            builder.a.putExtra(CustomTabsIntent.EXTRA_ENABLE_URLBAR_HIDING, true);
            CustomTabsIntent customTabsIntentA = builder.a();
            customTabsIntentA.intent.addFlags(268435456);
            safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(customTabsIntentA, context, Uri.parse(str));
            return true;
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "Xenoss", "tryStartCustomTabs exception", e, false, 8, null);
            return false;
        }
    }
}
