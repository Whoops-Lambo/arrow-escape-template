package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.i0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class f {
    public String a;
    public final Map b;
    public final i0 c;
    public final g1 d;

    public abstract void a();

    public abstract boolean b();

    public final int a(String str) {
        String str2 = (String) this.b.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Integer.parseInt(str2, 10);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public f(Map map, i0 i0Var, g1 g1Var) {
        this.b = map;
        this.d = g1Var;
        this.c = i0Var;
    }
}
