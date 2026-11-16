package com.adsurge.adn.p036k1;

import android.text.TextUtils;
import com.adsurge.adn.X.A;
import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.adsurge.adn.p026h0.k;
import com.adsurge.adn.u1.c;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class D {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AdSurgeAdFormat.values().length];
            a = iArr;
            try {
                iArr[AdSurgeAdFormat.NATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AdSurgeAdFormat.BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AdSurgeAdFormat.APP_OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String a(c cVar) {
        int i;
        int i2;
        String str;
        boolean zJ = com.adsurge.adn.J.a.d().c().j();
        int iZ0 = cVar.z0();
        int i3 = 2;
        if (zJ) {
            i = 2;
        } else {
            i = 1;
        }
        if (iZ0 == 3) {
            i2 = 0;
        } else if (cVar.t0() > cVar.s0()) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        AdSurgeAdFormat adSurgeAdFormatX = cVar.x();
        int i4 = adSurgeAdFormatX.type;
        int i5 = a.a[adSurgeAdFormatX.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    i3 = i2;
                } else {
                    if (iZ0 == 3) {
                        if (TextUtils.isEmpty(cVar.D0())) {
                            iZ0 = 1;
                        } else {
                            iZ0 = 2;
                        }
                    }
                    if (cVar.t0() <= cVar.s0()) {
                        i3 = 1;
                    }
                }
            } else {
                if (cVar.N0()) {
                    if (cVar.C() == 1) {
                        i4 = 20;
                    } else {
                        i4 = 21;
                    }
                }
                i = 0;
                iZ0 = 0;
                i3 = 0;
            }
        } else {
            if (iZ0 == 3) {
                if (TextUtils.isEmpty(cVar.e0())) {
                    iZ0 = 1;
                } else {
                    iZ0 = 2;
                }
            }
            i = 0;
            i3 = 0;
        }
        Locale locale = Locale.CHINA;
        if (A.b()) {
            str = "1%d%d%d%02d";
        } else {
            str = "%d%d%d%02d";
        }
        return String.format(locale, str, Integer.valueOf(iZ0), Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i4));
    }

    public static k a(String str, int i) {
        return new k(str, i);
    }
}
