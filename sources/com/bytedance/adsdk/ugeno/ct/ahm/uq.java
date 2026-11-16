package com.bytedance.adsdk.ugeno.ct.ahm;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.ct.yo;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class uq extends kgy {
    @Override // com.bytedance.adsdk.ugeno.ct.ahm.kgy
    public void ahm() {
    }

    @Override // com.bytedance.adsdk.ugeno.ct.ahm.kgy
    public void kgy() {
        Object obj;
        com.bytedance.adsdk.ugeno.ahm.rz rzVar;
        com.bytedance.adsdk.ugeno.ahm.rz rzVarAhm;
        com.bytedance.adsdk.ugeno.ahm.rz rzVarGf;
        final com.bytedance.adsdk.ugeno.kgy.kgy kgyVarTwf;
        Map<String, Object> map = this.noq;
        if (map == null || map.size() <= 0 || (obj = this.noq.get("name")) == null) {
            return;
        }
        String strValueOf = String.valueOf(obj);
        if (TextUtils.isEmpty(strValueOf) || (rzVarAhm = (rzVar = this.rz).ahm(rzVar)) == null || (rzVarGf = rzVarAhm.gf(strValueOf)) == null || (kgyVarTwf = rzVarGf.twf(strValueOf)) == null) {
            return;
        }
        kgyVarTwf.ahm();
        kgyVarTwf.kgy(new com.bytedance.adsdk.ugeno.kgy.ahm() { // from class: com.bytedance.adsdk.ugeno.ct.ahm.uq.1
            @Override // com.bytedance.adsdk.ugeno.kgy.ahm
            public void kgy() {
            }

            @Override // com.bytedance.adsdk.ugeno.kgy.ahm
            public void ahm() {
                uq.this.rz();
                kgyVarTwf.ahm(this);
            }
        });
    }

    public uq(com.bytedance.adsdk.ugeno.ahm.rz rzVar, String str, yo.kgy kgyVar) {
        super(rzVar, str, kgyVar);
    }
}
