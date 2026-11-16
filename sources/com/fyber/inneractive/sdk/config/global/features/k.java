package com.fyber.inneractive.sdk.config.global.features;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class k extends i {
    public k() {
        super("load_timeouts");
    }

    public static String a(String... strArr) {
        StringBuilder sb = new StringBuilder();
        Iterator it = Arrays.asList(strArr).iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append("_");
            }
        }
        return sb.toString();
    }

    public static boolean d(String str) {
        return UnitDisplayType.INTERSTITIAL.name().equalsIgnoreCase(str) || UnitDisplayType.REWARDED.name().equalsIgnoreCase(str);
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return "all_mediators";
        }
        return str.toLowerCase(Locale.US);
    }

    public final int b(String str, String str2) {
        int iIntValue;
        String strA = a(str, "bidding", "global_timeout", e(str2));
        String strA2 = a(str, "bidding", "global_timeout", "all_mediators");
        if (d(str)) {
            iIntValue = 30000;
        } else {
            iIntValue = 10000;
        }
        Integer numA = a(a(str, "global_timeout", "all_mediators"));
        if (numA != null) {
            iIntValue = numA.intValue();
        }
        Integer numA2 = a(strA2);
        if (numA2 != null) {
            iIntValue = numA2.intValue();
        }
        Integer numA3 = a(strA);
        if (numA3 != null) {
            return numA3.intValue();
        }
        return iIntValue;
    }

    public final int c(String str, String str2) {
        int iIntValue;
        String strA = a(str, "global_timeout", e(str2));
        String strA2 = a(str, "global_timeout", "all_mediators");
        if (d(str)) {
            iIntValue = 30000;
        } else {
            iIntValue = 10000;
        }
        Integer numA = a(a(str, "global_timeout", "all_mediators"));
        if (numA != null) {
            iIntValue = numA.intValue();
        }
        Integer numA2 = a(strA2);
        if (numA2 != null) {
            iIntValue = numA2.intValue();
        }
        Integer numA3 = a(strA);
        if (numA3 != null) {
            return numA3.intValue();
        }
        return iIntValue;
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.i
    public final i b() {
        k kVar = new k();
        a(kVar);
        return kVar;
    }
}
