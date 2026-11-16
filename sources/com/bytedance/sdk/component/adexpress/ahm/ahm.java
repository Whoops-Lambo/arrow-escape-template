package com.bytedance.sdk.component.adexpress.ahm;

import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ahm implements ra {
    private com.bytedance.sdk.component.adexpress.dynamic.kgy.kgy ahm;
    private int ct;
    private Context kgy;
    private fi rz;
    private twf uq;

    public com.bytedance.sdk.component.adexpress.dynamic.uq ahm() {
        com.bytedance.sdk.component.adexpress.dynamic.kgy.kgy kgyVar = this.ahm;
        if (kgyVar != null) {
            return kgyVar.uq();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.adexpress.ahm.ra
    public boolean kgy(final ra.kgy kgyVar) {
        this.uq.ct().kgy(this.ct);
        this.ahm.kgy(new yo() { // from class: com.bytedance.sdk.component.adexpress.ahm.ahm.1
            @Override // com.bytedance.sdk.component.adexpress.ahm.yo
            public void kgy(View view, kus kusVar) {
                if (kgyVar.rz()) {
                    return;
                }
                ahm.this.uq.ct().ct(ahm.this.ct);
                ahm.this.uq.ct().noq(ahm.this.ct);
                ahm.this.uq.ct().gf();
                vs vsVarAhm = kgyVar.ahm();
                if (vsVarAhm == null) {
                    return;
                }
                vsVarAhm.kgy(ahm.this.ahm, kusVar);
                kgyVar.kgy(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.ahm.yo
            public void kgy(int i, String str) {
                ahm.this.uq.ct().kgy(ahm.this.ct, i, str, kgyVar.ahm(ahm.this));
                boolean zAhm = kgyVar.ahm(ahm.this);
                ra.kgy kgyVar2 = kgyVar;
                if (zAhm) {
                    kgyVar2.kgy(ahm.this);
                    return;
                }
                vs vsVarAhm = kgyVar2.ahm();
                if (vsVarAhm == null) {
                    return;
                }
                vsVarAhm.a_(i);
            }
        });
        return true;
    }

    public ahm(Context context, twf twfVar, boolean z, com.bytedance.sdk.component.adexpress.dynamic.ct.fi fiVar, fi fiVar2, com.bytedance.sdk.component.adexpress.dynamic.kgy.kgy kgyVar) {
        this.kgy = context;
        this.uq = twfVar;
        this.rz = fiVar2;
        this.ahm = kgyVar;
        kgyVar.kgy(fiVar2);
        if (fiVar instanceof com.bytedance.sdk.component.adexpress.dynamic.ct.yo) {
            this.ct = 3;
        } else {
            this.ct = 2;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ahm.ra
    public void kgy() {
        com.bytedance.sdk.component.adexpress.dynamic.kgy.kgy kgyVar = this.ahm;
        if (kgyVar != null) {
            kgyVar.ahm();
        }
    }
}
