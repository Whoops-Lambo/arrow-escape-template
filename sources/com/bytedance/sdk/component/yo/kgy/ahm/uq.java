package com.bytedance.sdk.component.yo.kgy.ahm;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.component.yo.kgy.ct;
import com.bytedance.sdk.component.yo.kgy.yo;
import com.safedk.android.analytics.events.CrashEvent;
import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class uq {
    private final PriorityBlockingQueue<com.bytedance.sdk.component.yo.kgy.uq.kgy> at;
    private volatile com.bytedance.sdk.component.yo.kgy.ahm.ahm.rz gf;
    private final Comparator<com.bytedance.sdk.component.yo.kgy.uq.kgy> nu;
    private volatile Handler ra;
    public static final uq kgy = new uq();
    public static final com.bytedance.sdk.component.yo.kgy.ahm.kgy.kgy uq = new com.bytedance.sdk.component.yo.kgy.ahm.kgy.kgy();
    public static final AtomicLong ct = new AtomicLong(0);
    public static final AtomicLong noq = new AtomicLong(0);
    public static final long yo = System.currentTimeMillis();
    public static long fi = 0;
    public volatile boolean ahm = false;
    public volatile boolean rz = false;

    /* JADX INFO: Access modifiers changed from: private */
    public int kgy(com.bytedance.sdk.component.yo.kgy.uq.kgy kgyVar, com.bytedance.sdk.component.yo.kgy.uq.kgy kgyVar2) {
        long jKgy;
        long jAhm;
        long jAhm2;
        long jKgy2;
        if (kgyVar == null) {
            return kgyVar2 == null ? 0 : -1;
        }
        if (kgyVar2 == null) {
            return 1;
        }
        if (kgyVar.ct() != kgyVar2.ct()) {
            return kgyVar.ct() - kgyVar2.ct();
        }
        if (kgyVar.kgy() != null) {
            jKgy = kgyVar.kgy().kgy();
            jAhm = kgyVar.kgy().ahm();
        } else {
            jKgy = 0;
            jAhm = 0;
        }
        if (kgyVar2.kgy() != null) {
            jKgy2 = kgyVar2.kgy().kgy();
            jAhm2 = kgyVar2.kgy().ahm();
        } else {
            jAhm2 = 0;
            jKgy2 = 0;
        }
        if (jKgy == 0 || jKgy2 == 0) {
            return 0;
        }
        long j = jKgy - jKgy2;
        if (Math.abs(j) > 2147483647L) {
            return 0;
        }
        if (j != 0) {
            return (int) j;
        }
        if (jAhm == 0 || jAhm2 == 0) {
            return 0;
        }
        return (int) (jAhm - jAhm2);
    }

    public void ct() {
        com.bytedance.sdk.component.yo.kgy.rz.ahm.kgy(uq.muf(), 1);
        final com.bytedance.sdk.component.yo.kgy.ahm.ahm.rz rzVar = this.gf;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (rzVar != null) {
                rzVar.rz(2);
                return;
            }
            return;
        }
        ct ctVarVs = yo.noq().vs();
        if (ctVarVs != null) {
            Executor executorUq = ctVarVs.uq();
            if (executorUq == null) {
                executorUq = ctVarVs.ct();
            }
            if (executorUq != null) {
                executorUq.execute(new com.bytedance.sdk.component.yo.kgy.ct.ct("flush") { // from class: com.bytedance.sdk.component.yo.kgy.ahm.uq.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.component.yo.kgy.ahm.ahm.rz rzVar2 = rzVar;
                        if (rzVar2 != null) {
                            rzVar2.rz(2);
                        }
                    }
                });
            }
        }
    }

    public void rz() {
        if (this.gf == null || !this.gf.isAlive()) {
            return;
        }
        synchronized (this) {
            try {
                if (this.gf != null && this.gf.isAlive()) {
                    if (this.ra != null) {
                        this.ra.removeCallbacksAndMessages(null);
                    }
                    this.gf.kgy(false);
                    this.gf.quitSafely();
                    this.gf = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean uq() {
        try {
            if (this.gf != null || com.bytedance.sdk.component.yo.kgy.ahm.ahm()) {
                return false;
            }
            synchronized (this) {
                if (this.gf != null) {
                    return false;
                }
                this.gf = new com.bytedance.sdk.component.yo.kgy.ahm.ahm.rz(this.at);
                this.gf.start();
                return true;
            }
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    private uq() {
        Comparator<com.bytedance.sdk.component.yo.kgy.uq.kgy> comparator = new Comparator<com.bytedance.sdk.component.yo.kgy.uq.kgy>() { // from class: com.bytedance.sdk.component.yo.kgy.ahm.uq.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.yo.kgy.uq.kgy kgyVar, com.bytedance.sdk.component.yo.kgy.uq.kgy kgyVar2) {
                return uq.this.kgy(kgyVar, kgyVar2);
            }
        };
        this.nu = comparator;
        this.at = new PriorityBlockingQueue<>(8, comparator);
    }

    public void ahm() {
        uq();
        ct();
    }

    public PriorityBlockingQueue<com.bytedance.sdk.component.yo.kgy.uq.kgy> kgy() {
        return this.at;
    }

    public void kgy(Handler handler) {
        this.ra = handler;
    }

    public void kgy(com.bytedance.sdk.component.yo.kgy.uq.kgy kgyVar, int i) {
        uq();
        ct ctVarVs = yo.noq().vs();
        com.bytedance.sdk.component.yo.kgy.ahm.ahm.rz rzVar = this.gf;
        if (rzVar != null) {
            kgy(ctVarVs, kgyVar);
            rzVar.kgy(kgyVar, kgyVar.ct() == 4);
        }
    }

    private void kgy(final ct ctVar, com.bytedance.sdk.component.yo.kgy.uq.kgy kgyVar) {
        if (ctVar != null) {
            try {
                if (ctVar.yo()) {
                    final long jAhm = (kgyVar == null || kgyVar.kgy() == null) ? 0L : kgyVar.kgy().ahm();
                    if (jAhm == 1) {
                        fi = System.currentTimeMillis();
                    }
                    AtomicLong atomicLongZjw = uq.zjw();
                    com.bytedance.sdk.component.yo.kgy.rz.ahm.kgy(atomicLongZjw, 1);
                    if (atomicLongZjw.get() == 200) {
                        if (Looper.getMainLooper() == Looper.myLooper()) {
                            Executor executorUq = ctVar.uq();
                            if (executorUq == null) {
                                executorUq = ctVar.ct();
                            }
                            if (executorUq != null) {
                                executorUq.execute(new com.bytedance.sdk.component.yo.kgy.ct.ct(CrashEvent.e) { // from class: com.bytedance.sdk.component.yo.kgy.ahm.uq.2
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        uq.this.kgy(ctVar, jAhm);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        kgy(ctVar, jAhm);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kgy(ct ctVar, long j) {
        com.bytedance.sdk.component.yo.kgy.ahm.ahm.rz rzVar = this.gf;
        if (ctVar == null || rzVar == null) {
            return;
        }
        com.bytedance.sdk.component.yo.kgy.ahm.kgy.kgy kgyVar = uq;
        rzVar.kgy(ctVar.kgy(kgyVar.ahm(j)), true);
        kgyVar.tp();
    }
}
