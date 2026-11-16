package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.b0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class RunnableC5243b0 implements Runnable {
    public final /* synthetic */ UnityPlayer a;

    public RunnableC5243b0(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.setupUnityToBePaused();
        this.a.windowFocusChanged(false);
        this.a.m_UnityPlayerLifecycleEvents.onUnityPlayerUnloaded();
    }
}
