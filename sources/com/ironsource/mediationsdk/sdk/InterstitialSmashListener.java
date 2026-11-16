package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterstitialSmashListener {
    void onInterstitialAdClicked();

    void onInterstitialAdClosed();

    void onInterstitialAdLoadFailed(IronSourceError ironSourceError);

    void onInterstitialAdOpened();

    void onInterstitialAdReady();

    void onInterstitialAdShowFailed(IronSourceError ironSourceError);

    void onInterstitialAdShowSucceeded();

    void onInterstitialAdVisible();

    void onInterstitialInitFailed(IronSourceError ironSourceError);

    void onInterstitialInitSuccess();

    default void onInterstitialAdClicked(Map<String, Object> map) {
        onInterstitialAdClicked();
    }

    default void onInterstitialAdClosed(Map<String, Object> map) {
        onInterstitialAdClosed();
    }

    default void onInterstitialAdLoadFailed(IronSourceError ironSourceError, Map<String, Object> map) {
        onInterstitialAdLoadFailed(ironSourceError);
    }

    default void onInterstitialAdOpened(Map<String, Object> map) {
        onInterstitialAdOpened();
    }

    default void onInterstitialAdReady(Map<String, Object> map) {
        onInterstitialAdReady();
    }

    default void onInterstitialAdShowFailed(IronSourceError ironSourceError, Map<String, Object> map) {
        onInterstitialAdShowFailed(ironSourceError);
    }

    default void onInterstitialAdShowSucceeded(Map<String, Object> map) {
        onInterstitialAdShowSucceeded();
    }

    default void onInterstitialAdVisible(Map<String, Object> map) {
        onInterstitialAdVisible();
    }

    default void onInterstitialInitFailed(IronSourceError ironSourceError, Map<String, Object> map) {
        onInterstitialInitFailed(ironSourceError);
    }

    default void onInterstitialInitSuccess(Map<String, Object> map) {
        onInterstitialInitSuccess();
    }
}
