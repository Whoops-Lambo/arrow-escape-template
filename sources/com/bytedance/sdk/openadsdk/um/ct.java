package com.bytedance.sdk.openadsdk.um;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.um;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.kus;
import com.bytedance.sdk.openadsdk.core.ra;
import com.ironsource.C4981t;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
class ct implements uq {
    private uq ahm;
    private int ct;
    private int kgy;
    private int rz;
    private int uq;

    @Override // com.bytedance.sdk.openadsdk.um.uq
    public com.bytedance.sdk.openadsdk.um.ahm.kgy kgy() {
        com.bytedance.sdk.openadsdk.um.ahm.kgy kgyVarKgy = this.ahm.kgy();
        kgyVarKgy.kgy(BuildConfig.VERSION_NAME);
        kgyVarKgy.kgy(this.rz);
        kgyVarKgy.ahm(this.uq);
        kgyVarKgy.rz(this.ct);
        kgyVarKgy.noq(ra.ahm().yo());
        kgyVarKgy.uq(kus.uq());
        String strRz = kgyVarKgy.rz();
        if (this.kgy != Integer.MIN_VALUE && ("get_ad".equals(strRz) || "dislike".equals(strRz) || "settings_fetch".equals(strRz) || C4981t.j.equals(strRz) || "strategy_fetch".equals(strRz))) {
            try {
                String strTwf = kgyVarKgy.twf();
                JSONObject jSONObject = TextUtils.isEmpty(strTwf) ? new JSONObject() : PangleNetworkBridge.jsonObjectInit(strTwf);
                jSONObject.put("nt", this.kgy);
                kgyVarKgy.yo(jSONObject.toString());
                return kgyVarKgy;
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EeriFP4T8=", "duEjnBeze+qPTtJRqxSuLUnvOZoRi3vGkFrSTw==", "XOsjkBG9fciSZ9hZiR0=", 68);
            }
        }
        return kgyVarKgy;
    }

    public ct(uq uqVar, int i, int i2, int i3) {
        this.kgy = Integer.MIN_VALUE;
        this.ahm = uqVar;
        this.rz = i;
        this.uq = i2;
        this.ct = i3;
        Context contextKgy = kgy.kgy();
        if (contextKgy != null) {
            this.kgy = um.rz(contextKgy);
        }
    }
}
