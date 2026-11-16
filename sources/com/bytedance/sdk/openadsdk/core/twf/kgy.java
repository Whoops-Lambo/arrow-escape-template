package com.bytedance.sdk.openadsdk.core.twf;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.ioy;
import com.tiktok.appevents.contents.TTContentsEventConstants;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class kgy {
    ahm ahm;
    private String at;
    private String ct;
    private double fi;
    private int gf;
    private String noq;
    private int ra;
    rz rz;
    private String uq;
    private String yo;
    final com.bytedance.sdk.openadsdk.core.model.uq kgy = new com.bytedance.sdk.openadsdk.core.model.uq();
    private String nu = "VAST_ACTION_BUTTON";

    public static kgy kgy(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        kgy kgyVar = new kgy();
        uq uqVarKgy = kgyVar.kgy.kgy();
        if (uqVarKgy == null) {
            uqVarKgy = new uq();
            kgyVar.kgy.kgy(uqVarKgy);
        }
        uqVarKgy.kgy(jSONObject.optJSONObject("videoTrackers"));
        kgyVar.ahm = ahm.kgy(jSONObject.optJSONObject("vastIcon"));
        kgyVar.rz = rz.ahm(jSONObject.optJSONObject("endCard"));
        kgyVar.uq = jSONObject.optString("title");
        kgyVar.ct = jSONObject.optString(TTContentsEventConstants.Params.EVENT_PROPERTY_DESCRIPTION);
        kgyVar.noq = jSONObject.optString("clickThroughUrl");
        kgyVar.yo = jSONObject.optString("videoUrl");
        kgyVar.fi = jSONObject.optDouble("videDuration");
        kgyVar.gf = jSONObject.optInt("videoWidth");
        kgyVar.gf = jSONObject.optInt("videoHeight");
        Set<ra> setAhm = kgyVar.kgy.ahm();
        if (setAhm == null) {
            setAhm = new HashSet<>();
            kgyVar.kgy.kgy(setAhm);
        }
        setAhm.addAll(ra.kgy(jSONObject.optJSONArray("viewabilityVendor")));
        return kgyVar;
    }

    public ahm ahm() {
        return this.ahm;
    }

    public Set<ra> at() {
        return this.kgy.ahm();
    }

    public String ct() {
        return this.ct;
    }

    public double fi() {
        return this.fi;
    }

    public String gf() {
        rz rzVar;
        String str = this.noq;
        if (!TextUtils.isEmpty(this.at)) {
            String str2 = this.at;
            this.at = null;
            return str2;
        }
        String str3 = this.nu;
        str3.getClass();
        if (str3.equals("VAST_ICON")) {
            ahm ahmVar = this.ahm;
            if (ahmVar != null && !TextUtils.isEmpty(ahmVar.fi)) {
                str = this.ahm.fi;
            }
        } else if (str3.equals("VAST_END_CARD") && (rzVar = this.rz) != null && !TextUtils.isEmpty(rzVar.fi)) {
            str = this.rz.fi;
        }
        this.nu = "VAST_ACTION_BUTTON";
        return str;
    }

    public String noq() {
        return this.noq;
    }

    public int nu() {
        return this.ra;
    }

    public int ra() {
        return this.gf;
    }

    public rz rz() {
        return this.rz;
    }

    public com.bytedance.sdk.openadsdk.core.model.uq twf() {
        return this.kgy;
    }

    public String uq() {
        return this.uq;
    }

    public String yo() {
        return this.yo;
    }

    public void ahm(String str) {
        this.ct = str;
    }

    public void ct(String str) {
        this.nu = str;
    }

    public void noq(String str) {
        this.at = str;
    }

    public void rz(String str) {
        this.noq = str;
    }

    public void uq(String str) {
        this.yo = str;
    }

    public void ahm(int i) {
        this.ra = i;
    }

    public void kgy(ahm ahmVar) {
        if (ahmVar != null) {
            ahmVar.kgy(this.yo);
        }
        this.ahm = ahmVar;
    }

    public void kgy(rz rzVar) {
        if (rzVar != null) {
            rzVar.kgy(this.yo);
        }
        this.rz = rzVar;
    }

    public void kgy(String str) {
        this.uq = str;
    }

    public void kgy(double d) {
        this.fi = d;
    }

    public uq kgy() {
        return this.kgy.kgy();
    }

    public void kgy(ioy ioyVar) {
        this.kgy.kgy(ioyVar);
        ahm ahmVar = this.ahm;
        if (ahmVar != null) {
            ahmVar.kgy(ioyVar);
        }
        rz rzVar = this.rz;
        if (rzVar != null) {
            rzVar.kgy(ioyVar);
        }
    }

    public void kgy(int i) {
        this.gf = i;
    }

    public void kgy(Set<ra> set) {
        this.kgy.ahm(set);
    }
}
