package com.bytedance.adsdk.ugeno.ct.rz;

import com.bytedance.adsdk.ugeno.ct.yo;
import com.ironsource.C4664b4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class ahm extends com.bytedance.adsdk.ugeno.ct.ahm.kgy {
    @Override // com.bytedance.adsdk.ugeno.ct.ahm.kgy
    public void kgy() {
        if (this.rz == null) {
            return;
        }
        Object obj = this.noq.get(C4664b4.i.L);
        int iKgy = obj != null ? com.bytedance.adsdk.ugeno.fi.rz.kgy(String.valueOf(obj), 0) : 0;
        com.bytedance.adsdk.ugeno.ahm.rz rzVar = this.rz;
        com.bytedance.adsdk.ugeno.ahm.rz rzVarAhm = rzVar.ahm(rzVar);
        if (rzVarAhm == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.ahm.rz rzVarNoq = rzVarAhm.noq("SwiperView");
        if (rzVarNoq instanceof com.bytedance.adsdk.ugeno.rz) {
            ((com.bytedance.adsdk.ugeno.rz) rzVarNoq).kgy(iKgy);
        }
    }

    public ahm(com.bytedance.adsdk.ugeno.ahm.rz rzVar, String str, yo.kgy kgyVar) {
        super(rzVar, str, kgyVar);
    }
}
