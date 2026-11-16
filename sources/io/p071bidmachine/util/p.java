package io.p071bidmachine.util;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Size;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import com.safedk.android.utils.Logger;
import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.dk2;
import defpackage.dt1;
import defpackage.er;
import defpackage.h50;
import defpackage.ix;
import defpackage.kc2;
import defpackage.kk2;
import defpackage.oi;
import defpackage.p92;
import defpackage.qo;
import defpackage.rd1;
import defpackage.s71;
import defpackage.tb5;
import defpackage.ul2;
import io.p071bidmachine.rendering.internal.AdActivity;
import io.p071bidmachine.util.conversion.a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class p {
    public static final a a = new a(0);
    public static final a b = new a(3);
    public static final a c = new a(4);
    public static final a d = new a(2);
    public static final a e = new a(1);
    public static WeakReference f;

    public static final Integer I(String str) {
        if (str != null && str.length() != 0) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static final void L(AdActivity adActivity) {
        adActivity.requestWindowFeature(1);
        Window window = adActivity.getWindow();
        if (window != null) {
            window.addFlags(128);
        }
    }

    public static Boolean X(Object obj) {
        return (Boolean) a.D(obj, null);
    }

    public static Float Z(Object obj) {
        return (Float) d.D(obj, null);
    }

    public static Long d0(Object obj) {
        return (Long) c.D(obj, null);
    }

    public static final float f0(Integer num, float f2, float f3) {
        return tb5.f(f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? rd1.p((num.floatValue() / f2) * f3) / f3 : num.floatValue() / f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
    }

    public static final Object n(Class cls, String str, Class[] clsArr, Object[] objArr, PackageManager packageManager) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(packageManager, Arrays.copyOf(objArr, objArr.length));
        } catch (Throwable unused) {
            Class superclass = cls.getSuperclass();
            if (superclass != null) {
                return n(superclass, str, clsArr, objArr, packageManager);
            }
            return null;
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "io.bidmachine");
        p0.startActivity(p1);
    }

    public static final boolean v(byte[] bArr, int... iArr) {
        if (bArr.length >= iArr.length + 8) {
            int length = iArr.length;
            for (int i = 0; i < length; i++) {
                if ((bArr[8 + i] & 255) == iArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean w(byte[] bArr, int... iArr) {
        if (bArr.length >= iArr.length) {
            int length = iArr.length;
            for (int i = 0; i < length; i++) {
                if ((bArr[i] & 255) == iArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public static final void A(View view) {
        if (view == null) {
            return;
        }
        n.a(new t(view, 0));
    }

    public static final h E(Context context, String str) {
        h hVar;
        context.getClass();
        h hVar2 = h.d;
        if (str == null || str.length() == 0) {
            return hVar2;
        }
        try {
            Uri uri = Uri.parse(str);
            uri.getClass();
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.setFlags(268435456);
            if (!o(context, intent)) {
                String strDecode = URLDecoder.decode(str, er.a.name());
                strDecode.getClass();
                Uri uri2 = Uri.parse(strDecode);
                uri2.getClass();
                intent = new Intent("android.intent.action.VIEW", uri2);
                intent.setFlags(268435456);
                o(context, intent);
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            hVar = h.c;
        } catch (Throwable unused) {
            hVar = null;
        }
        return hVar == null ? hVar2 : hVar;
    }

    public static final Integer J(String str) {
        if (str != null && str.length() != 0) {
            try {
                if (str.charAt(0) == '#' && str.length() == 9) {
                    str = "#" + str.substring(7, 9) + str.substring(1, 7);
                }
                return Integer.valueOf(Color.parseColor(str));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static int U(float f2, float f3, float f4, Float f5) {
        int iY;
        int iY2;
        if (f5 != null) {
            float fFloatValue = f5.floatValue();
            if (Build.VERSION.SDK_INT >= 26) {
                return Color.argb(fFloatValue, f2, f3, f4);
            }
            iY = (Y(f2) << 16) | (Y(fFloatValue) << 24);
            iY2 = (Y(f3) << 8) | Y(f4);
        } else {
            if (Build.VERSION.SDK_INT >= 26) {
                return Color.rgb(f2, f3, f4);
            }
            iY = (Y(f2) << 16) | (-16777216) | (Y(f3) << 8);
            iY2 = Y(f4);
        }
        return iY | iY2;
    }

    public static final void W(View view) {
        if (view == null) {
            return;
        }
        n.a(new t(view, 2));
    }

    public static final int Y(float f2) {
        return (int) ((f2 * 255.0f) + 0.5f);
    }

    public static /* synthetic */ boolean b(int i, View view, ViewGroup.LayoutParams layoutParams, ViewGroup viewGroup) {
        if ((i & 4) != 0) {
            layoutParams = null;
        }
        return a(-1, view, layoutParams, viewGroup);
    }

    public static final Object f(View view, ul2 ul2Var) {
        qo qoVar = new qo(1, kc2.q(ul2Var));
        qoVar.s();
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            s sVar = new s(view, qoVar);
            qoVar.v(new oi(19, view, sVar));
            view.addOnLayoutChangeListener(sVar);
            if (!view.isLaidOut() && !view.isLayoutRequested()) {
                view.requestLayout();
            }
        } else {
            qoVar.resumeWith(view);
        }
        return qoVar.r();
    }

    public static final ViewGroup.LayoutParams h() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public static final Activity m(ContextWrapper contextWrapper, int i) {
        if (i >= 10) {
            return null;
        }
        Context baseContext = contextWrapper.getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        if (baseContext instanceof ContextWrapper) {
            return m((ContextWrapper) baseContext, i + 1);
        }
        return null;
    }

    public static final void r(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            q(activity);
        } catch (Throwable unused) {
        }
    }

    public static final TelephonyManager y(Context context) {
        try {
            Object systemService = context.getSystemService("phone");
            if (!(systemService instanceof TelephonyManager)) {
                systemService = null;
            }
            return (TelephonyManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final boolean B(String str) {
        str.getClass();
        if (!kk2.L(str, d.v, false) && !kk2.L(str, "https://", false)) {
            return false;
        }
        return true;
    }

    public static final float C(float f2, float f3, float f4) {
        return h50.c(f3, f2, f4, f2);
    }

    public static int D(boolean z, int i, float f2, int i2) {
        Float fValueOf;
        float fC = C(Q(i), Q(i2), f2);
        float fC2 = C(z(i), z(i2), f2);
        float fC3 = C(g(i), g(i2), f2);
        if (z) {
            fValueOf = Float.valueOf(C(c(i), c(i2), f2));
        } else {
            fValueOf = null;
        }
        return U(fC, fC2, fC3, fValueOf);
    }

    public static final int F(SharedPreferences sharedPreferences, String str, int i) {
        sharedPreferences.getClass();
        try {
            if (sharedPreferences.contains(str)) {
                return sharedPreferences.getInt(str, i);
            }
        } catch (Throwable unused) {
        }
        return i;
    }

    public static final long G(SharedPreferences sharedPreferences, String str, long j) {
        sharedPreferences.getClass();
        try {
            if (sharedPreferences.contains(str)) {
                return sharedPreferences.getLong(str, j);
            }
        } catch (Throwable unused) {
        }
        return j;
    }

    public static final String H(SharedPreferences sharedPreferences, String str) {
        String string;
        sharedPreferences.getClass();
        str.getClass();
        try {
            if (!sharedPreferences.contains(str) || (string = sharedPreferences.getString(str, null)) == null) {
                return null;
            }
            return string;
        } catch (Throwable unused) {
        }
    }

    public static final Uri K(String str) {
        Uri uri;
        str.getClass();
        Uri uri2 = Uri.parse(str);
        uri2.getClass();
        String scheme = uri2.getScheme();
        if ((scheme == null || scheme.length() == 0) && !kk2.L(str, "/", false)) {
            try {
                uri = Uri.parse(o.c(str));
            } catch (Throwable unused) {
                uri = null;
            }
            if (uri != null) {
                String scheme2 = uri.getScheme();
                if (scheme2 == null || scheme2.length() <= 0) {
                    String string = uri.toString();
                    string.getClass();
                    if (kk2.L(string, "/", false)) {
                    }
                }
                return uri;
            }
        }
        return uri2;
    }

    public static final void M(SharedPreferences sharedPreferences, String str, Integer num) {
        sharedPreferences.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.getClass();
        editorEdit.putInt(str, num.intValue());
        editorEdit.apply();
    }

    public static final void N(SharedPreferences.Editor editor, String str, Long l) {
        editor.getClass();
        if (l == null) {
            editor.remove(str);
        } else {
            editor.putLong(str, l.longValue());
        }
    }

    public static final void O(SharedPreferences sharedPreferences, String str, Long l) {
        sharedPreferences.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.getClass();
        editorEdit.putLong(str, l.longValue());
        editorEdit.apply();
    }

    public static final void P(SharedPreferences sharedPreferences, String str, String str2) {
        sharedPreferences.getClass();
        str.getClass();
        if (str2 == null) {
            R(sharedPreferences, str);
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.getClass();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public static final float Q(int i) {
        return f0(Integer.valueOf(Color.red(i)), 255.0f, 100.0f);
    }

    public static final void R(SharedPreferences sharedPreferences, String str) {
        sharedPreferences.getClass();
        str.getClass();
        sharedPreferences.edit().remove(str).apply();
    }

    public static final az2 S(View view) {
        ViewGroup viewGroup;
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return null;
        }
        viewGroup.removeView(view);
        return az2.a;
    }

    public static final void T(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        onPreDrawListener.getClass();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        }
    }

    public static final void V(Rect rect, Rect rect2, float f2) {
        rect.getClass();
        rect2.getClass();
        int i = rect2.left;
        int i2 = o.a;
        rect.set((int) ((i / f2) + 0.5f), (int) ((rect2.top / f2) + 0.5f), (int) ((rect2.right / f2) + 0.5f), (int) ((rect2.bottom / f2) + 0.5f));
    }

    public static final boolean a(int i, View view, ViewGroup.LayoutParams layoutParams, ViewGroup viewGroup) {
        Boolean bool;
        viewGroup.getClass();
        view.getClass();
        try {
            S(view);
            if (layoutParams != null) {
                viewGroup.addView(view, i, layoutParams);
            } else {
                viewGroup.addView(view, i);
            }
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
            bool = null;
        }
        return s71.b(bool, Boolean.TRUE);
    }

    public static final JSONArray a0(List list) {
        list.getClass();
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object objB = o.b(it.next());
            if (objB != null) {
                jSONArray.put(objB);
            }
        }
        return jSONArray;
    }

    public static final JSONObject b0(Map map) throws JSONException {
        String string;
        Object objB;
        map.getClass();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key != null) {
                string = key.toString();
            } else {
                string = null;
            }
            Object value = entry.getValue();
            if (string != null && string.length() > 0 && value != null && (objB = o.b(value)) != null) {
                jSONObject.put(string, objB);
            }
        }
        return jSONObject;
    }

    public static float c(int i) {
        return f0(Integer.valueOf(Color.alpha(i)), 255.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public static final ArrayList c0(JSONArray jSONArray) {
        jSONArray.getClass();
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object objA = o.a(jSONArray.opt(i));
            if (objA != null) {
                arrayList.add(objA);
            }
        }
        return arrayList;
    }

    public static final void d(Uri.Builder builder, Uri uri, Collection collection) {
        collection.getClass();
        for (String str : uri.getQueryParameterNames()) {
            if (!collection.contains(str)) {
                Iterator<String> it = uri.getQueryParameters(str).iterator();
                while (it.hasNext()) {
                    builder.appendQueryParameter(str, it.next());
                }
            }
        }
    }

    public static final void e(AdActivity adActivity) {
        Window window = adActivity.getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowInsetsController windowInsetsController = window.getDecorView().getWindowInsetsController();
                if (windowInsetsController != null) {
                    windowInsetsController.setSystemBarsBehavior(2);
                    windowInsetsController.hide(WindowInsets.Type.statusBars());
                }
            } else {
                window.setFlags(1024, 1024);
                window.getDecorView().setSystemUiVisibility(4);
            }
        }
        InputMethodManager inputMethodManager = null;
        try {
            Object systemService = adActivity.getSystemService("input_method");
            if (!(systemService instanceof InputMethodManager)) {
                systemService = null;
            }
            inputMethodManager = (InputMethodManager) systemService;
        } catch (Throwable unused) {
        }
        if (inputMethodManager != null) {
            View currentFocus = adActivity.getCurrentFocus();
            if (currentFocus == null) {
                currentFocus = new View(adActivity);
            }
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public static final LinkedHashMap e0(JSONObject jSONObject) {
        jSONObject.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        for (String str : (ix) p92.F(itKeys)) {
            Object objA = o.a(jSONObject.opt(str));
            if (objA != null) {
                str.getClass();
                linkedHashMap.put(str, objA);
            }
        }
        return linkedHashMap;
    }

    public static final float g(int i) {
        return f0(Integer.valueOf(Color.blue(i)), 255.0f, 100.0f);
    }

    public static final byte[] i(int i, String str) {
        str.getClass();
        try {
            byte[] bytes = str.getBytes(er.a);
            bytes.getClass();
            return Base64.decode(bytes, i);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final dt1 j(String str, char c2) {
        str.getClass();
        int iW = dk2.W(str, c2, 0, 6);
        if (iW >= 0 && iW <= str.length() - 1) {
            return new dt1(str.substring(0, iW), str.substring(iW + 1, str.length()));
        }
        return null;
    }

    public static final int k(Context context, float f2) {
        context.getClass();
        if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0;
        }
        return (int) TypedValue.applyDimension(1, f2, t(context));
    }

    public static final g l(g[] gVarArr, String str) {
        String lowerCase;
        String key;
        gVarArr.getClass();
        if (str != null && str.length() != 0) {
            Locale locale = Locale.getDefault();
            locale.getClass();
            String lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            for (g gVar : gVarArr) {
                if (gVar != null && (key = gVar.getKey()) != null) {
                    Locale locale2 = Locale.getDefault();
                    locale2.getClass();
                    lowerCase = key.toLowerCase(locale2);
                    lowerCase.getClass();
                } else {
                    lowerCase = null;
                }
                if (kk2.E(lowerCase, lowerCase2, false)) {
                    return gVar;
                }
            }
        }
        return null;
    }

    public static final boolean o(Context context, Intent intent) {
        Object next;
        context.getClass();
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        listQueryIntentActivities.getClass();
        ComponentName componentName = null;
        if (!listQueryIntentActivities.isEmpty()) {
            Iterator<T> it = listQueryIntentActivities.iterator();
            do {
                if (it.hasNext()) {
                    next = it.next();
                } else {
                    next = null;
                    break;
                }
            } while (!s71.b(((ResolveInfo) next).activityInfo.packageName, "com.android.vending"));
            ResolveInfo resolveInfo = (ResolveInfo) next;
            if (resolveInfo != null) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
            }
            if (componentName == null) {
                componentName = new ComponentName(listQueryIntentActivities.get(0).activityInfo.packageName, listQueryIntentActivities.get(0).activityInfo.name);
            }
        }
        if (componentName == null) {
            return false;
        }
        intent.setComponent(componentName);
        return true;
    }

    public static final View p(View view) {
        view.getClass();
        if (view.getId() == 16908290) {
            return view;
        }
        ViewParent parent = view.getParent();
        View view2 = null;
        while (parent instanceof View) {
            view2 = (View) parent;
            view2.getClass();
            if (view2.getId() == 16908290) {
                return view2;
            }
            parent = view2.getParent();
        }
        return view2;
    }

    public static final void q(Activity activity) {
        activity.getClass();
        activity.finish();
        if (Build.VERSION.SDK_INT >= 34) {
            try {
                activity.overrideActivityTransition(0, 0, 0, 0);
                activity.overrideActivityTransition(1, 0, 0, 0);
                return;
            } catch (Throwable unused) {
            }
        }
        try {
            activity.overridePendingTransition(0, 0);
        } catch (Throwable unused2) {
        }
    }

    public static final long s(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.getClass();
        calendar.setTime(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static final DisplayMetrics t(Context context) {
        context.getClass();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        return displayMetrics;
    }

    public static final Rect u(View view) {
        view.getClass();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new Rect(iArr[0], iArr[1], view.getWidth() + iArr[0], view.getHeight() + iArr[1]);
    }

    public static final Size x(Context context) {
        WindowManager windowManager;
        Size size;
        context.getClass();
        Size size2 = null;
        try {
            Object systemService = context.getSystemService("window");
            if (!(systemService instanceof WindowManager)) {
                systemService = null;
            }
            windowManager = (WindowManager) systemService;
        } catch (Throwable unused) {
            windowManager = null;
        }
        if (windowManager != null) {
            try {
                if (Build.VERSION.SDK_INT >= 30) {
                    Rect bounds = windowManager.getMaximumWindowMetrics().getBounds();
                    size = new Size(bounds.width(), bounds.height());
                } else {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    if (defaultDisplay != null) {
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        size = new Size(point.x, point.y);
                    } else {
                        size = null;
                    }
                }
                if (size != null && size.getWidth() > 0 && size.getHeight() > 0) {
                    size2 = size;
                }
            } catch (Throwable unused2) {
            }
        }
        if (size2 == null) {
            DisplayMetrics displayMetricsT = t(context);
            return new Size(displayMetricsT.widthPixels, displayMetricsT.heightPixels);
        }
        return size2;
    }

    public static final float z(int i) {
        return f0(Integer.valueOf(Color.green(i)), 255.0f, 100.0f);
    }
}
