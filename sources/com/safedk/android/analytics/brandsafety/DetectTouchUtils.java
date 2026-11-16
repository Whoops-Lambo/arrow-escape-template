package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public class DetectTouchUtils {
    private static final String a = "DetectTouchUtils";
    private static final HashMap<String, w> b = new HashMap<>();
    private static final HashMap<String, w> c = new HashMap<>();
    private static ExecutorService d = null;

    public static void a() {
        d = Executors.newSingleThreadExecutor();
    }

    public static w a(String str) {
        Logger.d(a, "getLastTouchEvent is latestTouchEventBySdkMap contains ", str, "? ", Boolean.valueOf(b.containsKey(str)), ", map = ", b);
        if (b.containsKey(str) && b.get(str) != null) {
            Logger.d(a, "getLastTouchEvent returns ", b.get(str));
            return b.get(str);
        }
        return null;
    }

    public static w a(String str, String str2) {
        return c.get(str + "_" + str2);
    }

    public static void activityOnTouch(Activity activityObj, String sdkPackageName, MotionEvent me) {
        try {
            if (me.getAction() != 0) {
                return;
            }
            Logger.d(a, "activity on touch started, sdk: ", sdkPackageName, ", activity: ", activityObj, ", motion event: ", me, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            if ((0 != me.getEventTime()) && me.getActionMasked() != 2) {
                a(activityObj != null ? BrandSafetyUtils.a((Object) activityObj) : null, sdkPackageName, null);
            }
        } catch (Throwable th) {
            Logger.d(a, "error in activity on touch", th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0167 A[Catch: Throwable -> 0x0170, TryCatch #0 {Throwable -> 0x0170, blocks: (B:3:0x0003, B:6:0x000a, B:8:0x0031, B:10:0x0035, B:12:0x003f, B:14:0x0045, B:49:0x0167, B:50:0x016c, B:15:0x0068, B:17:0x0077, B:19:0x007b, B:20:0x0090, B:22:0x0094, B:23:0x00a9, B:25:0x00b1, B:27:0x00b7, B:29:0x00bf, B:37:0x00f1, B:39:0x011c, B:41:0x0123, B:31:0x00cf, B:33:0x00d7, B:35:0x00dd, B:42:0x013e, B:44:0x0158, B:46:0x015f), top: B:55:0x0003 }] */
    public static void viewOnTouch(String sdkPackage, View view, MotionEvent me) {
        String str;
        try {
            if (me.getAction() != 0) {
                return;
            }
            Logger.d(a, "view on touch, started, sdkPackage = ", sdkPackage, ", View = ", view, ", MotionEvent = ", me);
            if (sdkPackage.equals(com.safedk.android.utils.h.a) && (view instanceof ViewGroup)) {
                String strA = BrandSafetyUtils.a(view);
                String strM = NativeFinder.m(strA);
                if (strM == null) {
                    strM = BannerFinder.r(strA);
                }
                if (strM != null) {
                    sdkPackage = strM;
                    Logger.d(a, "view on touch, translate Max native ad view to sdk: ", sdkPackage, ", view: ", view, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                } else {
                    Logger.d(a, "view on touch, failed to translate Max native ad view to sdk, view: ", view);
                }
            } else if (view instanceof WebView) {
                Logger.d(a, "web view on touch, sdk: ", sdkPackage, ", view: ", view);
            } else if (view instanceof ViewGroup) {
                Logger.d(a, "view group on touch, sdk: ", sdkPackage, ", view: ", view);
            } else {
                if ((!CreativeInfoManager.a(sdkPackage, AdNetworkConfiguration.ALLOW_FULL_SCREEN_MULTI_CLICK_URL_UPDATES, false) || view.getTag() == null || CreativeInfoManager.a(sdkPackage, AdNetworkConfiguration.FULLSCREEN_NEXT_BUTTON_TAG, (String) null) == null || !view.getTag().equals(CreativeInfoManager.a(sdkPackage, AdNetworkConfiguration.FULLSCREEN_NEXT_BUTTON_TAG, (String) null))) && (CreativeInfoManager.a(sdkPackage, AdNetworkConfiguration.FULL_SCREEN_MULTI_VIEW_TAG_AD_SPECIFIC, (String) null) == null || view.getTag() == null || !com.safedk.android.utils.n.b(view.getTag().toString(), CreativeInfoManager.a(sdkPackage, AdNetworkConfiguration.FULL_SCREEN_MULTI_VIEW_TAG_AD_SPECIFIC, (String) null)))) {
                    Object[] objArr = new Object[6];
                    objArr[0] = "view on touch, sdk: ";
                    objArr[1] = sdkPackage;
                    objArr[2] = ", view: ";
                    objArr[3] = view;
                    objArr[4] = ", tag : ";
                    objArr[5] = view.getTag() != null ? view.getTag() : "";
                    Logger.d(a, objArr);
                } else {
                    Object[] objArr2 = new Object[8];
                    objArr2[0] = "view on touch, custom view : (";
                    objArr2[1] = view.getClass().getName();
                    objArr2[2] = ") on touch, sdk: ";
                    objArr2[3] = sdkPackage;
                    objArr2[4] = ", view: ";
                    objArr2[5] = view;
                    objArr2[6] = ", tag : ";
                    objArr2[7] = view.getTag() != null ? view.getTag() : "";
                    Logger.d(a, objArr2);
                    str = (String) view.getTag();
                    SafeDK.getInstance().z().a(sdkPackage, view, System.currentTimeMillis());
                }
                a(view != null ? BrandSafetyUtils.a(view) : null, sdkPackage, str);
            }
            str = null;
            a(view != null ? BrandSafetyUtils.a(view) : null, sdkPackage, str);
        } catch (Throwable th) {
            Logger.d(a, "error in view on touch", th);
        }
    }

    public static void a(final String str, final String str2, final String str3) {
        if (com.safedk.android.utils.n.c() && d != null) {
            d.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.DetectTouchUtils.1
                @Override // java.lang.Runnable
                public void run() {
                    DetectTouchUtils.c(str, str2, str3);
                }
            });
        } else {
            c(str, str2, str3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, String str2, String str3) {
        w wVar = new w(Long.valueOf(SystemClock.elapsedRealtime()), Long.valueOf(System.currentTimeMillis()), str, str3);
        b.put(str2, wVar);
        Logger.d(a, "Set latest touch event, setting sdk: ", str2, ", details: ", wVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (str != null) {
            String str4 = str2 + "_" + str;
            c.put(str4, wVar);
            Logger.d(a, "Set latest touch event, setting key: ", str4, ", details: ", wVar);
            if (com.safedk.android.utils.h.o.equals(str2)) {
                BannerFinder.a(wVar);
            }
        }
    }

    public static void viewChangedByExternalLib(ViewGroup viewGroup, View view) {
        try {
            Logger.d(a, "view on view group add view, started, viewGroup = ", viewGroup, ", view = ", view.getClass().getCanonicalName());
            Activity activityA = com.safedk.android.utils.o.a(viewGroup);
            if (activityA != null) {
                Logger.d(a, "view on view group add view, started, activity = ", activityA);
                if (BrandSafetyUtils.d(activityA.getClass()) && view.getClass().getCanonicalName().toLowerCase().contains("com.braze.ui.inappmessage")) {
                    if (SafeDK.getInstance() != null && SafeDK.getInstance().z() != null) {
                        String strA = BrandSafetyUtils.a((Class) activityA.getClass());
                        Logger.d(a, "view on view group add view, activity = ", activityA, " is an ad inter activity and the newly added view is of an external lib. requestNoSampling will be invoked for sdk ", strA);
                        SafeDK.getInstance().z().a(strA, (String) null, false);
                    }
                } else {
                    Logger.d(a, "view on view group add view, activity = ", activityA, " is not an ad inter activity, skipping");
                }
            }
        } catch (Throwable th) {
            Logger.d(a, "error in on view group add view", th);
        }
    }
}
