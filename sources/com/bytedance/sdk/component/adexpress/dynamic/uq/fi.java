package com.bytedance.sdk.component.adexpress.dynamic.uq;

import android.text.TextUtils;
import defpackage.pv1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class fi {
    private float ahm;
    private List<List<fi>> at;
    private float ct;
    private float fi;
    private ct gf;
    private String kgy;
    private boolean kus;
    private float noq;
    private fi nu;
    private List<fi> ra;
    private float rz;
    private String twf;
    private float uq;
    private float yo;
    private Map<String, String> vs = new HashMap();
    private Map<Integer, String> dg = new HashMap();

    public Map<Integer, String> ahm() {
        return this.dg;
    }

    public fi at() {
        return this.nu;
    }

    public boolean ay() {
        return TextUtils.equals(this.gf.ct().wy(), "flex");
    }

    public float ct() {
        return this.ct;
    }

    public float dg() {
        noq noqVarCt = this.gf.ct();
        return (noqVarCt.at() * 2.0f) + noqVarCt.kus() + noqVarCt.xh() + kus();
    }

    public float fi() {
        return this.noq;
    }

    public boolean fpp() {
        return this.kus;
    }

    public float gf() {
        return this.yo;
    }

    public void gm() {
        List<List<fi>> list = this.at;
        if (list == null || list.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (List<fi> list2 : this.at) {
            if (list2 != null && list2.size() > 0) {
                arrayList.add(list2);
            }
        }
        this.at = arrayList;
    }

    public String ioy() {
        return this.gf.ct().ioy();
    }

    public void kgy(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() == 0) {
                    return;
                }
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    this.dg.put(Integer.valueOf(jSONObjectOptJSONObject.optInt("id")), jSONObjectOptJSONObject.optString("value"));
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX60nX+sh", "f/cjlA61auuBU9hImCSuIU8=", "SOs5twSRaNOFWN5cgDKlJk/rP7YCsGrkj0bYTw==", 54);
            }
        }
    }

    public int kus() {
        noq noqVarCt = this.gf.ct();
        return noqVarCt.jc() + noqVarCt.lb();
    }

    public boolean lqi() {
        return this.gf.ct().qi() < 0 || this.gf.ct().ebs() < 0 || this.gf.ct().vf() < 0 || this.gf.ct().idg() < 0;
    }

    public float noq() {
        return this.ahm;
    }

    public List<fi> nu() {
        return this.ra;
    }

    public ct ra() {
        return this.gf;
    }

    public void rz(String str) {
        this.gf.ct().noq(str);
    }

    public Map<String, String> sx() {
        return this.vs;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DynamicLayoutUnit{id='");
        sb.append(this.kgy);
        sb.append("', x=");
        sb.append(this.ahm);
        sb.append(", y=");
        sb.append(this.rz);
        sb.append(", width=");
        sb.append(this.noq);
        sb.append(", height=");
        sb.append(this.yo);
        sb.append(", remainWidth=");
        sb.append(this.fi);
        sb.append(", rootBrick=");
        sb.append(this.gf);
        sb.append(", childrenBrickUnits=");
        return pv1.q(sb, this.ra, '}');
    }

    public int twf() {
        noq noqVarCt = this.gf.ct();
        return noqVarCt.sm() + noqVarCt.gg();
    }

    public boolean um() {
        List<fi> list = this.ra;
        return list == null || list.size() <= 0;
    }

    public float uq() {
        return this.uq;
    }

    public float vs() {
        noq noqVarCt = this.gf.ct();
        return (noqVarCt.at() * 2.0f) + noqVarCt.dg() + noqVarCt.vs() + twf();
    }

    public List<List<fi>> xh() {
        return this.at;
    }

    public float yo() {
        return this.rz;
    }

    public void ahm(String str) {
        this.kgy = str;
    }

    public void ct(float f) {
        this.noq = f;
    }

    public void noq(float f) {
        this.yo = f;
    }

    public void uq(float f) {
        this.rz = f;
    }

    public void yo(float f) {
        this.fi = f;
    }

    public void ahm(float f) {
        this.ct = f;
    }

    public void ahm(List<List<fi>> list) {
        this.at = list;
    }

    public void rz(float f) {
        this.ahm = f;
    }

    public String rz() {
        return this.kgy;
    }

    public void kgy(String str) {
        this.twf = str;
    }

    public String kgy() {
        return this.twf;
    }

    public void kgy(float f) {
        this.uq = f;
    }

    public void kgy(ct ctVar) {
        this.gf = ctVar;
    }

    public void kgy(List<fi> list) {
        this.ra = list;
    }

    public void kgy(fi fiVar) {
        this.nu = fiVar;
    }

    public void kgy(boolean z) {
        this.kus = z;
    }

    public void kgy(String str, String str2) {
        this.vs.put(str, str2);
    }

    public String kgy(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.gf.ahm());
        sb.append(":");
        sb.append(this.kgy);
        if (this.gf.ct() != null) {
            sb.append(":");
            sb.append(this.gf.ct().jw());
        }
        return pv1.l(i, ":", sb);
    }
}
