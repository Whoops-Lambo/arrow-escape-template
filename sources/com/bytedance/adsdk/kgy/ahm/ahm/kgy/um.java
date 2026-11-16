package com.bytedance.adsdk.kgy.ahm.ahm.kgy;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class um extends xh {
    private static final ThreadLocal<StringBuilder> uq = new ThreadLocal<StringBuilder>() { // from class: com.bytedance.adsdk.kgy.ahm.ahm.kgy.um.1
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    };

    public um() {
        super(com.bytedance.adsdk.kgy.ahm.uq.rz.PLUS);
    }

    @Override // com.bytedance.adsdk.kgy.ahm.ahm.kgy
    public Object kgy(Map<String, JSONObject> map) {
        Object objKgy;
        Object objKgy2 = this.kgy.kgy(map);
        if (objKgy2 == null || (objKgy = this.ahm.kgy(map)) == null) {
            return null;
        }
        if (!(objKgy2 instanceof String) && !(objKgy instanceof String)) {
            return com.bytedance.adsdk.kgy.ahm.ct.kgy.fi.kgy((Number) objKgy2, (Number) objKgy);
        }
        StringBuilder sb = uq.get();
        sb.append(objKgy2);
        sb.append(objKgy);
        String string = sb.toString();
        sb.setLength(0);
        return string;
    }
}
