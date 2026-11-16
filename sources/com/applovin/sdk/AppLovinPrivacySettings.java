package com.applovin.sdk;

import android.content.Context;
import androidx.annotation.Nullable;
import com.applovin.impl.q0;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.u7;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class AppLovinPrivacySettings {
    @Deprecated
    public static void setDoNotSell(boolean z, Context context) {
        p.g("AppLovinPrivacySettings", "setDoNotSell()");
        if (q0.a(z, context)) {
            AppLovinSdk.getInstance(context).reinitialize(null, Boolean.valueOf(z));
        }
    }

    @Deprecated
    public static void setHasUserConsent(boolean z, Context context) {
        p.g("AppLovinPrivacySettings", "setHasUserConsent()");
        if (q0.b(z, context)) {
            AppLovinSdk.getInstance(context).reinitialize(Boolean.valueOf(z), null);
        }
    }

    @Nullable
    public static Boolean getAdditionalConsentStatus(int i) {
        l lVarF = u7.f();
        if (lVarF == null) {
            p.h("AppLovinPrivacySettings", "Unable to retrieve additional consent status");
            return null;
        }
        return lVarF.t0().a(i);
    }

    @Nullable
    public static Boolean getPurposeConsentStatus(int i) {
        l lVarF = u7.f();
        if (lVarF == null) {
            p.h("AppLovinPrivacySettings", "Unable to retrieve purpose consent status");
            return null;
        }
        return lVarF.t0().b(i);
    }

    @Nullable
    public static Boolean getSpecialFeatureOptInStatus(int i) {
        l lVarF = u7.f();
        if (lVarF == null) {
            p.h("AppLovinPrivacySettings", "Unable to retrieve special feature opt in status");
            return null;
        }
        return lVarF.t0().c(i);
    }

    @Nullable
    public static Boolean getTcfVendorConsentStatus(int i) {
        l lVarF = u7.f();
        if (lVarF == null) {
            p.h("AppLovinPrivacySettings", "Unable to retrieve TCF vendor consent status");
            return null;
        }
        return lVarF.t0().d(i);
    }

    @Deprecated
    public static boolean hasUserConsent(Context context) {
        Boolean boolB = q0.b().b(context);
        if (boolB != null) {
            return boolB.booleanValue();
        }
        return false;
    }

    @Deprecated
    public static boolean isDoNotSell(Context context) {
        Boolean boolB = q0.a().b(context);
        if (boolB != null) {
            return boolB.booleanValue();
        }
        return false;
    }

    @Deprecated
    public static boolean isDoNotSellSet(Context context) {
        if (q0.a().b(context) != null) {
            return true;
        }
        return false;
    }

    @Deprecated
    public static boolean isUserConsentSet(Context context) {
        if (q0.b().b(context) != null) {
            return true;
        }
        return false;
    }

    public static boolean isDoNotSellSet() {
        return isDoNotSellSet(l.p());
    }

    public static boolean isUserConsentSet() {
        return isUserConsentSet(l.p());
    }

    public static boolean hasUserConsent() {
        return hasUserConsent(l.p());
    }

    public static boolean isDoNotSell() {
        return isDoNotSell(l.p());
    }

    public static void setDoNotSell(boolean z) {
        setDoNotSell(z, l.p());
    }

    public static void setHasUserConsent(boolean z) {
        setHasUserConsent(z, l.p());
    }
}
