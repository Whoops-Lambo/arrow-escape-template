package com.unity3d.player;

import android.widget.FrameLayout;
import defpackage.sm;
import defpackage.tg;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class V0 implements Runnable {
    public final /* synthetic */ UnityPlayerForGameActivity a;

    public V0(UnityPlayerForGameActivity unityPlayerForGameActivity) {
        this.a = unityPlayerForGameActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UnityPlayerForGameActivity unityPlayerForGameActivity = this.a;
        sm smVar = unityPlayerForGameActivity.m_PersistentUnitySurface;
        FrameLayout frameLayout = unityPlayerForGameActivity.getFrameLayout();
        tg tgVar = smVar.b;
        if (tgVar != null && tgVar.getParent() != null) {
            frameLayout.removeView(smVar.b);
        }
        this.a.m_PersistentUnitySurface.b = null;
    }
}
