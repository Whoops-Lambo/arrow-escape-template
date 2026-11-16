package com.google.android.gms.internal.ads;

import com.tiktok.appevents.edp.TTEDPEventConstants;
import defpackage.e32;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgvz {
    public static void a(boolean z) {
        if (z) {
            return;
        }
        e32.a();
    }

    public static void b(String str, boolean z) {
        if (z) {
            return;
        }
        defpackage.d.r(str);
    }

    public static void c(int i, String str, boolean z) {
        if (z) {
            return;
        }
        defpackage.d.r(zzgwq.a(str, Integer.valueOf(i)));
    }

    public static void d(long j, boolean z, String str) {
        if (z) {
            return;
        }
        defpackage.d.r(zzgwq.a(str, Long.valueOf(j)));
    }

    public static void e(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        defpackage.d.r(zzgwq.a(str, obj));
    }

    public static void f(boolean z) {
        if (z) {
            return;
        }
        io.p071bidmachine.media3.extractor.ts.y.b();
    }

    public static void g(String str, boolean z) {
        if (z) {
            return;
        }
        e32.i(str);
    }

    public static void h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        defpackage.d.w(str);
    }

    public static void i(int i, int i2) {
        String strA;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strA = zzgwq.a("%s (%s) must not be negative", TTEDPEventConstants.EDP_EVENT_PROPERTY_INDEX, Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    defpackage.d.r(pv1.l(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
                    return;
                }
                strA = zzgwq.a("%s (%s) must be less than size (%s)", TTEDPEventConstants.EDP_EVENT_PROPERTY_INDEX, Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strA);
        }
    }

    public static void j(int i, int i2) {
        if (i < 0 || i > i2) {
            io.p071bidmachine.media3.extractor.ts.y.p(l(i, i2, TTEDPEventConstants.EDP_EVENT_PROPERTY_INDEX));
        }
    }

    public static void k(int i, int i2, int i3) {
        String strL;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strL = l(i, i3, "start index");
            } else {
                strL = (i2 < 0 || i2 > i3) ? l(i2, i3, "end index") : zzgwq.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strL);
        }
    }

    public static String l(int i, int i2, String str) {
        if (i < 0) {
            return zzgwq.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzgwq.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        defpackage.d.r(pv1.l(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
        return null;
    }
}
