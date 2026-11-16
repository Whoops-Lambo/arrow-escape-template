package com.bytedance.adsdk.ugeno.ct.ahm;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.ct.yo;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class noq extends kgy {
    private void kgy(com.bytedance.adsdk.ugeno.ahm.rz rzVar) {
        Object obj;
        if (rzVar == null) {
            return;
        }
        for (String str : this.noq.keySet()) {
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "id") && (obj = this.noq.get(str)) != null) {
                rzVar.kgy(str, String.valueOf(obj));
            }
        }
        rzVar.kgy(this.noq.containsKey("width"), this.noq.containsKey("height"));
        rzVar.ahm();
    }

    public noq(com.bytedance.adsdk.ugeno.ahm.rz rzVar, String str, yo.kgy kgyVar) {
        super(rzVar, str, kgyVar);
    }

    @Override // com.bytedance.adsdk.ugeno.ct.ahm.kgy
    public void kgy() {
        Map<String, Object> map = this.noq;
        if (map == null || map.size() <= 0) {
            return;
        }
        Object obj = this.noq.get("id");
        if (obj == null) {
            kgy(this.rz);
            return;
        }
        String strValueOf = String.valueOf(obj);
        boolean zIsEmpty = TextUtils.isEmpty(strValueOf);
        com.bytedance.adsdk.ugeno.ahm.rz rzVar = this.rz;
        if (zIsEmpty) {
            kgy(rzVar);
            return;
        }
        com.bytedance.adsdk.ugeno.ahm.rz rzVarAhm = rzVar.ahm(rzVar);
        if (rzVarAhm == null) {
            return;
        }
        kgy(rzVarAhm.ct(strValueOf));
    }
}
