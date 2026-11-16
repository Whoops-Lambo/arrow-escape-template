package com.bytedance.adsdk.kgy.ahm.uq;

import com.ironsource.C4664b4;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public enum uq implements ct {
    LEFT_PAREN("("),
    RIGHT_PAREN(")"),
    LEFT_BRACKET(C4664b4.j.d),
    RIGHT_BRACKET(C4664b4.j.e),
    COMMA(",");

    private static final Map<String, uq> noq;
    private final String yo;

    static {
        HashMap map = new HashMap(128);
        noq = map;
        for (uq uqVar : map.values()) {
            noq.put(uqVar.kgy(), uqVar);
        }
    }

    public static boolean kgy(ct ctVar) {
        return ctVar instanceof uq;
    }

    uq(String str) {
        this.yo = str;
    }

    public String kgy() {
        return this.yo;
    }
}
