package com.unity3d.player;

import android.view.accessibility.AccessibilityManager;
import com.unity3d.player.UnityAccessibilityDelegate.a;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class S implements AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ UnityAccessibilityDelegate a;

    public S(UnityAccessibilityDelegate unityAccessibilityDelegate) {
        this.a = unityAccessibilityDelegate;
        unityAccessibilityDelegate.c.addAccessibilityStateChangeListener(this);
        unityAccessibilityDelegate.c.addTouchExplorationStateChangeListener(this);
        if (unityAccessibilityDelegate.c.isEnabled()) {
            onAccessibilityStateChanged(true);
        }
    }

    public void cleanup() {
        this.a.c.removeAccessibilityStateChangeListener(this);
        this.a.c.removeTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        UnityAccessibilityDelegate unityAccessibilityDelegate = this.a;
        if (z) {
            unityAccessibilityDelegate.b.setAccessibilityDelegate(unityAccessibilityDelegate);
            this.a.b.setWillNotDraw(false);
            onTouchExplorationStateChanged(this.a.c.isTouchExplorationEnabled());
        } else {
            unityAccessibilityDelegate.b.setAccessibilityDelegate(null);
            this.a.b.setWillNotDraw(true);
            onTouchExplorationStateChanged(false);
        }
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        boolean z2 = this.a.c.isEnabled() && z;
        UnityAccessibilityDelegate unityAccessibilityDelegate = this.a;
        if (z2) {
            unityAccessibilityDelegate.b.setOnHoverListener(unityAccessibilityDelegate.new a());
        } else {
            unityAccessibilityDelegate.b.setOnHoverListener(null);
        }
        UnityAccessibilityDelegate unityAccessibilityDelegate2 = this.a;
        if (unityAccessibilityDelegate2.i == z2) {
            return;
        }
        unityAccessibilityDelegate2.i = z2;
        UnityPlayer unityPlayer = unityAccessibilityDelegate2.a;
        Objects.requireNonNull(unityPlayer);
        this.a.a.invokeOnMainThread((Runnable) new Q(unityPlayer, z2));
    }
}
