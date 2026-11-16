package com.bytedance.adsdk.kgy.ahm.ahm.kgy;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class nu extends xh {
    public nu() {
        super(com.bytedance.adsdk.kgy.ahm.uq.rz.MINUS);
    }

    @Override // com.bytedance.adsdk.kgy.ahm.ahm.kgy
    public Object kgy(Map<String, JSONObject> map) {
        Object objKgy;
        Object objKgy2 = this.kgy.kgy(map);
        if (objKgy2 == null || (objKgy = this.ahm.kgy(map)) == null) {
            return null;
        }
        return com.bytedance.adsdk.kgy.ahm.ct.kgy.ct.kgy((Number) objKgy2, (Number) objKgy);
    }
}
