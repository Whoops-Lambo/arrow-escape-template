package com.google.ads.mediation.pangle;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.PAGConstant;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import defpackage.ft1;
import defpackage.gt1;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kt1;
import defpackage.l7;
import defpackage.mt1;
import defpackage.ot1;
import defpackage.pt1;
import defpackage.pv1;
import defpackage.qt1;
import defpackage.tt1;
import defpackage.vt1;
import defpackage.wt1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class PangleMediationAdapter extends RtbAdapter {
    public static final String TAG = "PangleMediationAdapter";
    public final mt1 a;
    public final wt1 b;
    public final kt1 c;

    public static void setPAConsent(@PAGConstant.PAGPAConsentType int i) {
        if (i == 1 || i == 0) {
            PAGConfig.setPAConsent(i);
        } else {
            Log.w(TAG, "Invalid PA value. Pangle SDK only accepts 0 or 1.");
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        this.b.getClass();
        String sDKVersion = PAGSdk.getSDKVersion();
        String[] strArrSplit = sDKVersion.split("\\.");
        if (strArrSplit.length < 3) {
            Log.w(TAG, pv1.n("Unexpected SDK version format: ", sDKVersion, ". Returning 0.0.0 for SDK version."));
            return new VersionInfo(0, 0, 0);
        }
        int i = Integer.parseInt(strArrSplit[0]);
        int i2 = Integer.parseInt(strArrSplit[1]);
        int i3 = Integer.parseInt(strArrSplit[2]);
        if (strArrSplit.length >= 4) {
            i3 = (i3 * 100) + Integer.parseInt(strArrSplit[3]);
        }
        return new VersionInfo(i, i2, i3);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        String[] strArrSplit = "8.2.0.4.0".split("\\.");
        if (strArrSplit.length < 4) {
            Log.w(TAG, "Unexpected adapter version format: 8.2.0.4.0. Returning 0.0.0 for adapter version.");
            return new VersionInfo(0, 0, 0);
        }
        int i = Integer.parseInt(strArrSplit[0]);
        int i2 = Integer.parseInt(strArrSplit[1]);
        int i3 = Integer.parseInt(strArrSplit[3]) + (Integer.parseInt(strArrSplit[2]) * 100);
        if (strArrSplit.length >= 5) {
            i3 = (i3 * 100) + Integer.parseInt(strArrSplit[4]);
        }
        return new VersionInfo(i, i2, i3);
    }

    public PangleMediationAdapter() {
        if (mt1.f == null) {
            mt1.f = new mt1();
        }
        this.a = mt1.f;
        this.b = new wt1();
        this.c = new kt1();
    }

    public static int getPAConsent() {
        return PAGConfig.getPAConsent();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NonNull RtbSignalData rtbSignalData, @NonNull SignalCallbacks signalCallbacks) {
        if (l7.o()) {
            signalCallbacks.onFailure(l7.i());
            return;
        }
        Bundle networkExtras = rtbSignalData.getNetworkExtras();
        wt1 wt1Var = this.b;
        if (networkExtras != null && networkExtras.containsKey("user_data")) {
            String string = networkExtras.getString("user_data", "");
            wt1Var.getClass();
            PAGConfig.setUserData(string);
        }
        PAGBiddingRequest pAGBiddingRequest = new PAGBiddingRequest();
        pAGBiddingRequest.setAdxId("207");
        Context context = rtbSignalData.getContext();
        pt1 pt1Var = new pt1(signalCallbacks);
        wt1Var.getClass();
        PAGSdk.getBiddingToken(context, pAGBiddingRequest, pt1Var);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        if (l7.o()) {
            initializationCompleteCallback.onInitializationFailed("MobileAds.getRequestConfiguration() indicates the user is a child. Pangle SDK V71 or higher does not support child users.");
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString("appid");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size <= 0) {
            AdError adErrorH = l7.h(101, "Missing or invalid App ID.");
            Log.w(TAG, adErrorH.toString());
            initializationCompleteCallback.onInitializationFailed(adErrorH.toString());
        } else {
            String str = (String) hashSet.iterator().next();
            if (size > 1) {
                Log.w(TAG, String.format("Found multiple app IDs in %s. Using %s to initialize Pangle SDK.", hashSet, str));
            }
            this.a.a(context, str, new qt1(initializationCompleteCallback));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        if (l7.o()) {
            mediationAdLoadCallback.onFailure(l7.i());
            return;
        }
        kt1 kt1Var = this.c;
        kt1Var.getClass();
        mt1 mt1Var = this.a;
        gt1 gt1Var = new gt1(mediationAdLoadCallback, mt1Var, this.b, kt1Var);
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError adErrorH = l7.h(101, "Failed to load app open ad from Pangle. Missing or invalid Placement ID.");
            Log.e(TAG, adErrorH.toString());
            mediationAdLoadCallback.onFailure(adErrorH);
        } else {
            mt1Var.a(mediationAppOpenAdConfiguration.getContext(), serverParameters.getString("appid"), new ft1(gt1Var, mediationAppOpenAdConfiguration.getBidResponse(), mediationAppOpenAdConfiguration, string, 0));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        if (l7.o()) {
            mediationAdLoadCallback.onFailure(l7.i());
            return;
        }
        kt1 kt1Var = this.c;
        kt1Var.getClass();
        mt1 mt1Var = this.a;
        jt1 jt1Var = new jt1(mediationAdLoadCallback, mt1Var, this.b, kt1Var);
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError adErrorH = l7.h(101, "Failed to load banner ad from Pangle. Missing or invalid Placement ID.");
            Log.e(TAG, adErrorH.toString());
            mediationAdLoadCallback.onFailure(adErrorH);
        } else {
            String bidResponse = mediationBannerAdConfiguration.getBidResponse();
            Context context = mediationBannerAdConfiguration.getContext();
            mt1Var.a(context, serverParameters.getString("appid"), new it1(jt1Var, mediationBannerAdConfiguration, context, bidResponse, string));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        if (l7.o()) {
            mediationAdLoadCallback.onFailure(l7.i());
            return;
        }
        kt1 kt1Var = this.c;
        kt1Var.getClass();
        mt1 mt1Var = this.a;
        ot1 ot1Var = new ot1(mediationAdLoadCallback, mt1Var, this.b, kt1Var);
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError adErrorH = l7.h(101, "Failed to load interstitial ad from Pangle. Missing or invalid Placement ID.");
            Log.e(TAG, adErrorH.toString());
            mediationAdLoadCallback.onFailure(adErrorH);
        } else {
            mt1Var.a(mediationInterstitialAdConfiguration.getContext(), serverParameters.getString("appid"), new ft1(ot1Var, mediationInterstitialAdConfiguration.getBidResponse(), mediationInterstitialAdConfiguration, string, 1));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        if (l7.o()) {
            mediationAdLoadCallback.onFailure(l7.i());
            return;
        }
        kt1 kt1Var = this.c;
        kt1Var.getClass();
        tt1 tt1Var = new tt1(mediationAdLoadCallback, this.a, this.b, kt1Var);
        Bundle serverParameters = mediationNativeAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError adErrorH = l7.h(101, "Failed to load native ad from Pangle. Missing or invalid Placement ID.");
            Log.e(TAG, adErrorH.toString());
            tt1Var.a.onFailure(adErrorH);
        } else {
            String bidResponse = mediationNativeAdConfiguration.getBidResponse();
            tt1Var.b.a(mediationNativeAdConfiguration.getContext(), serverParameters.getString("appid"), new ft1(tt1Var, bidResponse, mediationNativeAdConfiguration, string, 2));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        if (l7.o()) {
            mediationAdLoadCallback.onFailure(l7.i());
            return;
        }
        kt1 kt1Var = this.c;
        kt1Var.getClass();
        mt1 mt1Var = this.a;
        vt1 vt1Var = new vt1(mediationAdLoadCallback, mt1Var, this.b, kt1Var);
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError adErrorH = l7.h(101, "Failed to load rewarded ad from Pangle. Missing or invalid Placement ID.");
            Log.e(TAG, adErrorH.toString());
            mediationAdLoadCallback.onFailure(adErrorH);
        } else {
            mt1Var.a(mediationRewardedAdConfiguration.getContext(), serverParameters.getString("appid"), new ft1(vt1Var, mediationRewardedAdConfiguration.getBidResponse(), mediationRewardedAdConfiguration, string, 3));
        }
    }
}
