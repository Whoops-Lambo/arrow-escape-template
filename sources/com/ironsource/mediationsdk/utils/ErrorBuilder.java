package com.ironsource.mediationsdk.utils;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.h50;
import defpackage.n30;
import defpackage.nj;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ErrorBuilder {
    private static IronSourceError a() {
        return buildGenericError("Mediation - wrong configuration");
    }

    public static IronSourceError adContainerIsNull(String str) {
        return new IronSourceError(617, n30.m(str, " banner container is null"));
    }

    public static IronSourceError buildCappedPerPlacementError(String str) {
        return new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, str);
    }

    public static IronSourceError buildCappedPerSessionError(String str) {
        return new IronSourceError(IronSourceError.ERROR_CAPPED_PER_SESSION, n30.m(str, " Show Fail - Networks have reached their cap per session"));
    }

    public static IronSourceError buildInitFailedError(String str) {
        StringBuilder sb = new StringBuilder("Init failed - ");
        if (TextUtils.isEmpty(str)) {
            str = "unknown error";
        }
        sb.append(str);
        return new IronSourceError(508, sb.toString());
    }

    public static IronSourceError buildInvalidConfigurationError(String str) {
        return new IronSourceError(501, pv1.n("", str, " Init Fail - Configurations from the server are not valid"));
    }

    public static IronSourceError buildInvalidCredentialsError(String str, String str2, String str3) {
        StringBuilder sbR = pv1.r("Init Fail - ", str, " value ", str2, " is not valid");
        sbR.append(!TextUtils.isEmpty(str3) ? n30.y(" - ", str3) : "");
        return new IronSourceError(506, sbR.toString());
    }

    public static IronSourceError buildLoadFailedError(String str, String str2, String str3) {
        String strQ = nj.q(h50.r("", str, " Load Fail"), TextUtils.isEmpty(str2) ? "" : n30.y(" ", str2), " - ");
        if (TextUtils.isEmpty(str3)) {
            str3 = "unknown error";
        }
        return new IronSourceError(510, n30.m(strQ, str3));
    }

    public static IronSourceError buildNoAdsToShowError(String str) {
        return new IronSourceError(509, n30.m(str, " Show Fail - No ads to show"));
    }

    public static IronSourceError buildNoConfigurationAvailableError(String str) {
        return new IronSourceError(501, pv1.n("", str, " Init Fail - Unable to retrieve configurations from the server"));
    }

    public static IronSourceError buildNoInternetConnectionInitFailError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NO_INTERNET_CONNECTION, pv1.n("", str, " Init Fail - No Internet connection"));
    }

    public static IronSourceError buildNoInternetConnectionLoadFailError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NO_INTERNET_CONNECTION, pv1.n("", str, " Load Fail - No Internet connection"));
    }

    public static IronSourceError buildNoInternetConnectionShowFailError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NO_INTERNET_CONNECTION, pv1.n("", str, " Show Fail - No Internet connection"));
    }

    public static IronSourceError buildNonExistentInstanceError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, n30.m(str, " The requested instance does not exist"));
    }

    public static IronSourceError buildShowFailedError(String str, String str2) {
        return new IronSourceError(509, h50.i(str, " Show Fail - ", str2));
    }

    public static IronSourceError buildUsingCachedConfigurationError(String str, String str2) {
        return new IronSourceError(502, pv1.o("Mediation - Unable to retrieve configurations from IronSource server, using cached configurations with appKey:", str, " and userId:", str2));
    }

    public static IronSourceError unsupportedBannerSize(String str) {
        return new IronSourceError(616, n30.m(str, " unsupported banner size"));
    }

    public static IronSourceError buildGenericError(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "An error occurred";
        }
        return new IronSourceError(510, str);
    }

    public static IronSourceError buildInvalidKeyValueError(String str, String str2) {
        String strY;
        if (TextUtils.isEmpty(str)) {
            return a();
        }
        StringBuilder sbR = h50.r("Mediation - ", str, " value is not valid ");
        if (!TextUtils.isEmpty(str2)) {
            strY = n30.y(" - ", str2);
        } else {
            strY = "";
        }
        sbR.append(strY);
        return new IronSourceError(506, sbR.toString());
    }

    public static IronSourceError buildKeyNotSetError(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return new IronSourceError(505, str3 + " Mediation - " + str + " is not set for " + str2);
        }
        return a();
    }

    public static IronSourceError buildInitFailedError(String str, String str2) {
        String strI;
        if (TextUtils.isEmpty(str)) {
            strI = n30.m(str2, " init failed due to an unknown error");
        } else {
            strI = h50.i(str2, " - ", str);
        }
        return new IronSourceError(508, strI);
    }

    public static IronSourceError buildLoadFailedError(String str) {
        return new IronSourceError(510, TextUtils.isEmpty(str) ? "Load failed due to an unknown error" : n30.y("Load failed - ", str));
    }
}
