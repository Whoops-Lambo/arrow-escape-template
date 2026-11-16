package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class P4 {
    public final String a = "P4";

    public final C4474vn a(D2 d2, N4 n4) {
        Integer num;
        d2.getClass();
        n4.getClass();
        int iB = d2.b();
        Config config = n4.b;
        if (iB != 200) {
            String str = this.a;
            if (iB != 304) {
                str.getClass();
                iB += 1000;
            } else {
                str.getClass();
                n4.b.getType();
            }
        } else {
            try {
                Config configA = d2.a();
                if (configA == null) {
                    this.a.getClass();
                    num = 3;
                } else if (!configA.isValid()) {
                    this.a.getClass();
                    num = 4;
                } else {
                    num = null;
                }
                if (num == null) {
                    if (configA != null) {
                        config = configA;
                    } else {
                        throw new IllegalArgumentException("Config object is null");
                    }
                } else {
                    iB = num.intValue();
                }
            } catch (IllegalArgumentException unused) {
                iB = 2;
            }
        }
        return new C4474vn(iB, config);
    }
}
