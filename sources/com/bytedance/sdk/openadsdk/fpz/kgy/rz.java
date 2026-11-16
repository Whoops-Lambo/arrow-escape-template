package com.bytedance.sdk.openadsdk.fpz.kgy;

import com.bytedance.sdk.openadsdk.core.model.ioy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class rz {
    public static int ahm = 6;
    public static boolean kgy = false;
    public static String rz = "engaged_view";

    private static ahm rz(ioy ioyVar) {
        if (ioyVar == null || !ioyVar.kii()) {
            return null;
        }
        return ioyVar.db();
    }

    public static void ahm(ioy ioyVar) {
        ahm ahmVarRz = rz(ioyVar);
        if (ahmVarRz == null) {
            return;
        }
        ahmVarRz.ahm();
    }

    public static void kgy(ioy ioyVar, boolean z) {
        int i;
        ahm ahmVarRz = rz(ioyVar);
        if (ahmVarRz != null && !ahmVarRz.rz()) {
            ahmVarRz.kgy(z);
            if (z) {
                i = 4;
            } else {
                i = 8;
            }
            ahmVarRz.kgy(i);
        }
    }

    public static void kgy(ioy ioyVar, int i) {
        ahm ahmVarRz = rz(ioyVar);
        if (ahmVarRz == null || ahmVarRz.rz()) {
            return;
        }
        ahmVarRz.kgy(i);
    }

    public static void kgy(ioy ioyVar) {
        ahm ahmVarRz = rz(ioyVar);
        if (ahmVarRz == null) {
            return;
        }
        ahmVarRz.kgy();
    }
}
