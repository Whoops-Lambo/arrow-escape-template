package com.bytedance.adsdk.kgy.ahm.uq;

import com.safedk.android.analytics.brandsafety.m;
import com.singular.sdk.internal.UserDetailsUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public enum rz implements ct {
    QUESTION("?", 0),
    COLON(":", 0),
    DOUBLE_AMP("&&", 1),
    DOUBLE_BAR(m.ac, 1),
    EQ("==", 2),
    GT(">", 2),
    LT("<", 2),
    LT_EQ("<=", 2),
    GT_EQ(">=", 2),
    NOT_EQ("!=", 2),
    PLUS(UserDetailsUtils.UserDetailsLiterals.PLUS, 3),
    MINUS("-", 3),
    MULTI("*", 4),
    DIVISION("/", 4),
    MOD("%", 4);

    private final int fpp;
    private final String um;
    private static final Map<String, rz> dg = new HashMap(128);
    private static final Set<rz> xh = new HashSet();

    static {
        for (rz rzVar : values()) {
            dg.put(rzVar.kgy(), rzVar);
            xh.add(rzVar);
        }
    }

    public static rz kgy(String str) {
        return dg.get(str);
    }

    public int ahm() {
        return this.fpp;
    }

    rz(String str, int i) {
        this.um = str;
        this.fpp = i;
    }

    public static boolean kgy(ct ctVar) {
        return ctVar instanceof rz;
    }

    public String kgy() {
        return this.um;
    }
}
