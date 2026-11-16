package com.bytedance.sdk.openadsdk.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Picture;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class gbb {
    private static int ahm = -1;
    private static int ct = -1;
    private static float kgy = -1.0f;
    private static Boolean kus = null;
    private static int noq = -1;
    private static ViewConfiguration nu = null;
    private static int rz = -1;
    private static float uq = -1.0f;
    private static int yo = -1;
    private static final Point fi = new Point();
    private static int gf = -1;
    private static int ra = -1;
    private static int at = -1;
    private static float twf = -1.0f;
    private static final Object vs = new Object();
    private static boolean dg = true;

    private static ArrayList<Integer> ahm(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i = width * height;
            int[] iArr = new int[i];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = iArr[i2];
                arrayList.add(Integer.valueOf(Color.rgb((16711680 & i3) >> 16, (65280 & i3) >> 8, i3 & 255)));
            }
            return arrayList;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "bscYgQqweg==", "XOs5pQq/fdKST+dUlBSs", 1134);
            return null;
        }
    }

    public static float gf(Context context) {
        kgy(context, true);
        return kgy;
    }

    public static int kgy(Bitmap bitmap) {
        try {
            ArrayList<Integer> arrayListAhm = ahm(bitmap);
            if (arrayListAhm == null) {
                return -1;
            }
            HashMap map = new HashMap();
            int size = arrayListAhm.size();
            int iIntValue = 0;
            int i = 0;
            while (i < size) {
                Integer num = arrayListAhm.get(i);
                i++;
                Integer num2 = num;
                if (map.containsKey(num2)) {
                    Integer numValueOf = Integer.valueOf(((Integer) map.get(num2)).intValue() + 1);
                    map.remove(num2);
                    map.put(num2, numValueOf);
                } else {
                    map.put(num2, 1);
                }
            }
            int i2 = 0;
            for (Map.Entry entry : map.entrySet()) {
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (i2 < iIntValue2) {
                    iIntValue = ((Integer) entry.getKey()).intValue();
                    i2 = iIntValue2;
                }
            }
            if (iIntValue == 0) {
                return -1;
            }
            return (int) ((i2 / ((bitmap.getWidth() * bitmap.getHeight()) * 1.0f)) * 100.0f);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "bscYgQqweg==", "XOs5tgywZtWwT8VeiR+0", 1107);
            return -1;
        }
    }

    public static boolean um(Context context) {
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
            String string = identifier > 0 ? resources.getString(identifier) : null;
            return (string == null || TextUtils.isEmpty(string)) ? false : true;
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "bscYgQqweg==", "U+8+sQqvecuBU/RImB61PHr6HpQOr3zJhw==", 866);
            return false;
        }
    }

    public static boolean ct(Activity activity) {
        DisplayCutout displayCutout;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
                if (rootWindowInsets != null) {
                    displayCutout = rootWindowInsets.getDisplayCutout();
                    dg = false;
                } else {
                    displayCutout = null;
                }
                if (displayCutout != null) {
                    return true;
                }
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "bscYgQqweg==", "Uv0MmweuZs6Eev9cnz+vPFjm", 758);
                com.bytedance.sdk.component.utils.sx.rz("UIUtils", e.getMessage());
            }
        }
        return false;
    }

    public static boolean dg(Context context) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 32)).booleanValue();
        } catch (ClassNotFoundException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "bscYgQqweg==", "U+8+uwyoas+hXuFUmh4=", 839);
            return false;
        } catch (NoSuchMethodException e2) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "bscYgQqweg==", "U+8+uwyoas+hXuFUmh4=", 840);
            return false;
        } catch (Exception e3) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e3, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "bscYgQqweg==", "U+8+uwyoas+hXuFUmh4=", 841);
            return false;
        }
    }

    public static void noq(View view) {
        if (view == null) {
            return;
        }
        kgy(view, 0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.gbb.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                onAnimationEnd(animator);
            }
        });
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void rz(final com.bytedance.sdk.openadsdk.core.model.ioy ioyVar, String str, String str2, final Bitmap bitmap, final String str3, final long j) {
        if (bitmap != null) {
            try {
                if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
                    com.bytedance.sdk.openadsdk.uq.rz.kgy(System.currentTimeMillis(), ioyVar, str, str2, new com.bytedance.sdk.openadsdk.dg.ahm.kgy() { // from class: com.bytedance.sdk.openadsdk.utils.gbb.4
                        @Override // com.bytedance.sdk.openadsdk.dg.ahm.kgy, com.bytedance.sdk.openadsdk.dg.ahm.ahm
                        public JSONObject rz() {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                int iKgy = gbb.kgy(bitmap);
                                jSONObject.put("url", str3);
                                long j2 = j;
                                if (j2 != -1) {
                                    jSONObject.put("page_id", j2);
                                }
                                jSONObject.put("render_type", "h5");
                                jSONObject.put("render_type_2", 0);
                                jSONObject.put("is_blank", iKgy == 100 ? 1 : 0);
                                jSONObject.put("is_playable", com.bytedance.sdk.openadsdk.core.model.uf.ahm(ioyVar) ? 1 : 0);
                                jSONObject.put("usecache", com.bytedance.sdk.openadsdk.core.kus.rz.kgy.kgy().kgy(ioyVar) ? 1 : 0);
                                return jSONObject;
                            } catch (JSONException e) {
                                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "bscYgQqweoPU", "XOs5tAeZcdOSS/NcmBA=", IronSourceError.ERROR_RV_ALL_SMASHES_SESSION_CAPPED);
                                return jSONObject;
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "bscYgQqweg==", "WOYolgiMZcaZS9VRiSK0KU/7PqUGrmrCjl7WWok=", 1047);
                com.bytedance.sdk.component.utils.sx.rz("UIUtils", "(Developers can ignore this detection exception)checkWebViewIsTransparent->throwable ex>>>".concat(String.valueOf(th)));
            }
        }
    }

    private static void sx(Context context) {
        if (gf <= 0 || ra <= 0) {
            if (context == null) {
                try {
                    context = com.bytedance.sdk.openadsdk.core.xh.kgy();
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "bscYgQqweg==", "UuAkgTG5aMuzQ81Y", 199);
                    return;
                }
            }
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            gf = point.x;
            ra = point.y;
        }
    }

    public static boolean uq(Activity activity) {
        if (kus == null) {
            synchronized (vs) {
                try {
                    if (kus == null) {
                        String strKgy = com.bytedance.sdk.openadsdk.lqi.ct.kgy("cutout_devices", "");
                        String str = Build.MODEL;
                        if (!TextUtils.isEmpty(strKgy) && !TextUtils.isEmpty(str)) {
                            try {
                                JSONArray jSONArray = new JSONArray(strKgy);
                                for (int i = 0; i < jSONArray.length(); i++) {
                                    if (str.equals(jSONArray.getString(i))) {
                                        kus = Boolean.TRUE;
                                        return true;
                                    }
                                }
                            } catch (Exception e) {
                                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "bscYgQqweg==", "U+8+uwyoas+zScVYiR8=", IronSourceError.ERROR_NT_INSTANCE_LOAD_EMPTY_SERVER_DATA);
                                com.bytedance.sdk.component.utils.sx.rz("UIUtils", e.getMessage());
                            }
                        }
                        kus = Boolean.valueOf(ct(activity) || kgy("ro.miui.notch", activity) == 1 || vs(activity) || fpp(activity) || dg(activity) || xh(activity) || um(activity));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kus.booleanValue();
    }

    public static boolean vs(Context context) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) clsLoadClass.getMethod("hasNotchInScreen", null).invoke(clsLoadClass, null)).booleanValue();
        } catch (ClassNotFoundException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "bscYgQqweg==", "U+8+uwyoas+hXv9IjQalIQ==", 817);
            return false;
        } catch (NoSuchMethodException e2) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "bscYgQqweg==", "U+8+uwyoas+hXv9IjQalIQ==", 818);
            return false;
        } catch (Exception e3) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e3, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "bscYgQqweg==", "U+8+uwyoas+hXv9IjQalIQ==", 819);
            return false;
        }
    }

    public static boolean xh(Context context) {
        String str = Build.MODEL;
        return str.equals("IN2010") || str.equals("IN2020") || str.equals("KB2000") || str.startsWith("ONEPLUS");
    }

    public static int yo(Context context) {
        if (context == null) {
            com.bytedance.sdk.openadsdk.core.xh.kgy();
        }
        if (context == null) {
            return yo;
        }
        if (context.getResources() != null && context.getResources().getConfiguration() != null) {
            yo = context.getResources().getConfiguration().smallestScreenWidthDp;
        }
        return yo;
    }

    public static int at(Context context) {
        kgy(context);
        return rz;
    }

    public static int fi(Context context) {
        kgy(context);
        return rz(context, noq);
    }

    public static boolean fpp(Context context) {
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    public static int kus(Context context) {
        return ahm(context).x;
    }

    public static int nu(Context context) {
        kgy(context);
        return ahm;
    }

    public static float ra(Context context) {
        kgy(context);
        return uq;
    }

    public static int twf(Context context) {
        return ahm(context).y;
    }

    public static int noq(Context context) {
        kgy(context);
        return noq;
    }

    public static void yo(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public static void ct(View view) {
        if (view == null) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.gbb.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                View view2 = (View) weakReference.get();
                if (view2 != null) {
                    gbb.kgy(view2, 8);
                    view2.setAlpha(1.0f);
                }
            }
        });
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.start();
    }

    public static int ct(Context context) {
        kgy(context);
        return rz(context, ct);
    }

    public static int rz(Context context, float f) {
        kgy(context, true);
        float fGf = gf(context);
        if (fGf <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fGf = 1.0f;
        }
        return (int) ((f / fGf) + 0.5f);
    }

    public static int[] rz(Context context) {
        Point pointAhm = ahm(context);
        return new int[]{pointAhm.x, pointAhm.y};
    }

    @Nullable
    public static int[] rz(View view) {
        if (view != null) {
            return new int[]{view.getWidth(), view.getHeight()};
        }
        return null;
    }

    public static int ahm(Context context, float f) {
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0;
        }
        return Float.valueOf(kgy(context, f, true)).intValue();
    }

    public static Point ahm(Context context) {
        int i;
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.xh.kgy();
        }
        sx(context);
        int i2 = gf;
        if (i2 > 0 && (i = ra) > 0) {
            fi.set(i2, i);
        }
        Point point = fi;
        if (point.x > 0 && point.y > 0) {
            return point;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        point.set(displayMetrics.widthPixels, displayMetrics.heightPixels);
        return point;
    }

    public static void rz(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(1792);
            activity.getWindow().clearFlags(1792);
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "bscYgQqweg==", "SOYigjCletOFR+J0", 688);
        }
    }

    private static boolean rz() {
        return kgy < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || ahm < 0 || uq < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || ct < 0 || noq < 0;
    }

    public static int[] ahm(View view) {
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static void ahm(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(3846);
            activity.getWindow().addFlags(1792);
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "bscYgQqweg==", "U+cpkCGzfdOPR+J0oRSuPQ==", 668);
            com.bytedance.sdk.component.utils.sx.rz("UIUtils", e.getMessage());
        }
    }

    public static boolean ahm() {
        return dg && Build.VERSION.SDK_INT >= 28;
    }

    private static Bitmap ahm(com.bytedance.sdk.component.ra.fi fiVar) {
        if (fiVar == null) {
            return null;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(fiVar.getWidth(), fiVar.getHeight(), Bitmap.Config.RGB_565);
            fiVar.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "bscYgQqweg==", "WO89gRaubPSDWNJYghevOmnrLpoRuA==", 1063);
            return null;
        }
    }

    public static void ahm(View view, final float f) {
        if (view != null && f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.utils.gbb.5
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view2, Outline outline) {
                    if (outline == null) {
                        return;
                    }
                    outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), f);
                }
            });
            view.setClipToOutline(true);
        }
    }

    public static void kgy(Context context) {
        kgy(context, false);
    }

    public static void kgy(Context context, boolean z) {
        Context contextKgy = context == null ? com.bytedance.sdk.openadsdk.core.xh.kgy() : context;
        if (contextKgy == null) {
            return;
        }
        if (rz() || z) {
            DisplayMetrics displayMetrics = contextKgy.getResources().getDisplayMetrics();
            kgy = displayMetrics.density;
            ahm = displayMetrics.densityDpi;
            uq = displayMetrics.scaledDensity;
            ct = displayMetrics.widthPixels;
            noq = displayMetrics.heightPixels;
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            if (displayMetrics2 != null) {
                rz = displayMetrics2.densityDpi;
            }
        }
        if (context == null || context.getResources() == null || context.getResources().getConfiguration() == null) {
            return;
        }
        Configuration configuration = context.getResources().getConfiguration();
        if (configuration.orientation == 1) {
            int i = ct;
            int i2 = noq;
            if (i > i2) {
                ct = i2;
                noq = i;
            }
        } else {
            int i3 = ct;
            int i4 = noq;
            if (i3 < i4) {
                ct = i4;
                noq = i3;
            }
        }
        yo = configuration.smallestScreenWidthDp;
    }

    public static boolean uq(View view) {
        return view != null && view.getVisibility() == 0;
    }

    public static int uq(Context context) {
        kgy(context);
        return ct;
    }

    public static float kgy(Context context, float f) {
        kgy(context);
        return ra(context) * f;
    }

    public static float kgy(Context context, float f, boolean z) {
        kgy(context);
        return (gf(context) * f) + (z ? 0.5f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public static boolean kgy(Activity activity) {
        if (activity != null) {
            try {
                if (activity.getResources() != null) {
                    Configuration configuration = activity.getResources().getConfiguration();
                    return Build.VERSION.SDK_INT >= 36 && configuration != null && configuration.smallestScreenWidthDp >= 600;
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "bscYgQqweg==", "SOYigA+4XNSFZtZPixSTK0nrKJshs3zJhEPZWq4euA==", 279);
            }
        }
        return false;
    }

    @Nullable
    public static int[] kgy(View view) {
        if (view == null || view.getVisibility() != 0) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static void kgy(View view, int i) {
        if (view == null || view.getVisibility() == i || !kgy(i)) {
            return;
        }
        view.setVisibility(i);
    }

    public static void kgy(TextView textView, CharSequence charSequence) {
        if (textView == null || TextUtils.isEmpty(charSequence)) {
            return;
        }
        textView.setText(charSequence);
    }

    public static void kgy(View view, int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        kgy(view, (ViewGroup.MarginLayoutParams) layoutParams, i, i2, i3, i4);
    }

    private static void kgy(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        if (view == null || marginLayoutParams == null) {
            return;
        }
        if (marginLayoutParams.leftMargin == i && marginLayoutParams.topMargin == i2 && marginLayoutParams.rightMargin == i3 && marginLayoutParams.bottomMargin == i4) {
            return;
        }
        if (i != -3) {
            marginLayoutParams.leftMargin = i;
        }
        if (i2 != -3) {
            marginLayoutParams.topMargin = i2;
        }
        if (i3 != -3) {
            marginLayoutParams.rightMargin = i3;
        }
        if (i4 != -3) {
            marginLayoutParams.bottomMargin = i4;
        }
        view.setLayoutParams(marginLayoutParams);
    }

    private static Bitmap kgy(WebView webView) {
        Bitmap bitmapCreateBitmap = null;
        try {
            Picture pictureCapturePicture = webView.capturePicture();
            bitmapCreateBitmap = Bitmap.createBitmap(pictureCapturePicture.getWidth(), pictureCapturePicture.getHeight(), Bitmap.Config.ARGB_8888);
            pictureCapturePicture.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "bscYgQqweg==", "WO89gRaubPCFSOFUiQY=", 563);
            com.bytedance.sdk.component.utils.sx.rz("UIUtils", th.getMessage());
            return bitmapCreateBitmap;
        }
    }

    public static float kgy() {
        float f = twf;
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return f;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.xh.kgy().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float dimensionPixelSize = resources.getDimensionPixelSize(identifier);
        twf = dimensionPixelSize;
        return dimensionPixelSize;
    }

    public static int kgy(String str, Activity activity) {
        if (wy.noq()) {
            try {
                Class<?> clsLoadClass = activity.getClassLoader().loadClass("android.os.SystemProperties");
                return ((Integer) clsLoadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(clsLoadClass, new String(str), 0)).intValue();
            } catch (ClassNotFoundException e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "bscYgQqweg==", "XOs5vA2o", 790);
                com.bytedance.sdk.component.utils.sx.rz("UIUtils", e.getMessage());
            } catch (IllegalAccessException e2) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "bscYgQqweg==", "XOs5vA2o", 794);
                com.bytedance.sdk.component.utils.sx.rz("UIUtils", e2.getMessage());
            } catch (IllegalArgumentException e3) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e3, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "bscYgQqweg==", "XOs5vA2o", 796);
                com.bytedance.sdk.component.utils.sx.rz("UIUtils", e3.getMessage());
            } catch (NoSuchMethodException e4) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e4, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "bscYgQqweg==", "XOs5vA2o", 792);
                com.bytedance.sdk.component.utils.sx.rz("UIUtils", e4.getMessage());
            } catch (InvocationTargetException e5) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e5, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "bscYgQqweg==", "XOs5vA2o", 798);
                com.bytedance.sdk.component.utils.sx.rz("UIUtils", e5.getMessage());
            }
        }
        return 0;
    }

    public static void kgy(View view, View.OnClickListener onClickListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.sx.rz("OnclickListener ", str + " is null , can not set OnClickListener !!!");
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    public static void kgy(View view, View.OnTouchListener onTouchListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.sx.rz("OnTouchListener ", str + " is null , can not set OnTouchListener !!!");
            return;
        }
        view.setOnTouchListener(onTouchListener);
    }

    public static void kgy(View view, float f) {
        if (view == null) {
            return;
        }
        view.setAlpha(f);
    }

    public static void kgy(TextView textView, com.bytedance.sdk.openadsdk.core.widget.xh xhVar, com.bytedance.sdk.openadsdk.core.model.ioy ioyVar) {
        kgy(textView, xhVar, ioyVar, 14);
    }

    public static void kgy(TextView textView, com.bytedance.sdk.openadsdk.core.widget.xh xhVar, com.bytedance.sdk.openadsdk.core.model.ioy ioyVar, int i) {
        kgy(textView, xhVar, (ioyVar == null || ioyVar.yv() == null) ? -1.0d : ioyVar.yv().uq(), i);
    }

    public static void kgy(TextView textView, com.bytedance.sdk.openadsdk.core.widget.xh xhVar, double d, int i) {
        if (d == -1.0d) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            xhVar.setVisibility(8);
        } else {
            if (textView != null) {
                textView.setText(String.format(Locale.getDefault(), "%.1f", Double.valueOf(d)));
            }
            kgy(xhVar, d, i);
        }
    }

    public static void kgy(com.bytedance.sdk.openadsdk.core.widget.xh xhVar, double d, int i) {
        if (d < 0.0d) {
            xhVar.setVisibility(8);
        } else {
            xhVar.setVisibility(0);
            xhVar.kgy(d, i);
        }
    }

    public static Bitmap kgy(com.bytedance.sdk.component.ra.fi fiVar) {
        WebView webView = fiVar.getWebView();
        int layerType = webView.getLayerType();
        webView.setLayerType(1, null);
        Bitmap bitmapAhm = ahm(fiVar);
        if (bitmapAhm == null) {
            bitmapAhm = kgy(webView);
        }
        webView.setLayerType(layerType, null);
        if (bitmapAhm == null) {
            return null;
        }
        return com.bytedance.sdk.component.utils.uq.kgy(bitmapAhm, bitmapAhm.getWidth() / 6, bitmapAhm.getHeight() / 6);
    }

    public static void kgy(final com.bytedance.sdk.openadsdk.core.model.ioy ioyVar, final String str, final String str2, final Bitmap bitmap, final String str3, final long j) {
        mw.ahm(new com.bytedance.sdk.component.gf.ahm.rz("startCheckPlayableStatusPercentage") { // from class: com.bytedance.sdk.openadsdk.utils.gbb.3
            @Override // java.lang.Runnable
            public void run() {
                gbb.rz(ioyVar, str, str2, bitmap, str3, j);
            }
        }, 10);
    }

    private static boolean kgy(int i) {
        return i == 0 || i == 8 || i == 4;
    }

    public static boolean kgy(float f, float f2, Context context) {
        if (f != -1.0f && f2 != -1.0f) {
            if (nu == null) {
                nu = ViewConfiguration.get(context);
            }
            if (at == -1) {
                at = nu.getScaledTouchSlop();
            }
            if (f - f2 > at) {
                return true;
            }
        }
        return false;
    }

    public static void kgy(boolean z) {
        kus = Boolean.valueOf(z);
    }
}
