package com.unity3d.player;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.provider.Settings;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.InputEvent;
import android.view.OrientationEventListener;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.widget.FrameLayout;
import com.ironsource.C4664b4;
import com.singular.sdk.internal.UserDetailsUtils;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ac1;
import defpackage.ce3;
import defpackage.di3;
import defpackage.fs1;
import defpackage.h12;
import defpackage.h50;
import defpackage.l62;
import defpackage.mg1;
import defpackage.mi3;
import defpackage.n30;
import defpackage.pf3;
import defpackage.sp1;
import defpackage.uj2;
import defpackage.ys1;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.fmod.FmodAndroidAudioManager;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class UnityPlayer implements IUnityPlayerLifecycleEvents {
    private static final String ARCORE_ENABLE_METADATA_NAME = "unity.arcore-enable";
    private static final String AUTO_REPORT_FULLY_DRAWN_ENABLE_METADATA_NAME = "unity.auto-report-fully-drawn";
    private static final String AUTO_SET_GAME_STATE_ENABLE_METADATA_NAME = "unity.auto-set-game-state";
    private static final String LAUNCH_FULLSCREEN = "unity.launch-fullscreen";
    private static final String RUN_WITHOUT_FOCUS = "unity.run-without-focus";
    private static final String SPLASH_ENABLE_METADATA_NAME = "unity.splash-enable";
    private static final String SPLASH_MODE_METADATA_NAME = "unity.splash-mode";
    public static Activity currentActivity;
    public static Context currentContext;
    Activity mActivity;
    Context mContext;
    private pf3 mContextType;
    private int mInitialScreenOrientation;
    int mNaturalOrientation;
    private OrientationEventListener mOrientationListener;
    boolean mQuitting;
    l62 mState;
    private f1 mVideoPlayerProxy;
    private GoogleARCoreApi m_ARCoreApi;
    private UnityAccessibilityDelegate m_AccessibilityDelegate;
    boolean m_AddPhoneCallListener;
    private AudioVolumeHandler m_AudioVolumeHandler;
    private Camera2Wrapper m_Camera2Wrapper;
    private ClipboardManager m_ClipboardManager;
    private ys1 m_Cursor;
    private boolean m_DeferredPauseForRunWithoutFocus;
    private C5271p0 m_FakeListener;
    private FmodAndroidAudioManager m_FmodAndroidAudioManager;
    private FrameLayout m_FrameLayout;
    private HFPStatus m_HFPStatus;
    volatile int m_LastFullScreenValue;
    private float m_LastScreenBrightness;
    private final ConcurrentLinkedQueue m_MainThreadJobs;
    private di3 m_NetworkConnectivity;
    private mi3 m_OnBackPressedDispatcher;
    private OrientationLockListener m_OrientationLockListener;
    private HashMap m_PermissionRequests;
    a m_PhoneCallListener;
    volatile boolean m_RunWithoutFocus;
    private ac1 m_SplashScreen;
    TelephonyManager m_TelephonyManager;
    private Thread m_UIThread;
    protected IUnityPlayerLifecycleEvents m_UnityPlayerLifecycleEvents;
    Window m_Window;
    private Configuration prevConfig;
    Handler mHandler = new Handler();
    private boolean mIsFullscreen = true;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends PhoneStateListener {
        public int a = 0;

        public a() {
        }

        @Override // android.telephony.PhoneStateListener
        public final void onCallStateChanged(int i, String str) {
            this.a = i;
            UnityPlayer.this.nativeMuteMasterAudio(i == 1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public abstract class b implements Runnable {
        public abstract void a();

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (UnityPlayer.this.isFinishing()) {
                return;
            }
            a();
        }
    }

    private void developmentPlayerInitialize() {
    }

    private final native void initJni(Context context, int i, String str);

    private final native void nativeApplicationUnload();

    private final native void nativeHidePreservedContent();

    private final native boolean nativeInjectEvent(InputEvent inputEvent, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean nativeIsAutorotationOn();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSetLaunchURL(String str);

    private static native void nativeUnitySendMessage(String str, String str2, byte[] bArr);

    private final native void nativeViewPaddingChanged(int i, int i2, int i3, int i4, int i5);

    public static native void permissionResponseToNative(long j, boolean z);

    private void setScreenBrightness(float f) {
        if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = Math.max(0.04f, f);
        }
        float fClamp = clamp(f, -1.0f, 1.0f);
        if (this.m_Window == null || this.m_LastScreenBrightness == fClamp) {
            return;
        }
        this.m_LastScreenBrightness = fClamp;
        runOnUiThread(new RunnableC5241a0(this, fClamp));
    }

    public synchronized void addPermissionRequest(PermissionRequest permissionRequest) {
        Integer numValueOf;
        try {
            if (this.m_PermissionRequests == null) {
                this.m_PermissionRequests = new HashMap();
            }
            int i = 1;
            while (true) {
                numValueOf = Integer.valueOf(i);
                if (!this.m_PermissionRequests.containsKey(numValueOf)) {
                    break;
                } else {
                    i++;
                }
            }
            this.m_PermissionRequests.put(numValueOf, permissionRequest);
            if (this.m_PermissionRequests.size() == 1) {
                requestPermissionsFromActivity(permissionRequest.getPermissionNames(), i);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void addPhoneCallListener() {
        this.m_AddPhoneCallListener = true;
        this.m_TelephonyManager.listen(this.m_PhoneCallListener, 32);
    }

    public abstract void cleanupResourcesForDestroy();

    public void disableLogger() {
        uj2.d = true;
    }

    public abstract SurfaceView getSurfaceView();

    public abstract View getView();

    public abstract View getViewForPadding();

    public abstract boolean handleFocus(boolean z);

    public abstract void hidePreservedContent();

    public void kill() {
        uj2.a(4, "Quitting process");
        Process.killProcess(Process.myPid());
    }

    public boolean loadLibrary(String str) {
        try {
            System.loadLibrary(str);
            return true;
        } catch (Exception | UnsatisfiedLinkError unused) {
            return false;
        }
    }

    public final native void nativeCrashNow();

    public final native int nativeGetMainWindowIndex();

    public final native void nativeMuteMasterAudio(boolean z);

    public abstract void onOrientationChanged(int i, int i2);

    public void onResume() {
        this.m_DeferredPauseForRunWithoutFocus = false;
        l62 l62Var = this.mState;
        if (!l62Var.b || l62Var.c) {
            setupUnityToBeResumed();
        }
    }

    @Override // com.unity3d.player.IUnityPlayerLifecycleEvents
    public void onUnityPlayerQuitted() {
    }

    @Override // com.unity3d.player.IUnityPlayerLifecycleEvents
    public void onUnityPlayerUnloaded() {
    }

    public synchronized void permissionResponse(Activity activity, int i, String[] strArr, int[] iArr) {
        try {
            if (this.m_PermissionRequests != null) {
                Integer numValueOf = Integer.valueOf(i);
                PermissionRequest permissionRequest = (PermissionRequest) this.m_PermissionRequests.get(numValueOf);
                if (permissionRequest != null) {
                    this.m_PermissionRequests.remove(numValueOf);
                    String[] permissionNames = permissionRequest.getPermissionNames();
                    int[] iArr2 = new int[permissionNames.length];
                    for (int i2 = 0; i2 < strArr.length; i2++) {
                        String str = strArr[i2];
                        int i3 = 0;
                        while (true) {
                            if (i3 >= permissionNames.length) {
                                i3 = -1;
                                break;
                            } else if (str.equals(permissionNames[i3])) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        if (i3 < 0) {
                            uj2.a(6, "Permission not found in request: " + str);
                        } else {
                            iArr2[i3] = iArr[i2] == 0 ? 1 : (Build.VERSION.SDK_INT < 30 && !UnityPermissions.shouldShowRequestPermissionRationale(activity, str)) ? 3 : 2;
                        }
                    }
                    invokeOnMainThread(new RunnableC5259j0(permissionRequest, permissionNames, iArr2));
                    triggerNextPermissionRequest();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract boolean runningOnMainThread();

    public abstract void setMainSurfaceViewAspectRatio(float f);

    public void setupUnityToBePaused() {
        this.m_DeferredPauseForRunWithoutFocus = false;
        GoogleARCoreApi googleARCoreApi = this.m_ARCoreApi;
        if (googleARCoreApi != null) {
            googleARCoreApi.pauseARCore();
        }
        f1 f1Var = this.mVideoPlayerProxy;
        if (f1Var != null) {
            f1Var.e.lock();
            VideoPlayer videoPlayer = f1Var.f;
            if (videoPlayer != null) {
                if (f1Var.g == 0) {
                    videoPlayer.cancelOnPrepare();
                } else if (f1Var.i) {
                    boolean zIsPaused = videoPlayer.isPaused();
                    f1Var.h = zIsPaused;
                    if (!zIsPaused) {
                        f1Var.f.pause();
                    }
                }
            }
            f1Var.e.unlock();
        }
        AudioVolumeHandler audioVolumeHandler = this.m_AudioVolumeHandler;
        if (audioVolumeHandler != null) {
            ce3 ce3Var = audioVolumeHandler.a;
            if (ce3Var.c != null) {
                ce3Var.a.getContentResolver().unregisterContentObserver(ce3Var.c);
                ce3Var.c = null;
            }
            audioVolumeHandler.a = null;
            this.m_AudioVolumeHandler = null;
        }
        OrientationLockListener orientationLockListener = this.m_OrientationLockListener;
        if (orientationLockListener != null) {
            mg1 mg1Var = orientationLockListener.a;
            if (mg1Var.b != null) {
                mg1Var.a.getContentResolver().unregisterContentObserver(mg1Var.b);
                mg1Var.b = null;
            }
            orientationLockListener.a = null;
            this.m_OrientationLockListener = null;
        }
        mi3 mi3Var = this.m_OnBackPressedDispatcher;
        if (mi3Var != null) {
            mi3Var.c = mi3Var.a != null;
            mi3Var.unregisterOnBackPressedCallback();
        }
        if (canPauseUnity()) {
            pauseUnity();
        }
    }

    public synchronized void triggerNextPermissionRequest() {
        Iterator it;
        HashMap map = this.m_PermissionRequests;
        if (map == null || (it = map.entrySet().iterator()) == null || !it.hasNext()) {
            return;
        }
        Map.Entry entry = (Map.Entry) it.next();
        requestPermissionsFromActivity(((PermissionRequest) entry.getValue()).getPermissionNames(), ((Integer) entry.getKey()).intValue());
    }

    static {
        h12 h12Var = new h12();
        synchronized (h12Var) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler == h12Var) {
                return;
            }
            h12Var.a = defaultUncaughtExceptionHandler;
            h12Var.b = "Unknown";
            Thread.setDefaultUncaughtExceptionHandler(h12Var);
        }
    }

    private void EarlyEnableFullScreenIfEnabled() {
        Activity activity = this.mActivity;
        if (activity != null && activity.getWindow() != null && (getLaunchFullscreen() || this.mActivity.getIntent().getBooleanExtra("android.intent.extra.VR_LAUNCH", false))) {
            applyWindowUIChanges(true);
        }
        DisplayCutoutSupport.setLayoutCutoutMode(this.mActivity);
    }

    public static void UnitySendMessage(String str, String str2, String str3) {
        byte[] bytes;
        if (l62.e) {
            if (str3 == null) {
                bytes = null;
            } else {
                try {
                    bytes = str3.getBytes("UTF-8");
                } catch (UnsupportedEncodingException unused) {
                    return;
                }
            }
            nativeUnitySendMessage(str, str2, bytes);
            return;
        }
        uj2.a(5, "Native libraries not loaded - dropping message for " + str + UserDetailsUtils.UserDetailsLiterals.DOT + str2);
    }

    private void applyWindowInsets() {
        Activity activity = this.mActivity;
        if (activity == null || activity.getWindow() == null) {
            return;
        }
        runOnUiThread(new RunnableC5247d0(this));
    }

    private void applyWindowUIChanges(boolean z) {
        Activity activity = this.mActivity;
        if (activity == null || activity.getWindow() == null) {
            return;
        }
        runOnUiThread(new RunnableC5245c0(this, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyWindowUIChangesOnUiThread(boolean z) {
        this.m_LastFullScreenValue = z ? 1 : 0;
        g1.a(this.mActivity, getFrameLayout(), z, DisplayCutoutSupport.getDisplayCutoutSupport(this.mActivity));
        dispatchFrameLayoutPadding();
    }

    private ActivityInfo getActivityInfo() {
        return this.mActivity.getPackageManager().getActivityInfo(this.mActivity.getComponentName(), 128);
    }

    private int getNaturalOrientation(int i) {
        int rotation = ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay().getRotation();
        if ((rotation == 0 || rotation == 2) && i == 2) {
            return 0;
        }
        return ((rotation == 1 || rotation == 3) && i == 1) ? 0 : 1;
    }

    private float getScreenBrightness() {
        Window window = this.m_Window;
        if (window == null) {
            return 1.0f;
        }
        float f = window.getAttributes().screenBrightness;
        if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return f;
        }
        int i = Settings.System.getInt(getContext().getContentResolver(), "screen_brightness", 255);
        return PlatformSupport.PIE_SUPPORT ? (float) Math.max(0.0d, Math.min(1.0d, ((Math.log(i) * 19.811d) - 9.411d) / 100.0d)) : i / 255.0f;
    }

    private void hideStatusBar() {
        Activity activity = this.mActivity;
        if (activity != null) {
            activity.getWindow().setFlags(1024, 1024);
        }
    }

    private boolean isWindowTranslucent() {
        Activity activity = this.mActivity;
        if (activity == null) {
            return false;
        }
        TypedArray typedArrayObtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{android.R.attr.windowIsTranslucent});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    private static String loadNative(String str) {
        String strM = n30.m(str, "/libmain.so");
        try {
            try {
                try {
                    System.load(strM);
                } catch (UnsatisfiedLinkError unused) {
                    System.loadLibrary(C4664b4.i.Z);
                }
                if (NativeLoader.load(str)) {
                    l62.e = true;
                    return "";
                }
                uj2.a(6, "NativeLoader.load failure, Unity libraries were not loaded.");
                return "NativeLoader.load failure, Unity libraries were not loaded.";
            } catch (SecurityException e) {
                return logLoadLibMainError(strM, e.toString());
            }
        } catch (UnsatisfiedLinkError e2) {
            return logLoadLibMainError(strM, e2.toString());
        }
    }

    private static String logLoadLibMainError(String str, String str2) {
        String str3 = "Failed to load 'libmain.so'\n\n" + str2;
        uj2.a(6, str3);
        return str3;
    }

    private void pauseJavaAndCallUnloadCallback() {
        runOnUiThread(new RunnableC5243b0(this));
    }

    private static void preloadJavaPlugins() {
        try {
            Class.forName("com.unity3d.JavaPluginPreloader");
        } catch (ClassNotFoundException unused) {
        } catch (LinkageError e) {
            uj2.a(6, "Java class preloading failed: " + e.getMessage());
        }
    }

    private void releasePointerCapture() {
        ys1 ys1Var = this.m_Cursor;
        ys1Var.getClass();
        if (PlatformSupport.OREO_SUPPORT) {
            ys1Var.a.runOnUiThread(new sp1(ys1Var, 1));
        }
    }

    private void requestPointerCapture() {
        ys1 ys1Var = this.m_Cursor;
        ys1Var.getClass();
        if (PlatformSupport.OREO_SUPPORT) {
            ys1Var.a.runOnUiThread(new sp1(ys1Var, 0));
        }
    }

    private void requestUserAuthorization(String str, long j) {
        Activity activity;
        if (str == null || str.isEmpty() || (activity = this.mActivity) == null) {
            return;
        }
        UnityPermissions.requestUserPermissions(activity, new String[]{str}, j != 0 ? new C5275r0(j, this) : null);
    }

    private void setBackButtonLeavesApp(boolean z) {
        mi3 mi3Var = this.m_OnBackPressedDispatcher;
        if (mi3Var != null) {
            if (z) {
                mi3Var.unregisterOnBackPressedCallback();
            } else {
                mi3Var.registerOnBackPressedCallback();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldRunWithoutFocus() {
        return MultiWindowSupport.isInMultiWindowMode(this.mActivity) || this.m_RunWithoutFocus;
    }

    private void startActivityIndicator(int i) {
        postOnUiThread(new RunnableC5249e0(this, i));
    }

    private void stopActivityIndicator() {
        postOnUiThread(new RunnableC5251f0());
    }

    private boolean supportsWindowInsetController() {
        return PlatformSupport.RED_VELVET_CAKE_SUPPORT;
    }

    private void swapViews(View view, View view2) {
        boolean z;
        ViewParent parent;
        if (this.mState.c) {
            z = false;
        } else {
            setupUnityToBePaused();
            z = true;
        }
        FrameLayout frameLayout = getFrameLayout();
        if (frameLayout != null) {
            if (view != null && (parent = view.getParent()) != frameLayout) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view);
                }
                frameLayout.addView(view);
                frameLayout.bringChildToFront(view);
                view.setVisibility(0);
            }
            if (view2 != null && view2.getParent() == frameLayout) {
                view2.setVisibility(8);
                frameLayout.removeView(view2);
            }
        }
        if (z) {
            setupUnityToBeResumed();
        }
    }

    private static void unloadNative() {
        if (l62.e) {
            if (!NativeLoader.unload()) {
                throw new UnsatisfiedLinkError("Unable to unload libraries from libmain.so");
            }
            l62.e = false;
        }
    }

    public boolean canPauseUnity() {
        l62 l62Var = this.mState;
        return l62Var.b || !l62Var.c;
    }

    public boolean canResumeUnity() {
        boolean zShouldRunWithoutFocus = this.mActivity != null ? shouldRunWithoutFocus() : false;
        l62 l62Var = this.mState;
        if (l62.e) {
            return ((!zShouldRunWithoutFocus && !l62Var.a) || l62Var.c || l62Var.b) ? false : true;
        }
        l62Var.getClass();
        return false;
    }

    public void configurationChanged(Configuration configuration) {
        int iDiff = this.prevConfig.diff(configuration);
        if ((iDiff & 256) != 0 || (iDiff & 1024) != 0 || (iDiff & 2048) != 0 || (iDiff & 128) != 0) {
            nativeHidePreservedContent();
        }
        this.prevConfig = new Configuration(configuration);
        f1 f1Var = this.mVideoPlayerProxy;
        if (f1Var != null) {
            f1Var.e.lock();
            VideoPlayer videoPlayer = f1Var.f;
            if (videoPlayer != null) {
                videoPlayer.updateVideoLayout();
            }
            f1Var.e.unlock();
        }
        UnityAccessibilityDelegate unityAccessibilityDelegate = this.m_AccessibilityDelegate;
        if (unityAccessibilityDelegate != null) {
            unityAccessibilityDelegate.a(configuration);
        }
    }

    public void destroy() {
        Camera2Wrapper camera2Wrapper = this.m_Camera2Wrapper;
        if (camera2Wrapper != null) {
            camera2Wrapper.b();
            this.m_Camera2Wrapper = null;
        }
        HFPStatus hFPStatus = this.m_HFPStatus;
        if (hFPStatus != null) {
            hFPStatus.b();
            this.m_HFPStatus = null;
        }
        FmodAndroidAudioManager fmodAndroidAudioManager = this.m_FmodAndroidAudioManager;
        if (fmodAndroidAudioManager != null) {
            fmodAndroidAudioManager.setActivity(null);
        }
        di3 di3Var = this.m_NetworkConnectivity;
        if (di3Var != null) {
            ConnectivityManager connectivityManager = di3Var.a;
            if (connectivityManager != null) {
                connectivityManager.unregisterNetworkCallback(di3Var.c);
            }
            this.m_NetworkConnectivity = null;
        }
        mi3 mi3Var = this.m_OnBackPressedDispatcher;
        if (mi3Var != null) {
            mi3Var.unregisterOnBackPressedCallback();
            this.m_OnBackPressedDispatcher = null;
        }
        this.mQuitting = true;
        if (!this.mState.c) {
            setupUnityToBePaused();
        }
        cleanupResourcesForDestroy();
        unloadNative();
    }

    public void executeMainThreadJobs() {
        while (true) {
            Runnable runnable = (Runnable) this.m_MainThreadJobs.poll();
            if (runnable == null) {
                return;
            } else {
                runnable.run();
            }
        }
    }

    public void finish() {
        Activity activity = this.mActivity;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        this.mActivity.finish();
    }

    public Activity getActivity() {
        return this.mActivity;
    }

    public ApplicationInfo getApplicationInfo() {
        return this.mContext.getPackageManager().getApplicationInfo(this.mContext.getPackageName(), 128);
    }

    public String getClipboardText() {
        ClipData primaryClip = this.m_ClipboardManager.getPrimaryClip();
        return primaryClip != null ? primaryClip.getItemAt(0).coerceToText(this.mContext).toString() : "";
    }

    public Context getContext() {
        return this.mContext;
    }

    public pf3 getContextType() {
        return this.mContextType;
    }

    public FrameLayout getFrameLayout() {
        return this.m_FrameLayout;
    }

    public String getKeyboardLayout() {
        InputMethodSubtype currentInputMethodSubtype = ((InputMethodManager) this.mContext.getSystemService("input_method")).getCurrentInputMethodSubtype();
        if (currentInputMethodSubtype == null) {
            return null;
        }
        String languageTag = currentInputMethodSubtype.getLanguageTag();
        return (languageTag == null || languageTag.equals("")) ? h50.i(currentInputMethodSubtype.getMode(), " ", currentInputMethodSubtype.getExtraValue()) : languageTag;
    }

    public String getLaunchURL() {
        Uri data;
        Activity activity = this.mActivity;
        if (activity == null || (data = activity.getIntent().getData()) == null) {
            return null;
        }
        return data.toString();
    }

    public int getNetworkConnectivity() {
        di3 di3Var = this.m_NetworkConnectivity;
        if (di3Var != null) {
            return di3Var.b;
        }
        di3 di3Var2 = new di3(this.mContext);
        this.m_NetworkConnectivity = di3Var2;
        return di3Var2.b;
    }

    public String getNetworkProxySettings(String str) {
        String str2;
        String str3;
        if (!str.startsWith("http:")) {
            if (str.startsWith("https:")) {
                str2 = "https.proxyHost";
                str3 = "https.proxyPort";
            }
            return null;
        }
        str2 = "http.proxyHost";
        str3 = "http.proxyPort";
        String property = System.getProperties().getProperty(str2);
        if (property != null && !"".equals(property)) {
            StringBuilder sb = new StringBuilder(property);
            String property2 = System.getProperties().getProperty(str3);
            if (property2 != null && !"".equals(property2)) {
                sb.append(":");
                sb.append(property2);
            }
            String property3 = System.getProperties().getProperty("http.nonProxyHosts");
            if (property3 != null && !"".equals(property3)) {
                sb.append('\n');
                sb.append(property3);
            }
            return sb.toString();
        }
        return null;
    }

    public String getState() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mState.toString() + "\n");
        sb.append(String.format("m_AudioVolumeHandler = %b", this.m_AudioVolumeHandler).concat("\n"));
        sb.append(String.format("m_OrientationLockListener = %b", this.m_OrientationLockListener).concat("\n"));
        return sb.toString();
    }

    public void handleDeferredPauseOnSurfaceDestroyed() {
        if (this.m_DeferredPauseForRunWithoutFocus) {
            setupUnityToBePaused();
        }
    }

    public void initialize(FrameLayout frameLayout, String str) {
        if (frameLayout != null) {
            this.m_FrameLayout = frameLayout;
            EarlyEnableFullScreenIfEnabled();
        }
        Configuration configuration = this.mContext.getResources().getConfiguration();
        this.prevConfig = configuration;
        this.mNaturalOrientation = getNaturalOrientation(configuration.orientation);
        if (this.mActivity != null && getSplashEnabled()) {
            Context context = this.mContext;
            int[] iArr = new int[3];
            System.arraycopy(fs1.b, 0, iArr, 0, 3);
            ac1 ac1Var = new ac1(context, iArr[getSplashMode()]);
            this.m_SplashScreen = ac1Var;
            this.m_FrameLayout.addView(ac1Var);
            this.m_FrameLayout.bringChildToFront(this.m_SplashScreen);
        }
        preloadJavaPlugins();
        String strLoadNative = loadNative(getUnityNativeLibraryPath(this.mContext));
        if (!l62.e) {
            uj2.a(6, "Your hardware does not support this application.");
            AlertDialog alertDialogCreate = new AlertDialog.Builder(this.mContext).setTitle("Failure to initialize!").setPositiveButton("OK", new DialogInterfaceOnClickListenerC5253g0(this)).setMessage("Your hardware does not support this application.\n\n" + strLoadNative + "\n\n Press OK to quit.").create();
            alertDialogCreate.setCancelable(false);
            alertDialogCreate.show();
            return;
        }
        initJni(this.mContext, this.mContextType.a, str);
        this.mState.d = true;
        this.mQuitting = false;
        developmentPlayerInitialize();
        hideStatusBar();
        this.m_TelephonyManager = (TelephonyManager) this.mContext.getSystemService("phone");
        this.m_ClipboardManager = (ClipboardManager) this.mContext.getSystemService("clipboard");
        this.m_Camera2Wrapper = new Camera2Wrapper(this.mContext);
        this.m_HFPStatus = new HFPStatus(this.mContext);
        this.m_Cursor = new ys1(this);
        FmodAndroidAudioManager fmodAndroidAudioManager = FmodAndroidAudioManager.getInstance();
        this.m_FmodAndroidAudioManager = fmodAndroidAudioManager;
        fmodAndroidAudioManager.setActivity(this.mActivity);
        this.m_OnBackPressedDispatcher = C5276s.a(getContext(), 1, new RunnableC5255h0(this));
        Activity activity = this.mActivity;
        if (activity != null) {
            this.m_Window = activity.getWindow();
        }
    }

    public boolean initializeGoogleAr() {
        if (this.m_ARCoreApi != null || this.mActivity == null || !getARCoreEnabled()) {
            return false;
        }
        GoogleARCoreApi googleARCoreApi = new GoogleARCoreApi();
        this.m_ARCoreApi = googleARCoreApi;
        googleARCoreApi.initializeARCore(this.mActivity);
        if (this.mState.c) {
            return false;
        }
        this.m_ARCoreApi.resumeARCore();
        return false;
    }

    public boolean injectEvent(InputEvent inputEvent, int i) {
        if (l62.e) {
            return nativeInjectEvent(inputEvent, i);
        }
        return false;
    }

    public void invokeOnMainThread(Runnable runnable) {
        if (l62.e) {
            if (runningOnUIThread() || !runningOnMainThread()) {
                this.m_MainThreadJobs.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    public boolean isFinishing() {
        if (this.mQuitting) {
            return true;
        }
        Activity activity = this.mActivity;
        if (activity != null) {
            this.mQuitting = activity.isFinishing();
        }
        return this.mQuitting;
    }

    public boolean isNativeInitialized() {
        return l62.e && this.mState.d;
    }

    public boolean isUaaLUseCase() {
        String callingPackage;
        Activity activity = this.mActivity;
        return (activity == null || (callingPackage = activity.getCallingPackage()) == null || !callingPackage.equals(this.mContext.getPackageName())) ? false : true;
    }

    public void onPause() {
        MultiWindowSupport.saveMultiWindowMode(this.mActivity);
        if (shouldRunWithoutFocus()) {
            this.m_DeferredPauseForRunWithoutFocus = true;
        } else {
            setupUnityToBePaused();
        }
    }

    public void pauseUnity() {
        l62 l62Var = this.mState;
        l62Var.b = false;
        l62Var.c = true;
    }

    public void postOnUiThread(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    public void reportError(String str, String str2) {
        uj2.a(6, str + ": " + str2);
    }

    public void reportFullyDrawn() {
        this.mActivity.reportFullyDrawn();
    }

    public void requestPermissionsFromActivity(String[] strArr, int i) {
        this.mActivity.requestPermissions(strArr, i);
    }

    public void resumeUnity() {
        this.mState.b = true;
    }

    public void runOnAnonymousThread(Runnable runnable) {
        new Thread(runnable).start();
    }

    public void runOnUiThread(Runnable runnable) {
        Activity activity = this.mActivity;
        if (activity != null) {
            activity.runOnUiThread(runnable);
        } else if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            this.mHandler.post(runnable);
        } else {
            runnable.run();
        }
    }

    public void saveFocusState(boolean z) {
        this.mState.a = z;
    }

    public void setAccessibilityDelegate(UnityAccessibilityDelegate unityAccessibilityDelegate) {
        this.m_AccessibilityDelegate = unityAccessibilityDelegate;
    }

    public void setClipboardText(String str) {
        this.m_ClipboardManager.setPrimaryClip(ClipData.newPlainText("Text", str));
    }

    public void setLaunchURL(Uri uri) {
        invokeOnMainThread(new RunnableC5263l0(uri != null ? uri.toString() : null));
    }

    public void setRunWithoutFocus(boolean z) {
        runOnUiThread(new RunnableC5261k0(this, z));
    }

    public void setupUnityToBeResumed() {
        GoogleARCoreApi googleARCoreApi = this.m_ARCoreApi;
        if (googleARCoreApi != null) {
            googleARCoreApi.resumeARCore();
        }
        this.mState.c = false;
        f1 f1Var = this.mVideoPlayerProxy;
        if (f1Var != null) {
            f1Var.e.lock();
            VideoPlayer videoPlayer = f1Var.f;
            if (videoPlayer != null && f1Var.i && !f1Var.h) {
                videoPlayer.start();
            }
            f1Var.e.unlock();
        }
        if (canResumeUnity()) {
            resumeUnity();
        }
        if (this.m_AudioVolumeHandler == null) {
            this.m_AudioVolumeHandler = new AudioVolumeHandler(this.mContext);
        }
        if (this.m_OrientationLockListener == null && l62.e) {
            this.m_OrientationLockListener = new OrientationLockListener(this.mContext);
        }
        mi3 mi3Var = this.m_OnBackPressedDispatcher;
        if (mi3Var == null || !mi3Var.c) {
            return;
        }
        mi3Var.registerOnBackPressedCallback();
    }

    public boolean shouldReportFullyDrawn() {
        if (this.mActivity == null) {
            return false;
        }
        return getAutoReportFullyDrawnEnabled();
    }

    public boolean shouldSetGameState() {
        return (!PlatformSupport.TIRAMISU_SUPPORT || this.mActivity == null || isUaaLUseCase() || !getAutoSetGameStateEnabled() || UnityGameManager.getGameManager(currentContext) == null) ? false : true;
    }

    public boolean showVideoPlayer(String str, int i, int i2, int i3, boolean z, int i4, int i5) {
        if (this.mVideoPlayerProxy == null) {
            this.mVideoPlayerProxy = new f1(this);
        }
        f1 f1Var = this.mVideoPlayerProxy;
        Context context = this.mContext;
        C5265m0 c5265m0 = new C5265m0(this);
        f1Var.e.lock();
        f1Var.c = c5265m0;
        f1Var.b = context;
        f1Var.d.drainPermits();
        f1Var.g = 2;
        f1Var.runOnUiThread(new b1(f1Var, str, i, i2, i3, z, i4, i5));
        boolean z2 = false;
        try {
            f1Var.e.unlock();
            f1Var.d.acquire();
            f1Var.e.lock();
            if (f1Var.g != 2) {
                z2 = true;
            }
        } catch (InterruptedException unused) {
        }
        f1Var.runOnUiThread(new c1(f1Var));
        if (!z2 || f1Var.g == 3) {
            f1Var.runOnUiThread(new e1(f1Var));
        } else {
            f1Var.runOnUiThread(new d1(f1Var));
        }
        f1Var.e.unlock();
        if (z2) {
            runOnUiThread(new RunnableC5267n0(this));
        }
        return z2;
    }

    public void shutdown() {
        this.mState.d = false;
    }

    public boolean skipPermissionsDialog() {
        Activity activity = this.mActivity;
        if (activity != null) {
            return UnityPermissions.skipPermissionsDialog(activity);
        }
        return false;
    }

    public boolean startOrientationListener(int i) {
        if (this.mOrientationListener != null) {
            uj2.a(5, "Orientation Listener already started.");
            return false;
        }
        C5269o0 c5269o0 = new C5269o0(this, this.mContext, i);
        this.mOrientationListener = c5269o0;
        if (c5269o0.canDetectOrientation()) {
            this.mOrientationListener.enable();
            return true;
        }
        uj2.a(5, "Orientation Listener cannot detect orientation.");
        return false;
    }

    public boolean stopOrientationListener() {
        OrientationEventListener orientationEventListener = this.mOrientationListener;
        if (orientationEventListener == null) {
            uj2.a(5, "Orientation Listener was not started.");
            return false;
        }
        orientationEventListener.disable();
        this.mOrientationListener = null;
        return true;
    }

    public void toggleGyroscopeSensor(boolean z) {
        SensorManager sensorManager = (SensorManager) this.mContext.getSystemService("sensor");
        Sensor defaultSensor = sensorManager.getDefaultSensor(11);
        C5271p0 c5271p0 = this.m_FakeListener;
        if (z) {
            sensorManager.registerListener(c5271p0, defaultSensor, 1);
        } else {
            sensorManager.unregisterListener(c5271p0);
        }
    }

    public UnityPlayer(Context context, pf3 pf3Var, IUnityPlayerLifecycleEvents iUnityPlayerLifecycleEvents) {
        String strSubstring;
        this.mInitialScreenOrientation = -1;
        l62 l62Var = new l62();
        l62Var.a = false;
        l62Var.b = false;
        l62Var.c = true;
        l62Var.d = false;
        this.mState = l62Var;
        this.mOrientationListener = null;
        this.mNaturalOrientation = -1;
        this.m_AddPhoneCallListener = false;
        this.m_PhoneCallListener = new a();
        this.m_ARCoreApi = null;
        this.m_FakeListener = new C5271p0();
        this.m_Camera2Wrapper = null;
        this.m_HFPStatus = null;
        this.m_AudioVolumeHandler = null;
        this.m_OrientationLockListener = null;
        this.m_FmodAndroidAudioManager = null;
        this.m_NetworkConnectivity = null;
        this.m_OnBackPressedDispatcher = null;
        this.m_Cursor = null;
        this.m_UnityPlayerLifecycleEvents = null;
        this.m_LastScreenBrightness = Float.NaN;
        this.m_AccessibilityDelegate = null;
        this.m_LastFullScreenValue = -1;
        this.m_DeferredPauseForRunWithoutFocus = false;
        this.m_MainThreadJobs = new ConcurrentLinkedQueue();
        this.m_UIThread = Thread.currentThread();
        this.mContext = context;
        this.mContextType = pf3Var;
        this.m_RunWithoutFocus = getMetaDataValue(RUN_WITHOUT_FOCUS);
        this.m_UnityPlayerLifecycleEvents = iUnityPlayerLifecycleEvents == null ? this : iUnityPlayerLifecycleEvents;
        String unityNativeLibraryPath = getUnityNativeLibraryPath(context);
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler instanceof h12) {
            h12 h12Var = (h12) defaultUncaughtExceptionHandler;
            int i = -1;
            int i2 = -1;
            while (true) {
                int iIndexOf = unityNativeLibraryPath.indexOf(47, i + 1);
                if (iIndexOf == -1) {
                    break;
                }
                i2 = i;
                i = iIndexOf;
            }
            if (i2 < 0) {
                strSubstring = "Unknown";
            } else {
                strSubstring = unityNativeLibraryPath.substring(i2 + 1);
            }
            h12Var.b = strSubstring;
        }
        currentContext = context;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.mActivity = activity;
            currentActivity = activity;
            this.mInitialScreenOrientation = activity.getRequestedOrientation();
        }
    }

    private String GetGlViewContentDescription(Context context) {
        return context.getResources().getString(context.getResources().getIdentifier("game_view_content_description", "string", context.getPackageName()));
    }

    public static float clamp(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchFrameLayoutPadding() {
        View viewForPadding = getViewForPadding();
        if (l62.e && viewForPadding != null) {
            nativeViewPaddingChanged(0, viewForPadding.getPaddingLeft(), viewForPadding.getPaddingTop(), viewForPadding.getPaddingRight(), viewForPadding.getPaddingBottom());
        }
    }

    private boolean getARCoreEnabled() {
        try {
            return getApplicationInfo().metaData.getBoolean(ARCORE_ENABLE_METADATA_NAME);
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean getLaunchFullscreen() {
        try {
            return getApplicationInfo().metaData.getBoolean(LAUNCH_FULLSCREEN);
        } catch (Exception unused) {
            return false;
        }
    }

    private String getProcessName() {
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.mContext.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == iMyPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    private static String getUnityNativeLibraryPath(Context context) {
        return context.getApplicationInfo().nativeLibraryDir;
    }

    private boolean runningOnUIThread() {
        if (Thread.currentThread() == this.m_UIThread) {
            return true;
        }
        return false;
    }

    public boolean addViewToPlayer(View view, boolean z) {
        View view2;
        boolean z2;
        boolean z3;
        boolean z4;
        FrameLayout frameLayout = getFrameLayout();
        boolean z5 = false;
        if (frameLayout == null) {
            return false;
        }
        View view3 = getView();
        if (z) {
            view2 = view3;
        } else {
            view2 = null;
        }
        swapViews(view, view2);
        if (view.getParent() == frameLayout) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && view3.getParent() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (view3.getParent() == frameLayout) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z2 && (z3 || z4)) {
            z5 = true;
        }
        if (!z5) {
            if (!z2) {
                uj2.a(6, "addViewToPlayer: Failure adding view to hierarchy");
            }
            if (!z3 && !z4) {
                uj2.a(6, "addViewToPlayer: Failure removing old view from hierarchy");
            }
        }
        return z5;
    }

    public void applySurfaceViewSettings(SurfaceView surfaceView) {
        if (isWindowTranslucent()) {
            surfaceView.getHolder().setFormat(-3);
            surfaceView.setZOrderOnTop(true);
        } else {
            surfaceView.getHolder().setFormat(-1);
        }
    }

    public void disableStaticSplashScreen() {
        if (getFrameLayout() == null) {
            return;
        }
        runOnUiThread(new RunnableC5257i0(this));
    }

    public boolean getAutoReportFullyDrawnEnabled() {
        try {
            return getApplicationInfo().metaData.getBoolean(AUTO_REPORT_FULLY_DRAWN_ENABLE_METADATA_NAME);
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean getAutoSetGameStateEnabled() {
        try {
            return getApplicationInfo().metaData.getBoolean(AUTO_SET_GAME_STATE_ENABLE_METADATA_NAME);
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean getMetaDataValue(String str) {
        try {
            return getApplicationInfo().metaData.getBoolean(str);
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean getSplashEnabled() {
        try {
            return getApplicationInfo().metaData.getBoolean(SPLASH_ENABLE_METADATA_NAME);
        } catch (Exception unused) {
            return false;
        }
    }

    public int getSplashMode() {
        try {
            return getApplicationInfo().metaData.getInt(SPLASH_MODE_METADATA_NAME);
        } catch (Exception unused) {
            return 0;
        }
    }

    public int getUaaLLaunchProcessType() {
        String processName = getProcessName();
        if (processName != null && !processName.equals(this.mContext.getPackageName())) {
            return 1;
        }
        return 0;
    }

    public void newIntent(Intent intent) {
        setLaunchURL(intent.getData());
    }

    public void onStart() {
        if (!shouldRunWithoutFocus()) {
            return;
        }
        setupUnityToBeResumed();
    }

    public void onStop() {
        if (!shouldRunWithoutFocus()) {
            return;
        }
        setupUnityToBePaused();
    }

    public void pause() {
        setupUnityToBePaused();
    }

    public void removeViewFromPlayer(View view) {
        boolean z;
        FrameLayout frameLayout = getFrameLayout();
        if (frameLayout != null) {
            View view2 = getView();
            swapViews(view2, view);
            ViewParent parent = view.getParent();
            boolean z2 = false;
            if (parent == null) {
                z = true;
            } else {
                z = false;
            }
            if (view2.getParent() == frameLayout) {
                z2 = true;
            }
            if (!z || !z2) {
                if (!z) {
                    uj2.a(6, "removeViewFromPlayer: Failure removing view from hierarchy");
                }
                if (!z2) {
                    uj2.a(6, "removeViewFromPlayer: Failure adding old view to hierarchy");
                }
            }
        }
    }

    public void resume() {
        setupUnityToBeResumed();
    }

    public void unload() {
        nativeApplicationUnload();
    }

    public void windowFocusChanged(boolean z) {
        Activity activity;
        saveFocusState(z);
        if (z && this.m_LastFullScreenValue != -1 && (activity = this.mActivity) != null && activity.getWindow() != null) {
            boolean z2 = true;
            if (this.m_LastFullScreenValue != 1) {
                z2 = false;
            }
            applyWindowUIChangesOnUiThread(z2);
        }
        if (handleFocus(z) && canResumeUnity()) {
            resumeUnity();
        }
    }

    public boolean injectEvent(InputEvent inputEvent) {
        return injectEvent(inputEvent, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invokeOnMainThread(b bVar) {
        if (isFinishing()) {
            return;
        }
        invokeOnMainThread((Runnable) bVar);
    }

    public void initialize(FrameLayout frameLayout) {
        initialize(frameLayout, "");
    }
}
