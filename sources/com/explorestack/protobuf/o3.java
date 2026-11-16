package com.explorestack.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class o3 {
    public static volatile o3 b;
    public static final o3 c = new o3();
    public final Map a;

    public static o3 a() {
        o3 o3Var;
        o3 o3Var2 = b;
        if (o3Var2 != null) {
            return o3Var2;
        }
        synchronized (o3.class) {
            try {
                o3Var = b;
                if (o3Var == null) {
                    Class cls = m3.a;
                    o3 o3Var3 = null;
                    if (cls != null) {
                        try {
                            o3Var3 = (o3) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    o3Var = o3Var3 != null ? o3Var3 : c;
                    b = o3Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o3Var;
    }

    public o3(o3 o3Var) {
        if (o3Var == c) {
            this.a = Collections.EMPTY_MAP;
        } else {
            this.a = Collections.unmodifiableMap(o3Var.a);
        }
    }

    public o3() {
        this.a = Collections.EMPTY_MAP;
    }
}
