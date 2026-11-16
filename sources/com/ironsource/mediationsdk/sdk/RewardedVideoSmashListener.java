package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public interface RewardedVideoSmashListener {
    void onRewardedVideoAdClicked();

    void onRewardedVideoAdClosed();

    void onRewardedVideoAdEnded();

    void onRewardedVideoAdOpened();

    void onRewardedVideoAdRewarded();

    void onRewardedVideoAdShowFailed(IronSourceError ironSourceError);

    void onRewardedVideoAdStarted();

    void onRewardedVideoAdVisible();

    void onRewardedVideoAvailabilityChanged(boolean z);

    void onRewardedVideoInitFailed(IronSourceError ironSourceError);

    void onRewardedVideoInitSuccess();

    void onRewardedVideoLoadFailed(IronSourceError ironSourceError);

    void onRewardedVideoLoadSuccess();

    default void onRewardedVideoAdClicked(Map<String, Object> map) {
        onRewardedVideoAdClicked();
    }

    default void onRewardedVideoAdClosed(Map<String, Object> map) {
        onRewardedVideoAdClosed();
    }

    default void onRewardedVideoAdEnded(Map<String, Object> map) {
        onRewardedVideoAdEnded();
    }

    default void onRewardedVideoAdOpened(Map<String, Object> map) {
        onRewardedVideoAdOpened();
    }

    default void onRewardedVideoAdRewarded(Map<String, Object> map) {
        onRewardedVideoAdRewarded();
    }

    default void onRewardedVideoAdShowFailed(IronSourceError ironSourceError, Map<String, Object> map) {
        onRewardedVideoAdShowFailed(ironSourceError);
    }

    default void onRewardedVideoAdStarted(Map<String, Object> map) {
        onRewardedVideoAdStarted();
    }

    default void onRewardedVideoAdVisible(Map<String, Object> map) {
        onRewardedVideoAdVisible();
    }

    default void onRewardedVideoAvailabilityChanged(boolean z, Map<String, Object> map) {
        onRewardedVideoAvailabilityChanged(z);
    }

    default void onRewardedVideoInitFailed(IronSourceError ironSourceError, Map<String, Object> map) {
        onRewardedVideoInitFailed(ironSourceError);
    }

    default void onRewardedVideoInitSuccess(Map<String, Object> map) {
        onRewardedVideoInitSuccess();
    }

    default void onRewardedVideoLoadFailed(IronSourceError ironSourceError, Map<String, Object> map) {
        onRewardedVideoLoadFailed(ironSourceError);
    }

    default void onRewardedVideoLoadSuccess(Map<String, Object> map) {
        onRewardedVideoLoadSuccess();
    }
}
