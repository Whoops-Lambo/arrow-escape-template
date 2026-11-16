package com.bytedance.sdk.openadsdk.uq.kgy.kgy;

import android.text.TextUtils;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class nu extends ra<JSONObject> {
    private static final AtomicInteger kgy = new AtomicInteger(0);

    public static JSONObject kgy(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            try {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject2.putOpt(next, jSONObject.opt(next));
                }
                String strOptString = jSONObject2.optString("event_extra");
                JSONObject jSONObject3 = TextUtils.isEmpty(strOptString) ? new JSONObject() : PangleNetworkBridge.jsonObjectInit(strOptString);
                jSONObject3.putOpt("_nl", 1);
                jSONObject3.putOpt("_ei", Integer.valueOf(kgy.getAndAdd(1)));
                jSONObject3.putOpt("_reqc", 0);
                jSONObject2.putOpt("event_extra", jSONObject3.toString());
            } catch (Exception unused) {
            }
        }
        return jSONObject2;
    }

    public nu(String str, JSONObject jSONObject) {
        super(str, jSONObject);
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
}
