package com.bytedance.sdk.openadsdk.core.twf;

import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class ahm extends rz {
    private long nu;
    private long ra;

    public ahm(int i, int i2, long j, long j2, com.bytedance.sdk.openadsdk.core.twf.rz.kgy.EnumC0266kgy enumC0266kgy, com.bytedance.sdk.openadsdk.core.twf.rz.kgy.ahm ahmVar, String str, List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> list, List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> list2, String str2) {
        super(i, i2, enumC0266kgy, ahmVar, str, list, list2, str2);
        this.ra = j;
        this.nu = j2;
        this.gf = "icon_click";
    }

    public static ahm kgy(JSONObject jSONObject) {
        rz rzVarAhm = rz.ahm(jSONObject);
        if (rzVarAhm == null) {
            return null;
        }
        return new ahm(rzVarAhm.kgy, rzVarAhm.ahm, jSONObject.optLong("offset", -1L), jSONObject.optLong("duration", -1L), rzVarAhm.rz, rzVarAhm.uq, rzVarAhm.ct, rzVarAhm.noq, rzVarAhm.yo, rzVarAhm.fi);
    }
}
