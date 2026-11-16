package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.safedk.android.analytics.brandsafety.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class kgy {
    private int ahm;
    private ioy at;
    private ioy ct;
    private int gf;
    private String kgy;
    private fpz noq;
    private String nu;
    private ay ra;
    private String rz;
    private List<ioy> uq = new ArrayList();
    private JSONObject yo = new JSONObject();
    private volatile boolean fi = false;

    public static kgy ahm(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            kgy kgyVar = new kgy();
            kgyVar.kgy(ay.kgy(jSONObject.optJSONObject("loop_config")));
            kgyVar.ahm(jSONObject.optInt("multi_ad_style", 0));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("creatives");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    ioy ioyVarKgy = com.bytedance.sdk.openadsdk.core.ahm.kgy(jSONArrayOptJSONArray.optJSONObject(i), (AdSlot) null, (ft) null, kgyVar, i);
                    if (ioyVarKgy != null) {
                        arrayList.add(ioyVarKgy);
                    }
                }
                kgyVar.kgy(arrayList);
            }
            kgyVar.kgy(jSONObject.optString("request_id", ""));
            String strOptString = jSONObject.optString("multi_ad_config");
            if (!TextUtils.isEmpty(strOptString)) {
                kgyVar.kgy(fpz.kgy(strOptString));
            }
            return kgyVar;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4yKRBrA=", "euoEmwWz", "XfwimCmvZsk=", 201);
            com.bytedance.sdk.component.utils.sx.kgy(c.a, "fromJson: ", th);
            return null;
        }
    }

    public static Map<String, ioy> kgy(kgy kgyVar) {
        if (kgyVar == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (ioy ioyVar : kgyVar.ct()) {
            if (!TextUtils.isEmpty(ioyVar.gj())) {
                map.put(ioyVar.gj(), ioyVar);
            }
        }
        if (map.size() != 0) {
            return map;
        }
        return null;
    }

    public String at() {
        return this.nu;
    }

    public List<ioy> ct() {
        return this.uq;
    }

    public ay fi() {
        return this.ra;
    }

    public boolean gf() {
        return this.gf == 1;
    }

    public boolean noq() {
        List<ioy> list = this.uq;
        return list != null && list.size() > 0;
    }

    public fpz nu() {
        return this.noq;
    }

    public ioy ra() {
        return this.at;
    }

    public ioy twf() {
        return this.ct;
    }

    public int uq() {
        return this.ahm;
    }

    public ioy yo() {
        if (this.uq.size() > 0) {
            return this.uq.get(0);
        }
        return null;
    }

    public String rz() {
        ioy ioyVarYo = yo();
        if (ioyVarYo != null) {
            return ioyVarYo.wh();
        }
        return "";
    }

    public void rz(String str) {
        this.nu = str;
    }

    public void kgy(JSONObject jSONObject) {
        this.yo = jSONObject;
    }

    public void kgy(String str) {
        this.kgy = str;
    }

    public void kgy(int i) {
        this.ahm = i;
    }

    public void kgy(ioy ioyVar) {
        this.uq.add(ioyVar);
        if (this.at == null) {
            this.at = ioyVar;
        }
    }

    public void kgy(List<ioy> list) {
        this.uq = list;
        if (list.isEmpty()) {
            return;
        }
        this.at = list.get(0);
    }

    public JSONObject kgy() {
        return this.yo;
    }

    public void kgy(ay ayVar) {
        this.ra = ayVar;
    }

    public void kgy(fpz fpzVar) {
        this.noq = fpzVar;
    }

    public void ahm(String str) {
        this.rz = str;
    }

    public void ahm(int i) {
        this.gf = i;
    }

    public String ahm() {
        return this.kgy;
    }

    public void ahm(ioy ioyVar) {
        this.ct = ioyVar;
    }
}
