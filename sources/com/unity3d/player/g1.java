package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class g1 {
    public static int a;

    public static void a(Activity activity, FrameLayout frameLayout, boolean z, boolean z2) {
        boolean z3;
        int iStatusBars;
        if (!PlatformSupport.RED_VELVET_CAKE_SUPPORT) {
            View decorView = activity.getWindow().getDecorView();
            int systemUiVisibility = z ? decorView.getSystemUiVisibility() | 5894 : decorView.getSystemUiVisibility() & (-5895);
            if (z2) {
                systemUiVisibility |= 1024;
            }
            decorView.setSystemUiVisibility(systemUiVisibility);
            return;
        }
        WindowInsetsController windowInsetsController = activity.getWindow().getDecorView().getWindowInsetsController();
        if (windowInsetsController != null) {
            int iNavigationBars = 0;
            if (z) {
                iStatusBars = WindowInsets.Type.navigationBars();
                z3 = true;
            } else {
                z3 = false;
                iNavigationBars = WindowInsets.Type.navigationBars();
                iStatusBars = 0;
            }
            if (z2) {
                iStatusBars |= WindowInsets.Type.statusBars();
                z3 = true;
            } else {
                iNavigationBars |= WindowInsets.Type.statusBars();
            }
            if (iStatusBars != 0) {
                windowInsetsController.hide(iStatusBars);
            }
            if (iNavigationBars != 0) {
                windowInsetsController.show(iNavigationBars);
            }
            a = iNavigationBars;
            windowInsetsController.setSystemBarsBehavior(z3 ? 2 : 1);
        }
        activity.getWindow().setDecorFitsSystemWindows(false);
    }

    public static void a(Activity activity, FrameLayout frameLayout) {
        if (PlatformSupport.RED_VELVET_CAKE_SUPPORT) {
            Insets insets = activity.getWindow().getDecorView().getRootWindowInsets().getInsets(a);
            frameLayout.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        }
    }

    public static Point a(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (PlatformSupport.RED_VELVET_CAKE_SUPPORT) {
            WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
            return new Point(currentWindowMetrics.getBounds().width(), currentWindowMetrics.getBounds().height());
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
}
