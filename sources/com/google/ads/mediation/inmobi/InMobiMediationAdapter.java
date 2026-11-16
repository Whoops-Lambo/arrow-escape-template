package com.google.ads.mediation.inmobi;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
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
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.inmobi.sdk.InMobiSdk;
import defpackage.at;
import defpackage.e51;
import defpackage.el1;
import defpackage.f51;
import defpackage.g51;
import defpackage.h51;
import defpackage.k51;
import defpackage.n41;
import defpackage.n51;
import defpackage.o51;
import defpackage.p41;
import defpackage.p51;
import defpackage.pv1;
import defpackage.q51;
import defpackage.r51;
import defpackage.s51;
import defpackage.t51;
import defpackage.v41;
import defpackage.v7;
import defpackage.wx;
import defpackage.y41;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class InMobiMediationAdapter extends RtbAdapter {

    @VisibleForTesting
    public static final String ERROR_MESSAGE_FOR_INVALID_ACCOUNTID = "Missing or invalid Account ID, configured for this ad source instance in the AdMob or Ad Manager UI";
    public static final String TAG = "InMobiMediationAdapter";
    private n41 inMobiAdFactory;
    private v41 inMobiInitializer;
    private e51 inMobiRtbBannerAd;
    private f51 inMobiRtbInterstitialAd;
    private g51 inMobiRtbNativeAd;
    private h51 inMobiRtbRewardedAd;
    private h51 inMobiRtbRewardedInterstitialAd;
    private k51 inMobiSdkWrapper;
    private o51 inMobiWaterfallBannerAd;
    private q51 inMobiWaterfallInterstitialAd;
    private s51 inMobiWaterfallNativeAd;
    private t51 inMobiWaterfallRewardedAd;
    private t51 inMobiWaterfallRewardedInterstitialAd;
    private el1 mediationUtils;

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        this.inMobiSdkWrapper.getClass();
        String version = InMobiSdk.getVersion();
        String[] strArrSplit = version.split("\\.");
        if (strArrSplit.length >= 3) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        }
        Log.w(TAG, pv1.n("Unexpected SDK version format: ", version, ". Returning 0.0.0 for SDK version."));
        return new VersionInfo(0, 0, 0);
    }

    @NonNull
    @VisibleForTesting
    public VersionInfo getVersionInfo(String str) {
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length < 4) {
            Log.w(TAG, pv1.n("Unexpected adapter version format: ", str, ". Returning 0.0.0 for adapter version."));
            return new VersionInfo(0, 0, 0);
        }
        return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[3]) + (Integer.parseInt(strArrSplit[2]) * 100));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        this.inMobiSdkWrapper.getClass();
        if (InMobiSdk.isSDKInitialized()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString("accountid");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size <= 0) {
            initializationCompleteCallback.onInitializationFailed(at.j(100, ERROR_MESSAGE_FOR_INVALID_ACCOUNTID).toString());
            return;
        }
        String str = (String) hashSet.iterator().next();
        if (size > 1) {
            Log.w(TAG, String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the InMobi SDK", "accountid", hashSet, str));
        }
        this.inMobiInitializer.a(context, str, new y41(initializationCompleteCallback));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        o51 o51Var = new o51(mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiWaterfallBannerAd = o51Var;
        el1 el1Var = this.mediationUtils;
        Context context = mediationBannerAdConfiguration.getContext();
        AdSize adSizeB = p41.b(context, mediationBannerAdConfiguration.getAdSize(), el1Var);
        MediationAdLoadCallback mediationAdLoadCallback2 = o51Var.a;
        if (adSizeB == null) {
            AdError adErrorJ = at.j(102, "The requested banner size: " + mediationBannerAdConfiguration.getAdSize() + " is not supported by InMobi SDK.");
            Log.e(TAG, adErrorJ.toString());
            mediationAdLoadCallback2.onFailure(adErrorJ);
            return;
        }
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        String string = serverParameters.getString("accountid");
        AdError adErrorF = p41.f(p41.d(serverParameters), string);
        if (adErrorF != null) {
            mediationAdLoadCallback2.onFailure(adErrorF);
        } else {
            o51Var.b.a(context, string, new n51(o51Var, context, adSizeB, mediationBannerAdConfiguration));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        q51 q51Var = new q51(mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiWaterfallInterstitialAd = q51Var;
        Context context = mediationInterstitialAdConfiguration.getContext();
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString("accountid");
        AdError adErrorF = p41.f(p41.d(serverParameters), string);
        if (adErrorF != null) {
            q51Var.b.onFailure(adErrorF);
        } else {
            q51Var.c.a(context, string, new p51(q51Var, context, mediationInterstitialAdConfiguration, 0));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        s51 s51Var = new s51(mediationNativeAdConfiguration, mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiWaterfallNativeAd = s51Var;
        MediationNativeAdConfiguration mediationNativeAdConfiguration2 = s51Var.a;
        Context context = mediationNativeAdConfiguration2.getContext();
        Bundle serverParameters = mediationNativeAdConfiguration2.getServerParameters();
        String string = serverParameters.getString("accountid");
        long jD = p41.d(serverParameters);
        AdError adErrorF = p41.f(jD, string);
        if (adErrorF != null) {
            s51Var.b.onFailure(adErrorF);
        } else {
            s51Var.e.a(context, string, new r51(s51Var, context, jD));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        t51 t51Var = new t51(mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiWaterfallRewardedAd = t51Var;
        t51Var.c(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedInterstitialAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        t51 t51Var = new t51(mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiWaterfallRewardedInterstitialAd = t51Var;
        t51Var.c(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        e51 e51Var = new e51(mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiRtbBannerAd = e51Var;
        el1 el1Var = this.mediationUtils;
        Context context = mediationBannerAdConfiguration.getContext();
        AdSize adSizeB = p41.b(context, mediationBannerAdConfiguration.getAdSize(), el1Var);
        if (adSizeB == null) {
            adSizeB = mediationBannerAdConfiguration.getAdSize();
        }
        e51Var.a(context, adSizeB, mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        f51 f51Var = new f51(mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiRtbInterstitialAd = f51Var;
        f51Var.a(mediationInterstitialAdConfiguration.getContext(), mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        g51 g51Var = new g51(mediationNativeAdConfiguration, mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiRtbNativeAd = g51Var;
        MediationNativeAdConfiguration mediationNativeAdConfiguration2 = g51Var.a;
        g51Var.a(mediationNativeAdConfiguration2.getContext(), p41.d(mediationNativeAdConfiguration2.getServerParameters()));
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        h51 h51Var = new h51(mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiRtbRewardedAd = h51Var;
        h51Var.a(mediationRewardedAdConfiguration.getContext(), mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedInterstitialAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        h51 h51Var = new h51(mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiRtbRewardedInterstitialAd = h51Var;
        h51Var.a(mediationRewardedAdConfiguration.getContext(), mediationRewardedAdConfiguration);
    }

    public InMobiMediationAdapter() {
        if (v41.d == null) {
            v41.d = new v41();
        }
        this.inMobiInitializer = v41.d;
        this.inMobiAdFactory = new n41();
        this.inMobiSdkWrapper = new k51();
        this.mediationUtils = new el1();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NonNull RtbSignalData rtbSignalData, @NonNull SignalCallbacks signalCallbacks) {
        v7 v7VarB = wx.b(rtbSignalData.getContext(), "c_google", rtbSignalData.getNetworkExtras());
        k51 k51Var = this.inMobiSdkWrapper;
        HashMap map = (HashMap) v7VarB.b;
        k51Var.getClass();
        signalCallbacks.onSuccess(InMobiSdk.getToken(map, ""));
    }

    public InMobiMediationAdapter(v41 v41Var, n41 n41Var, k51 k51Var, el1 el1Var) {
        this.inMobiInitializer = v41Var;
        this.inMobiAdFactory = n41Var;
        this.inMobiSdkWrapper = k51Var;
        this.mediationUtils = el1Var;
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        return getVersionInfo("11.4.1.1");
    }
}
