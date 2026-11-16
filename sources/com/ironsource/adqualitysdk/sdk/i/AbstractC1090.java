package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.Ἵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC1090 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass();
    }

    /* JADX INFO: renamed from: ﾒ */
    public abstract C1033 mo364(C0890 c0890, C1199 c1199);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m794(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        int length = objArr.length;
        boolean z = true;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            if (!z) {
                sb.append(StringFog.decrypt("oQM=\n", "jSNeFm73I18=\n"));
            }
            if (obj instanceof String) {
                sb.append(StringFog.decrypt("Dw==\n", "LalVVaZkv+w=\n"));
                sb.append(obj);
                sb.append(StringFog.decrypt("xw==\n", "5V03Bjuehbg=\n"));
            } else {
                sb.append(obj);
            }
            i++;
            z = false;
        }
        return sb.toString();
    }

    public int hashCode() {
        return getClass().hashCode();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final C1033 m795(C0890 c0890, C1199 c1199) {
        C1033 c1033Mo364 = mo364(c0890, c1199);
        if (c1033Mo364 != null) {
            Object obj = c1033Mo364.f3012;
            if (obj instanceof AbstractC1090) {
                return ((AbstractC1090) obj).m795(c0890, c1199);
            }
            return c1033Mo364;
        }
        return c1033Mo364;
    }
}
