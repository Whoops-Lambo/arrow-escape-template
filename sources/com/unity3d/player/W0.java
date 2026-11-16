package com.unity3d.player;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class W0 implements Runnable {
    public final /* synthetic */ VideoPlayer a;

    public W0(VideoPlayer videoPlayer) {
        this.a = videoPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.destroyPlayer();
        this.a.changeState(3);
    }
}
