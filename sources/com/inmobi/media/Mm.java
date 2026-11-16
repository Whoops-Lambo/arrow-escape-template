package com.inmobi.media;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Mm {
    public final Fa a;

    public final HashMap a() {
        C4533y1 c4533y1;
        String str;
        HashMap map = new HashMap();
        try {
            if (this.a.a() && (c4533y1 = Lm.a) != null && (str = c4533y1.b) != null) {
                map.put("GPID", str);
            }
        } catch (Exception unused) {
        }
        return map;
    }

    public Mm(Fa fa) {
        fa.getClass();
        this.a = fa;
    }
}
