package com.bytedance.adsdk.ahm;

import android.content.Context;
import android.os.Trace;
import com.singular.sdk.internal.UserDetailsUtils;
import com.unity3d.services.UnityAdsConstants;
import defpackage.e32;
import defpackage.h50;
import defpackage.nj;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class ct {
    private static boolean ahm = false;
    private static volatile com.bytedance.adsdk.ahm.uq.yo at = null;
    private static String[] ct = null;
    private static int fi = 0;
    private static com.bytedance.adsdk.ahm.uq.noq gf = null;
    public static boolean kgy = false;
    private static long[] noq = null;
    private static volatile com.bytedance.adsdk.ahm.uq.fi nu = null;
    private static com.bytedance.adsdk.ahm.uq.ct ra = null;
    private static boolean rz = true;
    private static boolean uq = true;
    private static int yo;

    public static float ahm(String str) {
        int i = fi;
        if (i > 0) {
            fi = i - 1;
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (!ahm) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int i2 = yo - 1;
        yo = i2;
        if (i2 == -1) {
            e32.i("Can't end trace section. There are none.");
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (str.equals(ct[i2])) {
            Trace.endSection();
            return (System.nanoTime() - noq[yo]) / 1000000.0f;
        }
        e32.i(nj.q(h50.r("Unbalanced trace call ", str, ". Expected "), ct[yo], UserDetailsUtils.UserDetailsLiterals.DOT));
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public static void kgy(String str) {
        if (ahm) {
            int i = yo;
            if (i == 20) {
                fi++;
                return;
            }
            ct[i] = str;
            noq[i] = System.nanoTime();
            Trace.beginSection(str);
            yo++;
        }
    }

    public static com.bytedance.adsdk.ahm.uq.fi kgy(Context context) {
        com.bytedance.adsdk.ahm.uq.fi fiVar;
        com.bytedance.adsdk.ahm.uq.fi fiVar2 = nu;
        if (fiVar2 != null) {
            return fiVar2;
        }
        synchronized (com.bytedance.adsdk.ahm.uq.fi.class) {
            try {
                fiVar = nu;
                if (fiVar == null) {
                    com.bytedance.adsdk.ahm.uq.yo yoVarAhm = ahm(context);
                    com.bytedance.adsdk.ahm.uq.noq ahmVar = gf;
                    if (ahmVar == null) {
                        ahmVar = new com.bytedance.adsdk.ahm.uq.ahm();
                    }
                    fiVar = new com.bytedance.adsdk.ahm.uq.fi(yoVarAhm, ahmVar);
                    nu = fiVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fiVar;
    }

    public static boolean kgy() {
        return uq;
    }

    public static com.bytedance.adsdk.ahm.uq.yo ahm(Context context) {
        com.bytedance.adsdk.ahm.uq.yo yoVar;
        if (!rz) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        com.bytedance.adsdk.ahm.uq.yo yoVar2 = at;
        if (yoVar2 != null) {
            return yoVar2;
        }
        synchronized (com.bytedance.adsdk.ahm.uq.yo.class) {
            try {
                yoVar = at;
                if (yoVar == null) {
                    com.bytedance.adsdk.ahm.uq.ct ctVar = ra;
                    if (ctVar == null) {
                        ctVar = new com.bytedance.adsdk.ahm.uq.ct() { // from class: com.bytedance.adsdk.ahm.ct.1
                            @Override // com.bytedance.adsdk.ahm.uq.ct
                            public File kgy() {
                                return new File(applicationContext.getCacheDir(), "lottie_network_cache");
                            }
                        };
                    }
                    yoVar = new com.bytedance.adsdk.ahm.uq.yo(ctVar);
                    at = yoVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yoVar;
    }
}
