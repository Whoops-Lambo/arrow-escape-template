package com.bytedance.sdk.component.adexpress.ahm;

import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class noq implements ra {
    private kgy ahm;
    private Context kgy;
    private twf rz;

    @Override // com.bytedance.sdk.component.adexpress.ahm.ra
    public boolean kgy(final ra.kgy kgyVar) {
        this.rz.ct().yo(0);
        this.ahm.kgy(new yo() { // from class: com.bytedance.sdk.component.adexpress.ahm.noq.1
            @Override // com.bytedance.sdk.component.adexpress.ahm.yo
            public void kgy(View view, kus kusVar) {
                if (kgyVar.rz()) {
                    return;
                }
                vs vsVarAhm = kgyVar.ahm();
                if (vsVarAhm != null) {
                    vsVarAhm.kgy(noq.this.ahm, kusVar);
                }
                kgyVar.kgy(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.ahm.yo
            public void kgy(int i, String str) {
                vs vsVarAhm = kgyVar.ahm();
                if (vsVarAhm != null) {
                    vsVarAhm.a_(i);
                }
            }
        });
        return true;
    }

    public noq(Context context, twf twfVar, kgy kgyVar) {
        this.kgy = context;
        this.ahm = kgyVar;
        this.rz = twfVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.ahm.ra
    public void kgy() {
    }

    public void kgy(rz rzVar) {
        this.ahm.kgy(rzVar);
    }
}
