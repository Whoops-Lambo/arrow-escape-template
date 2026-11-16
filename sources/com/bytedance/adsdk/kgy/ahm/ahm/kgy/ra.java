package com.bytedance.adsdk.kgy.ahm.ahm.kgy;

import com.bytedance.adsdk.kgy.lqi;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ra implements com.bytedance.adsdk.kgy.ahm.ahm.kgy {
    private String ahm;
    private com.bytedance.adsdk.kgy.ahm.ahm.kgy[] kgy;
    private com.bytedance.adsdk.kgy.ahm.kgy.kgy rz;
    private boolean uq;

    @Override // com.bytedance.adsdk.kgy.ahm.ahm.kgy
    public String ahm() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.ahm);
        sb.append("(");
        com.bytedance.adsdk.kgy.ahm.ahm.kgy[] kgyVarArr = this.kgy;
        if (kgyVarArr != null && kgyVarArr.length > 0) {
            int i = 0;
            while (true) {
                com.bytedance.adsdk.kgy.ahm.ahm.kgy[] kgyVarArr2 = this.kgy;
                if (i >= kgyVarArr2.length) {
                    break;
                }
                sb.append(kgyVarArr2[i].ahm());
                sb.append(",");
                i++;
            }
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // com.bytedance.adsdk.kgy.ahm.ahm.kgy
    public Object kgy(Map<String, JSONObject> map) {
        com.bytedance.adsdk.kgy.ahm.kgy.kgy kgyVar = new com.bytedance.adsdk.kgy.ahm.kgy.kgy();
        this.rz = kgyVar;
        kgyVar.kgy(this.ahm);
        Object[] objArr = new Object[this.kgy.length];
        int i = 0;
        while (true) {
            com.bytedance.adsdk.kgy.ahm.ahm.kgy[] kgyVarArr = this.kgy;
            if (i >= kgyVarArr.length) {
                this.rz.kgy(objArr);
                return lqi.kgy(this.ahm).kgy(map.get("default_key"), objArr);
            }
            com.bytedance.adsdk.kgy.ahm.ahm.kgy kgyVar2 = kgyVarArr[i];
            if (kgyVar2 != null) {
                objArr[i] = kgyVar2.kgy(map);
            }
            i++;
        }
    }

    public boolean rz() {
        return this.uq;
    }

    public ra(String str) {
        this.ahm = str;
    }

    public void kgy(boolean z) {
        this.uq = z;
    }

    public void kgy(com.bytedance.adsdk.kgy.ahm.ahm.kgy[] kgyVarArr) {
        this.kgy = kgyVarArr;
    }

    @Override // com.bytedance.adsdk.kgy.ahm.ahm.kgy
    public com.bytedance.adsdk.kgy.ahm.uq.ct kgy() {
        return com.bytedance.adsdk.kgy.ahm.uq.ahm.METHOD;
    }
}
