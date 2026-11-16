package com.bytedance.sdk.openadsdk.core;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.gbb;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class muf {
    private static int rz(View view, int i) {
        if (i == 3) {
            return gbb.noq(view.getContext().getApplicationContext()) / 2;
        }
        return 20;
    }

    public static float kgy(View view) {
        if (view != null) {
            try {
                if (view.getVisibility() == 0 && view.getParent() != null) {
                    Rect rect = new Rect();
                    if (!view.getGlobalVisibleRect(rect)) {
                        return -1.0f;
                    }
                    long jHeight = ((long) rect.height()) * ((long) rect.width());
                    long height = ((long) view.getHeight()) * ((long) view.getWidth());
                    if (height <= 0) {
                        return -1.0f;
                    }
                    return jHeight / height;
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "bec+nAG1Zc6UU/RViRKrLUk=", "XOs5owqvYMWMT/ZPiRA=", 64);
            }
        }
        return -1.0f;
    }

    private static int ahm(View view, int i, int i2, boolean z) throws Throwable {
        if (view.getWindowVisibility() != 0) {
            return 4;
        }
        if (!ahm(view)) {
            return 1;
        }
        if (!kgy(view, i2, z)) {
            return 6;
        }
        if (!kgy(view, i)) {
            return 3;
        }
        return 0;
    }

    private static int ahm(View view, int i) {
        if (i == 3) {
            return (int) (((double) gbb.uq(view.getContext().getApplicationContext())) * 0.7d);
        }
        return 20;
    }

    private static boolean ahm(View view) {
        return view != null && view.isShown();
    }

    private static boolean kgy(View view, int i) {
        float fKgy = kgy(view);
        return fKgy > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fKgy >= ((float) i) / 100.0f;
    }

    private static boolean kgy(View view, int i, boolean z) {
        int iAhm = ahm(view, i);
        int iRz = rz(view, i);
        if (i == 1 && z) {
            return view.getWidth() > 0 && view.getHeight() > 0;
        }
        return view.getWidth() >= iAhm && view.getHeight() >= iRz;
    }

    public static boolean kgy(View view, int i, int i2, boolean z) {
        if (i2 == 1) {
            while (view != null) {
                try {
                    if (view.getVisibility() != 0) {
                        return false;
                    }
                    if ((view instanceof com.bytedance.sdk.openadsdk.core.gf.um) || (view instanceof com.bytedance.sdk.openadsdk.core.rz.uq)) {
                        break;
                    }
                    view = (View) view.getParent();
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "bec+nAG1Zc6UU/RViRKrLUk=", "Uv0enQyr", 147);
                    return false;
                }
            }
            if (z) {
                i = 0;
            }
        }
        return ahm(view, i, i2, z) == 0;
    }
}
