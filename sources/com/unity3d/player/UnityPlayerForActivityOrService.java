package com.unity3d.player;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.view.Surface;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import defpackage.bj3;
import defpackage.jg3;
import defpackage.l62;
import defpackage.ld3;
import defpackage.pf3;
import defpackage.tc3;
import defpackage.uj2;
import defpackage.xf3;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class UnityPlayerForActivityOrService extends UnityPlayer {
    private boolean mMainDisplayOverride;
    private bj3 mOnHandleFocusListener;
    private boolean mProcessKillRequested;
    private jg3 mSoftInput;
    private long mSoftInputTimeoutMilliSeconds;
    private int m_IsNoWindowMode;
    private Z m_MainThread;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum SynchronizationTimeout {
        Pause(0),
        SurfaceDetach(1),
        Destroy(2);

        private int m_TimeoutMilliseconds = 2000;
        final int value;

        public static void setTimeoutForAll(int i) {
            for (SynchronizationTimeout synchronizationTimeout : (SynchronizationTimeout[]) SynchronizationTimeout.class.getEnumConstants()) {
                synchronizationTimeout.setTimeout(i);
            }
        }

        public int getTimeout() {
            return this.m_TimeoutMilliseconds;
        }

        public void setTimeout(int i) {
            this.m_TimeoutMilliseconds = i;
        }

        SynchronizationTimeout(int i) {
            this.value = i;
        }
    }

    private final native boolean nativeDone();

    private final native boolean nativeGetNoWindowMode();

    private final native void nativeMemoryUsageChanged(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeOnApplyWindowInsets(WindowInsets windowInsets);

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean nativePause();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeRecreateGfxState(int i, Surface surface);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeReportKeyboardConfigChanged();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeResume();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSendSurfaceChangedEvent();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetInputArea(int i, int i2, int i3, int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetInputSelection(int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetInputString(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetKeyboardIsVisible(boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSoftInputCanceled();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSoftInputClosed();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSoftInputLostFocus();

    /* JADX INFO: Access modifiers changed from: private */
    public void queueDestroy() {
        uj2.a(4, "Queue Destroy");
        runOnUiThread(new E0(this));
    }

    public final native void nativeConfigurationChanged(Configuration configuration);

    public final native void nativeFocusChanged(boolean z);

    public final native void nativeOrientationChanged(int i, int i2);

    public final native boolean nativeRender();

    public void reportSoftInputStr(String str, int i, boolean z) {
        if (i == 1) {
            hideSoftInput();
        }
        invokeOnMainThread((Runnable) new A0(this, z, str, i));
    }

    public void resetSoftInput() {
        this.mSoftInput = null;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum MemoryUsage {
        Low(1),
        Medium(2),
        High(3),
        Critical(4);

        public final int value;

        MemoryUsage(int i) {
            this.value = i;
        }
    }

    public UnityPlayerForActivityOrService(Context context, IUnityPlayerLifecycleEvents iUnityPlayerLifecycleEvents, String str, tc3 tc3Var) {
        super(context, pf3.b, iUnityPlayerLifecycleEvents);
        Z z = new Z(this);
        this.m_MainThread = z;
        this.mMainDisplayOverride = false;
        xf3 xf3Var = null;
        this.mSoftInput = null;
        this.m_IsNoWindowMode = -1;
        this.mProcessKillRequested = true;
        this.mSoftInputTimeoutMilliSeconds = 1000L;
        z.start();
        if (tc3Var.a) {
            xf3Var = new xf3(context, this);
            xf3Var.setOnApplyWindowInsetsListener(new F0(this));
        }
        initialize(xf3Var, str);
        Z z2 = this.m_MainThread;
        z2.getClass();
        try {
            z2.b.await();
        } catch (InterruptedException e) {
            uj2.a(6, "UnityMainThread was interrupted:" + e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissSoftInput() {
        jg3 jg3Var = this.mSoftInput;
        if (jg3Var != null) {
            jg3Var.hide();
            nativeReportKeyboardConfigChanged();
        }
    }

    private long getSoftInputTimeout() {
        return Math.round(this.mSoftInputTimeoutMilliSeconds * ((double) Math.max(1.0f, Settings.System.getFloat(this.mContext.getContentResolver(), "animator_duration_scale", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))));
    }

    private void raiseFocusListener(boolean z) {
        bj3 bj3Var = this.mOnHandleFocusListener;
        if (bj3Var != null) {
            RunnableC5283v0 runnableC5283v0 = ((C5279t0) bj3Var).a;
            runnableC5283v0.b = true;
            if (runnableC5283v0.a) {
                runnableC5283v0.c.release();
            }
        }
    }

    private boolean updateDisplayInternal(int i, Surface surface) {
        if (!isNativeInitialized()) {
            return false;
        }
        Semaphore semaphore = new Semaphore(0);
        K0 k0 = new K0(this, i, surface, semaphore);
        boolean zIsMainWindow = isMainWindow(i);
        if (zIsMainWindow) {
            Z z = this.m_MainThread;
            if (surface == null) {
                Message.obtain(z.c, 2269, Y.d).sendToTarget();
                Message.obtain(z.c, k0).sendToTarget();
            } else {
                Message.obtain(z.c, k0).sendToTarget();
                Message.obtain(z.c, 2269, Y.e).sendToTarget();
            }
        } else {
            k0.run();
        }
        if (!zIsMainWindow || surface != null) {
            return true;
        }
        try {
            SynchronizationTimeout synchronizationTimeout = SynchronizationTimeout.SurfaceDetach;
            if (semaphore.tryAcquire(synchronizationTimeout.getTimeout(), TimeUnit.MILLISECONDS)) {
                return true;
            }
            uj2.a(5, "Timeout (" + synchronizationTimeout.getTimeout() + " ms) while trying detaching primary window.");
            return true;
        } catch (InterruptedException unused) {
            uj2.a(5, "UI thread got interrupted while trying to detach the primary window from the Unity Engine.");
            return true;
        }
    }

    @Override // com.unity3d.player.UnityPlayer
    public void cleanupResourcesForDestroy() {
        Message.obtain(this.m_MainThread.c, 2269, Y.c).sendToTarget();
        try {
            this.m_MainThread.join(SynchronizationTimeout.Destroy.getTimeout());
        } catch (InterruptedException unused) {
            this.m_MainThread.interrupt();
        }
        if (l62.e && getFrameLayout() != null) {
            getFrameLayout().removeAllViews();
        }
        if (this.mProcessKillRequested) {
            this.m_UnityPlayerLifecycleEvents.onUnityPlayerQuitted();
            kill();
        }
    }

    public boolean getHaveAndroidWindowSupport() {
        if (this.m_IsNoWindowMode == -1) {
            this.m_IsNoWindowMode = nativeGetNoWindowMode() ? 1 : 0;
        }
        return this.m_IsNoWindowMode == 1;
    }

    @Override // com.unity3d.player.UnityPlayer
    public boolean handleFocus(boolean z) {
        jg3 jg3Var;
        if (!this.mState.d || ((jg3Var = this.mSoftInput) != null && !jg3Var.isConsumeOutsideTouchesEnabled())) {
            raiseFocusListener(z);
            return false;
        }
        Message.obtain(this.m_MainThread.c, 2269, z ? Y.g : Y.f).sendToTarget();
        raiseFocusListener(z);
        return true;
    }

    public void hideSoftInput() {
        if (this.mSoftInput == null) {
            return;
        }
        reportSoftInputArea(new Rect());
        reportSoftInputIsVisible(false);
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            dismissSoftInput();
            resetSoftInput();
            return;
        }
        Semaphore semaphore = new Semaphore(0);
        postOnUiThread(new RunnableC5283v0(this, semaphore, this));
        try {
            if (!semaphore.tryAcquire(getSoftInputTimeout(), TimeUnit.MILLISECONDS)) {
                uj2.a(6, "Timeout (" + getSoftInputTimeout() + " ms) while waiting softinput hiding operation.");
            }
        } catch (InterruptedException unused) {
            uj2.a(6, "UI thread got interrupted while waiting softinput hiding operation.");
        } finally {
            this.mSoftInput = null;
        }
    }

    @Override // com.unity3d.player.UnityPlayer
    public void onOrientationChanged(int i, int i2) {
        Z z = this.m_MainThread;
        z.h = this.mNaturalOrientation;
        z.i = i2;
        Message.obtain(z.c, 2269, Y.i).sendToTarget();
    }

    public void onTrimMemory(MemoryUsage memoryUsage) {
        if (l62.e) {
            nativeMemoryUsageChanged(memoryUsage.value);
        }
    }

    @Override // com.unity3d.player.UnityPlayer
    public void pauseUnity() {
        super.pauseUnity();
        reportSoftInputStr(null, 1, true);
        l62 l62Var = this.mState;
        l62Var.b = false;
        l62Var.c = true;
        if (l62.e) {
            Semaphore semaphore = new Semaphore(0);
            Runnable g0 = isFinishing() ? new G0(this, semaphore) : new H0(this, semaphore);
            Z z = this.m_MainThread;
            Message.obtain(z.c, 2269, Y.a).sendToTarget();
            Message.obtain(z.c, g0).sendToTarget();
            try {
                SynchronizationTimeout synchronizationTimeout = SynchronizationTimeout.Pause;
                if (!semaphore.tryAcquire(synchronizationTimeout.getTimeout(), TimeUnit.MILLISECONDS)) {
                    uj2.a(5, "Timeout (" + synchronizationTimeout.getTimeout() + " ms) while trying to pause the Unity Engine.");
                }
            } catch (InterruptedException unused) {
                uj2.a(5, "UI thread got interrupted while trying to pause the Unity Engine.");
            }
        }
        if (this.m_AddPhoneCallListener) {
            this.m_TelephonyManager.listen(this.m_PhoneCallListener, 0);
        }
    }

    public void reportSoftInputArea(Rect rect) {
        invokeOnMainThread((Runnable) new C0(this, rect));
    }

    public void reportSoftInputIsVisible(boolean z) {
        invokeOnMainThread((Runnable) new D0(this, z));
    }

    public void reportSoftInputSelection(int i, int i2) {
        invokeOnMainThread((Runnable) new B0(this, i, i2));
    }

    public void setCharacterLimit(int i) {
        runOnUiThread(new RunnableC5287x0(this, i));
    }

    public void setHideInputField(boolean z) {
        runOnUiThread(new RunnableC5289y0(this, z));
    }

    public void setOnHandleFocusListener(bj3 bj3Var) {
        this.mOnHandleFocusListener = bj3Var;
    }

    public void setSelection(int i, int i2) {
        runOnUiThread(new RunnableC5291z0(this, i, i2));
    }

    public void setSoftInputStr(String str) {
        runOnUiThread(new RunnableC5285w0(this, str));
    }

    public void showSoftInput(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i2, boolean z5, boolean z6) {
        Semaphore semaphore = new Semaphore(0);
        postOnUiThread(new Q0(this, this, str, i, z, z2, z3, z4, str2, i2, z5, z6, semaphore));
        try {
            if (semaphore.tryAcquire(getSoftInputTimeout(), TimeUnit.MILLISECONDS)) {
                return;
            }
            uj2.a(6, "Timeout (" + getSoftInputTimeout() + " ms) while waiting softinput showing operation.");
        } catch (InterruptedException unused) {
            uj2.a(6, "UI thread got interrupted while waiting softinput showing operation.");
        }
    }

    public void updateGLDisplay(int i, Surface surface) {
        if (this.mMainDisplayOverride) {
            return;
        }
        updateDisplayInternal(i, surface);
    }

    private boolean isMainWindow(int i) {
        if (i == nativeGetMainWindowIndex()) {
            return true;
        }
        return false;
    }

    @Override // com.unity3d.player.UnityPlayer
    public void configurationChanged(Configuration configuration) {
        super.configurationChanged(configuration);
        if (!isNativeInitialized()) {
            return;
        }
        invokeOnMainThread(new I0(this, new Configuration(configuration)));
    }

    public boolean displayChanged(int i, Surface surface) {
        boolean z;
        if (isMainWindow(i) && getFrameLayout() != null) {
            if (surface != null) {
                z = true;
            } else {
                z = false;
            }
            this.mMainDisplayOverride = z;
            runOnUiThread(new L0(this));
        }
        return updateDisplayInternal(i, surface);
    }

    @Override // com.unity3d.player.UnityPlayer
    public ld3 getSurfaceView() {
        W view = getView();
        if (view == null) {
            return null;
        }
        return view.a;
    }

    @Override // com.unity3d.player.UnityPlayer
    public W getView() {
        FrameLayout frameLayout = getFrameLayout();
        if (frameLayout == null) {
            return null;
        }
        return ((xf3) frameLayout).b;
    }

    @Override // com.unity3d.player.UnityPlayer
    public View getViewForPadding() {
        W view = getView();
        ld3 ld3Var = view.a;
        if (ld3Var != null && ld3Var.a > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return view;
        }
        return getFrameLayout();
    }

    @Override // com.unity3d.player.UnityPlayer
    public void hidePreservedContent() {
        if (getFrameLayout() == null) {
            return;
        }
        runOnUiThread(new N0(this));
    }

    @Override // com.unity3d.player.UnityPlayer
    public void resumeUnity() {
        super.resumeUnity();
        invokeOnMainThread(new M0(this));
        Z z = this.m_MainThread;
        Message.obtain(z.c, 2269, Y.b).sendToTarget();
    }

    @Override // com.unity3d.player.UnityPlayer
    public boolean runningOnMainThread() {
        if (Thread.currentThread() == this.m_MainThread) {
            return true;
        }
        return false;
    }

    public void sendSurfaceChangedEvent() {
        if (!isNativeInitialized()) {
            return;
        }
        Message.obtain(this.m_MainThread.c, new J0(this)).sendToTarget();
    }

    @Override // com.unity3d.player.UnityPlayer
    public void setMainSurfaceViewAspectRatio(float f) {
        if (getFrameLayout() == null) {
            return;
        }
        runOnUiThread(new O0(this, f));
    }

    @Override // com.unity3d.player.UnityPlayer
    public void shutdown() {
        this.mProcessKillRequested = nativeDone();
        super.shutdown();
    }

    public UnityPlayerForActivityOrService(Context context, IUnityPlayerLifecycleEvents iUnityPlayerLifecycleEvents) {
        this(context, iUnityPlayerLifecycleEvents, "", new tc3());
    }

    public UnityPlayerForActivityOrService(Context context, IUnityPlayerLifecycleEvents iUnityPlayerLifecycleEvents, String str) {
        this(context, iUnityPlayerLifecycleEvents, str, new tc3());
    }

    public UnityPlayerForActivityOrService(Context context) {
        this(context, null, "", new tc3());
    }
}
