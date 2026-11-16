package com.google.android.gms.internal.p002firebaseauthapi;

import com.tiktok.appevents.edp.TTEDPEventConstants;
import defpackage.d;
import defpackage.pv1;
import io.p071bidmachine.media3.extractor.ts.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzu {
    public static void a(int i, int i2) {
        String strB;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strB = zzac.b("%s (%s) must not be negative", TTEDPEventConstants.EDP_EVENT_PROPERTY_INDEX, Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    d.r(pv1.k(i2, "negative size: "));
                    return;
                }
                strB = zzac.b("%s (%s) must be less than size (%s)", TTEDPEventConstants.EDP_EVENT_PROPERTY_INDEX, Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strB);
        }
    }

    public static void b(int i, int i2, int i3) {
        String strC;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strC = c(i, i3, "start index");
            } else {
                strC = (i2 < 0 || i2 > i3) ? c(i2, i3, "end index") : zzac.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strC);
        }
    }

    public static String c(int i, int i2, String str) {
        if (i < 0) {
            return zzac.b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzac.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        d.r(pv1.k(i2, "negative size: "));
        return null;
    }

    public static void d(int i, int i2) {
        if (i < 0 || i > i2) {
            y.p(c(i, i2, TTEDPEventConstants.EDP_EVENT_PROPERTY_INDEX));
        }
    }
}
