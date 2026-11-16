package com.adsurge.adn.W0;

import com.google.android.gms.ads.AdError;
import com.unity3d.services.UnityAdsConstants;
import io.p071bidmachine.media3.extractor.ts.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class m {
    public static final m c = new m(Float.NaN, l.UNDEFINED);
    public static final m d = new m(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, l.POINT);
    public static final m e = new m(Float.NaN, l.AUTO);
    public final float a;
    public final l b;

    public static m a(String str) {
        if (str == null) {
            return null;
        }
        if (AdError.UNDEFINED_DOMAIN.equals(str)) {
            return c;
        }
        if ("auto".equals(str)) {
            return e;
        }
        try {
            return str.endsWith("%") ? new m(Float.parseFloat(str.substring(0, str.length() - 1)), l.PERCENT) : new m(Float.parseFloat(str), l.POINT);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[l.values().length];
            a = iArr;
            try {
                iArr[l.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[l.POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[l.PERCENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[l.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            l lVar = this.b;
            if (lVar == mVar.b) {
                return lVar == l.UNDEFINED || lVar == l.AUTO || Float.compare(this.a, mVar.a) == 0;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.b.b() + Float.floatToIntBits(this.a);
    }

    public String toString() {
        int i = a.a[this.b.ordinal()];
        if (i == 1) {
            return AdError.UNDEFINED_DOMAIN;
        }
        if (i == 2) {
            return Float.toString(this.a);
        }
        if (i != 3) {
            if (i == 4) {
                return "auto";
            }
            y.b();
            return null;
        }
        return this.a + "%";
    }

    public m(float f, l lVar) {
        this.a = f;
        this.b = lVar;
    }
}
