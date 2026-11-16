package com.bytedance.adsdk.ugeno.ct.uq;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class rz {
    protected com.bytedance.adsdk.ugeno.ahm.rz ahm;
    protected Map<String, Object> ct;
    protected String fi;
    protected String gf;
    protected com.bytedance.adsdk.ugeno.ct.at kgy;
    protected String noq;
    protected Context ra;
    protected com.bytedance.adsdk.ugeno.ct.yo rz;
    protected com.bytedance.adsdk.ugeno.ct.yo.kgy uq;
    protected String yo;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        public static rz kgy(Context context, com.bytedance.adsdk.ugeno.ahm.rz rzVar, JSONObject jSONObject, JSONObject jSONObject2) {
            com.bytedance.adsdk.ugeno.ct.yo yoVarKgy;
            com.bytedance.adsdk.ugeno.ct.yo.kgy kgyVarKgy;
            if (rzVar == null || jSONObject == null || (yoVarKgy = com.bytedance.adsdk.ugeno.ct.yo.kgy(jSONObject, jSONObject2)) == null || (kgyVarKgy = yoVarKgy.kgy()) == null) {
                return null;
            }
            String strKgy = kgyVarKgy.kgy();
            if (TextUtils.equals(strKgy, "custom")) {
                uq uqVar = new uq(context);
                uqVar.kgy(rzVar);
                uqVar.kgy(yoVarKgy);
                uqVar.rz();
                return uqVar;
            }
            com.bytedance.adsdk.ugeno.ct.fi fiVarKgy = (TextUtils.isEmpty(strKgy) || TextUtils.equals(strKgy, "global")) ? com.bytedance.adsdk.ugeno.ct.nu.kgy(kgyVarKgy.ahm()) : com.bytedance.adsdk.ugeno.ct.nu.kgy(kgyVarKgy.ct());
            if (fiVarKgy == null) {
                return null;
            }
            rz rzVarKgy = fiVarKgy.kgy(context);
            rzVarKgy.kgy(rzVar);
            rzVarKgy.kgy(yoVarKgy);
            rzVarKgy.rz();
            return rzVarKgy;
        }
    }

    public abstract boolean kgy(Object... objArr);

    public Map<String, Object> ct() {
        return this.ct;
    }

    public com.bytedance.adsdk.ugeno.ct.yo fi() {
        return this.rz;
    }

    public void kgy(com.bytedance.adsdk.ugeno.ahm.rz rzVar) {
        this.ahm = rzVar;
    }

    public String noq() {
        return this.fi;
    }

    public void rz() {
        this.uq = this.rz.kgy();
        com.bytedance.adsdk.ugeno.ct.yo yoVar = this.rz;
        if (yoVar == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.ct.yo.kgy kgyVarKgy = yoVar.kgy();
        this.uq = kgyVarKgy;
        if (kgyVarKgy == null) {
            return;
        }
        this.ct = kgyVarKgy.rz();
        this.noq = this.uq.ahm();
        this.yo = this.uq.kgy();
        this.fi = this.uq.uq();
        this.gf = this.uq.ct();
    }

    public String uq() {
        return this.noq;
    }

    public String yo() {
        return this.gf;
    }

    public rz(Context context) {
        this.ra = context;
    }

    public void kgy(com.bytedance.adsdk.ugeno.ct.yo yoVar) {
        this.rz = yoVar;
    }

    public void kgy(com.bytedance.adsdk.ugeno.ct.at atVar) {
        this.kgy = atVar;
    }
}
