package com.apm.insight.runtime;

import com.apm.insight.MonitorCrash;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class j {
    private static MonitorCrash a = null;
    private static int b = -1;
    private static int c;

    public static MonitorCrash a() {
        if (a == null) {
            MonitorCrash monitorCrashInitSDK = MonitorCrash.initSDK(com.apm.insight.e.g(), "239017", 200001190L, "2.0.0.11", "com.apm.insight");
            a = monitorCrashInitSDK;
            monitorCrashInitSDK.config().setChannel("release");
        }
        return a;
    }

    public static void a(Throwable th, String str) {
        if (com.apm.insight.e.g() == null) {
            return;
        }
        if (b == -1) {
            b = 5;
        }
        int i = c;
        if (i < b) {
            c = i + 1;
            a().reportCustomErr(str, "INNER", th);
        }
    }
}
