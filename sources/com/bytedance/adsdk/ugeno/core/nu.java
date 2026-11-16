package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class nu {
    private JSONObject ahm;
    private com.bytedance.adsdk.ugeno.ct.dg ct;
    private Context kgy;
    private String noq;
    private JSONObject rz;
    private Map<String, Object> uq;
    private Set<String> yo;

    public void ahm(JSONObject jSONObject) {
        this.rz = jSONObject;
    }

    public Set<String> ct() {
        return this.yo;
    }

    public void kgy(Context context) {
        this.kgy = context;
    }

    public com.bytedance.adsdk.ugeno.ct.dg rz() {
        return this.ct;
    }

    public String uq() {
        return this.noq;
    }

    public Map<String, Object> ahm() {
        return this.uq;
    }

    public void kgy(JSONObject jSONObject) {
        this.ahm = jSONObject;
    }

    public JSONObject kgy() {
        return this.rz;
    }

    public void kgy(Map<String, Object> map) {
        this.uq = map;
    }
}
