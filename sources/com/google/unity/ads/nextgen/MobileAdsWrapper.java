package com.google.unity.ads.nextgen;

import android.app.Activity;
import com.google.android.libraries.ads.mobile.sdk.MobileAds;
import com.google.android.libraries.ads.mobile.sdk.common.RequestConfiguration;
import com.google.android.libraries.ads.mobile.sdk.initialization.InitializationConfig;
import com.google.android.libraries.ads.mobile.sdk.initialization.OnAdapterInitializationCompleteListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
class MobileAdsWrapper {
    public RequestConfiguration getRequestConfiguration() {
        return MobileAds.getRequestConfiguration();
    }

    public String getVersionString() {
        return MobileAds.getVersion().toString();
    }

    public void initialize(Activity activity, InitializationConfig initializationConfig, OnAdapterInitializationCompleteListener onAdapterInitializationCompleteListener) {
        MobileAds.initialize(activity, initializationConfig, onAdapterInitializationCompleteListener);
    }

    public boolean putPublisherFirstPartyIdEnabled(boolean z) {
        return MobileAds.putPublisherFirstPartyIdEnabled(z);
    }

    public void setRequestConfiguration(RequestConfiguration requestConfiguration) {
        MobileAds.setRequestConfiguration(requestConfiguration);
    }

    public void setUserControlledAppVolume(float f) {
        MobileAds.setUserControlledAppVolume(f);
    }

    public void setUserMutedApp(boolean z) {
        MobileAds.setUserMutedApp(z);
    }
}
