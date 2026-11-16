package com.bytedance.sdk.component.yo.kgy.ahm;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.yo.kgy.kgy.ct;
import com.bytedance.sdk.component.yo.kgy.yo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class kgy {
    private static long ahm(int i, Context context) {
        if (context == null) {
            return i;
        }
        Runtime runtime = Runtime.getRuntime();
        long jFreeMemory = runtime.freeMemory() / 1048576;
        long jMaxMemory = (runtime.maxMemory() / 1048576) - (runtime.totalMemory() / 1048576);
        if (jMaxMemory <= 0) {
            if (jFreeMemory <= 2) {
                return 1L;
            }
            return jFreeMemory <= 10 ? Math.min(i, 10) : Math.min((jFreeMemory / 2) * 10, i);
        }
        long j = ((jFreeMemory + jMaxMemory) - 10) / 2;
        if (j <= 2) {
            return 1L;
        }
        return j <= 10 ? Math.min(i, 10) : Math.min(j * 10, i);
    }

    public static boolean ct() {
        ct ctVarRz = yo.noq().rz();
        if (ctVarRz != null && !TextUtils.isEmpty(ctVarRz.rz())) {
            return true;
        }
        return false;
    }

    public static boolean kgy() {
        ct ctVarRz = yo.noq().rz();
        if (ctVarRz != null && !TextUtils.isEmpty(ctVarRz.kgy())) {
            return true;
        }
        return false;
    }

    public static boolean noq() {
        ct ctVarRz = yo.noq().rz();
        if (ctVarRz != null && !TextUtils.isEmpty(ctVarRz.noq())) {
            return true;
        }
        return false;
    }

    public static boolean rz() {
        ct ctVarRz = yo.noq().rz();
        if (ctVarRz != null && !TextUtils.isEmpty(ctVarRz.uq())) {
            return true;
        }
        return false;
    }

    public static boolean uq() {
        ct ctVarRz = yo.noq().rz();
        if (ctVarRz != null && !TextUtils.isEmpty(ctVarRz.ct())) {
            return true;
        }
        return false;
    }

    public static long kgy(int i, Context context) {
        return ahm(i, context);
    }

    public static boolean ahm() {
        ct ctVarRz = yo.noq().rz();
        return (ctVarRz == null || TextUtils.isEmpty(ctVarRz.ahm())) ? false : true;
    }
}
