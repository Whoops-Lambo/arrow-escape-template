package com.unity3d.player;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class Y0 implements Runnable {
    public final VideoPlayer a;
    public boolean b = false;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        if (this.b) {
            return;
        }
        if (VideoPlayer.LOG) {
            VideoPlayer.Log("Stopping the video player due to timeout.");
        }
        this.a.cancelOnPrepare();
    }

    public Y0(VideoPlayer videoPlayer) {
        this.a = videoPlayer;
    }
}
