package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.c0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class RunnableC5245c0 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ UnityPlayer b;

    public RunnableC5245c0(UnityPlayer unityPlayer, boolean z) {
        this.b = unityPlayer;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.applyWindowUIChangesOnUiThread(this.a);
    }
}
