package com.bytedance.adsdk.ugeno.ct.ahm;

import com.bytedance.adsdk.ugeno.ct.yo;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class ahm extends kgy {
    private List<com.bytedance.adsdk.ugeno.ct.kgy.uq> gf;

    @Override // com.bytedance.adsdk.ugeno.ct.ahm.kgy
    public void kgy() {
        Object obj;
        com.bytedance.adsdk.ugeno.ct.kgy.rz rzVarKgy;
        Map<String, Object> map = this.noq;
        if (map == null || map.size() <= 0 || (obj = this.noq.get("name")) == null) {
            return;
        }
        String strValueOf = String.valueOf(obj);
        com.bytedance.adsdk.ugeno.ct.kgy.kgy kgyVarGbb = this.rz.gbb();
        if (kgyVarGbb == null || (rzVarKgy = kgyVarGbb.kgy(strValueOf)) == null) {
            return;
        }
        rzVarKgy.kgy(strValueOf);
    }

    public ahm(com.bytedance.adsdk.ugeno.ahm.rz rzVar, String str, yo.kgy kgyVar) {
        super(rzVar, str, kgyVar);
        this.gf = new CopyOnWriteArrayList();
    }
}
