package com.moloco.sdk.internal.services;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import defpackage.cm2;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class q {
    public final Context a;
    public final cm2 b = new cm2(new com.moloco.sdk.acm.services.e(this, 7));

    public final b0 a() {
        String networkOperatorName;
        boolean z;
        String str;
        String str2 = Build.MANUFACTURER;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = Build.MODEL;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = Build.HARDWARE;
        String str5 = str4 != null ? str4 : "";
        boolean zBooleanValue = ((Boolean) this.b.getValue()).booleanValue();
        Build.VERSION.RELEASE.getClass();
        String str6 = str4;
        int i = Build.VERSION.SDK_INT;
        String language = Locale.getDefault().getLanguage();
        language.getClass();
        TelephonyManager telephonyManager = (TelephonyManager) this.a.getSystemService(TelephonyManager.class);
        if (telephonyManager == null || (networkOperatorName = telephonyManager.getNetworkOperatorName()) == null) {
            networkOperatorName = "";
        }
        float f = Resources.getSystem().getDisplayMetrics().density;
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        if (str6 == null) {
            str6 = "";
        }
        String str7 = Build.BRAND;
        if (str7 == null) {
            z = zBooleanValue;
            str = "";
        } else {
            z = zBooleanValue;
            str = str7;
        }
        new b0(str2, str3, str5, z, i, language, networkOperatorName, f, jCurrentTimeMillis, str6, str);
        return r1;
    }

    public q(Context context) {
        this.a = context;
    }
}
