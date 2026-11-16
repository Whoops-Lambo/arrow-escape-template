package com.bytedance.kgy.kgy;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class ahm implements Handler.Callback, com.bytedance.kgy.uq {
    private final com.bytedance.kgy.rz.ct ahm;
    private volatile Handler ct;
    private final Context kgy;
    private volatile Handler noq;
    private volatile gf uq;
    private final ConcurrentHashMap<Class<? extends com.bytedance.kgy.kgy>, fi<? extends com.bytedance.kgy.kgy>> rz = new ConcurrentHashMap<>();
    private volatile boolean yo = false;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class kgy implements Comparable<kgy>, Runnable {
        private final int kgy;

        public abstract void kgy();

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
        public int compareTo(kgy kgyVar) {
            return kgyVar.kgy - this.kgy;
        }

        public kgy(int i) {
            this.kgy = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            kgy();
        }
    }

    private void ahm(final com.bytedance.kgy.kgy kgyVar) {
        com.bytedance.kgy.rz.uq uqVarAhm = this.ahm.ahm();
        ExecutorService executorServiceKgy = uqVarAhm != null ? uqVarAhm.kgy() : null;
        if (executorServiceKgy == null) {
            executorServiceKgy = com.bytedance.kgy.kgy.ahm.kgy.kgy();
        }
        Objects.toString(kgyVar);
        executorServiceKgy.execute(new kgy(kgyVar.yo()) { // from class: com.bytedance.kgy.kgy.ahm.3
            @Override // com.bytedance.kgy.kgy.ahm.kgy
            public void kgy() {
                ahm.this.kgy((com.bytedance.kgy.kgy<?>) kgyVar, true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uq() {
        if (this.ct == null || this.noq == null) {
            return;
        }
        for (fi<? extends com.bytedance.kgy.kgy> fiVar : this.rz.values()) {
            try {
                fiVar.kgy(kgy());
                kgy((fi) fiVar, false);
                com.bytedance.kgy.kgy.kgy.kgy kgyVarUq = fiVar.uq();
                if (kgyVarUq != null) {
                    kgyVarUq.kgy(this.ct.getLooper(), fiVar);
                }
            } catch (Exception unused) {
            }
        }
        this.yo = true;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (!com.bytedance.kgy.kgy.kgy.kgy) {
            return true;
        }
        try {
            switch (message.what) {
                case 1001:
                    rz((fi) message.obj);
                    break;
                case 1002:
                    ((fi) message.obj).kgy(kgy(), this.ahm.gf());
                    break;
                case 1003:
                    ((fi) message.obj).uq(kgy());
                    break;
                case 1004:
                    ((fi) message.obj).ct(kgy());
                    break;
            }
        } catch (Exception unused) {
        }
        return true;
    }

    public ahm(Context context, com.bytedance.kgy.rz.ct ctVar) {
        this.kgy = context;
        this.ahm = ctVar;
        ctVar.ahm(true);
        ctVar.toString();
        for (Map.Entry<Class<? extends com.bytedance.kgy.kgy>, com.bytedance.kgy.ahm<? extends com.bytedance.kgy.kgy>> entry : ctVar.noq().entrySet()) {
            Class<? extends com.bytedance.kgy.kgy> key = entry.getKey();
            this.rz.put(key, new fi<>(this, entry.getValue()));
            Objects.toString(key);
        }
        new HandlerThread("AppLogS") { // from class: com.bytedance.kgy.kgy.ahm.1
            @Override // android.os.HandlerThread
            public void onLooperPrepared() {
                ahm.this.noq = new Handler(getLooper(), ahm.this);
                ahm.this.uq();
            }
        }.start();
        new HandlerThread("AppLogU") { // from class: com.bytedance.kgy.kgy.ahm.2
            @Override // android.os.HandlerThread
            public void onLooperPrepared() {
                ahm.this.ct = new Handler(getLooper(), ahm.this);
                ahm.this.uq();
            }
        }.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kgy(com.bytedance.kgy.kgy<?> kgyVar, boolean z) {
        Objects.toString(kgyVar);
        fi<? extends com.bytedance.kgy.kgy> fiVar = this.rz.get(kgyVar.getClass());
        if (fiVar == null) {
            return;
        }
        int iKgy = fiVar.kgy(kgyVar);
        if ((iKgy & 4) == 4 && this.ahm.kgy()) {
            kgyVar.toString();
            fiVar.kgy(kgy(), kgyVar);
        }
        int i = iKgy & 2;
        Handler handler = this.noq;
        if (i == 2) {
            if (handler != null) {
                this.noq.removeMessages(1001, fiVar);
            }
            if (z) {
                rz(fiVar);
            } else {
                this.noq.sendMessage(this.noq.obtainMessage(1001, fiVar));
            }
        } else if (handler != null && !this.noq.hasMessages(1001, fiVar)) {
            this.noq.sendMessageDelayed(this.noq.obtainMessage(1001, fiVar), fiVar.nu());
            fiVar.nu();
        }
        com.bytedance.kgy.kgy.kgy.kgy kgyVarUq = fiVar.uq();
        if (kgyVarUq != null) {
            kgyVarUq.kgy();
        }
    }

    private void rz(fi fiVar) {
        boolean z;
        if (fiVar.rz() == 0) {
            Objects.toString(fiVar.kgy());
            return;
        }
        boolean zKgy = fiVar.kgy(this.ahm, kgy());
        Objects.toString(fiVar.kgy());
        if (this.ct != null) {
            if (zKgy) {
                boolean z2 = false;
                boolean z3 = true;
                if (!this.ct.hasMessages(1002, fiVar) && !fiVar.gf()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && fiVar.ra()) {
                    Objects.toString(fiVar.kgy());
                    z2 = true;
                } else {
                    z3 = z;
                }
                if (z3) {
                    kgy(fiVar, z2);
                    return;
                }
                return;
            }
            fiVar.ahm(kgy());
        }
    }

    public ConcurrentHashMap<Class<? extends com.bytedance.kgy.kgy>, fi<? extends com.bytedance.kgy.kgy>> ahm() {
        return this.rz;
    }

    public void ahm(fi fiVar) {
        if (this.ct.hasMessages(1004, fiVar)) {
            return;
        }
        this.ct.sendMessageDelayed(this.ct.obtainMessage(1004, fiVar), this.ahm.fi());
    }

    public com.bytedance.kgy.rz.ct rz() {
        return this.ahm;
    }

    @Override // com.bytedance.kgy.uq
    public boolean kgy(com.bytedance.kgy.kgy kgyVar) {
        fi<? extends com.bytedance.kgy.kgy> fiVar;
        if (kgyVar == null || !com.bytedance.kgy.kgy.kgy.kgy || (fiVar = this.rz.get(kgyVar.getClass())) == null) {
            return false;
        }
        if (!this.yo) {
            kgyVar.toString();
            ahm(kgyVar);
            return true;
        }
        if (kgyVar.ahm() == 1) {
            kgy((com.bytedance.kgy.kgy<?>) kgyVar, false);
        } else {
            ahm(kgyVar);
        }
        com.bytedance.kgy.kgy.kgy.kgy kgyVarUq = fiVar.uq();
        if (kgyVarUq != null) {
            kgyVarUq.kgy(1);
        }
        return true;
    }

    public gf kgy() {
        if (this.uq == null) {
            synchronized (this) {
                try {
                    if (this.uq == null) {
                        this.uq = this.ahm.ra() ? new uq(this.kgy, this, this.ahm) : new rz(this.kgy, this, this.ahm);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.uq;
    }

    public void kgy(fi fiVar, boolean z, boolean z2, boolean z3) {
        if (z2 && !z) {
            Objects.toString(fiVar.kgy());
            return;
        }
        if (z2 && z3) {
            Objects.toString(fiVar.kgy());
        } else if (this.ct.hasMessages(1002, fiVar)) {
            return;
        }
        kgy(fiVar, z2 && z);
    }

    private void kgy(fi fiVar, boolean z) {
        long jCt = z ? 0L : fiVar.ct();
        this.ct.removeMessages(1002, fiVar);
        this.ct.sendMessageDelayed(this.ct.obtainMessage(1002, fiVar), jCt);
        Objects.toString(fiVar.kgy());
    }

    public void kgy(fi fiVar) {
        if (this.ct.hasMessages(1003, fiVar)) {
            return;
        }
        this.ct.sendMessageDelayed(this.ct.obtainMessage(1003, fiVar), this.ahm.fi());
    }
}
