package com.bytedance.adsdk.kgy.ahm.ahm.kgy;

import defpackage.nj;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class sx implements com.bytedance.adsdk.kgy.ahm.ahm.kgy {
    private final String kgy;

    @Override // com.bytedance.adsdk.kgy.ahm.ahm.kgy
    public String ahm() {
        return nj.q(new StringBuilder("'"), this.kgy, "'");
    }

    @Override // com.bytedance.adsdk.kgy.ahm.ahm.kgy
    public Object kgy(Map<String, JSONObject> map) {
        return this.kgy;
    }

    public sx(String str) {
        this.kgy = str;
    }

    public String toString() {
        return ahm();
    }

    @Override // com.bytedance.adsdk.kgy.ahm.ahm.kgy
    public com.bytedance.adsdk.kgy.ahm.uq.ct kgy() {
        return com.bytedance.adsdk.kgy.ahm.uq.noq.STRING;
    }
}
