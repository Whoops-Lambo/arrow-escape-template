package com.bytedance.sdk.openadsdk.uq.kgy.kgy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class rz {
    private static final rz fi = new rz();
    private static final com.bytedance.sdk.openadsdk.lqi.ahm.kgy<rz> gf = new com.bytedance.sdk.openadsdk.lqi.ahm.kgy<rz>() { // from class: com.bytedance.sdk.openadsdk.uq.kgy.kgy.rz.1
        @Override // com.bytedance.sdk.openadsdk.lqi.ahm.kgy
        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
        public rz ahm(String str) {
            return new rz(str);
        }
    };
    public boolean ahm;
    public long ct;
    public boolean kgy;
    public boolean noq;
    private final HashMap<String, kgy> ra;
    public long rz;
    public boolean uq;
    public int yo;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ahm {
        public String ct;
        public long kgy = 5000;
        public int ahm = 50;
        public long rz = 604800000;
        public boolean uq = false;
        public int noq = 5;
        public int yo = 5;
        public long fi = 5000;
        public long gf = 600000;

        public void kgy(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            this.kgy = jSONObject.optLong("u_d_t", this.kgy);
            this.gf = jSONObject.optLong("u_d_m_t", this.gf);
            this.ahm = jSONObject.optInt("u_m_c", this.ahm);
            this.rz = jSONObject.optLong("e_t", this.rz);
            this.uq = jSONObject.optBoolean("ena", this.uq);
            this.noq = jSONObject.optInt("n_e_b_u_n_d_c", this.noq);
            this.yo = jSONObject.optInt("b_s_e_c", this.yo);
            this.fi = jSONObject.optLong("b_s_d_t", this.fi);
        }

        public ahm(String str) {
            this.ct = str;
        }

        public String toString() {
            return super.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        public static final kgy kgy = new kgy();
        public String ahm;
        private final ahm ct;
        private final ahm rz;
        private final ahm uq;

        @NonNull
        public ahm ahm() {
            return this.uq;
        }

        @NonNull
        public ahm kgy() {
            return this.rz;
        }

        @NonNull
        public ahm rz() {
            return this.ct;
        }

        public kgy(JSONObject jSONObject) {
            ahm ahmVar = new ahm("applog");
            this.rz = ahmVar;
            ahm ahmVar2 = new ahm("stats");
            this.uq = ahmVar2;
            ahm ahmVar3 = new ahm("track");
            this.ct = ahmVar3;
            try {
                this.ahm = jSONObject.getString("name");
                ahmVar.kgy(jSONObject.optJSONObject("applog"));
                ahmVar2.kgy(jSONObject.optJSONObject("stats"));
                ahmVar3.kgy(jSONObject.optJSONObject("track"));
            } catch (JSONException unused) {
            }
        }

        public String toString() {
            return super.toString();
        }

        public kgy() {
            this.rz = new ahm("applog");
            this.uq = new ahm("stats");
            this.ct = new ahm("track");
        }
    }

    public static rz ahm() {
        rz rzVar = fi;
        rz rzVar2 = (rz) com.bytedance.sdk.openadsdk.lqi.ct.kgy("event_logger_config", rzVar, gf);
        return rzVar2 != null ? rzVar2 : rzVar;
    }

    public rz(String str) {
        this.ra = new HashMap<>();
        this.rz = 86400000L;
        this.ct = 3000L;
        this.yo = 0;
        try {
            JSONObject jSONObjectJsonObjectInit = PangleNetworkBridge.jsonObjectInit(str);
            this.kgy = jSONObjectJsonObjectInit.optBoolean("ena_mon", this.kgy);
            this.ahm = jSONObjectJsonObjectInit.optBoolean("ena_wal", this.ahm);
            this.rz = jSONObjectJsonObjectInit.optLong("mon_u_i_ms", this.rz);
            this.uq = jSONObjectJsonObjectInit.optBoolean("ena_dy_adj", this.uq);
            this.ct = jSONObjectJsonObjectInit.optLong("p_u_r_d_t", this.ct);
            this.noq = jSONObjectJsonObjectInit.optBoolean("s_e_u_t_p", this.noq);
            this.yo = jSONObjectJsonObjectInit.optInt("cy_ty", this.yo);
            JSONArray jSONArrayOptJSONArray = jSONObjectJsonObjectInit.optJSONArray("ins_confs");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    kgy kgyVar = new kgy(jSONArrayOptJSONArray.getJSONObject(i));
                    this.ra.put(kgyVar.ahm, kgyVar);
                }
            }
        } catch (JSONException unused) {
        }
    }

    @NonNull
    public static kgy kgy() {
        kgy kgyVarKgy = ahm().kgy("ads");
        if (kgyVarKgy != null) {
            return kgyVarKgy;
        }
        return kgy.kgy;
    }

    @Nullable
    private kgy kgy(String str) {
        return this.ra.get(str);
    }

    public rz() {
        this.ra = new HashMap<>();
        this.rz = 86400000L;
        this.ct = 3000L;
        this.yo = 0;
    }
}
