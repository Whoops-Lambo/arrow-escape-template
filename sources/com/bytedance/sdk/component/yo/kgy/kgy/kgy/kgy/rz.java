package com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.sx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class rz {
    private static int rz = 20;
    private boolean ct;
    private boolean fi;
    private final Context kgy;
    protected final List<com.bytedance.sdk.component.yo.kgy.uq.kgy> ahm = new ArrayList();
    private final List<com.bytedance.sdk.component.yo.kgy.uq.kgy> uq = new ArrayList();
    private boolean noq = false;
    private volatile boolean yo = false;
    private final Runnable gf = new Runnable() { // from class: com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.rz.1
        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList;
            synchronized (rz.this) {
                try {
                    rz.this.yo = false;
                    boolean zIsEmpty = rz.this.ahm.isEmpty();
                    rz rzVar = rz.this;
                    if (zIsEmpty) {
                        rzVar.noq = false;
                        return;
                    }
                    if (rzVar.ct) {
                        int size = rz.this.ahm.size();
                        for (int i = 0; i < size; i++) {
                            rz.this.uq.add(rz.this.ahm.get(i));
                        }
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(rz.this.ahm);
                    }
                    rz.this.ahm.clear();
                    rz.this.noq = false;
                    rz rzVar2 = rz.this;
                    if (arrayList != null) {
                        rzVar2.ct(arrayList);
                    } else {
                        rzVar2.ct(rzVar2.uq);
                        rz.this.uq.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    public abstract String ahm();

    public synchronized void uq(List<String> list) {
        if (list != null) {
            if (!list.isEmpty()) {
                try {
                    Iterator<com.bytedance.sdk.component.yo.kgy.uq.kgy> it = this.ahm.iterator();
                    while (it.hasNext()) {
                        com.bytedance.sdk.component.yo.kgy.uq.kgy next = it.next();
                        if (next != null) {
                            String strRz = next.rz();
                            if (!TextUtils.isEmpty(strRz) && list.contains(strRz)) {
                                it.remove();
                            }
                        }
                    }
                } catch (Throwable th) {
                    ahm();
                    th.getMessage();
                }
            }
        }
    }

    private void kgy() {
        if (!this.noq) {
            com.bytedance.sdk.component.yo.kgy.yo.kgy.kgy().postDelayed(this.gf, this.ct ? noq() : com.bytedance.sdk.component.yo.kgy.yo.kgy.ahm());
            this.noq = true;
        }
        if (this.fi && this.ahm.size() >= rz && !this.yo) {
            com.bytedance.sdk.component.yo.kgy.yo.kgy.kgy().removeCallbacks(this.gf);
            com.bytedance.sdk.component.yo.kgy.yo.kgy.kgy().post(this.gf);
            this.noq = true;
            this.yo = true;
        }
    }

    public long noq() {
        return 10000L;
    }

    public rz(Context context) {
        this.fi = true;
        this.kgy = context;
        try {
            com.bytedance.sdk.component.yo.kgy.ct ctVarVs = com.bytedance.sdk.component.yo.kgy.yo.noq().vs();
            if (ctVarVs != null) {
                this.fi = ctVarVs.twf();
                this.ct = ctVarVs.kus();
                rz = ctVarVs.vs();
            }
            sx.kgy("DBInsertMemRepo", "enableOpt:" + this.fi + ",BATCH_SIZE:" + rz, Boolean.valueOf(this.ct));
        } catch (Throwable unused) {
        }
    }

    public void ct(List<com.bytedance.sdk.component.yo.kgy.uq.kgy> list) {
        com.bytedance.sdk.component.yo.kgy.kgy.kgy.rz.kgy(ct(), ahm(), list);
    }

    public Context ct() {
        return this.kgy;
    }

    public synchronized void kgy(com.bytedance.sdk.component.yo.kgy.uq.kgy kgyVar) {
        if (kgyVar.noq() != null && !TextUtils.isEmpty(kgyVar.rz())) {
            this.ahm.add(kgyVar);
            kgy();
        }
    }
}
