package com.bytedance.adsdk.kgy.ahm.ahm.kgy;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class fpp implements com.bytedance.adsdk.kgy.ahm.ahm.ahm {
    private com.bytedance.adsdk.kgy.ahm.ahm.kgy ahm;
    private com.bytedance.adsdk.kgy.ahm.ahm.kgy kgy;
    private com.bytedance.adsdk.kgy.ahm.ahm.kgy rz;

    private boolean kgy(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof String) {
            return !((String) obj).isEmpty();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return (obj instanceof Number) && ((Number) obj).doubleValue() != 0.0d;
    }

    @Override // com.bytedance.adsdk.kgy.ahm.ahm.kgy
    public String ahm() {
        return this.kgy.ahm() + "?" + this.ahm.ahm() + ":" + this.rz.ahm();
    }

    @Override // com.bytedance.adsdk.kgy.ahm.ahm.ahm
    public void rz(com.bytedance.adsdk.kgy.ahm.ahm.kgy kgyVar) {
        this.rz = kgyVar;
    }

    public String toString() {
        return ahm();
    }

    @Override // com.bytedance.adsdk.kgy.ahm.ahm.ahm
    public void ahm(com.bytedance.adsdk.kgy.ahm.ahm.kgy kgyVar) {
        this.ahm = kgyVar;
    }

    @Override // com.bytedance.adsdk.kgy.ahm.ahm.kgy
    public Object kgy(Map<String, JSONObject> map) {
        if (!kgy(this.kgy.kgy(map))) {
            return this.rz.kgy(map);
        }
        return this.ahm.kgy(map);
    }

    @Override // com.bytedance.adsdk.kgy.ahm.ahm.kgy
    public com.bytedance.adsdk.kgy.ahm.uq.ct kgy() {
        return com.bytedance.adsdk.kgy.ahm.uq.noq.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.kgy.ahm.ahm.ahm
    public void kgy(com.bytedance.adsdk.kgy.ahm.ahm.kgy kgyVar) {
        this.kgy = kgyVar;
    }
}
