package com.bytedance.sdk.component.noq.ahm.kgy;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class kgy implements ThreadFactory {
    private final AtomicInteger ahm = new AtomicInteger(1);
    private final ThreadGroup kgy;

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.kgy, runnable, "tt_img_" + this.ahm.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }

    public kgy(String str) {
        this.kgy = new ThreadGroup("tt_img_".concat(String.valueOf(str)));
    }
}
