package defpackage;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.RequestConfiguration;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.metadata.MetaData;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class gz2 {
    public static AdError a(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        int i;
        int i2 = fz2.b[unityAdsInitializationError.ordinal()];
        if (i2 == 1) {
            i = Sdk.SDKError.Reason.MRAID_ERROR_VALUE;
        } else if (i2 != 2) {
            i = i2 != 3 ? 300 : 303;
        } else {
            i = Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE;
        }
        return new AdError(i, str, "com.unity3d.ads");
    }

    public static AdError b(UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        int i;
        int i2 = fz2.c[unityAdsLoadError.ordinal()];
        if (i2 == 1) {
            i = 401;
        } else if (i2 == 2) {
            i = TTAdConstant.AD_ID_IS_NULL_CODE;
        } else if (i2 == 3) {
            i = 403;
        } else if (i2 != 4) {
            i = i2 != 5 ? 400 : 405;
        } else {
            i = 404;
        }
        return new AdError(i, str, "com.unity3d.ads");
    }

    public static AdError c(UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        int i;
        switch (fz2.d[unityAdsShowError.ordinal()]) {
            case 1:
                i = 501;
                break;
            case 2:
                i = 502;
                break;
            case 3:
                i = 503;
                break;
            case 4:
                i = 504;
                break;
            case 5:
                i = 505;
                break;
            case 6:
                i = 506;
                break;
            case 7:
                i = 507;
                break;
            case 8:
                i = 508;
                break;
            default:
                i = 500;
                break;
        }
        return new AdError(i, str, "com.unity3d.ads");
    }

    public static void d(RequestConfiguration requestConfiguration, MetaData metaData) {
        int tagForChildDirectedTreatment = requestConfiguration.getTagForChildDirectedTreatment();
        int tagForUnderAgeOfConsent = requestConfiguration.getTagForUnderAgeOfConsent();
        if (tagForChildDirectedTreatment != 1 && tagForUnderAgeOfConsent != 1 && (tagForChildDirectedTreatment == 0 || tagForUnderAgeOfConsent == 0)) {
            metaData.set("user.nonbehavioral", Boolean.FALSE);
        } else {
            metaData.set("user.nonbehavioral", Boolean.TRUE);
        }
        metaData.commit();
    }
}
