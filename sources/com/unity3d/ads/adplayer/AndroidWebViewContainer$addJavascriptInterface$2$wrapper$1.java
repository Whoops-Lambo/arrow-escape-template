package com.unity3d.ads.adplayer;

import android.webkit.JavascriptInterface;
import com.explorestack.protobuf.z;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.utils.Logger;
import com.unity3d.ads.adplayer.model.WebViewBridgeInterface;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/unity3d/ads/adplayer/AndroidWebViewContainer$addJavascriptInterface$2$wrapper$1", "Lcom/unity3d/ads/adplayer/model/WebViewBridgeInterface;", "", "message", "Laz2;", "handleInvocation", "(Ljava/lang/String;)V", "callbackId", "callbackStatus", "rawParameters", "handleCallback", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidWebViewContainer$addJavascriptInterface$2$wrapper$1 implements WebViewBridgeInterface {
    final /* synthetic */ WebViewBridge $webViewBridgeInterface;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AndroidWebViewContainer$addJavascriptInterface$2$wrapper$1(WebViewBridge webViewBridge) {
        this(webViewBridge, null);
        Logger.d("UnityAds|SafeDK: Execution> Lcom/unity3d/ads/adplayer/AndroidWebViewContainer$addJavascriptInterface$2$wrapper$1;-><init>(Lcom/unity3d/ads/adplayer/WebViewBridge;)V");
        CreativeInfoManager.onWebviewInterfaceConstruction("com.unity3d.ads", this);
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewBridgeInterface
    @JavascriptInterface
    public void handleInvocation(String message) {
        Logger.d("UnityAds|SafeDK: Execution> Lcom/unity3d/ads/adplayer/AndroidWebViewContainer$addJavascriptInterface$2$wrapper$1;->handleInvocation(Ljava/lang/String;)V");
        CreativeInfoManager.onHandleInvocation("com.unity3d.ads", this, message);
        safedk_AndroidWebViewContainer$addJavascriptInterface$2$wrapper$1_handleInvocation_13f0ae608c73e26f83257d778e6067a1(message);
    }

    private AndroidWebViewContainer$addJavascriptInterface$2$wrapper$1(WebViewBridge p1, StatsEvent p2) {
        Logger.d("UnityAds|SafeDK: Execution> Lcom/unity3d/ads/adplayer/AndroidWebViewContainer$addJavascriptInterface$2$wrapper$1;-><init>(Lcom/unity3d/ads/adplayer/WebViewBridge;)V");
        if ("UnityAds|SafeDK: Execution> Lcom/unity3d/ads/adplayer/AndroidWebViewContainer$addJavascriptInterface$2$wrapper$1;-><init>(Lcom/unity3d/ads/adplayer/WebViewBridge;)V" == 0) {
            this.$webViewBridgeInterface = p1;
        } else {
            this.$webViewBridgeInterface = p1;
        }
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewBridgeInterface
    @JavascriptInterface
    public void handleCallback(String callbackId, String callbackStatus, String rawParameters) {
        z.r(callbackId, callbackStatus, rawParameters);
        this.$webViewBridgeInterface.handleCallback(callbackId, callbackStatus, rawParameters);
    }

    @JavascriptInterface
    public void safedk_AndroidWebViewContainer$addJavascriptInterface$2$wrapper$1_handleInvocation_13f0ae608c73e26f83257d778e6067a1(String p0) {
        p0.getClass();
        this.$webViewBridgeInterface.handleInvocation(p0);
    }
}
