package com.bytedance.sdk.component.kgy;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import defpackage.nj;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class kgy {
    protected nu ahm;
    protected String ct;
    protected Context kgy;
    protected yo rz;
    noq yo;
    protected Handler uq = new Handler(Looper.getMainLooper());
    protected volatile boolean noq = false;
    private final Map<String, noq> fi = new HashMap();

    public abstract void ahm(gf gfVar);

    public abstract Context kgy(gf gfVar);

    public abstract String kgy();

    public abstract void kgy(String str);

    public final void ahm(String str, kus kusVar) {
        JSONObject jSONObject;
        if (this.noq || TextUtils.isEmpty(kusVar.noq)) {
            return;
        }
        if (!str.startsWith("{") || !str.endsWith("}")) {
            fi.kgy(new IllegalArgumentException("Illegal callback data: ".concat(str)));
        }
        try {
            jSONObject = PangleNetworkBridge.jsonObjectInit(str);
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VqjtZ", "euw+gRG9atOiWN5ZixQ=", "XecjnBC0SsaMRg==", 193);
            jSONObject = new JSONObject();
        }
        kgy(twf.kgy().kgy("__msg_type", "callback").kgy("__callback_id", kusVar.noq).kgy("__params", jSONObject).ahm(), kusVar);
    }

    public void invokeMethod(final String str) {
        if (this.noq) {
            return;
        }
        this.uq.post(new Runnable() { // from class: com.bytedance.sdk.component.kgy.kgy.1
            @Override // java.lang.Runnable
            public void run() {
                kus kusVarKgy;
                if (kgy.this.noq) {
                    return;
                }
                try {
                    kusVarKgy = kgy.this.kgy(PangleNetworkBridge.jsonObjectInit(str));
                } catch (Exception e) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VqjtZ", "euw+gRG9atOiWN5ZixTkeQ==", "Sfsj", 52);
                    kusVarKgy = null;
                }
                if (!kus.kgy(kusVarKgy)) {
                    kgy.this.kgy(kusVarKgy);
                    return;
                }
                Objects.toString(kusVarKgy);
                if (kusVarKgy != null) {
                    kgy.this.ahm(fpp.kgy(new dg(kusVarKgy.kgy, "Failed to parse invocation.")), kusVarKgy);
                }
            }
        });
    }

    public final void kgy(kus kusVar) {
        String strKgy;
        if (this.noq || (strKgy = kgy()) == null) {
            return;
        }
        noq noqVarAhm = ahm(kusVar.yo);
        if (noqVarAhm == null) {
            kusVar.toString();
            if (this.ahm != null) {
                kgy();
            }
            ahm(fpp.kgy(new dg(-4, nj.q(new StringBuilder("Namespace "), kusVar.yo, " unknown."))), kusVar);
            return;
        }
        ct ctVar = new ct();
        ctVar.ahm = strKgy;
        ctVar.kgy = this.kgy;
        ctVar.rz = noqVarAhm;
        try {
            noq.kgy kgyVarKgy = noqVarAhm.kgy(kusVar, ctVar);
            if (kgyVarKgy != null) {
                if (kgyVarKgy.kgy) {
                    ahm(kgyVarKgy.ahm, kusVar);
                }
                if (this.ahm != null) {
                    kgy();
                    return;
                }
                return;
            }
            kusVar.toString();
            if (this.ahm != null) {
                kgy();
            }
            ahm(fpp.kgy(new dg(-2, "Function " + kusVar.uq + " is not registered.")), kusVar);
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VqjtZ", "euw+gRG9atOiWN5ZixQ=", "U+8jkQ+5SsaMRg==", 145);
            kusVar.toString();
            ahm(fpp.kgy(e), kusVar);
        }
    }

    public final void rz(gf gfVar) {
        this.kgy = kgy(gfVar);
        this.rz = gfVar.uq;
        this.ahm = gfVar.fi;
        this.yo = new noq(gfVar, this);
        this.ct = gfVar.ra;
        ahm(gfVar);
    }

    public void ahm() {
        this.yo.kgy();
        Iterator<noq> it = this.fi.values().iterator();
        while (it.hasNext()) {
            it.next().kgy();
        }
        this.uq.removeCallbacksAndMessages(null);
        this.noq = true;
    }

    private noq ahm(String str) {
        if (!TextUtils.equals(str, this.ct) && !TextUtils.isEmpty(str)) {
            return this.fi.get(str);
        }
        return this.yo;
    }

    public void kgy(String str, kus kusVar) {
        kgy(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public kus kgy(JSONObject jSONObject) {
        String strOptString;
        if (this.noq) {
            return null;
        }
        String strOptString2 = jSONObject.optString("__callback_id");
        String strOptString3 = jSONObject.optString("func");
        if (kgy() == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("__msg_type");
            String strValueOf = "";
            try {
                Object objOpt = jSONObject.opt("params");
                if (objOpt == null) {
                    strOptString = strValueOf;
                } else if (objOpt instanceof JSONObject) {
                    strOptString = String.valueOf((JSONObject) objOpt);
                } else {
                    if (objOpt instanceof String) {
                        strValueOf = (String) objOpt;
                    } else {
                        strValueOf = String.valueOf(objOpt);
                    }
                    strOptString = strValueOf;
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VqjtZ", "euw+gRG9atOiWN5ZixQ=", "WPwolBe5SsaMRg==", 265);
                strOptString = jSONObject.optString("params");
            }
            String string2 = jSONObject.getString("JSSDK");
            String strOptString4 = jSONObject.optString("namespace");
            return kus.kgy().kgy(string2).ahm(string).rz(strOptString3).uq(strOptString).ct(strOptString2).noq(strOptString4).yo(jSONObject.optString("__iframe_url")).kgy();
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VqjtZ", "euw+gRG9atOiWN5ZixQ=", "WPwolBe5SsaMRg==", 280);
            return kus.kgy(strOptString2, -1);
        }
    }
}
