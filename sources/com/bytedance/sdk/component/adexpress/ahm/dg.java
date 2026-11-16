package com.bytedance.sdk.component.adexpress.ahm;

import android.content.Context;
import android.view.View;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class dg implements ra {
    private com.bytedance.sdk.component.adexpress.ct.kgy ahm;
    private ScheduledFuture<?> ct;
    private Context kgy;
    private AtomicBoolean noq = new AtomicBoolean(false);
    private fi rz;
    private twf uq;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class kgy implements Runnable {
        ra.kgy kgy;
        private int rz;

        public kgy(int i, ra.kgy kgyVar) {
            this.rz = i;
            this.kgy = kgyVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.rz == 1) {
                dg.this.ahm.kgy(true);
                dg.this.kgy(this.kgy, 107, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rz() {
        try {
            ScheduledFuture<?> scheduledFuture = this.ct;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.ct.cancel(false);
            this.ct = null;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJgyZRPxVONHQ==", "bOsvowq5fvWFRNNYnjiuPF78LpATqGbV", "WO8jlgawW8KOTtJPuBitLXT7ObMWqHzVhX7WToc=", 102);
        }
    }

    public dg(Context context, twf twfVar, com.bytedance.sdk.component.adexpress.ct.kgy kgyVar, fi fiVar) {
        this.kgy = context;
        this.uq = twfVar;
        this.rz = fiVar;
        this.ahm = kgyVar;
        kgyVar.kgy(this.rz);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kgy(ra.kgy kgyVar, int i, String str) {
        vs vsVarAhm;
        if (!kgyVar.rz() && !this.noq.get()) {
            rz();
            this.uq.ct().kgy(i, str);
            if (kgyVar.ahm(this)) {
                kgyVar.kgy(this);
            } else {
                if (kgyVar.rz() || (vsVarAhm = kgyVar.ahm()) == null) {
                    return;
                }
                kgyVar.kgy(true);
                vsVarAhm.a_(i);
            }
            this.noq.getAndSet(true);
        }
    }

    public com.bytedance.sdk.component.adexpress.ct.kgy ahm() {
        return this.ahm;
    }

    @Override // com.bytedance.sdk.component.adexpress.ahm.ra
    public boolean kgy(final ra.kgy kgyVar) {
        int iNoq = this.uq.noq();
        if (iNoq < 0) {
            kgy(kgyVar, 107, "time is ".concat(String.valueOf(iNoq)));
        } else {
            this.ct = com.bytedance.sdk.component.adexpress.uq.uq.kgy(new kgy(1, kgyVar), iNoq, TimeUnit.MILLISECONDS);
            this.ahm.kgy(new yo() { // from class: com.bytedance.sdk.component.adexpress.ahm.dg.1
                @Override // com.bytedance.sdk.component.adexpress.ahm.yo
                public void kgy(View view, kus kusVar) {
                    vs vsVarAhm;
                    dg.this.rz();
                    if (kgyVar.rz() || (vsVarAhm = kgyVar.ahm()) == null) {
                        return;
                    }
                    vsVarAhm.kgy(dg.this.ahm, kusVar);
                    kgyVar.kgy(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.ahm.yo
                public void kgy(int i, String str) {
                    dg.this.kgy(kgyVar, i, str);
                }
            });
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.ahm.ra
    public void kgy() {
        this.ahm.fi();
        rz();
    }
}
