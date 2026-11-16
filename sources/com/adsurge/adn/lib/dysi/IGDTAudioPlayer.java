package com.adsurge.adn.lib.dysi;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public interface IGDTAudioPlayer {
    int currentTime();

    int duration();

    void free();

    int isPlaying();

    void pause();

    void play();

    void prepare(String str);

    @Deprecated
    void prepareAudioPlayer(String str, String str2);

    void setNumberOfLoops(int i);

    void setVolume(double d);

    void stop();
}
