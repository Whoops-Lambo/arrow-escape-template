package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class xh {
    private kgy ahm;
    private kgy kgy;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        C0255kgy ahm;
        C0255kgy kgy;

        /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.xh$kgy$kgy, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static class C0255kgy {
            String kgy;

            public boolean kgy() {
                return !TextUtils.isEmpty(this.kgy);
            }

            public C0255kgy(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return;
                }
                this.kgy = jSONObject.optString("entry");
            }
        }

        public boolean kgy() {
            C0255kgy c0255kgy = this.ahm;
            if (c0255kgy != null && c0255kgy.kgy()) {
                return true;
            }
            C0255kgy c0255kgy2 = this.kgy;
            return c0255kgy2 != null && c0255kgy2.kgy();
        }

        public kgy(JSONObject jSONObject) {
            if (jSONObject != null) {
                if (jSONObject.has("vertical")) {
                    this.kgy = new C0255kgy(jSONObject.optJSONObject("vertical"));
                }
                if (jSONObject.has("horizontal")) {
                    this.ahm = new C0255kgy(jSONObject.optJSONObject("horizontal"));
                }
            }
        }

        public String kgy(boolean z) {
            if (z) {
                C0255kgy c0255kgy = this.kgy;
                if (c0255kgy != null) {
                    return c0255kgy.kgy;
                }
                return "";
            }
            C0255kgy c0255kgy2 = this.ahm;
            if (c0255kgy2 != null) {
                return c0255kgy2.kgy;
            }
            return "";
        }
    }

    public static kgy ahm(ioy ioyVar) {
        xh xhVarEia;
        if (ioyVar == null || (xhVarEia = ioyVar.eia()) == null) {
            return null;
        }
        return xhVarEia.ahm;
    }

    public static boolean kgy(ioy ioyVar, boolean z) {
        xh xhVarEia;
        if (ioyVar == null || (xhVarEia = ioyVar.eia()) == null) {
            return false;
        }
        if (z) {
            kgy kgyVar = xhVarEia.ahm;
            return kgyVar != null && kgyVar.kgy();
        }
        kgy kgyVar2 = xhVarEia.kgy;
        return kgyVar2 != null && kgyVar2.kgy();
    }

    public static kgy rz(ioy ioyVar) {
        xh xhVarEia;
        if (ioyVar == null || (xhVarEia = ioyVar.eia()) == null) {
            return null;
        }
        return xhVarEia.kgy;
    }

    public xh(JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("easy_playable");
            if (jSONObjectOptJSONObject != null) {
                this.kgy = new kgy(jSONObjectOptJSONObject.optJSONObject("components"));
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("popup");
            if (jSONObjectOptJSONObject2 != null) {
                this.ahm = new kgy(jSONObjectOptJSONObject2.optJSONObject("components"));
            }
        }
    }

    public static boolean kgy(ioy ioyVar) {
        return kgy(ioyVar, false);
    }
}
