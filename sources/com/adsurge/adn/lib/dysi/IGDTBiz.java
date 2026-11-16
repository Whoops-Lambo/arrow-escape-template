package com.adsurge.adn.lib.dysi;

import com.adsurge.adn.C1.n;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public interface IGDTBiz {
    public static final String KEY_GDTBIZ = "GDTBiz";

    boolean isOnViewAppearanceChangedEnable();

    boolean isTimerTickEnable();

    void onAdClickOpen(int i);

    void onAdClickPlayable(long j);

    void onAdClickReturn(int i);

    void onApkStartInstall(String str);

    void onAppInstall();

    void onBizCustomEventTriggered(String str);

    void onDialogDismiss(int i);

    void onDialogShow(int i);

    void onGoAppStore(String str);

    void onLandingPageClose();

    void onLandingPageOpen();

    void onNativeAdClick(int i);

    void onPageLoadEnd(String str);

    void onPageLoadStart(String str);

    void onPlayStateChange(n nVar, int i);

    void onReward(int i);

    void onTimerTick(long j);

    void onTimerTickPlus(long j, long j2);

    void onVideoLandingPageClicked();

    void onViewAppearanceChanged(String str);

    void setObserveFlag(int i);
}
