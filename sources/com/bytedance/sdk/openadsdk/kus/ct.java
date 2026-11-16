package com.bytedance.sdk.openadsdk.kus;

import android.os.Build;
import android.view.WindowInsets;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class ct {
    public static int ahm(@Nullable WindowInsets windowInsets) {
        if (windowInsets == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT < 30) {
            return windowInsets.getSystemWindowInsetBottom();
        }
        return kgy(windowInsets.getInsets(WindowInsets.Type.navigationBars()).bottom, windowInsets.getInsets(WindowInsets.Type.tappableElement()).bottom, windowInsets.getInsets(WindowInsets.Type.systemGestures()).bottom);
    }

    public static int kgy(@Nullable WindowInsets windowInsets) {
        if (windowInsets == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT < 30) {
            return windowInsets.getSystemWindowInsetTop();
        }
        return kgy(windowInsets.getInsets(WindowInsets.Type.statusBars()).top, windowInsets.getInsets(WindowInsets.Type.displayCutout()).top);
    }

    public static int kgy(int i, int i2) {
        return Math.max(i, i2);
    }

    public static int kgy(int i, int i2, int i3) {
        return Math.max(i, Math.max(i2, i3));
    }
}
