package com.unity3d.player;

import android.view.accessibility.CaptioningManager;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class U extends CaptioningManager.CaptioningChangeListener {
    public final /* synthetic */ UnityAccessibilityDelegate a;

    public U(UnityAccessibilityDelegate unityAccessibilityDelegate) {
        this.a = unityAccessibilityDelegate;
        unityAccessibilityDelegate.e.addCaptioningChangeListener(this);
        onEnabledChanged(unityAccessibilityDelegate.e.isEnabled());
    }

    public void cleanup() {
        this.a.e.removeCaptioningChangeListener(this);
    }

    @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
    public final void onEnabledChanged(boolean z) {
        UnityPlayer unityPlayer = this.a.a;
        Objects.requireNonNull(unityPlayer);
        this.a.a.invokeOnMainThread((Runnable) new T(unityPlayer, z));
    }
}
