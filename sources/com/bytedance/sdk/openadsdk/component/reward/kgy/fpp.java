package com.bytedance.sdk.openadsdk.component.reward.kgy;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class fpp {
    public static int ahm(Activity activity, int i) {
        return kgy(activity, 1, i);
    }

    private static boolean rz(Activity activity, int i) {
        try {
            if (i != 1) {
                return (i == 3 && com.bytedance.sdk.openadsdk.core.gf.ahm.kgy.kgy(activity)) ? false : true;
            }
            return !com.bytedance.sdk.openadsdk.core.gf.ahm.kgy.ahm(activity);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48erThU4CibF/J7wpdLxVnCHKEmWukohw==", "aO0/kAayRtWJT9lJjQWpJ1XGKJkTuXs=", "Uv0elgaybPePRt5elTCsJFT5C5oRv2zokkPSU5gQtCFU4A==", Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
            return false;
        }
    }

    public static int kgy(Activity activity, View view, Configuration configuration, int i, boolean z) {
        int i2;
        FrameLayout.LayoutParams layoutParams;
        if (activity != null && view != null && com.bytedance.sdk.openadsdk.core.gf.ahm.kgy.kgy(activity)) {
            if (configuration == null) {
                Resources resources = activity.getResources();
                configuration = resources != null ? resources.getConfiguration() : null;
            }
            if (configuration != null && (((i2 = configuration.orientation) == 2 || i2 == 1) && (!z || i != i2))) {
                try {
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                        layoutParams = (FrameLayout.LayoutParams) layoutParams2;
                    } else {
                        layoutParams = layoutParams2 != null ? new FrameLayout.LayoutParams(layoutParams2) : new FrameLayout.LayoutParams(-1, -1);
                    }
                    if (i2 == 2) {
                        float[] fArrKgy = at.kgy(activity, 2, false);
                        int i3 = fArrKgy.length > 0 ? (int) fArrKgy[0] : 0;
                        if (i3 > 0) {
                            layoutParams.width = i3;
                            layoutParams.height = i3;
                            layoutParams.gravity = 17;
                        }
                    } else {
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                        layoutParams.gravity = 0;
                    }
                    view.setLayoutParams(layoutParams);
                    return i2;
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48erThU4CibF/J7wpdLxVnCHKEmWukohw==", "aO0/kAayRtWJT9lJjQWpJ1XGKJkTuXs=", "Tv4plBe5RcaOTt5TiyGhL17cIpoXkGjej1/De4MDjClJ6SimAK5swo5j0XOJFKQtXw==", 204);
                }
            }
        }
        return i;
    }

    public static boolean kgy(Activity activity, int i) {
        try {
            return kgy(activity) && rz(activity, i);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48erThU4CibF/J7wpdLxVnCHKEmWukohw==", "aO0/kAayRtWJT9lJjQWpJ1XGKJkTuXs=", "WO8jswyuasKvWN5YggWhPFLhIw==", 45);
            return false;
        }
    }

    public static int kgy(Activity activity, int i, boolean z, int i2) {
        return kgy(activity, kgy(i, z), i2);
    }

    public static int kgy(Activity activity, int i, int i2) {
        if (!kgy(activity, i2)) {
            Objects.toString(activity);
            return 0;
        }
        try {
            if (activity.getRequestedOrientation() == i) {
                return 2;
            }
            activity.toString();
            activity.setRequestedOrientation(i);
            return 1;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48erThU4CibF/J7wpdLxVnCHKEmWukohw==", "aO0/kAayRtWJT9lJjQWpJ1XGKJkTuXs=", "SOs5pwatfMKTXtJZowOpLVX6LIEKs2f0gUzSUZU=", 93);
            return 3;
        }
    }

    private static boolean kgy(Activity activity) {
        return (activity == null || Build.VERSION.SDK_INT == 26) ? false : true;
    }

    public static int kgy(int i, boolean z) {
        if (i == 2) {
            return z ? 8 : 0;
        }
        return 1;
    }
}
