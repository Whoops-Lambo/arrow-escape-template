package com.apm.insight;

import com.apm.insight.l.g;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class c {
    private static com.apm.insight.b.a a = new com.apm.insight.b.a();

    public static void a(Throwable th, String str) {
        if (e.i().isEnsureEnable() && !g.a(th)) {
            com.apm.insight.f.b.a(th, str, "core_exception_monitor");
        }
    }

    public static com.apm.insight.b.a a() {
        return a;
    }
}
