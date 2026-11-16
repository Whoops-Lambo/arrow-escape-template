package com.bytedance.sdk.openadsdk.uq.kgy.kgy;

import android.os.SystemClock;
import android.text.TextUtils;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class gf extends ra<JSONObject> {
    private static final AtomicInteger kgy = new AtomicInteger(0);
    private com.bytedance.sdk.openadsdk.uq.kgy ahm;

    public gf(final com.bytedance.sdk.openadsdk.uq.kgy kgyVar) {
        super(kgyVar.kgy, (com.bytedance.kgy.kgy.InterfaceC0201kgy) new com.bytedance.kgy.kgy.InterfaceC0201kgy<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.uq.kgy.kgy.gf.1
            final int kgy = gf.kgy.getAndAdd(1);
            final long ahm = SystemClock.elapsedRealtime();

            @Override // com.bytedance.kgy.kgy.InterfaceC0201kgy
            /* JADX INFO: renamed from: ahm, reason: merged with bridge method [inline-methods] */
            public JSONObject kgy() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObjectUq = kgyVar.uq();
                    Iterator<String> itKeys = jSONObjectUq.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.putOpt(next, jSONObjectUq.opt(next));
                    }
                    String strOptString = jSONObject.optString("ad_extra_data", null);
                    JSONObject jSONObject2 = TextUtils.isEmpty(strOptString) ? new JSONObject() : PangleNetworkBridge.jsonObjectInit(strOptString);
                    String strOptString2 = jSONObject2.optString("pag_json_data");
                    JSONObject jSONObject3 = TextUtils.isEmpty(strOptString2) ? new JSONObject() : PangleNetworkBridge.jsonObjectInit(strOptString2);
                    jSONObject3.putOpt("_nl", 1);
                    jSONObject3.putOpt("_ei", Integer.valueOf(this.kgy));
                    jSONObject3.putOpt("_reqc", 0);
                    jSONObject3.putOpt("_c_t_s", Long.valueOf(SystemClock.elapsedRealtime() - this.ahm));
                    if (noq.ahm()) {
                        jSONObject3.put("_ad_staging_flag", 3);
                    }
                    jSONObject2.putOpt("pag_json_data", jSONObject3.toString());
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                    return jSONObject;
                } catch (Exception unused) {
                    return null;
                }
            }
        });
        kgy(kgyVar.fi() ? 1 : 0);
        this.ahm = kgyVar;
    }

    public String fi() {
        com.bytedance.sdk.openadsdk.uq.kgy kgyVar = this.ahm;
        if (kgyVar != null) {
            return kgyVar.noq();
        }
        return null;
    }

    @Override // com.bytedance.kgy.kgy
    public String toString() {
        com.bytedance.sdk.openadsdk.uq.kgy kgyVar = this.ahm;
        return kgyVar != null ? kgyVar.noq() : super.toString();
    }

    @Override // com.bytedance.kgy.kgy
    public byte[] uq() {
        String string;
        JSONObject jSONObjectRz = rz();
        if (jSONObjectRz != null && (string = jSONObjectRz.toString()) != null) {
            return string.getBytes(StandardCharsets.UTF_8);
        }
        return null;
    }

    public gf(String str, JSONObject jSONObject) {
        super(str, jSONObject);
    }
}
