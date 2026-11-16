package com.unity3d.player;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class d1 implements Runnable {
    public final /* synthetic */ f1 a;

    public d1(f1 f1Var) {
        this.a = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f1 f1Var = this.a;
        VideoPlayer videoPlayer = f1Var.f;
        if (videoPlayer != null) {
            f1Var.a.addViewToPlayer(videoPlayer, true);
            f1 f1Var2 = this.a;
            f1Var2.i = true;
            f1Var2.f.requestFocus();
        }
    }
}
