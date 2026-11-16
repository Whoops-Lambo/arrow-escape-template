package com.applovin.mediation.adapter.listeners;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.applovin.mediation.adapter.MaxAdapterError;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public interface MaxInterstitialAdapterListener extends MaxAdapterListener {
    void onInterstitialAdClicked();

    void onInterstitialAdClicked(@Nullable Bundle bundle);

    void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError);

    void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, @Nullable Bundle bundle);

    void onInterstitialAdDisplayed();

    void onInterstitialAdDisplayed(@Nullable Bundle bundle);

    void onInterstitialAdHidden();

    void onInterstitialAdHidden(@Nullable Bundle bundle);

    void onInterstitialAdLoadFailed(MaxAdapterError maxAdapterError);

    void onInterstitialAdLoaded();

    void onInterstitialAdLoaded(@Nullable Bundle bundle);
}
