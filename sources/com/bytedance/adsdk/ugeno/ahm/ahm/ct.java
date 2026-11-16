package com.bytedance.adsdk.ugeno.ahm.ahm;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
final class ct {
    private static Handler ahm;
    private static HandlerThread kgy;
    private volatile boolean fi;
    private long gf;
    private volatile int nu;
    private volatile int ra;
    private final uq rz;
    private noq uq = new noq();
    private noq ct = new noq();
    private noq noq = new noq();
    private final Object yo = new Object();
    private final Runnable at = new Runnable() { // from class: com.bytedance.adsdk.ugeno.ahm.ahm.ct.1
        @Override // java.lang.Runnable
        public void run() {
            float f;
            if (ct.this.fi) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (ct.this.gf == 0) {
                    f = 0.016f;
                } else {
                    f = (jUptimeMillis - ct.this.gf) / 1000.0f;
                    if (f > 0.033333335f) {
                        f = 0.033333335f;
                    }
                }
                ct.this.gf = jUptimeMillis;
                ct.this.rz.kgy(ct.this.ra, ct.this.nu);
                ct.this.rz.kgy(f);
                ct.this.rz.kgy(ct.this.uq);
                synchronized (ct.this.yo) {
                    noq noqVar = ct.this.ct;
                    ct ctVar = ct.this;
                    ctVar.ct = ctVar.uq;
                    ct.this.uq = noqVar;
                }
                if (ct.this.fi) {
                    ct.fi().postDelayed(this, 16L);
                }
            }
        }
    };

    public void ct() {
        this.fi = false;
        fi().removeCallbacks(this.at);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized Handler fi() {
        try {
            if (kgy == null) {
                HandlerThread handlerThread = new HandlerThread("ugen-particle-physics", 10);
                kgy = handlerThread;
                handlerThread.start();
                ahm = new Handler(kgy.getLooper());
            }
        } catch (Throwable th) {
            throw th;
        }
        return ahm;
    }

    public ahm ahm() {
        return this.rz.ahm();
    }

    public noq kgy() {
        noq noqVar;
        synchronized (this.yo) {
            noq noqVar2 = this.noq;
            noqVar = this.ct;
            this.noq = noqVar;
            this.ct = noqVar2;
        }
        return noqVar;
    }

    public ahm.uq[] rz() {
        return this.rz.kgy();
    }

    public void uq() {
        if (this.fi) {
            return;
        }
        this.fi = true;
        this.gf = 0L;
        fi().post(this.at);
    }

    public ct(ahm ahmVar) {
        this.rz = new uq(ahmVar);
    }

    public void noq() {
        ct();
        synchronized (this.yo) {
            this.uq = new noq();
            this.ct = new noq();
            this.noq = new noq();
        }
    }

    public void kgy(int i, int i2) {
        this.ra = i;
        this.nu = i2;
    }
}
