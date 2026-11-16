package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.t5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4401t5 extends U5 implements Thread.UncaughtExceptionHandler {
    public final Thread.UncaughtExceptionHandler b;

    @Override // com.inmobi.media.U5
    public final void b() {
        Thread.setDefaultUncaughtExceptionHandler(this.b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4401t5(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, V5 v5) {
        super(v5);
        v5.getClass();
        this.b = uncaughtExceptionHandler;
    }

    @Override // com.inmobi.media.U5
    public final void a() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        thread.getClass();
        th.getClass();
        this.a.a(new C4429u5(thread, th));
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
