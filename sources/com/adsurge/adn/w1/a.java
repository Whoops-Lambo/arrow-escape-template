package com.adsurge.adn.w1;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    public static final int a;
    public static final boolean b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final HashSet h;
    public static final Set i;
    public static final boolean j;

    static {
        int iNextInt = new Random(System.currentTimeMillis()).nextInt(10000);
        a = iNextInt;
        b = iNextInt < com.adsurge.adn.N.b.a("evtsp", 10000);
        c = com.adsurge.adn.N.b.a("maxCount", 30);
        d = com.adsurge.adn.N.b.a("perfPeriod", 600);
        e = com.adsurge.adn.N.b.a("eventPeriod", 600);
        f = com.adsurge.adn.N.b.a("perfBatchCount", 30);
        g = com.adsurge.adn.N.b.a("eventBatchCount", 30);
        h = a();
        i = Collections.EMPTY_SET;
        j = com.adsurge.adn.N.b.a("sttfr", 0) == 1;
    }

    public static HashSet a(String str) {
        String[] strArrSplit;
        HashSet hashSet = new HashSet();
        String strA = com.adsurge.adn.N.b.a(str, "");
        if (!TextUtils.isEmpty(strA) && (strArrSplit = strA.split(",")) != null && strArrSplit.length > 0) {
            try {
                for (String str2 : strArrSplit) {
                    if (!TextUtils.isEmpty(str2)) {
                        hashSet.add(Integer.valueOf(Integer.parseInt(str2)));
                    }
                }
            } catch (Exception unused) {
            }
        }
        return hashSet;
    }

    public static HashSet a() {
        return a("evtbk");
    }

    public static boolean a(int i2) {
        if ((j || (i2 <= 6999999 && i2 >= 6000000)) && i2 != 0 && b) {
            HashSet hashSet = h;
            if (hashSet.size() == 0 || !hashSet.contains(Integer.valueOf(i2))) {
                return true;
            }
        }
        return false;
    }
}
