package com.bytedance.sdk.component.adexpress.kgy.ahm;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.gm;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class ct extends rz {
    private static volatile ct ahm;
    private static File kgy;
    private AtomicBoolean rz = new AtomicBoolean(true);
    private AtomicBoolean uq = new AtomicBoolean(false);
    private boolean ct = false;
    private AtomicBoolean noq = new AtomicBoolean(false);
    private AtomicInteger yo = new AtomicInteger(0);
    private AtomicLong fi = new AtomicLong();

    public void yo() {
        kgy(false);
    }

    public static ct ahm() {
        if (ahm == null) {
            synchronized (ct.class) {
                try {
                    if (ahm == null) {
                        ahm = new ct();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ahm;
    }

    public static File fi() {
        if (kgy == null) {
            try {
                File fileKgy = uq.kgy();
                Context contextAhm = com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().rz().ahm();
                File file = new File(contextAhm != null ? com.bytedance.sdk.component.utils.yo.kgy(contextAhm, "tt_tmpl_pkg") : new File(fileKgy, "tt_tmpl_pkg"), "template");
                file.mkdirs();
                kgy = file;
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJsyYdD2VjCEqErU+s=", "b+sghQ+9fcKtS9lcixSy", "XOs5oQaxecuBXtJ5hQM=", 274);
            }
        }
        return kgy;
    }

    private void gf() {
        com.bytedance.sdk.component.adexpress.uq.uq.ahm(new com.bytedance.sdk.component.gf.ahm.rz("init") { // from class: com.bytedance.sdk.component.adexpress.kgy.ahm.ct.1
            @Override // java.lang.Runnable
            public void run() {
                fi.kgy();
                ct.this.rz.set(false);
                ct.this.uq();
                ct.this.yo();
                if (com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().rz() != null && gm.kgy(com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().rz().ahm()) && com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().rz() != null) {
                    com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().rz().uq();
                }
            }
        }, 10);
    }

    private void ra() {
        if (this.yo.getAndSet(0) <= 0 || System.currentTimeMillis() - this.fi.get() <= 600000) {
            return;
        }
        yo();
    }

    public boolean ct() {
        return this.ct;
    }

    public void kgy(boolean z) {
        List<com.bytedance.sdk.component.adexpress.kgy.rz.kgy.C0205kgy> listKgy;
        boolean z2;
        if (this.rz.get()) {
            return;
        }
        try {
            if (this.uq.get()) {
                if (z) {
                    this.yo.getAndIncrement();
                    return;
                }
                return;
            }
            boolean z3 = true;
            this.uq.set(true);
            com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgyVarCt = com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().rz().ct();
            com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgyVarAhm = fi.ahm();
            if (kgyVarCt != null && kgyVarCt.fi()) {
                if (!fi.ahm(kgyVarCt)) {
                    this.uq.set(false);
                    this.fi.set(System.currentTimeMillis());
                    return;
                }
                if (com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().rz() != null) {
                    com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().rz().rz().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.kgy.ahm.ct.2
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.component.adexpress.ct.ct.kgy().ahm();
                        }
                    });
                }
                fi.kgy(kgyVarCt);
                boolean zKgy = (kgyVarCt.ct() == null || TextUtils.isEmpty(kgyVarCt.ct().kgy())) ? false : kgy(kgyVarCt.ct().kgy());
                if (kgyVarCt.kgy().size() != 0) {
                    listKgy = kgy(kgyVarCt, kgyVarAhm);
                    z2 = listKgy != null;
                } else {
                    listKgy = null;
                    z2 = zKgy;
                }
                if (!zKgy) {
                    List<com.bytedance.sdk.component.adexpress.kgy.rz.kgy.C0205kgy> listAhm = ahm(kgyVarCt, kgyVarAhm);
                    if (listKgy == null || listAhm == null) {
                        listKgy = listAhm;
                    } else {
                        listKgy.addAll(listAhm);
                    }
                    if (listAhm == null) {
                        z3 = false;
                    }
                    if (listAhm == null) {
                        this.uq.set(false);
                    }
                    z2 = z3;
                }
                if (z2 && kgy(kgyVarCt)) {
                    fi.kgy(kgyVarCt);
                    fi.rz();
                    ahm(listKgy);
                }
                uq();
                this.uq.set(false);
                this.fi.set(System.currentTimeMillis());
                ra();
                return;
            }
            this.uq.set(false);
            kgy(109);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJsyYdD2VjCEqErU+s=", "b+sghQ+9fcKtS9lcixSy", "V+EskTe5ZNeMS8NY", 239);
        }
    }

    private ct() {
        gf();
    }

    public com.bytedance.sdk.component.adexpress.kgy.rz.kgy noq() {
        return fi.ahm();
    }

    public void rz() {
        gf();
    }

    public void uq() {
        com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgyVarAhm = fi.ahm();
        if (kgyVarAhm != null && kgyVarAhm.fi()) {
            boolean zKgy = kgy(kgyVarAhm);
            if (!zKgy) {
                fi.uq();
            }
            this.ct = zKgy;
        }
    }

    public boolean kgy(com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgyVar) {
        if (kgyVar == null) {
            return false;
        }
        return kgy(kgyVar.kgy()) || kgy(kgyVar.ct()) || kgy(kgyVar.noq());
    }

    @Override // com.bytedance.sdk.component.adexpress.kgy.ahm.rz
    public File kgy() {
        return fi();
    }
}
