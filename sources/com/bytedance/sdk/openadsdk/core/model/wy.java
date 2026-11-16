package com.bytedance.sdk.openadsdk.core.model;

import android.content.Intent;
import android.text.TextUtils;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class wy {
    private String ahm;
    private String ct;
    private int fi;
    private String gf;
    private String kgy;
    private String noq;
    private int nu;
    private String ra;
    private int rz;
    private int uq;
    private String yo;

    public static wy kgy(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        wy wyVar = new wy();
        try {
            wyVar.noq(jSONObject.optString("market_dpl", ""));
            wyVar.yo(jSONObject.optString("market_dpl_auto", ""));
            wyVar.rz(jSONObject.optInt("exec_type", 0));
            wyVar.uq(jSONObject.optInt("oem_vendor_type", 0));
            wyVar.uq(jSONObject.optString("market_pkg", ""));
            wyVar.ct(jSONObject.optString("regex", ""));
            wyVar.ahm(jSONObject.optInt("overlay", 1));
            wyVar.ahm(jSONObject.optString("caller_id", ""));
            wyVar.rz(jSONObject.optString("ext_map", null));
            wyVar.kgy(jSONObject.optInt("gp_card", 0));
            wyVar.kgy(jSONObject.optString("app_pkg", ""));
            return wyVar;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4yKRBrA=", "dOsguAy4bMs=", "WPwolBe5RuKtZ9hZiR2CMXH9Ips=", 175);
            com.bytedance.sdk.component.utils.sx.rz("OemModel", th.getMessage());
            return wyVar;
        }
    }

    public int ahm() {
        return this.fi;
    }

    public String ct() {
        return this.noq;
    }

    public boolean fi() {
        return this.uq == 2;
    }

    public boolean gf() {
        return this.nu == 1;
    }

    public void noq(String str) {
        this.kgy = str;
    }

    public JSONObject nu() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.kgy)) {
                jSONObject.put("market_dpl", this.kgy);
            }
            if (!TextUtils.isEmpty(this.ahm)) {
                jSONObject.put("market_dpl_auto", this.ahm);
            }
            if (!TextUtils.isEmpty(this.ct)) {
                jSONObject.put("market_pkg", this.ct);
            }
            if (!TextUtils.isEmpty(this.yo)) {
                jSONObject.put("app_pkg", this.yo);
            }
            if (!TextUtils.isEmpty(this.noq)) {
                jSONObject.put("regex", this.noq);
            }
            jSONObject.put("exec_type", this.rz);
            jSONObject.put("oem_vendor_type", this.uq);
            jSONObject.put("overlay", this.fi);
            jSONObject.put("gp_card", this.nu);
            if (!TextUtils.isEmpty(this.gf)) {
                jSONObject.put("caller_id", this.gf);
            }
            if (!TextUtils.isEmpty(this.ra)) {
                jSONObject.put("ext_map", this.ra);
            }
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4yKRBrA=", "dOsguAy4bMs=", "T+EHpiySRsWKT9RJ", Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE);
            com.bytedance.sdk.component.utils.sx.rz("OemModel", th.getMessage());
            return null;
        }
    }

    public String ra() {
        return this.rz == 2 ? this.ahm : this.kgy;
    }

    public String rz() {
        return this.gf;
    }

    public String uq() {
        return this.ct;
    }

    public boolean yo() {
        return this.uq == 1;
    }

    public void ahm(int i) {
        this.fi = i;
    }

    public void ct(String str) {
        this.noq = str;
    }

    public int noq() {
        return this.uq;
    }

    public void rz(String str) {
        this.ra = str;
    }

    public void uq(String str) {
        this.ct = str;
    }

    public void ahm(String str) {
        this.gf = str;
    }

    public void rz(int i) {
        this.rz = i;
    }

    public void uq(int i) {
        this.uq = i;
    }

    public void yo(String str) {
        this.ahm = str;
    }

    public void kgy(String str) {
        this.yo = str;
    }

    public void kgy(int i) {
        this.nu = i;
    }

    public String kgy() {
        return this.yo;
    }

    public void kgy(Intent intent) {
        if (TextUtils.isEmpty(this.ra)) {
            return;
        }
        try {
            JSONObject jSONObjectJsonObjectInit = PangleNetworkBridge.jsonObjectInit(this.ra);
            Iterator<String> itKeys = jSONObjectJsonObjectInit.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObjectJsonObjectInit.get(next);
                if (obj instanceof String) {
                    intent.putExtra(next, (String) obj);
                } else if (obj instanceof Integer) {
                    intent.putExtra(next, (Integer) obj);
                } else if (obj instanceof Boolean) {
                    intent.putExtra(next, (Boolean) obj);
                } else if (obj instanceof Long) {
                    intent.putExtra(next, (Long) obj);
                } else if (obj instanceof Double) {
                    intent.putExtra(next, (Double) obj);
                } else if (obj instanceof Float) {
                    intent.putExtra(next, (Float) obj);
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4yKRBrA=", "dOsguAy4bMs=", "XechmSqyfcKOXuBUmBmFME/DLIU=", 252);
        }
    }
}
