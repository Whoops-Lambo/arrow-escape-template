package com.bytedance.sdk.component.adexpress.uq;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class uq {
    public static void ahm(com.bytedance.sdk.component.gf.ahm.rz rzVar, int i) {
        if (rzVar == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.kgy.kgy.rz rzVarRz = com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().rz();
        ExecutorService executorServiceTwf = rzVarRz != null ? rzVarRz.twf() : null;
        if (executorServiceTwf != null) {
            rzVar.setPriority(i);
            executorServiceTwf.execute(rzVar);
        }
    }

    public static void kgy(com.bytedance.sdk.component.gf.ahm.rz rzVar, int i) {
        if (rzVar == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.kgy.kgy.rz rzVarRz = com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().rz();
        ExecutorService executorServiceKus = rzVarRz != null ? rzVarRz.kus() : null;
        if (executorServiceKus != null) {
            rzVar.setPriority(i);
            executorServiceKus.execute(rzVar);
        }
    }

    public static ScheduledFuture kgy(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.kgy.kgy.rz rzVarRz = com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().rz();
        ScheduledExecutorService scheduledExecutorServiceVs = rzVarRz != null ? rzVarRz.vs() : null;
        if (scheduledExecutorServiceVs != null) {
            return scheduledExecutorServiceVs.schedule(runnable, j, timeUnit);
        }
        return null;
    }
}
