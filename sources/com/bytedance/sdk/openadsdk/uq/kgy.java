package com.bytedance.sdk.openadsdk.uq;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.ioy;
import com.bytedance.sdk.openadsdk.core.model.uf;
import com.bytedance.sdk.openadsdk.utils.ft;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.t;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import com.unity3d.mediation.LevelPlayAdError;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class kgy implements com.bytedance.sdk.component.yo.kgy.uq.kgy.ahm {
    private static final Set<String> at = new HashSet(Arrays.asList("insight_log"));
    private static final Map<String, String> twf = new HashMap<String, String>() { // from class: com.bytedance.sdk.openadsdk.uq.kgy.1
        {
            put("id", "extra_id");
            put("source", "extra_source");
            put("url", "extra_url");
            put("toolType", "extra_tool_type");
            put("storeOpenType", "store_open_type");
            put(IronSourceConstants.EVENTS_ERROR_CODE, t.d);
            put("md5", "extra_md5");
            put("areaType", "area_type");
            put("rectInfo", "rect_info");
        }
    };
    protected final JSONObject ahm;
    private com.bytedance.sdk.openadsdk.uq.ahm.kgy ay;
    private long ct;
    private String dg;
    private int fi;
    private String fpp;
    private int fpz;
    private List<String> ft;
    private int gf;
    private String gm;
    private String ioy;
    private String jpc;
    public final String kgy;
    private final AtomicBoolean kus;
    private String lqi;
    private long noq;
    private int nu;
    private int ra;
    private int rz;
    private String sx;
    private String um;
    private boolean uq;
    private JSONObject vs;
    private String xh;
    private final String yo;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.uq.kgy$kgy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class C0286kgy {
        private String ahm;
        private final int at;
        private String ct;
        private final long dg;
        private String fi;
        private boolean fpp;
        private String gf;
        private List<String> gm;
        public int kgy;
        private com.bytedance.sdk.openadsdk.uq.ahm.ahm kus;
        private String noq;
        private String nu;
        private JSONObject ra;
        private String rz;
        private String sx;
        private String twf;
        private int um;
        private String uq;
        private com.bytedance.sdk.openadsdk.uq.ahm.kgy vs;
        private int xh;
        private String yo;

        public C0286kgy(long j, ioy ioyVar) {
            this.xh = -1;
            this.um = -1;
            this.kgy = -1;
            if (ioyVar != null) {
                this.fpp = uf.ahm(ioyVar);
                this.xh = ioyVar.znm();
                this.um = ioyVar.naw();
                this.kgy = ioyVar.rdw();
            }
            this.dg = j;
            this.at = com.bytedance.sdk.component.utils.um.rz(com.bytedance.sdk.openadsdk.core.xh.kgy());
        }

        public void kgy(com.bytedance.sdk.openadsdk.uq.ahm.kgy kgyVar) {
            com.bytedance.sdk.openadsdk.noq.ahm.kgy().kgy(this.uq, this.sx, this.yo, this.rz);
            this.vs = kgyVar;
            kgy kgyVar2 = new kgy(this);
            try {
                com.bytedance.sdk.openadsdk.uq.ahm.ahm ahmVar = this.kus;
                if (ahmVar != null) {
                    ahmVar.kgy(kgyVar2.ahm, this.dg);
                } else {
                    new com.bytedance.sdk.openadsdk.uq.ahm.rz().kgy(kgyVar2.ahm, this.dg);
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "euoIgwayfYOhTvJLiR+0Ck7nIZEGrg==", "SOsjkQ==", LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED);
            }
            com.bytedance.sdk.openadsdk.uq.kgy.ahm.kgy(kgyVar2);
        }

        public C0286kgy ahm(String str) {
            this.rz = str;
            return this;
        }

        public C0286kgy ct(String str) {
            this.fi = str;
            return this;
        }

        public C0286kgy fi(String str) {
            this.sx = str;
            return this;
        }

        public C0286kgy noq(String str) {
            this.gf = str;
            return this;
        }

        public C0286kgy rz(String str) {
            this.uq = str;
            return this;
        }

        public C0286kgy uq(String str) {
            this.ct = str;
            return this;
        }

        public C0286kgy yo(String str) {
            this.yo = str;
            return this;
        }

        public C0286kgy kgy(String str) {
            this.twf = str;
            return this;
        }

        public C0286kgy kgy(List<String> list) {
            this.gm = list;
            return this;
        }

        public C0286kgy kgy(JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            this.ra = jSONObject;
            return this;
        }
    }

    private JSONObject kgy(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("adiff")) {
                jSONObject.put("adiff", this.kgy);
            }
            if (this.uq) {
                if (!jSONObject.has("interaction_method")) {
                    jSONObject.put("interaction_method", this.fi);
                }
                if (!jSONObject.has("real_interaction_method")) {
                    jSONObject.put("real_interaction_method", this.gf);
                }
                if (!jSONObject.has("image_mode")) {
                    jSONObject.put("image_mode", this.ra);
                }
            }
            ahm(jSONObject);
            if (!jSONObject.has("pangle_client_unique_id")) {
                jSONObject.put("pangle_client_unique_id", "pangle-" + this.kgy + "-" + System.currentTimeMillis());
            }
            if (com.bytedance.sdk.openadsdk.uq.kgy.kgy.noq.ahm()) {
                String strOptString = jSONObject.optString("pag_json_data");
                if (!TextUtils.isEmpty(strOptString)) {
                    this.nu = PangleNetworkBridge.jsonObjectInit(strOptString).optInt("_l_s_t");
                }
            }
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "euoIgwayfQ==", "VP45lCK4TN+UWNZ5jQWh", 206);
            com.bytedance.sdk.component.utils.sx.rz("AdEvent", th.getMessage() == null ? "error " : th.getMessage());
            return jSONObject;
        }
    }

    private void nu() throws JSONException {
        this.ahm.putOpt("app_log_url", this.jpc);
        List<String> list = this.ft;
        if (list != null && !list.isEmpty()) {
            try {
                this.ahm.putOpt("app_log_url_back", new JSONArray((Collection) this.ft));
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "euoIgwayfQ==", "WuoptgyxZMiOetZPjRyz", 343);
                com.bytedance.sdk.component.utils.sx.rz("AdEvent", th.getMessage());
            }
        }
        this.ahm.putOpt("tag", this.dg);
        this.ahm.putOpt("label", this.xh);
        this.ahm.putOpt("category", this.um);
        if (!TextUtils.isEmpty(this.fpp)) {
            try {
                this.ahm.putOpt("value", Long.valueOf(Long.parseLong(this.fpp)));
            } catch (NumberFormatException e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "euoIgwayfQ==", "WuoptgyxZMiOetZPjRyz", 353);
                this.ahm.putOpt("value", 0L);
            }
        }
        if (!TextUtils.isEmpty(this.gm)) {
            try {
                this.ahm.putOpt("ext_value", Long.valueOf(Long.parseLong(this.gm)));
            } catch (Exception e2) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "euoIgwayfQ==", "WuoptgyxZMiOetZPjRyz", 361);
            }
        }
        if (!TextUtils.isEmpty(this.lqi)) {
            this.ahm.putOpt("log_extra", this.lqi);
        }
        if (!TextUtils.isEmpty(this.ioy)) {
            try {
                this.ahm.putOpt("ua_policy", Integer.valueOf(Integer.parseInt(this.ioy)));
            } catch (NumberFormatException e3) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e3, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "euoIgwayfQ==", "WuoptgyxZMiOetZPjRyz", 373);
            }
        }
        kgy(this.ahm, this.xh);
        try {
            if (!this.ahm.has("nt")) {
                this.ahm.putOpt("nt", Integer.valueOf(this.fpz));
            }
        } catch (Exception e4) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e4, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "euoIgwayfQ==", "WuoptgyxZMiOetZPjRyz", 382);
        }
        Iterator<String> itKeys = this.vs.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            this.ahm.putOpt(next, this.vs.opt(next));
        }
    }

    private void ra() {
        JSONObject jSONObject = this.vs;
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("value");
            String strOptString2 = this.vs.optString("category");
            String strOptString3 = this.vs.optString("log_extra");
            if (kgy(this.fpp, this.um, this.lqi)) {
                if (!TextUtils.isEmpty(strOptString) && TextUtils.equals(strOptString, "0")) {
                    return;
                }
                if (!TextUtils.isEmpty(strOptString2) && !ahm(strOptString2)) {
                    return;
                }
            } else {
                if ((TextUtils.isEmpty(strOptString) || TextUtils.equals(strOptString, "0")) && (TextUtils.isEmpty(this.fpp) || TextUtils.equals(this.fpp, "0"))) {
                    return;
                }
                if ((TextUtils.isEmpty(this.um) || !ahm(this.um)) && (TextUtils.isEmpty(strOptString2) || !ahm(strOptString2))) {
                    return;
                }
                if (TextUtils.isEmpty(this.lqi) && TextUtils.isEmpty(strOptString3)) {
                    return;
                }
            }
        } else if (!kgy(this.fpp, this.um, this.lqi)) {
            return;
        }
        this.ct = com.bytedance.sdk.openadsdk.uq.kgy.ahm.rz.incrementAndGet();
    }

    public boolean fi() {
        Set<String> setAt;
        if (this.ahm == null || (setAt = com.bytedance.sdk.openadsdk.core.xh.uq().at()) == null) {
            return false;
        }
        String strOptString = this.ahm.optString("label");
        if (!TextUtils.isEmpty(strOptString)) {
            return setAt.contains(strOptString);
        }
        if (TextUtils.isEmpty(this.xh)) {
            return false;
        }
        return setAt.contains(this.xh);
    }

    public int gf() {
        return this.rz;
    }

    public String noq() {
        if (!TextUtils.isEmpty(this.xh)) {
            return this.xh;
        }
        JSONObject jSONObject = this.ahm;
        return jSONObject != null ? jSONObject.optString("label") : "";
    }

    public int rz() {
        return this.nu;
    }

    public JSONObject uq() {
        if (this.kus.get()) {
            return this.ahm;
        }
        try {
            nu();
            if (this.ahm.has("ad_extra_data")) {
                Object objOpt = this.ahm.opt("ad_extra_data");
                if (objOpt != null) {
                    try {
                        if (objOpt instanceof JSONObject) {
                            this.ahm.put("ad_extra_data", kgy((JSONObject) objOpt).toString());
                        } else if (objOpt instanceof String) {
                            this.ahm.put("ad_extra_data", kgy(PangleNetworkBridge.jsonObjectInit((String) objOpt)).toString());
                        }
                    } catch (JSONException e) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "euoIgwayfQ==", "XOs5sBW5Z9M=", 263);
                        com.bytedance.sdk.component.utils.sx.rz("AdEvent", "json error", e.getMessage());
                    }
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("adiff", this.kgy);
                    if (this.uq) {
                        jSONObject.put("interaction_method", this.fi);
                        jSONObject.put("real_interaction_method", this.gf);
                        jSONObject.put("image_mode", this.ra);
                    }
                    this.ahm.put("ad_extra_data", jSONObject.toString());
                } catch (JSONException e2) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "euoIgwayfQ==", "XOs5sBW5Z9M=", 276);
                    com.bytedance.sdk.component.utils.sx.rz("AdEvent", "json error", e2.getMessage());
                }
            }
            this.kus.set(true);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "euoIgwayfQ==", "XOs5sBW5Z9M=", 283);
        }
        return this.ahm;
    }

    public String yo() {
        return this.kgy;
    }

    public kgy(C0286kgy c0286kgy) {
        JSONObject jSONObject;
        this.yo = "adiff";
        this.kus = new AtomicBoolean(false);
        this.vs = new JSONObject();
        if (TextUtils.isEmpty(c0286kgy.ahm)) {
            this.kgy = ft.kgy();
        } else {
            this.kgy = c0286kgy.ahm;
        }
        this.ay = c0286kgy.vs;
        this.lqi = c0286kgy.noq;
        this.dg = c0286kgy.rz;
        this.xh = c0286kgy.uq;
        if (TextUtils.isEmpty(c0286kgy.ct)) {
            this.um = "app_union";
        } else {
            this.um = c0286kgy.ct;
        }
        this.ioy = c0286kgy.nu;
        this.fpp = c0286kgy.fi;
        this.gm = c0286kgy.gf;
        this.sx = c0286kgy.yo;
        this.fpz = c0286kgy.at;
        this.jpc = c0286kgy.twf;
        if (c0286kgy.ra != null) {
            jSONObject = c0286kgy.ra;
        } else {
            jSONObject = new JSONObject();
        }
        this.vs = c0286kgy.ra = jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        this.ahm = jSONObject2;
        if (!TextUtils.isEmpty(c0286kgy.twf)) {
            try {
                jSONObject2.put("app_log_url", c0286kgy.twf);
            } catch (JSONException e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "euoIgwayfQ==", "B+cjnBfi", 456);
                com.bytedance.sdk.component.utils.sx.rz("AdEvent", e.getMessage());
            }
        }
        this.ft = c0286kgy.gm;
        if (c0286kgy.gm != null && !c0286kgy.gm.isEmpty()) {
            try {
                this.ahm.putOpt("app_log_url_back", new JSONArray((Collection) c0286kgy.gm));
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "euoIgwayfQ==", "B+cjnBfi", 465);
                com.bytedance.sdk.component.utils.sx.rz("AdEvent", th.getMessage());
            }
        }
        this.fi = c0286kgy.xh;
        this.gf = c0286kgy.um;
        this.ra = c0286kgy.kgy;
        this.uq = c0286kgy.fpp;
        this.noq = System.currentTimeMillis();
        ra();
    }

    private boolean ahm(String str) {
        str.getClass();
        switch (str) {
            case "umeng":
            case "event_v1":
            case "event_v3":
            case "app_union":
                return true;
            default:
                return false;
        }
    }

    public JSONObject ct() {
        JSONObject jSONObjectUq = uq();
        try {
            JSONObject jSONObjectJsonObjectInit = PangleNetworkBridge.jsonObjectInit(jSONObjectUq.toString());
            JSONObject jSONObjectOptJSONObject = jSONObjectJsonObjectInit.optJSONObject("params");
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.remove("app_log_url");
                jSONObjectOptJSONObject.remove("app_log_url_back");
                return jSONObjectJsonObjectInit;
            }
            return jSONObjectJsonObjectInit;
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "euoIgwayfQ==", "XOs5sBW5Z9O3Q8NVowS0CUv+AZoEiXvL", 299);
            com.bytedance.sdk.component.utils.sx.rz("AdEvent", e.getMessage());
            return jSONObjectUq;
        }
    }

    private void ahm(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        for (String str : twf.keySet()) {
            try {
                if (jSONObject.has(str)) {
                    Object objOpt = jSONObject.opt(str);
                    jSONObject.remove(str);
                    jSONObject.put(twf.get(str), objOpt);
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "euoIgwayfQ==", "SesjlA65QsKZWQ==", 228);
            }
        }
    }

    @Override // com.bytedance.sdk.component.yo.kgy.uq.kgy.ahm
    public long ahm() {
        return this.ct;
    }

    private boolean kgy(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "0") || TextUtils.isEmpty(str3)) {
            return false;
        }
        str2.getClass();
        switch (str2) {
            case "umeng":
            case "event_v1":
            case "event_v3":
            case "app_union":
                return true;
            default:
                return false;
        }
    }

    @Override // com.bytedance.sdk.component.yo.kgy.uq.kgy.ahm
    public JSONObject kgy(String str) {
        return uq();
    }

    @Override // com.bytedance.sdk.component.yo.kgy.uq.kgy.ahm
    public long kgy() {
        return this.noq;
    }

    private static void kgy(JSONObject jSONObject, String str) {
        try {
            Set<String> set = at;
            if (!set.contains(str) && !set.contains(jSONObject.get("label"))) {
                jSONObject.putOpt("is_ad_event", "1");
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "euoIgwayfQ==", "Uv0MkQedbeKWT9lJ", 693);
            com.bytedance.sdk.component.utils.sx.rz("AdEvent", th);
        }
    }

    public kgy(String str, JSONObject jSONObject, int i) {
        this.yo = "adiff";
        this.kus = new AtomicBoolean(false);
        this.vs = new JSONObject();
        this.kgy = str;
        this.ahm = jSONObject;
        this.rz = i;
    }
}
