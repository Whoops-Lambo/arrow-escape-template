package com.mbridge.msdk.video.signal;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public interface f {
    void configurationChanged(int i, int i2, int i3);

    boolean endCardShowing();

    void hideAlertWebview();

    void ivRewardAdsWithoutVideo(String str);

    boolean miniCardShowing();

    void readyStatus(int i);

    void resizeMiniCard(int i, int i2, int i3);

    boolean showAlertWebView();

    void showEndcard(int i);

    void showMiniCard(int i, int i2, int i3, int i4, int i5);

    void showVideoClickView(int i);

    void showVideoEndCover();
}
