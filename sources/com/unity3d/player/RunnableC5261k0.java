package com.unity3d.player;

import defpackage.l62;

/* JADX INFO: renamed from: com.unity3d.player.k0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class RunnableC5261k0 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ UnityPlayer b;

    public RunnableC5261k0(UnityPlayer unityPlayer, boolean z) {
        this.b = unityPlayer;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.b.m_RunWithoutFocus;
        boolean z2 = this.a;
        if (z == z2) {
            return;
        }
        this.b.m_RunWithoutFocus = z2;
        if (this.b.shouldRunWithoutFocus()) {
            return;
        }
        UnityPlayer unityPlayer = this.b;
        l62 l62Var = unityPlayer.mState;
        if (l62Var.a || l62Var.c) {
            return;
        }
        unityPlayer.setupUnityToBePaused();
    }
}
