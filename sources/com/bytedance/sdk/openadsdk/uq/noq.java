package com.bytedance.sdk.openadsdk.uq;

import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class noq extends kgy {
    public static final SimpleDateFormat rz = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    @Override // com.bytedance.sdk.openadsdk.uq.kgy
    public JSONObject uq() {
        return this.ahm;
    }

    public noq(String str, JSONObject jSONObject, int i) {
        super(str, jSONObject, i);
    }
}
