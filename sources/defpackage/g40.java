package defpackage;

import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.google.android.gms.ads.AdError;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class g40 {
    public static final AdError a(InneractiveErrorCode inneractiveErrorCode) {
        int i = 399;
        switch (inneractiveErrorCode == null ? -1 : f40.$EnumSwitchMapping$1[inneractiveErrorCode.ordinal()]) {
            case 1:
                i = 300;
                break;
            case 2:
                i = Sdk.SDKError.Reason.MRAID_ERROR_VALUE;
                break;
            case 3:
                i = Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE;
                break;
            case 4:
                i = 303;
                break;
            case 5:
                i = Sdk.SDKError.Reason.AD_EXPIRED_VALUE;
                break;
            case 6:
                i = Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE;
                break;
            case 7:
                i = 306;
                break;
            case 8:
                i = 307;
                break;
            case 9:
                i = 308;
                break;
            case 10:
                i = Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE;
                break;
            case 11:
                i = Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE;
                break;
            case 12:
                i = Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE;
                break;
            case 13:
                i = Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE;
                break;
            case 14:
                i = Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE;
                break;
            case 15:
                i = Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE;
                break;
            case 16:
                i = Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE;
                break;
            case 17:
                i = Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE;
                break;
            case 18:
                i = Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE;
                break;
        }
        return new AdError(i, "DT Exchange failed to request ad with reason: " + inneractiveErrorCode, "com.google.ads.mediation.dtexchange");
    }

    public static final AdError b(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
        int i;
        fyberInitStatus.getClass();
        int i2 = f40.$EnumSwitchMapping$0[fyberInitStatus.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        i = 299;
                    } else {
                        i = 203;
                    }
                } else {
                    i = 202;
                }
            } else {
                i = 201;
            }
        } else {
            i = 200;
        }
        return new AdError(i, "DT Exchange failed to initialize with reason: " + fyberInitStatus, "com.google.ads.mediation.dtexchange");
    }
}
