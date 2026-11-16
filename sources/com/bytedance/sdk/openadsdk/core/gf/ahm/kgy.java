package com.bytedance.sdk.openadsdk.core.gf.ahm;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.openadsdk.lqi.ct;
import com.bytedance.sdk.openadsdk.utils.gbb;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class kgy {
    public static boolean ahm(Activity activity) {
        try {
            return gbb.kgy(activity) && (kgy() & 1) != 0;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4CyBCqpswphaxVifAu49T+chhg==", "f/cjlA61avGJT8BomBisOw==", "SOYigA+4TMmBSNtYoBCyL17dLocGuWfhj1jlWJsQsix9+yGZML97woVE", 42);
            return false;
        }
    }

    public static boolean rz(Activity activity) {
        try {
            return gbb.kgy(activity) && (kgy() & 2) != 0;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4CyBCqpswphaxVifAu49T+chhg==", "f/cjlA61avGJT8BomBisOw==", "SOYigA+4TMmBSNtYoBCyL17dLocGuWfhj1j2TZw+sC1V", 55);
            return false;
        }
    }

    public static float[] kgy(Context context, int i, int i2) {
        boolean z;
        boolean z2;
        float fKgy = kgy(context);
        float fAhm = ahm(context);
        if (i2 == 1) {
            z = true;
        } else {
            z = false;
        }
        if (fKgy > fAhm) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            float f = fKgy + fAhm;
            fAhm = f - fAhm;
            fKgy = f - fAhm;
        }
        if (i2 == 1) {
            fKgy -= i;
        } else {
            fAhm -= i;
        }
        return new float[]{fAhm, fKgy};
    }

    public static int ahm() {
        try {
            return ct.kgy("min_edge_bounding_box", 0);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4CyBCqpswphaxVifAu49T+chhg==", "f/cjlA61avGJT8BomBisOw==", "XOs5uAqyTMOHT/VSmR+kIVXpD5obj2rCjk8=", 98);
            return 0;
        }
    }

    public static float ahm(Context context) {
        return gbb.rz(context, gbb.kus(context));
    }

    public static boolean kgy(Activity activity) {
        try {
            return gbb.kgy(activity) && (kgy() & 4) != 0;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4CyBCqpswphaxVifAu49T+chhg==", "f/cjlA61avGJT8BomBisOw==", "SOYigA+4TMmBSNtYoBCyL17dLocGuWfhj1j7XIIVqSZc3iySBg==", 29);
            return false;
        }
    }

    public static int kgy() {
        int iAhm = ahm();
        if (kgy(iAhm)) {
            return iAhm;
        }
        return 0;
    }

    private static boolean kgy(int i) {
        return i >= 0 && (i & (-8)) == 0;
    }

    public static float kgy(Context context) {
        return gbb.rz(context, gbb.twf(context));
    }
}
