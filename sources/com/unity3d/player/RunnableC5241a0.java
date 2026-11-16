package com.unity3d.player;

import android.view.WindowManager;

/* JADX INFO: renamed from: com.unity3d.player.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class RunnableC5241a0 implements Runnable {
    public final /* synthetic */ float a;
    public final /* synthetic */ UnityPlayer b;

    public RunnableC5241a0(UnityPlayer unityPlayer, float f) {
        this.b = unityPlayer;
        this.a = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WindowManager.LayoutParams attributes = this.b.m_Window.getAttributes();
        attributes.screenBrightness = this.a;
        this.b.m_Window.setAttributes(attributes);
    }
}
