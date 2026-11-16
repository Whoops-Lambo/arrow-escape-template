package com.unity3d.player;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import defpackage.sm;
import defpackage.tg;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class R0 implements SurfaceHolder.Callback {
    public final /* synthetic */ UnityPlayerForGameActivity a;

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public R0(UnityPlayerForGameActivity unityPlayerForGameActivity) {
        this.a = unityPlayerForGameActivity;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        UnityPlayerForGameActivity unityPlayerForGameActivity = this.a;
        sm smVar = unityPlayerForGameActivity.m_PersistentUnitySurface;
        FrameLayout frameLayout = unityPlayerForGameActivity.getFrameLayout();
        tg tgVar = smVar.b;
        if (tgVar == null || tgVar.getParent() != null) {
            return;
        }
        frameLayout.addView(smVar.b);
        frameLayout.bringChildToFront(smVar.b);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        UnityPlayerForGameActivity unityPlayerForGameActivity = this.a;
        sm smVar = unityPlayerForGameActivity.m_PersistentUnitySurface;
        SurfaceView surfaceView = unityPlayerForGameActivity.m_SurfaceView;
        if (smVar.a != null) {
            if (smVar.b == null) {
                smVar.b = new tg(smVar, smVar.a);
            }
            smVar.b.a(surfaceView);
        }
        this.a.handleDeferredPauseOnSurfaceDestroyed();
    }
}
