package com.unity3d.player;

import android.content.res.Configuration;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.CaptioningManager;
import java.util.Objects;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
class UnityAccessibilityDelegate extends View.AccessibilityDelegate {
    private final UnityPlayer a;
    private final SurfaceView b;
    private AccessibilityManager c;
    private S d;
    private CaptioningManager e;
    private U f;
    private int g = -1;
    private int h = -1;
    private boolean i = false;
    private float j = 1.0f;
    private final P k = new P(this);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements View.OnHoverListener {
        public a() {
        }

        @Override // android.view.View.OnHoverListener
        public final boolean onHover(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int iHitTest = UnityAccessibilityDelegate.hitTest(motionEvent.getX(), motionEvent.getY());
                UnityAccessibilityDelegate unityAccessibilityDelegate = UnityAccessibilityDelegate.this;
                int i = unityAccessibilityDelegate.h;
                if (i != iHitTest) {
                    unityAccessibilityDelegate.h = iHitTest;
                    if (iHitTest != -1) {
                        unityAccessibilityDelegate.sendEventForVirtualViewId(iHitTest, 128);
                    }
                    if (i != -1) {
                        unityAccessibilityDelegate.sendEventForVirtualViewId(i, 256);
                        return true;
                    }
                    return true;
                }
                return true;
            }
            if (action != 10) {
                Log.i("a11y", "hover unknown" + motionEvent.toString());
                return true;
            }
            UnityAccessibilityDelegate unityAccessibilityDelegate2 = UnityAccessibilityDelegate.this;
            int i2 = unityAccessibilityDelegate2.h;
            if (i2 != -1) {
                unityAccessibilityDelegate2.h = -1;
                if (i2 != -1) {
                    unityAccessibilityDelegate2.sendEventForVirtualViewId(i2, 256);
                    return true;
                }
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native int[] getRootNodeIds();

    /* JADX INFO: Access modifiers changed from: private */
    public static native int hitTest(float f, float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean isNodeDismissable(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean isNodeInvokable(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean isNodeScrollable(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean isNodeSlider(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void onClosedCaptioningStatusChanged(boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void onFontScaleChanged(float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean onNodeDecremented(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean onNodeDismissed(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void onNodeFocusChanged(int i, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean onNodeIncremented(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean onNodeInvoked(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean onNodeScrolled(int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void onScreenReaderStatusChanged(boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean populateNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo, int i, View view);

    public boolean sendAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        ViewGroup viewGroup;
        if (accessibilityEvent == null || (viewGroup = (ViewGroup) this.b.getParent()) == null) {
            return false;
        }
        return viewGroup.requestSendAccessibilityEvent(this.b, accessibilityEvent);
    }

    public static UnityAccessibilityDelegate init(UnityPlayer unityPlayer) {
        UnityAccessibilityDelegate unityAccessibilityDelegate = new UnityAccessibilityDelegate(unityPlayer);
        unityAccessibilityDelegate.c = (AccessibilityManager) unityAccessibilityDelegate.a.getContext().getSystemService("accessibility");
        CaptioningManager captioningManager = (CaptioningManager) unityAccessibilityDelegate.a.getContext().getSystemService("captioning");
        unityAccessibilityDelegate.e = captioningManager;
        if (unityAccessibilityDelegate.c != null || captioningManager != null) {
            Semaphore semaphore = new Semaphore(0);
            unityAccessibilityDelegate.a.runOnUiThread(new G(unityAccessibilityDelegate, semaphore));
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
            }
        }
        unityAccessibilityDelegate.j = unityAccessibilityDelegate.a.getContext().getResources().getConfiguration().fontScale;
        unityAccessibilityDelegate.a.setAccessibilityDelegate(unityAccessibilityDelegate);
        return unityAccessibilityDelegate;
    }

    public final void a(Configuration configuration) {
        float f = configuration.fontScale;
        if (f != this.j) {
            this.j = f;
            UnityPlayer unityPlayer = this.a;
            Objects.requireNonNull(unityPlayer);
            this.a.invokeOnMainThread((Runnable) new H(unityPlayer, configuration));
        }
    }

    public void cleanup() {
        S s = this.d;
        if (s != null) {
            s.cleanup();
        }
        U u = this.f;
        if (u != null) {
            u.cleanup();
        }
        this.a.setAccessibilityDelegate(null);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        return this.k;
    }

    public int getFocusedNodeId() {
        return this.g;
    }

    public boolean sendAnnouncementForVirtualViewId(int i, String str) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setSource(this.b, i);
        accessibilityEventObtain.getText().add(str);
        return sendAccessibilityEvent(accessibilityEventObtain);
    }

    public boolean sendEventForVirtualViewId(int i, int i2) {
        if (!this.c.isEnabled()) {
            return false;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setSource(this.b, i);
        if (i2 == 2048) {
            accessibilityEventObtain.setContentChangeTypes(1);
        }
        if (i2 == 32768) {
            if (this.g == i) {
                return false;
            }
            this.g = i;
            this.b.invalidate();
            UnityPlayer unityPlayer = this.a;
            Objects.requireNonNull(unityPlayer);
            this.a.invokeOnMainThread((Runnable) new J(unityPlayer, i));
        }
        if (i2 == 65536) {
            if (this.g == i) {
                this.g = -1;
            }
            this.b.invalidate();
            UnityPlayer unityPlayer2 = this.a;
            Objects.requireNonNull(unityPlayer2);
            this.a.invokeOnMainThread((Runnable) new K(unityPlayer2, i));
        }
        return sendAccessibilityEvent(accessibilityEventObtain);
    }

    public boolean sendEventForVirtualViewIdFromNative(int i, int i2) {
        this.a.runOnUiThread(new I(this, i, i2));
        return true;
    }

    public UnityAccessibilityDelegate(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
        this.b = unityPlayer.getSurfaceView();
    }
}
