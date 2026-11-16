package com.bytedance.sdk.component.gf.ahm;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class ct implements ThreadFactory {
    public static volatile boolean rz;
    protected final String ahm;
    protected final ThreadGroup kgy;
    private final AtomicInteger uq = new AtomicInteger(1);

    public static String kgy(String str) {
        return "pag_".concat(String.valueOf(str));
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        if (rz) {
            return null;
        }
        Thread threadKgy = kgy(this.kgy, runnable, this.ahm + "_" + this.uq.getAndIncrement());
        if (threadKgy.isDaemon()) {
            threadKgy.setDaemon(false);
        }
        return threadKgy;
    }

    public ct(String str) {
        this.kgy = new ThreadGroup("pag_g_".concat(String.valueOf(str)));
        this.ahm = kgy(str);
    }

    public Thread kgy(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }
}
