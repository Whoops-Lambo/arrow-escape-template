package com.bytedance.sdk.openadsdk.api.init;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.gf.ahm.rz;
import com.bytedance.sdk.component.utils.ay;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.common.noq;
import com.bytedance.sdk.openadsdk.core.bmz;
import com.bytedance.sdk.openadsdk.core.gf;
import com.bytedance.sdk.openadsdk.core.kus;
import com.bytedance.sdk.openadsdk.core.xh;
import com.bytedance.sdk.openadsdk.dg.uq;
import com.bytedance.sdk.openadsdk.fi.kgy;
import com.bytedance.sdk.openadsdk.utils.mw;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class PAGSdk {
    public static final int INIT_LOCAL_FAIL_CODE = 4000;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface PAGInitCallback {
        void fail(int i, String str);

        void success();
    }

    public static void addPAGInitCallback(PAGInitCallback pAGInitCallback) {
        if (pAGInitCallback != null && kus.uq() == 0) {
            kgy.kgy.add(pAGInitCallback);
        }
    }

    public static void getBiddingToken(final Context context, final PAGBiddingRequest pAGBiddingRequest, final PAGBidCallback pAGBidCallback) {
        if (pAGBidCallback == null) {
            return;
        }
        if (noq.kgy()) {
            pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10009, gf.kgy(10009)));
        } else {
            mw.uq(new rz("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.3
                @Override // java.lang.Runnable
                public void run() {
                    xh.ahm(context);
                    kgy.kgy(pAGBiddingRequest, pAGBidCallback);
                    com.bytedance.sdk.openadsdk.gm.kgy.ahm.kgy.kgy().kgy(false);
                }
            });
        }
    }

    public static void setAdRevenue(JSONObject jSONObject) {
        if (jSONObject != null && xh.uq().xh() && isInitSuccess()) {
            uq.kgy().kgy(jSONObject);
        }
    }

    static {
        kgy.kgy();
    }

    public static void closeMultiWebViewFileLock() {
        com.bytedance.sdk.openadsdk.fpp.kgy.kgy();
    }

    public static String getSDKVersion() {
        if (bmz.kgy() != null) {
            return bmz.kgy().ahm();
        }
        return "";
    }

    public static void init(final Context context, final PAGConfig pAGConfig, final PAGInitCallback pAGInitCallback) {
        kus.ahm().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.1
            @Override // java.lang.Runnable
            public void run() {
                kgy.kgy(context, pAGConfig, pAGInitCallback);
            }
        });
        kus.yo();
    }

    public static boolean isInitSuccess() {
        if (kus.uq() == 1) {
            return true;
        }
        return false;
    }

    public static void setAabPackageName(String str) {
        if (!TextUtils.isEmpty(str)) {
            ay.kgy(str);
            com.bytedance.adsdk.ugeno.fi.uq.kgy(str);
        }
    }

    private static void setSdkDisable(boolean z) {
        noq.kgy(z);
    }

    public static void getBiddingToken(final Context context, final PAGBiddingRequest pAGBiddingRequest, final BiddingTokenCallback biddingTokenCallback) {
        if (biddingTokenCallback == null) {
            return;
        }
        if (noq.kgy()) {
            biddingTokenCallback.onBiddingTokenCollected("");
        } else {
            mw.uq(new rz("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.2
                @Override // java.lang.Runnable
                public void run() {
                    xh.ahm(context);
                    kgy.kgy(pAGBiddingRequest, new PAGBidCallback() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.2.1
                        @Override // com.bytedance.sdk.openadsdk.api.init.PAGBidCallback
                        public void onBiddingTokenCollected(String str) {
                            biddingTokenCallback.onBiddingTokenCollected(str);
                        }

                        @Override // com.bytedance.sdk.openadsdk.api.init.PAGBidCallback
                        public void onBiddingTokenFailed(PAGBidError pAGBidError) {
                            biddingTokenCallback.onBiddingTokenCollected("");
                        }
                    });
                    com.bytedance.sdk.openadsdk.gm.kgy.ahm.kgy.kgy().kgy(false);
                }
            });
        }
    }
}
