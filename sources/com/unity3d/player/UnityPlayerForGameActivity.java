package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.l62;
import defpackage.pf3;
import defpackage.sm;
import defpackage.uj2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class UnityPlayerForGameActivity extends UnityPlayer {
    Thread m_MainThread;
    private sm m_PersistentUnitySurface;
    SurfaceView m_SurfaceView;

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeOrientationChanged(int i, int i2);

    private final native void nativeUnityPlayerForGameActivityInitialized(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeUnityPlayerSetRunning(boolean z);

    @Override // com.unity3d.player.UnityPlayer
    public void cleanupResourcesForDestroy() {
    }

    @Override // com.unity3d.player.UnityPlayer
    public View getViewForPadding() {
        return null;
    }

    @Override // com.unity3d.player.UnityPlayer
    public boolean handleFocus(boolean z) {
        return true;
    }

    @Override // com.unity3d.player.UnityPlayer
    public void setMainSurfaceViewAspectRatio(float f) {
        uj2.a(6, "setMainSurfaceViewAspectRatio is not supported for GameActivity");
    }

    public UnityPlayerForGameActivity(Activity activity, FrameLayout frameLayout, SurfaceView surfaceView, IUnityPlayerLifecycleEvents iUnityPlayerLifecycleEvents, String str) {
        super(activity, pf3.c, iUnityPlayerLifecycleEvents);
        this.m_SurfaceView = surfaceView;
        initialize(frameLayout, str);
        this.m_MainThread = null;
        nativeUnityPlayerForGameActivityInitialized(!l62.e ? 1 : 0);
        applySurfaceViewSettings(this.m_SurfaceView);
        this.m_PersistentUnitySurface = new sm(activity);
        this.m_SurfaceView.getHolder().addCallback(new R0(this));
    }

    @Override // com.unity3d.player.UnityPlayer
    public SurfaceView getSurfaceView() {
        return this.m_SurfaceView;
    }

    @Override // com.unity3d.player.UnityPlayer
    public void hidePreservedContent() {
        runOnUiThread(new V0(this));
    }

    @Override // com.unity3d.player.UnityPlayer
    public void onOrientationChanged(int i, int i2) {
        invokeOnMainThread((Runnable) new S0(this, i, i2));
    }

    @Override // com.unity3d.player.UnityPlayer
    public boolean runningOnMainThread() {
        if (this.m_MainThread != null) {
            return Thread.currentThread() == this.m_MainThread;
        }
        io.p071bidmachine.media3.extractor.ts.y.j("Main Thread was not yet set.");
        return false;
    }

    public void setMainThread() {
        if (this.m_MainThread == null) {
            this.m_MainThread = Thread.currentThread();
        } else {
            io.p071bidmachine.media3.extractor.ts.y.j("Main Thread was already set.");
        }
    }

    public static int getUnityViewIdentifier(Context context) {
        return context.getResources().getIdentifier("unitySurfaceView", "id", context.getPackageName());
    }

    @Override // com.unity3d.player.UnityPlayer
    public void pauseUnity() {
        super.pauseUnity();
        invokeOnMainThread((Runnable) new T0(this));
    }

    @Override // com.unity3d.player.UnityPlayer
    public void resumeUnity() {
        super.resumeUnity();
        invokeOnMainThread((Runnable) new U0(this));
    }

    @Override // com.unity3d.player.UnityPlayer
    public SurfaceView getView() {
        return getSurfaceView();
    }

    public UnityPlayerForGameActivity(Activity activity, FrameLayout frameLayout, SurfaceView surfaceView, IUnityPlayerLifecycleEvents iUnityPlayerLifecycleEvents) {
        this(activity, frameLayout, surfaceView, iUnityPlayerLifecycleEvents, "");
    }

    public UnityPlayerForGameActivity(Activity activity, FrameLayout frameLayout, SurfaceView surfaceView) {
        this(activity, frameLayout, surfaceView, null, "");
    }
}
