package com.bytedance.sdk.openadsdk.ioy;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public enum uq {
    UTF8(26, "UTF-8");

    private final String[] ct;
    private final int[] uq;
    private static final Map<Integer, uq> ahm = new HashMap();
    private static final Map<String, uq> rz = new HashMap();

    static {
        for (uq uqVar : values()) {
            if (Charset.isSupported(uqVar.name())) {
                for (int i : uqVar.uq) {
                    ahm.put(Integer.valueOf(i), uqVar);
                }
                rz.put(uqVar.name(), uqVar);
                for (String str : uqVar.ct) {
                    rz.put(str, uqVar);
                }
            }
        }
    }

    public static uq kgy(Charset charset) {
        return rz.get(charset.name());
    }

    uq(int i, String... strArr) {
        this.uq = new int[]{i};
        this.ct = strArr;
    }

    public int kgy() {
        return this.uq[0];
    }
}
