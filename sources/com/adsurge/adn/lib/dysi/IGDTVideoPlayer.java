package com.adsurge.adn.lib.dysi;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public interface IGDTVideoPlayer {
    public static final String EVENT_ON_VIDEO_VIEW_INIT = "event_onVideoViewInit";
    public static final String KEY_VIDEO_PLAYER = "GDTVideoPlayer";

    int currentTime();

    int duration();

    boolean isPlaying();

    void pause();

    void pauseAndLock();

    void play();

    void speed(double d);

    void stop();

    void unlockAndPlay();
}
