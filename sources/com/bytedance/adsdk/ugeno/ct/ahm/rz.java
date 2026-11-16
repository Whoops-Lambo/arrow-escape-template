package com.bytedance.adsdk.ugeno.ct.ahm;

import com.bytedance.adsdk.ugeno.core.vs;
import com.bytedance.adsdk.ugeno.ct.yo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class rz extends kgy {
    private vs gf;

    @Override // com.bytedance.adsdk.ugeno.ct.ahm.kgy
    public void kgy() {
        vs vsVarLqi = this.rz.lqi();
        this.gf = vsVarLqi;
        if (vsVarLqi != null) {
            vsVarLqi.kgy(this.rz, this.yo, this.ahm);
        }
    }

    public rz(com.bytedance.adsdk.ugeno.ahm.rz rzVar, String str, yo.kgy kgyVar) {
        super(rzVar, str, kgyVar);
    }
}
