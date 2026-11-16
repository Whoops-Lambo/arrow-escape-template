package com.ironsource.adqualitysdk.sdk.i;

import android.util.Log;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.h50;
import defpackage.q63;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.Λ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0509 {
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m488(String str, String str2) {
        m497(str, str, str2, null, null, false);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m489(String str, String str2) {
        m496(str, str, str2, null, false);
    }

    static {
        StringFog.decrypt("OjZHTduy5aEQIQhi7Izlsh8tXFo=\n", "c0QoI4jdkNM=\n");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m491(String str, String str2, String str3, boolean z) {
        if (m492()) {
            Log.v(m494(str), str3);
        } else if (z && m493().shouldPrintLog(ISAdQualityLogLevel.VERBOSE)) {
            Log.v(m494(str2), str3);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m497(String str, String str2, String str3, Throwable th, AbstractC0804 abstractC0804, boolean z) {
        if (m492()) {
            String strM494 = m494(str);
            if (abstractC0804 != null) {
                str3 = str3 + "\n" + abstractC0804;
            }
            Log.e(strM494, str3, th);
            return;
        }
        if (z && m493().shouldPrintLog(ISAdQualityLogLevel.ERROR)) {
            String strM495 = m494(str2);
            if (abstractC0804 != null) {
                str3 = str3 + "\n" + abstractC0804;
            }
            Log.e(strM495, str3, th);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m490(String str, String str2) {
        m497(str, str, str2, null, null, true);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m492() {
        boolean z;
        C1328 c1328M948 = C1328.m948();
        synchronized (c1328M948) {
            z = c1328M948.f3961;
        }
        return z;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m499(String str, String str2, boolean z) {
        m497(str, str, str2, null, null, z);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static ISAdQualityLogLevel m493() {
        ISAdQualityLogLevel iSAdQualityLogLevel;
        C1328 c1328M948 = C1328.m948();
        synchronized (c1328M948) {
            iSAdQualityLogLevel = c1328M948.f3960;
        }
        return iSAdQualityLogLevel;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m498(String str, String str2, String str3, boolean z) {
        if (m492()) {
            Log.i(m494(str), str3);
        } else if (z && m493().shouldPrintLog(ISAdQualityLogLevel.INFO)) {
            Log.i(m494(str2), str3);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m495(String str, String str2) {
        m496(str, str, str2, null, true);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m496(String str, String str2, String str3, Object obj, boolean z) {
        if (obj != null) {
            StringBuilder sbQ = h50.q(str3, "\n");
            sbQ.append(obj.toString());
            str3 = sbQ.toString();
        }
        if (m492()) {
            Log.d(m494(str), str3);
        } else if (z && m493().shouldPrintLog(ISAdQualityLogLevel.DEBUG)) {
            Log.d(m494(str2), str3);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m494(String str) {
        return q63.i("kRYdZI/kcVu7AVJLuNpxSLQNBnPmqw==\n", "2GRyCtyLBCk=\n", str);
    }
}
