package com.unity3d.player;

import defpackage.jg3;

/* JADX INFO: renamed from: com.unity3d.player.x0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC5287x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ UnityPlayerForActivityOrService b;

    public RunnableC5287x0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, int i) {
        this.b = unityPlayerForActivityOrService;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jg3 jg3Var = this.b.mSoftInput;
        if (jg3Var != null) {
            jg3Var.setCharacterLimit(this.a);
        }
    }
}
