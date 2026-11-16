package com.bytedance.sdk.component.ahm.kgy.kgy.kgy;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class noq extends com.bytedance.sdk.component.ahm.kgy.uq {
    private ExecutorService kgy;
    private List<com.bytedance.sdk.component.ahm.kgy.ahm> ahm = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.ahm.kgy.ahm> rz = new CopyOnWriteArrayList();
    private AtomicInteger uq = new AtomicInteger(64);

    @Override // com.bytedance.sdk.component.ahm.kgy.uq
    public ExecutorService ahm() {
        return this.kgy;
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.uq
    public int kgy() {
        return this.uq.get();
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.uq
    public List<com.bytedance.sdk.component.ahm.kgy.ahm> rz() {
        return this.ahm;
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.uq
    public List<com.bytedance.sdk.component.ahm.kgy.ahm> uq() {
        return this.rz;
    }

    public noq() {
        if (this.kgy == null) {
            this.kgy = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 20L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.bytedance.sdk.component.ahm.kgy.kgy.kgy.noq.1
                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable, "systemHttp Dispatcher");
                    thread.setDaemon(false);
                    thread.setPriority(10);
                    return thread;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.uq
    public void kgy(int i) {
        this.uq.set(i);
    }
}
