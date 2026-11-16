package com.bytedance.adsdk.kgy.ahm.ahm.kgy;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class kus extends xh {
    public kus() {
        super(com.bytedance.adsdk.kgy.ahm.uq.rz.NOT_EQ);
    }

    @Override // com.bytedance.adsdk.kgy.ahm.ahm.kgy
    public Object kgy(Map<String, JSONObject> map) {
        Object objKgy = this.kgy.kgy(map);
        Object objKgy2 = this.ahm.kgy(map);
        if (objKgy == null && objKgy2 == null) {
            return Boolean.FALSE;
        }
        if (objKgy == null && objKgy2 != null) {
            return Boolean.TRUE;
        }
        if (objKgy == null || objKgy2 != null) {
            return ((objKgy instanceof Number) && (objKgy2 instanceof Number)) ? Boolean.valueOf(!com.bytedance.adsdk.kgy.ahm.ct.kgy.ahm.kgy((Number) objKgy, (Number) objKgy2)) : Boolean.valueOf(!objKgy.equals(objKgy2));
        }
        return Boolean.TRUE;
    }
}
