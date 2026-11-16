package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.p4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class C4915p4 implements Thread.UncaughtExceptionHandler {
    private Thread.UncaughtExceptionHandler a;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        C4933q4 c4933q4 = new C4933q4(th);
        if (c4933q4.d()) {
            new P5(c4933q4.b(), "" + System.currentTimeMillis(), "Crash").a();
        }
        this.a.uncaughtException(thread, th);
    }

    public C4915p4(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }
}
