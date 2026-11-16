package com.vungle.ads.internal.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements ThreadFactory {
    public final String a;
    public final ThreadFactory b;
    public final AtomicInteger c;

    public c(String str) {
        str.getClass();
        this.a = str;
        this.b = Executors.defaultThreadFactory();
        this.c = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        runnable.getClass();
        Thread threadNewThread = this.b.newThread(runnable);
        threadNewThread.setName(this.a + "-th-" + this.c.incrementAndGet());
        return threadNewThread;
    }
}
