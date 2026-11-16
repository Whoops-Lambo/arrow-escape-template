package com.bytedance.sdk.openadsdk.uq.kgy.kgy;

import com.safedk.android.internal.partials.PangleNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class fi {
    private final kgy ct;
    private final kgy rz;
    private final kgy uq;
    public static final fi kgy = new fi();
    private static final com.bytedance.sdk.openadsdk.lqi.ahm.kgy<fi> ahm = new com.bytedance.sdk.openadsdk.lqi.ahm.kgy<fi>() { // from class: com.bytedance.sdk.openadsdk.uq.kgy.kgy.fi.1
        @Override // com.bytedance.sdk.openadsdk.lqi.ahm.kgy
        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
        public fi ahm(String str) {
            return new fi(str);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        public int ahm;
        public int kgy;

        public void kgy(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            this.kgy = jSONObject.optInt("m_c_c", this.kgy);
            this.ahm = jSONObject.optInt("b_u_m_c", this.ahm);
        }

        public kgy(int i, int i2) {
            this.kgy = i;
            this.ahm = i2;
        }

        public String toString() {
            return super.toString();
        }

        public com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy kgy() {
            return com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy.kgy(this.kgy, this.ahm);
        }
    }

    private static fi uq() {
        return (fi) com.bytedance.sdk.openadsdk.lqi.ct.kgy("olog_config", kgy, ahm);
    }

    public fi(String str) {
        kgy kgyVar = new kgy(1, 50);
        this.rz = kgyVar;
        kgy kgyVar2 = new kgy(1, 50);
        this.uq = kgyVar2;
        kgy kgyVar3 = new kgy(3, 50);
        this.ct = kgyVar3;
        try {
            JSONObject jSONObjectJsonObjectInit = PangleNetworkBridge.jsonObjectInit(str);
            kgyVar.kgy(jSONObjectJsonObjectInit.optJSONObject("al_hi"));
            kgyVar2.kgy(jSONObjectJsonObjectInit.optJSONObject("al_no"));
            kgyVar3.kgy(jSONObjectJsonObjectInit.optJSONObject("st_no"));
        } catch (JSONException unused) {
        }
    }

    public static com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy ahm() {
        return uq().uq.kgy();
    }

    public static com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy kgy() {
        return uq().rz.kgy();
    }

    public static com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy rz() {
        return uq().ct.kgy();
    }

    private fi() {
        this.rz = new kgy(1, 50);
        this.uq = new kgy(1, 50);
        this.ct = new kgy(3, 50);
    }
}
