package com.google.ads.mediation.ironsource;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.moloco.MolocoMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AgeRestrictedTreatment;
import com.google.android.gms.ads.MediationUtils;
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
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.metadata.a;
import com.singular.sdk.internal.UserDetailsUtils;
import com.unity3d.ironsourceads.InitRequest;
import com.unity3d.ironsourceads.IronSourceAds;
import com.unity3d.ironsourceads.banner.BannerAdLoader;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoader;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoader;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import com.unity3d.mediation.LevelPlay;
import defpackage.d81;
import defpackage.f81;
import defpackage.h81;
import defpackage.j81;
import defpackage.k81;
import defpackage.l81;
import defpackage.n30;
import defpackage.qb5;
import defpackage.rd1;
import defpackage.rl3;
import defpackage.x41;
import defpackage.xw0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class IronSourceMediationAdapter extends RtbAdapter {
    public static final String ADAPTER_ERROR_DOMAIN = "com.google.ads.mediation.ironsource";
    public static final int ERROR_AD_ALREADY_LOADED = 103;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 105;
    public static final int ERROR_CALL_SHOW_BEFORE_LOADED_SUCCESS = 107;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_REQUIRES_ACTIVITY_CONTEXT = 102;
    public static final int ERROR_SDK_NOT_INITIALIZED = 106;
    public static final String IRONSOURCE_SDK_ERROR_DOMAIN = "com.ironsource.mediationsdk";
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public final xw0 a = new xw0(13);

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        String[] strArrSplit = "9.6.1.0".split("\\.");
        if (strArrSplit.length < 4) {
            Log.w("IronSourceMediationAdapter", "Unexpected adapter version format: 9.6.1.0. Returning 0.0.0 for adapter version.");
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

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        if (b.get()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString("appKey");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size <= 0) {
            initializationCompleteCallback.onInitializationFailed(new AdError(101, "Missing or invalid app key.", ADAPTER_ERROR_DOMAIN).getMessage());
            return;
        }
        String str = (String) hashSet.iterator().next();
        if (TextUtils.isEmpty(str)) {
            initializationCompleteCallback.onInitializationFailed(new AdError(101, "Missing or invalid app key.", ADAPTER_ERROR_DOMAIN).getMessage());
            return;
        }
        if (size > 1) {
            Log.w("IronSourceMediationAdapter", String.format("Multiple '%s' entries found: %s. Using app key '%s' to initialize the IronSource SDK.", "appKey", hashSet, str));
        }
        IronSource.setMediationType(MolocoMediationAdapter.MEDIATION_PLATFORM_NAME + "9.6.1.0".replace(UserDetailsUtils.UserDetailsLiterals.DOT, "") + "SDK" + MobileAds.getVersion().toString().replace(UserDetailsUtils.UserDetailsLiterals.DOT, "") + "iAds511");
        StringBuilder sb = new StringBuilder("Initializing IronSource SDK with app key: ");
        sb.append(str);
        Log.d("IronSourceMediationAdapter", sb.toString());
        RequestConfiguration requestConfiguration = MobileAds.getRequestConfiguration();
        boolean z = qb5.p() && requestConfiguration.getAgeRestrictedTreatment() == AgeRestrictedTreatment.CHILD;
        if (requestConfiguration.getTagForChildDirectedTreatment() == 1 || requestConfiguration.getTagForUnderAgeOfConsent() == 1 || z) {
            LevelPlay.setMetaData(a.b, "true");
        } else if (requestConfiguration.getTagForChildDirectedTreatment() == 0 || requestConfiguration.getTagForUnderAgeOfConsent() == 0) {
            LevelPlay.setMetaData(a.b, "false");
        }
        IronSourceAds.init(context, new InitRequest.Builder(str).withLegacyAdFormats(new ArrayList(Arrays.asList(IronSourceAds.AdFormat.BANNER, IronSourceAds.AdFormat.INTERSTITIAL, IronSourceAds.AdFormat.REWARDED))).build(), new x41(initializationCompleteCallback, 2));
        IronSource.setISDemandOnlyInterstitialListener(f81.e);
        IronSource.setISDemandOnlyRewardedVideoListener(h81.e);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        ISBannerSize iSBannerSize;
        if (!b.get()) {
            AdError adError = new AdError(106, "Failed to load IronSource banner ad since IronSource SDK is not initialized.", IRONSOURCE_SDK_ERROR_DOMAIN);
            Log.w("IronSourceMediationAdapter", adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        d81 d81Var = new d81(mediationAdLoadCallback);
        String string = mediationBannerAdConfiguration.getServerParameters().getString("instanceId", "0");
        Context context = mediationBannerAdConfiguration.getContext();
        AdError adErrorR = rd1.r(context, string);
        if (adErrorR != null) {
            Log.w("IronSourceMediationAdapter", adErrorR.toString());
            if (mediationAdLoadCallback != null) {
                mediationAdLoadCallback.onFailure(adErrorR);
                return;
            }
            return;
        }
        ConcurrentHashMap concurrentHashMap = d81.f;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(string);
        if (weakReference != null && weakReference.get() != null) {
            AdError adError2 = new AdError(103, n30.y("An IronSource banner is already loaded for instance ID: ", string), ADAPTER_ERROR_DOMAIN);
            Log.w("IronSourceMediationAdapter", adError2.toString());
            if (mediationAdLoadCallback != null) {
                mediationAdLoadCallback.onFailure(adError2);
                return;
            }
            return;
        }
        AdSize adSize = mediationBannerAdConfiguration.getAdSize();
        ArrayList arrayList = new ArrayList();
        AdSize adSize2 = AdSize.BANNER;
        arrayList.add(adSize2);
        AdSize adSize3 = AdSize.MEDIUM_RECTANGLE;
        arrayList.add(adSize3);
        AdSize adSize4 = AdSize.LARGE_BANNER;
        arrayList.add(adSize4);
        this.a.getClass();
        context.getClass();
        adSize.getClass();
        AdSize adSizeFindClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (adSizeFindClosestSize == null) {
            iSBannerSize = null;
        } else if (adSize2.equals(adSizeFindClosestSize)) {
            iSBannerSize = ISBannerSize.BANNER;
        } else if (adSize3.equals(adSizeFindClosestSize)) {
            iSBannerSize = ISBannerSize.RECTANGLE;
        } else {
            iSBannerSize = adSize4.equals(adSizeFindClosestSize) ? ISBannerSize.LARGE : new ISBannerSize(adSizeFindClosestSize.getWidth(), adSizeFindClosestSize.getHeight());
        }
        d81Var.e = iSBannerSize;
        if (iSBannerSize == null) {
            AdError adError3 = new AdError(105, "There is no matching IronSource banner ad size for Google ad size: " + adSize, ADAPTER_ERROR_DOMAIN);
            Log.w("IronSourceMediationAdapter", adError3.toString());
            if (mediationAdLoadCallback != null) {
                mediationAdLoadCallback.onFailure(adError3);
                return;
            }
            return;
        }
        String string2 = mediationBannerAdConfiguration.getServerParameters().getString("instanceId", "0");
        Context context2 = mediationBannerAdConfiguration.getContext();
        Activity activity = (Activity) context2;
        concurrentHashMap.put(string2, new WeakReference(d81Var));
        d81Var.c = new FrameLayout(context2);
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayoutCreateBannerForDemandOnly = IronSource.createBannerForDemandOnly(activity, d81Var.e);
        d81Var.d = iSDemandOnlyBannerLayoutCreateBannerForDemandOnly;
        iSDemandOnlyBannerLayoutCreateBannerForDemandOnly.setBannerDemandOnlyListener(d81.g);
        Log.d("IronSourceMediationAdapter", "Loading IronSource banner ad with instance ID: " + string2);
        IronSource.loadISDemandOnlyBanner(activity, d81Var.d, string2);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        if (!b.get()) {
            AdError adError = new AdError(106, "Failed to load IronSource interstitial ad since IronSource SDK is not initialized.", IRONSOURCE_SDK_ERROR_DOMAIN);
            Log.w("IronSourceMediationAdapter", adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        f81 f81Var = new f81(mediationInterstitialAdConfiguration, mediationAdLoadCallback);
        Context context = mediationInterstitialAdConfiguration.getContext();
        String str = f81Var.c;
        AdError adErrorR = rd1.r(context, str);
        MediationAdLoadCallback mediationAdLoadCallback2 = f81Var.b;
        if (adErrorR != null) {
            Log.e("IronSourceMediationAdapter", adErrorR.toString());
            if (mediationAdLoadCallback2 != null) {
                mediationAdLoadCallback2.onFailure(adErrorR);
                return;
            }
            return;
        }
        ConcurrentHashMap concurrentHashMap = f81.d;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(str);
        if (weakReference == null || weakReference.get() == null) {
            concurrentHashMap.put(str, new WeakReference(f81Var));
            Log.d("IronSourceMediationAdapter", "Loading IronSource interstitial ad with instance ID: " + str);
            IronSource.loadISDemandOnlyInterstitial((Activity) mediationInterstitialAdConfiguration.getContext(), str);
            return;
        }
        AdError adError2 = new AdError(103, n30.y("An IronSource interstitial ad is already loading for instance ID: ", str), ADAPTER_ERROR_DOMAIN);
        Log.e("IronSourceMediationAdapter", adError2.toString());
        if (mediationAdLoadCallback2 != null) {
            mediationAdLoadCallback2.onFailure(adError2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        if (!b.get()) {
            AdError adError = new AdError(106, "Failed to load IronSource rewarded ad since IronSource SDK is not initialized.", ADAPTER_ERROR_DOMAIN);
            Log.w("IronSourceMediationAdapter", adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        h81 h81Var = new h81(mediationRewardedAdConfiguration, mediationAdLoadCallback);
        Context context = mediationRewardedAdConfiguration.getContext();
        String str = h81Var.c;
        AdError adErrorR = rd1.r(context, str);
        MediationAdLoadCallback mediationAdLoadCallback2 = h81Var.b;
        if (adErrorR != null) {
            Log.w("IronSourceMediationAdapter", adErrorR.toString());
            mediationAdLoadCallback2.onFailure(adErrorR);
            return;
        }
        ConcurrentHashMap concurrentHashMap = h81.d;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(str);
        if (weakReference != null && weakReference.get() != null) {
            AdError adError2 = new AdError(103, n30.y("An IronSource Rewarded ad is already loading for instance ID: ", str), ADAPTER_ERROR_DOMAIN);
            Log.w("IronSourceMediationAdapter", adError2.toString());
            mediationAdLoadCallback2.onFailure(adError2);
        } else {
            concurrentHashMap.put(str, new WeakReference(h81Var));
            Log.d("IronSourceMediationAdapter", "Loading IronSource rewarded ad with instance ID: " + str);
            IronSource.loadISDemandOnlyRewardedVideo((Activity) mediationRewardedAdConfiguration.getContext(), str);
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedInterstitialAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        Log.d("IronSourceMediationAdapter", "IronSource adapter was asked to load a rewarded interstitial ad. Using the rewarded ad request flow to load the ad to attempt to load a rewarded interstitial ad from IronSource.");
        loadRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        com.unity3d.ironsourceads.AdSize adSizeLeaderboard;
        j81 j81Var = new j81(mediationAdLoadCallback);
        String string = mediationBannerAdConfiguration.getServerParameters().getString("instanceId", "");
        if (TextUtils.isEmpty(string)) {
            mediationAdLoadCallback.onFailure(rd1.d(101, "Missing or invalid instance ID."));
            return;
        }
        Bundle bundleG = rl3.g("google_watermark", mediationBannerAdConfiguration.getWatermark());
        Context context = mediationBannerAdConfiguration.getContext();
        AdSize adSize = mediationBannerAdConfiguration.getAdSize();
        String bidResponse = mediationBannerAdConfiguration.getBidResponse();
        AdSize adSize2 = AdSize.BANNER;
        AdSize adSize3 = AdSize.MEDIUM_RECTANGLE;
        AdSize adSize4 = AdSize.LARGE_BANNER;
        AdSize adSize5 = AdSize.LEADERBOARD;
        ArrayList arrayList = new ArrayList(Arrays.asList(adSize2, adSize3, adSize4, adSize5));
        this.a.getClass();
        context.getClass();
        adSize.getClass();
        AdSize adSizeFindClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (adSizeFindClosestSize == null || adSize2.equals(adSizeFindClosestSize)) {
            adSizeLeaderboard = com.unity3d.ironsourceads.AdSize.banner();
        } else if (adSize3.equals(adSizeFindClosestSize)) {
            adSizeLeaderboard = com.unity3d.ironsourceads.AdSize.mediumRectangle();
        } else if (adSize4.equals(adSizeFindClosestSize)) {
            adSizeLeaderboard = com.unity3d.ironsourceads.AdSize.large();
        } else {
            adSizeLeaderboard = adSize5.equals(adSizeFindClosestSize) ? com.unity3d.ironsourceads.AdSize.leaderboard() : com.unity3d.ironsourceads.AdSize.banner();
        }
        BannerAdRequest bannerAdRequestBuild = new BannerAdRequest.Builder(context, string, bidResponse, adSizeLeaderboard).withExtraParams(bundleG).build();
        j81Var.c = new FrameLayout(context);
        BannerAdLoader.loadAd(bannerAdRequestBuild, j81Var);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        k81 k81Var = new k81(mediationAdLoadCallback);
        String string = mediationInterstitialAdConfiguration.getServerParameters().getString("instanceId", "");
        if (TextUtils.isEmpty(string)) {
            mediationAdLoadCallback.onFailure(rd1.d(101, "Missing or invalid instance ID."));
        } else {
            InterstitialAdLoader.loadAd(new InterstitialAdRequest.Builder(string, mediationInterstitialAdConfiguration.getBidResponse()).withExtraParams(rl3.g("google_watermark", mediationInterstitialAdConfiguration.getWatermark())).build(), k81Var);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        l81 l81Var = new l81(mediationAdLoadCallback);
        String string = mediationRewardedAdConfiguration.getServerParameters().getString("instanceId", "");
        if (TextUtils.isEmpty(string)) {
            mediationAdLoadCallback.onFailure(rd1.d(101, "Missing or invalid instance ID."));
        } else {
            RewardedAdLoader.loadAd(new RewardedAdRequest.Builder(string, mediationRewardedAdConfiguration.getBidResponse()).withExtraParams(rl3.g("google_watermark", mediationRewardedAdConfiguration.getWatermark())).build(), l81Var);
        }
    }

    @VisibleForTesting
    public void setIsInitialized(boolean z) {
        b.set(z);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NonNull RtbSignalData rtbSignalData, @NonNull SignalCallbacks signalCallbacks) {
        signalCallbacks.onSuccess(IronSource.getISDemandOnlyBiddingData(rtbSignalData.getContext()));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        String sdkVersion = IronSourceAds.getSdkVersion();
        String[] strArrSplit = sdkVersion.split("\\.");
        if (strArrSplit.length >= 3) {
            int i = Integer.parseInt(strArrSplit[0]);
            int i2 = Integer.parseInt(strArrSplit[1]);
            int i3 = Integer.parseInt(strArrSplit[2]);
            if (strArrSplit.length >= 4) {
                i3 = (i3 * 100) + Integer.parseInt(strArrSplit[3]);
            }
            return new VersionInfo(i, i2, i3);
        }
        Log.w("IronSourceMediationAdapter", "Unexpected SDK version format: " + sdkVersion + ". Returning 0.0.0 for SDK version.");
        return new VersionInfo(0, 0, 0);
    }
}
