package com.google.android.gms.internal.common;

import com.tiktok.appevents.edp.TTEDPEventConstants;
import defpackage.d;
import defpackage.pv1;
import io.p071bidmachine.media3.extractor.ts.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzs {
    public static void a(int i, int i2) {
        String strA;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strA = zzy.a("%s (%s) must not be negative", TTEDPEventConstants.EDP_EVENT_PROPERTY_INDEX, Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    d.r(pv1.l(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
                    return;
                }
                strA = zzy.a("%s (%s) must be less than size (%s)", TTEDPEventConstants.EDP_EVENT_PROPERTY_INDEX, Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strA);
        }
    }

    public static void b(int i, int i2) {
        if (i < 0 || i > i2) {
            y.p(d(i, i2, TTEDPEventConstants.EDP_EVENT_PROPERTY_INDEX));
        }
    }

    public static void c(int i, int i2, int i3) {
        String strD;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strD = d(i, i3, "start index");
            } else {
                strD = (i2 < 0 || i2 > i3) ? d(i2, i3, "end index") : zzy.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strD);
        }
    }

    public static String d(int i, int i2, String str) {
        if (i < 0) {
            return zzy.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzy.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        d.r(pv1.l(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
        return null;
    }
}
