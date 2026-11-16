package com.google.ads.mediation.fyber;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.applovin.mediation.adapters.inneractive.BuildConfig;
import com.fyber.inneractive.sdk.external.BidTokenProvider;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.NativeAdUnitController;
import com.fyber.inneractive.sdk.external.NativeAdVideoContentController;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AgeRestrictedTreatment;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
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
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import defpackage.fs1;
import defpackage.i40;
import defpackage.j40;
import defpackage.k40;
import defpackage.l40;
import defpackage.m40;
import defpackage.n40;
import defpackage.o40;
import defpackage.p40;
import defpackage.q40;
import defpackage.qb5;
import defpackage.r40;
import defpackage.s71;
import defpackage.ss0;
import defpackage.ts0;
import defpackage.us0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class FyberMediationAdapter extends RtbAdapter {
    public static final String KEY_MUTE_VIDEO = "muteVideo";
    public static final InneractiveMediationName c = InneractiveMediationName.ADMOB;
    public us0 a;
    public l40 b;

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        String[] strArrSplit = BuildConfig.VERSION_NAME.split("\\.");
        if (strArrSplit.length < 4) {
            Log.w("FyberMediationAdapter", "Unexpected adapter version format: 8.4.7.0. Returning 0.0.0 for adapter version.");
            return new VersionInfo(0, 0, 0);
        }
        return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[3]) + (Integer.parseInt(strArrSplit[2]) * 100));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        p40 p40Var = new p40(mediationAdLoadCallback);
        String str = p40.f;
        mediationBannerAdConfiguration.getClass();
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        serverParameters.getClass();
        String string = serverParameters.getString("applicationId");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "App ID is null or empty.", "com.google.ads.mediation.dtexchange");
            Log.w(str, adError.toString());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("spotId");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Cannot render banner ad. Please define a valid spot id on the AdMob UI.", "com.google.ads.mediation.dtexchange");
            Log.w(str, adError2.toString());
            mediationAdLoadCallback.onFailure(adError2);
        } else {
            InneractiveAdManager.setMediationName(c);
            InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
            InneractiveAdManager.initialize(mediationBannerAdConfiguration.getContext(), string, new o40(p40Var, mediationBannerAdConfiguration, string2));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        r40 r40Var = new r40();
        mediationInterstitialAdConfiguration.getClass();
        mediationAdLoadCallback.getClass();
        r40Var.a = mediationAdLoadCallback;
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        serverParameters.getClass();
        String string = serverParameters.getString("applicationId");
        AdError adError = new AdError(101, "App ID is null or empty.", "com.google.ads.mediation.dtexchange");
        if (TextUtils.isEmpty(string)) {
            Log.w("FyberMediationAdapter", adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("spotId");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Cannot render interstitial ad. Please define a valid spot id on the AdMob UI.", "com.google.ads.mediation.dtexchange");
            Log.w("FyberMediationAdapter", adError2.getMessage());
            mediationAdLoadCallback.onFailure(adError2);
        } else {
            InneractiveAdManager.setMediationName(c);
            InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
            InneractiveAdManager.initialize(mediationInterstitialAdConfiguration.getContext(), string, new q40(mediationAdLoadCallback, r40Var, mediationInterstitialAdConfiguration, string2));
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        m40 m40Var = new m40(mediationAdLoadCallback);
        mediationBannerAdConfiguration.getClass();
        InneractiveAdManager.setMediationName(c);
        InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
        String bidResponse = mediationBannerAdConfiguration.getBidResponse();
        bidResponse.getClass();
        InneractiveAdSpot inneractiveAdSpotCreateSpot = InneractiveAdSpotManager.get().createSpot();
        inneractiveAdSpotCreateSpot.getClass();
        m40Var.b = inneractiveAdSpotCreateSpot;
        InneractiveAdViewUnitController inneractiveAdViewUnitController = new InneractiveAdViewUnitController();
        InneractiveAdSpot inneractiveAdSpot = m40Var.b;
        if (inneractiveAdSpot == null) {
            s71.D("adSpot");
            throw null;
        }
        inneractiveAdSpot.addUnitController(inneractiveAdViewUnitController);
        AdSize adSize = mediationBannerAdConfiguration.getAdSize();
        adSize.getClass();
        Context context = mediationBannerAdConfiguration.getContext();
        context.getClass();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(adSize.getWidthInPixels(context), adSize.getHeightInPixels(context));
        RelativeLayout relativeLayout = new RelativeLayout(context);
        m40Var.c = relativeLayout;
        relativeLayout.setLayoutParams(layoutParams);
        InneractiveAdSpot inneractiveAdSpot2 = m40Var.b;
        if (inneractiveAdSpot2 == null) {
            s71.D("adSpot");
            throw null;
        }
        inneractiveAdSpot2.setRequestListener(m40Var);
        inneractiveAdViewUnitController.setEventsListener(m40Var);
        fs1.F(mediationBannerAdConfiguration.getMediationExtras());
        String watermark = mediationBannerAdConfiguration.getWatermark();
        watermark.getClass();
        InneractiveAdSpot inneractiveAdSpot3 = m40Var.b;
        if (inneractiveAdSpot3 != null) {
            inneractiveAdSpot3.loadAd(bidResponse, watermark);
        } else {
            s71.D("adSpot");
            throw null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        n40 n40Var = new n40(mediationAdLoadCallback);
        mediationInterstitialAdConfiguration.getClass();
        InneractiveAdManager.setMediationName(c);
        InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
        String bidResponse = mediationInterstitialAdConfiguration.getBidResponse();
        bidResponse.getClass();
        InneractiveAdSpot inneractiveAdSpotCreateSpot = InneractiveAdSpotManager.get().createSpot();
        inneractiveAdSpotCreateSpot.getClass();
        n40Var.b = inneractiveAdSpotCreateSpot;
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = new InneractiveFullscreenUnitController();
        InneractiveAdSpot inneractiveAdSpot = n40Var.b;
        if (inneractiveAdSpot == null) {
            s71.D("adSpot");
            throw null;
        }
        inneractiveAdSpot.addUnitController(inneractiveFullscreenUnitController);
        InneractiveAdSpot inneractiveAdSpot2 = n40Var.b;
        if (inneractiveAdSpot2 == null) {
            s71.D("adSpot");
            throw null;
        }
        inneractiveAdSpot2.setRequestListener(n40Var);
        inneractiveFullscreenUnitController.setEventsListener(n40Var);
        fs1.F(mediationInterstitialAdConfiguration.getMediationExtras());
        String watermark = mediationInterstitialAdConfiguration.getWatermark();
        watermark.getClass();
        InneractiveAdSpot inneractiveAdSpot3 = n40Var.b;
        if (inneractiveAdSpot3 != null) {
            inneractiveAdSpot3.loadAd(bidResponse, watermark);
        } else {
            s71.D("adSpot");
            throw null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAdMapper(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<NativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        l40 l40Var = this.b;
        if (l40Var != null) {
            l40Var.destroy();
            this.b = null;
        }
        l40 l40Var2 = new l40(mediationAdLoadCallback);
        this.b = l40Var2;
        mediationNativeAdConfiguration.getClass();
        InneractiveAdManager.setMediationName(c);
        InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
        String bidResponse = mediationNativeAdConfiguration.getBidResponse();
        bidResponse.getClass();
        String watermark = mediationNativeAdConfiguration.getWatermark();
        watermark.getClass();
        InneractiveAdSpot inneractiveAdSpotCreateSpot = InneractiveAdSpotManager.get().createSpot();
        NativeAdUnitController nativeAdUnitController = new NativeAdUnitController();
        NativeAdVideoContentController nativeAdVideoContentController = new NativeAdVideoContentController();
        nativeAdVideoContentController.setEventsListener(new i40(l40Var2));
        nativeAdUnitController.addContentController(nativeAdVideoContentController);
        nativeAdUnitController.setEventsListener(new j40(l40Var2));
        inneractiveAdSpotCreateSpot.addUnitController(nativeAdUnitController);
        inneractiveAdSpotCreateSpot.setRequestListener(new k40(l40Var2, mediationNativeAdConfiguration));
        fs1.F(mediationNativeAdConfiguration.getMediationExtras());
        inneractiveAdSpotCreateSpot.loadAd(bidResponse, watermark);
        l40Var2.c = inneractiveAdSpotCreateSpot;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.a = new us0(mediationAdLoadCallback);
        InneractiveAdManager.setMediationName(c);
        InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
        us0 us0Var = this.a;
        us0Var.getClass();
        String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
        us0Var.a(mediationRewardedAdConfiguration);
        us0Var.c.loadAd(bidResponse, mediationRewardedAdConfiguration.getWatermark());
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NonNull RtbSignalData rtbSignalData, @NonNull SignalCallbacks signalCallbacks) {
        String bidderToken = BidTokenProvider.getBidderToken();
        if (TextUtils.isEmpty(bidderToken)) {
            bidderToken = "";
        }
        signalCallbacks.onSuccess(bidderToken);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        String version = InneractiveAdManager.getVersion();
        String[] strArrSplit = version.split("\\.");
        if (strArrSplit.length >= 3) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        }
        Log.w("FyberMediationAdapter", "Unexpected SDK version format: " + version + ". Returning 0.0.0 for SDK version.");
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        boolean z;
        if (InneractiveAdManager.wasInitialized()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString("applicationId");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        if (hashSet.isEmpty()) {
            AdError adError = new AdError(101, "DT Exchange SDK requires an appId to be configured on the AdMob UI.", "com.google.ads.mediation.dtexchange");
            Log.w("FyberMediationAdapter", adError.getMessage());
            initializationCompleteCallback.onInitializationFailed(adError.getMessage());
            return;
        }
        String str = (String) hashSet.iterator().next();
        if (hashSet.size() > 1) {
            Log.w("FyberMediationAdapter", String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the DT Exchange SDK.", "applicationId", hashSet, str));
        }
        RequestConfiguration requestConfiguration = MobileAds.getRequestConfiguration();
        if (qb5.p() && requestConfiguration.getAgeRestrictedTreatment() == AgeRestrictedTreatment.CHILD) {
            z = true;
        } else {
            z = false;
        }
        if (requestConfiguration.getTagForChildDirectedTreatment() == 1 || requestConfiguration.getTagForUnderAgeOfConsent() == 1 || z) {
            InneractiveAdManager.currentAudienceAppliesToCoppa();
        }
        InneractiveAdManager.initialize(context, str, new ts0(initializationCompleteCallback));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        String string = mediationRewardedAdConfiguration.getServerParameters().getString("applicationId");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "App ID is null or empty.", "com.google.ads.mediation.dtexchange");
            Log.w("FyberMediationAdapter", adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
        } else {
            InneractiveAdManager.setMediationName(c);
            InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
            InneractiveAdManager.initialize(mediationRewardedAdConfiguration.getContext(), string, new ss0(this, mediationAdLoadCallback, mediationRewardedAdConfiguration));
        }
    }
}
