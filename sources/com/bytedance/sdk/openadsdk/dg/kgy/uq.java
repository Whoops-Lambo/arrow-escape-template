package com.bytedance.sdk.openadsdk.dg.kgy;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.sx;
import com.bytedance.sdk.component.utils.um;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.ra;
import com.bytedance.sdk.openadsdk.core.xh;
import com.bytedance.sdk.openadsdk.dg.kgy.uq;
import com.bytedance.sdk.openadsdk.utils.ft;
import com.bytedance.sdk.openadsdk.utils.ftg;
import com.ironsource.R6;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.t;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class uq<T extends uq> implements rz {
    private String ahm;
    private String at;
    private String gf;
    private String kgy;
    private String nu;
    private String ra;
    private String rz;
    private String twf;
    private String yo;
    private final String uq = BuildConfig.VERSION_NAME;
    private long ct = System.currentTimeMillis() / 1000;
    private int noq = 0;
    private int fi = 0;

    private T dg() {
        return this;
    }

    private JSONObject vs() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(R6.F, 1);
            jSONObject.put(R6.B, Build.MODEL);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("package_name", ftg.noq());
            jSONObject.put(R6.d0, ftg.uq());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public T ahm(String str) {
        this.nu = str;
        return (T) dg();
    }

    public String at() {
        return this.gf;
    }

    public T ct(String str) {
        this.yo = str;
        return (T) dg();
    }

    public T fi(String str) {
        this.at = str;
        return (T) dg();
    }

    public int gf() {
        return this.noq;
    }

    @Override // com.bytedance.sdk.openadsdk.dg.kgy.rz
    public JSONObject kgy() {
        JSONObject jSONObjectJsonObjectInit;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ad_sdk_version", yo());
            jSONObject.put("app_version", ftg.fi());
            jSONObject.put("timestamp", fi());
            jSONObject.put("conn_type", um.ahm(xh.kgy()));
            jSONObject.put("appid", TextUtils.isEmpty(ra.ahm().uq()) ? "" : ra.ahm().uq());
            jSONObject.put("device_info", vs());
            if (!TextUtils.isEmpty(rz())) {
                jSONObject.put("type", rz());
            }
            jSONObject.put(t.d, nu());
            if (!TextUtils.isEmpty(at())) {
                jSONObject.put("error_msg", at());
            }
            if (!TextUtils.isEmpty(ct())) {
                jSONObject.put("rit", ct());
            }
            if (!TextUtils.isEmpty(noq())) {
                jSONObject.put("creative_id", noq());
            }
            if (gf() > 0) {
                jSONObject.put("adtype", gf());
            }
            if (!TextUtils.isEmpty(ra())) {
                jSONObject.put("req_id", ra());
            }
            if (!TextUtils.isEmpty(twf())) {
                jSONObject.put("extra", twf());
            }
            String strUq = uq();
            if (TextUtils.isEmpty(strUq)) {
                jSONObjectJsonObjectInit = new JSONObject();
            } else {
                try {
                    jSONObjectJsonObjectInit = PangleNetworkBridge.jsonObjectInit(strUq);
                } catch (Throwable unused) {
                    jSONObjectJsonObjectInit = null;
                }
            }
            if (jSONObjectJsonObjectInit != null) {
                jSONObjectJsonObjectInit.put("os_version_int", Build.VERSION.SDK_INT);
                jSONObjectJsonObjectInit.put("pangle_client_unique_id", "pangle-" + this.twf + "-" + System.currentTimeMillis());
                jSONObject.put("event_extra", jSONObjectJsonObjectInit.toString());
            } else if (!TextUtils.isEmpty(strUq)) {
                jSONObject.put("event_extra", strUq);
            }
            if (!TextUtils.isEmpty(kus())) {
                jSONObject.put("duration", kus());
            }
        } catch (Throwable th) {
            sx.rz("LogStatsBase", th.getMessage());
        }
        return jSONObject;
    }

    public String kus() {
        return this.at;
    }

    public T noq(String str) {
        this.gf = str;
        return (T) dg();
    }

    public int nu() {
        return this.fi;
    }

    public String ra() {
        return this.yo;
    }

    public T rz(String str) {
        this.ahm = str;
        return (T) dg();
    }

    public String twf() {
        return this.ra;
    }

    public T uq(String str) {
        this.rz = str;
        return (T) dg();
    }

    public String yo() {
        return TextUtils.isEmpty(BuildConfig.VERSION_NAME) ? "" : BuildConfig.VERSION_NAME;
    }

    private uq() {
        try {
            this.twf = ft.kgy();
        } catch (Throwable unused) {
            this.twf = com.unity3d.ads.BuildConfig.FLAVOR;
        }
    }

    public static uq<uq> ahm() {
        return new uq<>();
    }

    public String ct() {
        return this.ahm;
    }

    public long fi() {
        return this.ct;
    }

    public String noq() {
        return this.rz;
    }

    public String rz() {
        return this.kgy;
    }

    public String uq() {
        return this.nu;
    }

    public T ahm(int i) {
        this.fi = i;
        return (T) dg();
    }

    public T yo(String str) {
        this.ra = str;
        return (T) dg();
    }

    public T kgy(String str) {
        this.kgy = str;
        return (T) dg();
    }

    public T kgy(int i) {
        this.noq = i;
        return (T) dg();
    }
}
