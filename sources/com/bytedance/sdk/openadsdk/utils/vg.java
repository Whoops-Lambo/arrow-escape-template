package com.bytedance.sdk.openadsdk.utils;

import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class vg {
    private static String ahm = null;
    private static String kgy = null;
    private static String rz = null;
    private static volatile boolean uq = true;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy extends com.bytedance.sdk.component.gf.ahm.rz {
        public static AtomicBoolean kgy = new AtomicBoolean(false);
        private static final AtomicLong ahm = new AtomicLong(0);

        public static void kgy() {
            if (kgy.get()) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            AtomicLong atomicLong = ahm;
            if (jCurrentTimeMillis - atomicLong.get() < 600000) {
                return;
            }
            atomicLong.set(jCurrentTimeMillis);
            mw.rz((Runnable) new kgy("UpdateSimStatusTask", 5));
        }

        @Override // java.lang.Runnable
        public void run() {
            kgy.set(true);
            vg.ct();
            kgy.set(false);
        }

        public kgy(String str, int i) {
            super(str, i);
        }
    }

    public static String ahm() {
        try {
            kgy.kgy();
            if (!uq) {
                com.bytedance.sdk.component.utils.sx.rz("MCC", "getMCC".concat(uq ? "Have SIM card" : "No SIM card, MCC returns null"));
                return null;
            }
            Configuration configuration = com.bytedance.sdk.openadsdk.core.xh.kgy().getResources().getConfiguration();
            int i = configuration.mcc;
            String strValueOf = i != 0 ? String.valueOf(i) : ahm;
            com.bytedance.sdk.component.utils.sx.rz("MCC", "config=" + configuration.mcc + ",sMCC=" + ahm);
            return strValueOf;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "aOcgoBe1ZdQ=", "XOs5uCCf", 110);
            com.bytedance.sdk.component.utils.sx.rz("SimUtils", th.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ct() {
        String simOperatorName;
        String simOperator;
        String strSubstring;
        if (com.bytedance.sdk.openadsdk.core.xh.kgy() == null) {
            return;
        }
        uq = true;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) com.bytedance.sdk.openadsdk.core.xh.kgy().getSystemService("phone");
            try {
                int simState = telephonyManager.getSimState();
                if (simState == 0 || simState == 1) {
                    uq = false;
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "aOcgoBe1ZdQ=", "UuAkgQ==", 48);
                com.bytedance.sdk.component.utils.sx.rz("SimUtils", th.getMessage());
            }
            String str = null;
            try {
                simOperatorName = telephonyManager.getSimOperatorName();
            } catch (Throwable th2) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "aOcgoBe1ZdQ=", "UuAkgQ==", 55);
                simOperatorName = null;
            }
            try {
                simOperator = telephonyManager.getNetworkOperator();
            } catch (Throwable th3) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th3, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "aOcgoBe1ZdQ=", "UuAkgQ==", 61);
                simOperator = null;
            }
            if (simOperator == null || simOperator.length() < 5) {
                try {
                    simOperator = telephonyManager.getSimOperator();
                } catch (Throwable th4) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th4, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "aOcgoBe1ZdQ=", "UuAkgQ==", 67);
                }
            }
            if (TextUtils.isEmpty(simOperator) || simOperator.length() <= 4) {
                strSubstring = null;
            } else {
                String strSubstring2 = simOperator.substring(0, 3);
                strSubstring = simOperator.substring(3);
                str = strSubstring2;
            }
            if (!TextUtils.isEmpty(simOperatorName)) {
                kgy = simOperatorName;
            }
            if (!TextUtils.isEmpty(str)) {
                ahm = str;
            }
            if (TextUtils.isEmpty(strSubstring)) {
                return;
            }
            rz = strSubstring;
        } catch (Throwable th5) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th5, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "aOcgoBe1ZdQ=", "UuAkgQ==", 87);
        }
    }

    public static String kgy() {
        kgy.kgy();
        return kgy;
    }

    public static String rz() {
        kgy.kgy();
        return rz;
    }
}
