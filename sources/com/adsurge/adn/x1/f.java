package com.adsurge.adn.x1;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class f {
    public static final h a = h.b.a();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class b implements h {
        public int b = 0;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public class a implements View.OnAttachStateChangeListener {
            public final /* synthetic */ Activity a;
            public final /* synthetic */ boolean b;
            public final /* synthetic */ boolean c;
            public final /* synthetic */ boolean d;
            public final /* synthetic */ Window e;

            public a(Activity activity, boolean z, boolean z2, boolean z3, Window window) {
                this.a = activity;
                this.b = z;
                this.c = z2;
                this.d = z3;
                this.e = window;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                b.this.a(this.a, this.b, this.c, this.d, false);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                this.e.getDecorView().removeOnAttachStateChangeListener(this);
            }
        }

        /* JADX INFO: renamed from: com.adsurge.adn.x1.f$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public class ViewOnSystemUiVisibilityChangeListenerC0148b implements View.OnSystemUiVisibilityChangeListener {
            public final /* synthetic */ Activity a;
            public final /* synthetic */ boolean b;
            public final /* synthetic */ boolean c;

            public ViewOnSystemUiVisibilityChangeListenerC0148b(Activity activity, boolean z, boolean z2) {
                this.a = activity;
                this.b = z;
                this.c = z2;
            }

            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i) {
                b.this.a(this.a, this.b, this.c, false, false);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public class c implements View.OnAttachStateChangeListener {
            public final /* synthetic */ View a;
            public final /* synthetic */ int b;

            public c(View view, int i) {
                this.a = view;
                this.b = i;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                b.this.a(this.a, this.b, false);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                this.a.removeOnAttachStateChangeListener(this);
            }
        }

        public boolean d(Activity activity) {
            if (Build.VERSION.SDK_INT >= 28) {
                return a(activity, b(activity)) > 0;
            }
            return b((Context) activity);
        }

        public final void a(Activity activity, boolean z, boolean z2, boolean z3, boolean z4) {
            int i;
            Window window = activity.getWindow();
            if (window != null) {
                if (z4) {
                    window.getDecorView().addOnAttachStateChangeListener(new a(activity, z, z2, z3, window));
                    return;
                }
                a(activity, z);
                int i2 = Build.VERSION.SDK_INT;
                if (z2) {
                    i = 1798;
                } else {
                    i = 1284;
                }
                window.getDecorView().setSystemUiVisibility(i | 4096);
                if (i2 >= 28) {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.layoutInDisplayCutoutMode = 1;
                    window.setAttributes(attributes);
                }
                a(activity);
                if (z3) {
                    window.getDecorView().setOnSystemUiVisibilityChangeListener(new ViewOnSystemUiVisibilityChangeListenerC0148b(activity, z, z2));
                }
            }
        }

        public int b(View view) {
            int iA;
            Context context = view.getContext();
            if (!c(view)) {
                return 0;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                iA = a(context, a(view));
            } else {
                iA = a(context);
            }
            this.b = iA;
            if (!b()) {
                return 0;
            }
            return iA;
        }

        public int c(Activity activity) {
            int iA;
            if (d(activity) && b()) {
                if (Build.VERSION.SDK_INT >= 28) {
                    iA = a(activity, b(activity));
                } else {
                    iA = a((Context) activity);
                }
                this.b = iA;
                return iA;
            }
            return 0;
        }

        public boolean c(View view) {
            if (Build.VERSION.SDK_INT >= 28) {
                return a(view.getContext(), a(view)) > 0;
            }
            return b(view.getContext());
        }

        public boolean b(Context context) {
            return false;
        }

        public boolean b() {
            return true;
        }

        public DisplayCutout b(Activity activity) {
            Window window;
            WindowInsets rootWindowInsets;
            if (Build.VERSION.SDK_INT < 28 || (window = activity.getWindow()) == null || (rootWindowInsets = window.getDecorView().getRootWindowInsets()) == null) {
                return null;
            }
            return rootWindowInsets.getDisplayCutout();
        }

        public void a(Activity activity) {
        }

        public int a(Context context, DisplayCutout displayCutout) {
            if (Build.VERSION.SDK_INT < 28 || displayCutout == null) {
                return 0;
            }
            if (context.getResources().getConfiguration().orientation == 1) {
                return displayCutout.getSafeInsetTop();
            }
            return displayCutout.getSafeInsetLeft() == 0 ? displayCutout.getSafeInsetRight() : displayCutout.getSafeInsetLeft();
        }

        public int a() {
            return a(com.adsurge.adn.s1.a.b().a(), "status_bar_height");
        }

        public DisplayCutout a(View view) {
            WindowInsets rootWindowInsets;
            if (Build.VERSION.SDK_INT < 28 || (rootWindowInsets = view.getRootWindowInsets()) == null) {
                return null;
            }
            return rootWindowInsets.getDisplayCutout();
        }

        @Override // com.adsurge.adn.x1.f.h
        public void a(Activity activity, boolean z, boolean z2) {
            a(activity, true, z, true, z2);
        }

        public int a(Context context) {
            return 0;
        }

        public final void a(Activity activity, boolean z) {
            ViewGroup viewGroup;
            Window window = activity.getWindow();
            if (window == null || (viewGroup = (ViewGroup) window.getDecorView().findViewWithTag("NOTCH_CONTAINER")) == null) {
                return;
            }
            if (viewGroup.getChildCount() == 0) {
                View view = new View(activity);
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, c(activity)));
                viewGroup.addView(view);
            }
            if (z) {
                viewGroup.setVisibility(8);
            } else {
                viewGroup.setVisibility(0);
            }
        }

        @Override // com.adsurge.adn.x1.f.h
        public void a(View view, int i, boolean z) {
            if (z) {
                view.addOnAttachStateChangeListener(new c(view, i));
                return;
            }
            if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int rotation = ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay().getRotation();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                Rect rect = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                a(rotation, i, rect, b(view));
                marginLayoutParams.setMargins(rect.left, rect.top, rect.right, rect.bottom);
            }
        }

        public final void a(int i, int i2, Rect rect, int i3) {
            if (i == 0) {
                if ((i2 & 2) == 2 || i2 == 0) {
                    rect.top += i3;
                    return;
                }
                return;
            }
            if (i == 1 || i == 3) {
                if ((i2 & 1) == 1) {
                    rect.left += i3;
                }
                if ((i2 & 4) == 4) {
                    rect.right += i3;
                }
                if (i2 == 0) {
                    rect.left += i3;
                    rect.right += i3;
                }
            }
        }

        public int a(Context context, String str) {
            try {
                int identifier = context.getResources().getIdentifier(str, "dimen", "android");
                if (identifier <= 0) {
                    return 0;
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(identifier);
                int dimensionPixelSize2 = Resources.getSystem().getDimensionPixelSize(identifier);
                if (dimensionPixelSize2 >= dimensionPixelSize) {
                    return dimensionPixelSize2;
                }
                float f = (dimensionPixelSize * Resources.getSystem().getDisplayMetrics().density) / context.getResources().getDisplayMetrics().density;
                return (int) (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f + 0.5f : f - 0.5f);
            } catch (Exception unused) {
                return 0;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class d extends b {
        @Override // com.adsurge.adn.x1.f.b
        public boolean b(Context context) {
            try {
                return ((Boolean) Class.forName("flyme.config.FlymeFeature").getDeclaredField("IS_FRINGE_DEVICE").get(null)).booleanValue();
            } catch (Exception unused) {
                return false;
            }
        }

        @Override // com.adsurge.adn.x1.f.b
        public int a(Context context) {
            if (c()) {
                return a();
            }
            return a(context, "fringe_height");
        }

        public boolean c() {
            if (Settings.Global.getInt(com.adsurge.adn.s1.a.b().a().getContentResolver(), "mz_fringe_hide", 0) != 1) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface h {
        public static final a a = a.b();

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static class b {
            public static h a() {
                a aVar = a.HUAWEI;
                a aVar2 = h.a;
                if (aVar == aVar2) {
                    return new c();
                }
                if (a.XIAOMI == aVar2) {
                    return new k();
                }
                if (a.VIVO == aVar2) {
                    return new j();
                }
                if (a.OPPO == aVar2) {
                    return new e();
                }
                if (a.MEIZU == aVar2) {
                    return new d();
                }
                if (a.SAMSUNG == aVar2) {
                    return new g();
                }
                return a.SMARTISAN == aVar2 ? new i() : new C0149f();
            }
        }

        void a(Activity activity, boolean z, boolean z2);

        void a(View view, int i, boolean z);

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public enum a {
            HUAWEI("Huawei"),
            XIAOMI("Xiaomi"),
            VIVO("vivo"),
            OPPO("OPPO"),
            MEIZU("Meizu"),
            SAMSUNG("samsung"),
            SMARTISAN("Smartisan");

            public final String a;

            a(String str) {
                this.a = str;
            }

            public static a b() {
                for (a aVar : values()) {
                    if (aVar.a.equalsIgnoreCase(Build.MANUFACTURER) || aVar.a.equalsIgnoreCase(Build.BRAND)) {
                        return aVar;
                    }
                }
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class k extends b {
        @Override // com.adsurge.adn.x1.f.b
        public boolean b(Context context) {
            int iIntValue;
            try {
                Class<?> clsLoadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
                iIntValue = ((Integer) clsLoadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(clsLoadClass, "ro.miui.notch", 0)).intValue();
            } catch (Exception unused) {
                iIntValue = 0;
            }
            return iIntValue == 1;
        }

        @Override // com.adsurge.adn.x1.f.b
        public void a(Activity activity) {
            if (Build.VERSION.SDK_INT < 26 || !d(activity)) {
                return;
            }
            try {
                Method method = Window.class.getMethod("addExtraFlags", Integer.TYPE);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(activity.getWindow(), 1792);
            } catch (Exception e) {
                e.getMessage();
            }
        }

        public boolean c() {
            if (Settings.Global.getInt(com.adsurge.adn.s1.a.b().a().getContentResolver(), "force_black", 0) != 1) {
                return false;
            }
            return true;
        }

        @Override // com.adsurge.adn.x1.f.b
        public int a(Context context) {
            if (c()) {
                return a();
            }
            return a(context, "notch_height");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements View.OnApplyWindowInsetsListener {
        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            DisplayCutout displayCutout;
            int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
            int systemWindowInsetRight = windowInsets.getSystemWindowInsetRight();
            int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
            if (systemWindowInsetTop > 0 && Build.VERSION.SDK_INT >= 28 && (displayCutout = windowInsets.getDisplayCutout()) != null) {
                systemWindowInsetLeft = Math.max(systemWindowInsetLeft, displayCutout.getSafeInsetLeft());
                systemWindowInsetTop = Math.max(systemWindowInsetTop, displayCutout.getSafeInsetTop());
                systemWindowInsetRight = Math.max(systemWindowInsetRight, displayCutout.getSafeInsetRight());
                systemWindowInsetBottom = Math.max(systemWindowInsetBottom, displayCutout.getSafeInsetBottom());
            }
            view.setPadding(systemWindowInsetLeft, systemWindowInsetTop, systemWindowInsetRight, systemWindowInsetBottom);
            return windowInsets.replaceSystemWindowInsets(0, 0, 0, 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class c extends b {
        @Override // com.adsurge.adn.x1.f.b
        public void a(Activity activity) {
            Window window = activity.getWindow();
            if (window != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                try {
                    Class<?> cls = Class.forName("com.huawei.android.view.LayoutParamsEx");
                    cls.getMethod("addHwFlags", Integer.TYPE).invoke(cls.getConstructor(WindowManager.LayoutParams.class).newInstance(attributes), 65536);
                } catch (Exception unused) {
                }
            }
        }

        @Override // com.adsurge.adn.x1.f.b
        public boolean b() {
            int rotation = ((WindowManager) com.adsurge.adn.s1.a.b().a().getSystemService("window")).getDefaultDisplay().getRotation();
            if (!c() || (rotation != 1 && rotation != 3)) {
                return true;
            }
            return false;
        }

        public boolean c() {
            if (Settings.Secure.getInt(com.adsurge.adn.s1.a.b().a().getContentResolver(), "display_notch_status", 0) != 1) {
                return false;
            }
            return true;
        }

        @Override // com.adsurge.adn.x1.f.b
        public boolean b(Context context) {
            try {
                Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
                return ((Boolean) clsLoadClass.getMethod("hasNotchInScreen", null).invoke(clsLoadClass, null)).booleanValue();
            } catch (Exception unused) {
                return false;
            }
        }

        @Override // com.adsurge.adn.x1.f.b
        public int a(Context context) {
            try {
                Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
                return ((int[]) clsLoadClass.getMethod("getNotchSize", null).invoke(clsLoadClass, null))[0];
            } catch (Exception unused) {
                return 0;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class e extends b {
        @Override // com.adsurge.adn.x1.f.b
        public int a(Context context) {
            int iA = a();
            if (80 >= iA) {
                return 80;
            }
            return iA;
        }

        @Override // com.adsurge.adn.x1.f.b
        public boolean b(Context context) {
            try {
                return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: com.adsurge.adn.x1.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class C0149f extends b {
        @Override // com.adsurge.adn.x1.f.b
        public boolean c(View view) {
            if (super.a(view.getContext(), a(view)) > 0) {
                return true;
            }
            return false;
        }

        @Override // com.adsurge.adn.x1.f.b
        public boolean d(Activity activity) {
            if (super.a(activity, b(activity)) > 0) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class g extends b {
        @Override // com.adsurge.adn.x1.f.b
        public boolean b(Context context) {
            try {
                return context.getResources().getIdentifier("config_mainBuiltInDisplayCutout", "string", "android") > 0;
            } catch (Exception unused) {
                return false;
            }
        }

        @Override // com.adsurge.adn.x1.f.b
        public int a(Context context) {
            return a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class i extends b {
        @Override // com.adsurge.adn.x1.f.b
        public int a(Context context) {
            int iA = a();
            if (82 >= iA) {
                return 82;
            }
            return iA;
        }

        @Override // com.adsurge.adn.x1.f.b
        public boolean b(Context context) {
            try {
                Class<?> clsLoadClass = context.getClassLoader().loadClass("smartisanos.api.DisplayUtilsSmt");
                return ((Boolean) clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 1)).booleanValue();
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class j extends b {
        @Override // com.adsurge.adn.x1.f.b
        public int a(Context context) {
            int iA = a();
            int iA2 = com.adsurge.adn.I0.i.a(context, 27);
            if (iA2 >= iA) {
                return iA2;
            }
            return iA;
        }

        @Override // com.adsurge.adn.x1.f.b
        public boolean b(Context context) {
            try {
                Class<?> clsLoadClass = context.getClassLoader().loadClass("android.util.FtFeature");
                return ((Boolean) clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 32)).booleanValue();
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public static void a(View view) {
        if (view == null) {
            return;
        }
        view.setOnApplyWindowInsetsListener(new a());
    }

    public static void a(Activity activity, boolean z) {
        a.a(activity, z, true);
    }

    public static void a(View view, int i2) {
        a.a(view, i2, true);
    }
}
