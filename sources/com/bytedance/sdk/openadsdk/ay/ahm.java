package com.bytedance.sdk.openadsdk.ay;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class ahm {
    private fi ahm;
    private kgy ct;
    private ScheduledExecutorService kgy = null;
    private long rz = 0;
    private int uq;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface kgy {
    }

    public void kgy(int i) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.kgy = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ay.ahm.1
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                long unused = ahm.this.rz;
                if (System.currentTimeMillis() - ahm.this.rz > ahm.this.uq) {
                    ahm.this.kgy.shutdown();
                    if (ahm.this.ahm != null) {
                        ahm.this.ahm.ahm(0, "Automatic detection of stuck");
                    }
                    if (ahm.this.ct != null) {
                        kgy unused2 = ahm.this.ct;
                    }
                }
            }
        }, 0L, i, TimeUnit.MILLISECONDS);
    }

    public boolean ahm() {
        ScheduledExecutorService scheduledExecutorService = this.kgy;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService.isShutdown();
        }
        return true;
    }

    public ahm(fi fiVar, int i) {
        this.ahm = fiVar;
        this.uq = i;
    }

    public void kgy(long j) {
        this.rz = j;
    }

    public void kgy() {
        ScheduledExecutorService scheduledExecutorService = this.kgy;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }
}
