package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import com.vungle.ads.internal.protos.Sdk;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class fpz {
    private JSONObject at;
    private int ct;
    private ahm fpp;
    private String gf;
    private int kgy;
    private int kus;
    private int noq;
    private boolean nu;
    private int rz;
    private int twf;
    private ikw um;
    private int uq;
    private JSONObject yo;
    private int ahm = 10;
    private int fi = 1;
    private kgy ra = new kgy();
    private int vs = 1;
    private String dg = "Next Ad";
    private String xh = "Next ad in %1$ds";

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ahm {
        private String ahm;
        private float ct;
        private int kgy;
        private String rz;
        private float uq;

        public static ahm kgy(JSONObject jSONObject) {
            ahm ahmVar = new ahm();
            if (jSONObject == null) {
                return ahmVar;
            }
            ahmVar.kgy = jSONObject.optInt("progress_type", 0);
            ahmVar.ahm = jSONObject.optString("progress_color");
            ahmVar.rz = jSONObject.optString("progress_background_color");
            ahmVar.uq = jSONObject.optInt("progress_size", 0);
            ahmVar.ct = jSONObject.optInt("bar_radius", 0);
            return ahmVar;
        }

        public String ahm() {
            return this.ahm;
        }

        public float ct() {
            return this.ct;
        }

        public String rz() {
            return this.rz;
        }

        public float uq() {
            return this.uq;
        }

        public int kgy() {
            return this.kgy;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        private int ahm;
        private int ct;
        private int kgy;
        private int rz;
        private int uq;

        public static kgy kgy(JSONObject jSONObject) {
            kgy kgyVar = new kgy();
            if (jSONObject == null) {
                return kgyVar;
            }
            kgyVar.kgy = Math.max(0, jSONObject.optInt("padding_left", 0));
            kgyVar.ahm = Math.max(0, jSONObject.optInt("padding_right", 0));
            kgyVar.rz = Math.max(0, jSONObject.optInt("padding_top", 0));
            kgyVar.uq = Math.max(0, jSONObject.optInt("padding_bottom", 0));
            kgyVar.ct = Math.max(0, jSONObject.optInt("card_spacing", 0));
            return kgyVar;
        }

        public int ahm() {
            return this.rz;
        }

        public int ct() {
            return this.ct;
        }

        public int rz() {
            return this.kgy;
        }

        public int uq() {
            return this.ahm;
        }

        public int kgy() {
            return this.uq;
        }
    }

    public static fpz kgy(String str) {
        fpz fpzVar = new fpz();
        if (TextUtils.isEmpty(str)) {
            return fpzVar;
        }
        try {
            JSONObject jSONObjectJsonObjectInit = PangleNetworkBridge.jsonObjectInit(str);
            fpzVar.kgy = jSONObjectJsonObjectInit.optInt("auto_switch");
            fpzVar.ahm = jSONObjectJsonObjectInit.optInt("playable_preload_count");
            fpzVar.rz = jSONObjectJsonObjectInit.optInt("disable_on_interaction");
            fpzVar.uq = jSONObjectJsonObjectInit.optInt("ceiling_type");
            fpzVar.ct = jSONObjectJsonObjectInit.optInt("can_loop");
            fpzVar.noq = jSONObjectJsonObjectInit.optInt("multi_skip_time", -1);
            fpzVar.fi = jSONObjectJsonObjectInit.optInt("load_more_strategy");
            fpzVar.vs = jSONObjectJsonObjectInit.optInt("report_show_by_percent", 1);
            JSONObject jSONObjectOptJSONObject = jSONObjectJsonObjectInit.optJSONObject("gesture_tpl_info");
            fpzVar.yo = jSONObjectOptJSONObject;
            if (jSONObjectOptJSONObject != null) {
                ikw ikwVarKgy = ikw.kgy(jSONObjectOptJSONObject);
                fpzVar.um = ikwVarKgy;
                if (ikwVarKgy != null && !TextUtils.isEmpty(ikwVarKgy.rz())) {
                    com.bytedance.sdk.openadsdk.core.at.kgy.ahm.kgy().kgy(new com.bytedance.sdk.openadsdk.core.at.fi.kgy().kgy(fpzVar.um.kgy()).ahm(fpzVar.um.ahm()).rz(fpzVar.um.rz()).uq(fpzVar.um.uq()), "guide");
                }
                int iOptInt = fpzVar.yo.optInt("delay_show_time", 5);
                fpzVar.twf = iOptInt;
                if (iOptInt < 0) {
                    fpzVar.twf = 5;
                }
                int iOptInt2 = fpzVar.yo.optInt("dismiss_after_idle_time", 3);
                fpzVar.kus = iOptInt2;
                if (iOptInt2 <= 0) {
                    fpzVar.kus = 3;
                }
            }
            fpzVar.gf = jSONObjectJsonObjectInit.optString("agg_endcard_url");
            fpzVar.nu = jSONObjectJsonObjectInit.optBoolean("has_more");
            fpzVar.at = jSONObjectJsonObjectInit.optJSONObject("session_params");
            fpzVar.ra = kgy.kgy(jSONObjectJsonObjectInit.optJSONObject("layout_config"));
            fpzVar.fpp = ahm.kgy(jSONObjectJsonObjectInit.optJSONObject("progress_config"));
            return fpzVar;
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4yKRBrA=", "dvshgQqdbeSPRNFUiw==", "XfwimCmPRuk=", Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
            return fpzVar;
        }
    }

    public JSONObject ahm() {
        ikw ikwVar = this.um;
        if (ikwVar == null) {
            return null;
        }
        try {
            String strUq = ikwVar.uq();
            if (!TextUtils.isEmpty(strUq)) {
                return PangleNetworkBridge.jsonObjectInit(strUq);
            }
            String strKgy = com.bytedance.sdk.openadsdk.core.at.kgy.ahm.kgy().kgy("guide", this.um.kgy(), this.um.ahm());
            if (TextUtils.isEmpty(strKgy)) {
                return null;
            }
            return PangleNetworkBridge.jsonObjectInit(strKgy);
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4yKRBrA=", "dvshgQqdbeSPRNFUiw==", "XOs5sha1bcK0T9pNgBC0LQ==", 148);
            return null;
        }
    }

    public JSONObject at() {
        return this.at;
    }

    public int ct() {
        return this.kus;
    }

    public int dg() {
        return this.ahm;
    }

    public int fi() {
        return this.fi;
    }

    public int gf() {
        return this.noq;
    }

    public boolean kus() {
        return this.rz == 1;
    }

    public kgy noq() {
        return this.ra;
    }

    public boolean nu() {
        return this.uq == 1;
    }

    public boolean ra() {
        return this.ct == 1;
    }

    public JSONObject rz() {
        ikw ikwVar = this.um;
        if (ikwVar == null) {
            return null;
        }
        return ikwVar.ct();
    }

    public boolean twf() {
        return this.nu;
    }

    public int uq() {
        return this.twf;
    }

    public boolean vs() {
        return this.kgy == 1;
    }

    public ahm xh() {
        return this.fpp;
    }

    public String yo() {
        return this.gf;
    }

    public boolean kgy() {
        return this.vs == 1;
    }
}
