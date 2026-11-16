package com.inmobi.media;

import defpackage.n30;

/* JADX INFO: renamed from: com.inmobi.media.u5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class C4429u5 extends Ca {
    public final StackTraceElement[] g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4429u5(Thread thread, Throwable th) {
        super("crashReporting", "CrashEvent", AbstractC4447un.a(thread, th));
        thread.getClass();
        th.getClass();
        this.g = th.getStackTrace();
    }

    public C4429u5(String str) {
        super(n30.f(), "crashReporting", "CatchEvent", str);
    }
}
