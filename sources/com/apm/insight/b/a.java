package com.apm.insight.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public a() {
        com.apm.insight.f.a.a();
    }

    public static void a(String str) {
        if (com.apm.insight.e.i().isEnsureEnable()) {
            com.apm.insight.f.b.a(Thread.currentThread().getStackTrace(), str, "EnsureNotReachHere");
        }
    }
}
