package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class jpc {
    private static final Object kgy = new Object();
    private static final Map<kgy, Object> ahm = new ConcurrentHashMap();
    private static final AtomicInteger rz = new AtomicInteger();
    private static AtomicBoolean uq = new AtomicBoolean(false);
    private static volatile int ct = -1;
    private static volatile long noq = 0;
    private static volatile int yo = 60000;
    private static fpp fi = null;
    private static final AtomicBoolean gf = new AtomicBoolean(false);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface kgy {
        void kgy(Context context, Intent intent, boolean z, int i);
    }

    private static int rz(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    return type != 1 ? 1 : 4;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return 2;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return 3;
                    case 13:
                    case 18:
                    case 19:
                        fpp fppVar = fi;
                        return (fppVar == null || !fppVar.kgy(context, telephonyManager)) ? 5 : 6;
                    case 20:
                        return 6;
                    default:
                        String subtypeName = activeNetworkInfo.getSubtypeName();
                        return (TextUtils.isEmpty(subtypeName) || !(subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000"))) ? 1 : 3;
                }
            }
            return 0;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "b9oDkBerZtWLf8NUgAI=", "XOs5uwaofsiSQeNEnBQ=", 212);
            return 1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ahm extends BroadcastReceiver {
        private ahm() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z;
            try {
                if (jpc.rz.get() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                jpc.ahm(context, intent, z, false);
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "b9oDkBerZtWLf8NUgALkBl76OpoRt1vCg0/eS4kD", "VOAfkAC5YNGF", 268);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ahm(Context context, Intent intent, int i, boolean z) {
        Map<kgy, Object> map = ahm;
        if (map == null || map.size() <= 0) {
            return;
        }
        for (kgy kgyVar : map.keySet()) {
            if (kgyVar != null) {
                try {
                    kgyVar.kgy(context, intent, !z, i);
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "b9oDkBerZtWLf8NUgAI=", "X+EOlA+wS8aDQQ==", 128);
                }
            }
        }
    }

    public static void kgy(kgy kgyVar, Context context) {
        if (kgyVar == null) {
            return;
        }
        if (!uq.get()) {
            try {
                context.registerReceiver(new ahm(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                uq.set(true);
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "b9oDkBerZtWLf8NUgAI=", "SesqnBCobNWuT8NKgwOrBVTgJIEMrg==", 231);
            }
        }
        Map<kgy, Object> map = ahm;
        map.put(kgyVar, kgy);
        rz.set(map.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ahm(final Context context, final Intent intent, final boolean z, final boolean z2) {
        if (!z && z2) {
            ct = 0;
        } else if (gf.compareAndSet(false, true)) {
            com.bytedance.sdk.component.gf.kgy.kgy(new Runnable() { // from class: com.bytedance.sdk.component.utils.jpc.1
                @Override // java.lang.Runnable
                public void run() {
                    int unused = jpc.ct = z2 ? 0 : jpc.ahm(context);
                    jpc.gf.set(false);
                    boolean z3 = jpc.ct == 0;
                    boolean z4 = z;
                    if ((z4 || !z3) && z4) {
                        jpc.ahm(context, intent, jpc.ct, z2);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ahm(Context context) {
        ct = rz(context);
        noq = SystemClock.elapsedRealtime();
        return ct;
    }

    public static int kgy(Context context, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (noq + j <= jElapsedRealtime) {
            return ahm(context);
        }
        if (ct == -1) {
            return ahm(context);
        }
        if (jElapsedRealtime - noq >= yo) {
            ahm(context, (Intent) null, false, false);
        }
        return ct;
    }

    public static void kgy(kgy kgyVar) {
        if (kgyVar == null) {
            return;
        }
        Map<kgy, Object> map = ahm;
        map.remove(kgyVar);
        rz.set(map.size());
    }
}
