package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.api.init.PAGBidCallback;
import com.bytedance.sdk.openadsdk.api.init.PAGBidError;
import com.google.ads.mediation.unity.UnityMediationAdapter;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.vungle.ads.BidTokenCallback;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class pt1 implements PAGBidCallback, IUnityAdsTokenListener, BidTokenCallback {
    public final SignalCallbacks a;

    public /* synthetic */ pt1(SignalCallbacks signalCallbacks) {
        this.a = signalCallbacks;
    }

    @Override // com.vungle.ads.BidTokenCallback
    public void onBidTokenCollected(String str) {
        Log.d(VungleMediationAdapter.TAG, "Liftoff Monetize bidding token=" + str);
        this.a.onSuccess(str);
    }

    @Override // com.vungle.ads.BidTokenCallback
    public void onBidTokenError(String str) {
        AdError adError = new AdError(108, "Liftoff Monetize returned an empty bid token.", VungleMediationAdapter.ERROR_DOMAIN);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.a.onFailure(adError);
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGBidCallback
    public void onBiddingTokenCollected(String str) {
        this.a.onSuccess(str);
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGBidCallback
    public void onBiddingTokenFailed(PAGBidError pAGBidError) {
        this.a.onFailure(new AdError(pAGBidError.getCode(), pAGBidError.getMessage(), "com.pangle.ads"));
    }

    @Override // com.unity3d.ads.IUnityAdsTokenListener
    public void onUnityAdsTokenReady(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        SignalCallbacks signalCallbacks = this.a;
        if (zIsEmpty) {
            signalCallbacks.onFailure(new AdError(112, "Unity Ads returned a null or empty bidding token.", UnityMediationAdapter.ADAPTER_ERROR_DOMAIN));
        } else {
            signalCallbacks.onSuccess(str);
        }
    }
}
