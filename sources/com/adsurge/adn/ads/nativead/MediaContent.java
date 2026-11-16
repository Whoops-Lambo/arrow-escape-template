package com.adsurge.adn.ads.nativead;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public interface MediaContent {
    float getAspectRatio();

    float getDuration();

    boolean hasVideoContent();

    void pause();

    void play();

    void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks);
}
