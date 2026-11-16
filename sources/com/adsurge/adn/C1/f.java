package com.adsurge.adn.C1;

import android.graphics.Matrix;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public interface f {
    void a(int i);

    void free();

    int getCurrentPosition();

    int getDuration();

    int getPlayerVersion();

    boolean isPlaying();

    void pause();

    void play();

    void setDataSource(String str);

    void setSpeed(float f);

    void setTransform(Matrix matrix);
}
