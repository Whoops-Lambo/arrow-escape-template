package com.bytedance.adsdk.ugeno.core;

import android.text.TextUtils;
import com.ironsource.C4664b4;
import com.unity3d.services.UnityAdsConstants;
import defpackage.nj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class yo {
    private JSONObject ahm;
    private String ct;
    private float fi;
    private float gf;
    private JSONObject kgy;
    private JSONObject noq;
    private boolean ra;
    private String rz;
    private JSONObject uq;
    private boolean yo;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        private String ahm;
        private LinkedList<kgy> ct;
        private String fi;
        private boolean gf;
        private String kgy;
        private kgy noq;
        private boolean nu;
        private boolean ra;
        private JSONObject rz;
        private JSONObject uq;
        private String yo;

        public void ahm(kgy kgyVar) {
            if (this.ct == null) {
                this.ct = new LinkedList<>();
            }
            this.ct.addLast(kgyVar);
        }

        public JSONObject ct() {
            return this.rz;
        }

        public void kgy(kgy kgyVar) {
            if (this.ct == null) {
                this.ct = new LinkedList<>();
            }
            this.ct.add(kgyVar);
        }

        public List<kgy> noq() {
            return this.ct;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("UGNode{id='");
            sb.append(this.kgy);
            sb.append("', name='");
            return nj.q(sb, this.ahm, "'}");
        }

        public JSONObject yo() {
            return this.uq;
        }

        public String uq() {
            return this.ahm;
        }

        public boolean rz() {
            return this.gf;
        }

        public String ahm() {
            return this.yo;
        }

        public void ahm(boolean z) {
            this.nu = z;
        }

        public String kgy() {
            return this.kgy;
        }

        public void kgy(String str) {
            this.ahm = str;
        }

        public void kgy(boolean z) {
            this.ra = z;
        }

        public void kgy(int i, kgy kgyVar) {
            if (this.ct == null) {
                this.ct = new LinkedList<>();
            }
            this.ct.add(i, kgyVar);
        }
    }

    private kgy kgy(JSONObject jSONObject, kgy kgyVar) {
        kgy kgyVarKgy;
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.has("type") ? jSONObject.optString("type") : jSONObject.optString("name");
        String strOptString2 = jSONObject.optString("id");
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.equals(next, "children")) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException unused) {
                }
            }
        }
        kgy kgyVar2 = new kgy();
        kgyVar2.kgy = strOptString2;
        if (this.yo && TextUtils.equals("Video", strOptString)) {
            kgyVar2.ahm = strOptString + "V3";
        } else {
            kgyVar2.ahm = strOptString;
        }
        kgyVar2.rz = jSONObject2;
        kgyVar2.noq = kgyVar;
        kgyVar2.yo = this.rz;
        kgyVar2.gf = this.ra;
        kgyVar2.fi = this.ct;
        if (jSONObject2.has("i18n")) {
            kgyVar2.uq = jSONObject2.optJSONObject("i18n");
        }
        if (TextUtils.equals(strOptString, "CustomComponent")) {
            kgy(jSONObject, kgyVar2.rz);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            int i = 0;
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                String strOptString3 = jSONObject.has("type") ? jSONObject.optString("type") : jSONObject.optString("name");
                String strKgy = com.bytedance.adsdk.ugeno.uq.ahm.kgy(jSONObjectOptJSONObject.optString("id"), this.uq);
                if (TextUtils.equals(strOptString3, "Template")) {
                    JSONObject jSONObject3 = this.ahm;
                    if (jSONObject3 != null) {
                        jSONObjectOptJSONObject = jSONObject3.optJSONObject(strKgy);
                        kgyVarKgy = kgy(jSONObjectOptJSONObject, kgyVar2);
                    } else {
                        kgyVarKgy = null;
                    }
                } else {
                    kgyVarKgy = kgy(jSONObjectOptJSONObject, kgyVar2);
                }
                if (kgyVarKgy != null) {
                    kgyVarKgy.ahm(ahm(kgyVarKgy));
                    kgyVarKgy.kgy(kgy(kgyVarKgy));
                }
                if (rz(kgyVarKgy)) {
                    i++;
                    kgyVar2.ahm(kgyVarKgy);
                } else if (kgyVarKgy != null) {
                    kgyVar2.kgy(i2 - i, kgyVarKgy);
                }
            }
        }
        return kgyVar2;
    }

    public boolean ahm(kgy kgyVar) {
        JSONObject jSONObjectCt;
        if (kgyVar == null || (jSONObjectCt = kgyVar.ct()) == null) {
            return false;
        }
        return TextUtils.equals(jSONObjectCt.optString("height"), "match_parent");
    }

    private kgy ct() {
        if (!uq()) {
            return kgy(this.kgy, (kgy) null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("flexDirection", "row");
            jSONObject.put("justifyContent", "flex_start");
            jSONObject.put("alignItems", "flex_start");
            jSONObject.put("clickable", false);
            jSONObject.put("width", "match_parent");
            jSONObject.put("height", "wrap_content");
            float f = this.fi;
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                jSONObject.put("width", f);
            }
            float f2 = this.gf;
            if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                jSONObject.put("height", f2);
            }
            JSONObject jSONObject2 = this.uq;
            if (jSONObject2 != null) {
                String strOptString = jSONObject2.optString("xSize");
                if (!TextUtils.isEmpty(strOptString)) {
                    JSONObject jSONObject3 = new JSONObject(strOptString);
                    if (jSONObject3.optInt("width") > 0) {
                        jSONObject.put("width", jSONObject3.optInt("width"));
                    }
                    if (jSONObject3.optInt("height") > 0) {
                        jSONObject.put("height", jSONObject3.optInt("height"));
                    }
                }
            }
        } catch (JSONException unused) {
        }
        kgy kgyVar = new kgy();
        kgyVar.ahm = "View";
        kgyVar.kgy = "virtualNode";
        kgyVar.rz = jSONObject;
        kgyVar.noq = null;
        kgyVar.yo = this.rz;
        kgyVar.gf = this.ra;
        kgyVar.fi = this.ct;
        kgyVar.kgy(kgy(this.kgy, kgyVar));
        return kgyVar;
    }

    public static boolean uq(kgy kgyVar) {
        return (kgyVar == null || kgyVar.rz == null) ? false : true;
    }

    public List<kgy> rz() {
        if (this.ahm == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = this.ahm.keys();
        while (itKeys.hasNext()) {
            kgy kgyVarKgy = kgy(this.ahm.optJSONObject(itKeys.next()), (kgy) null);
            if (kgyVarKgy != null) {
                arrayList.add(kgyVarKgy);
            }
        }
        return arrayList;
    }

    public yo(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        JSONObject jSONObjectOptJSONObject;
        this.ra = true;
        if (jSONObject != null) {
            if (jSONObject.has("body")) {
                this.kgy = jSONObject.optJSONObject("body");
            } else {
                this.kgy = jSONObject.optJSONObject("main_template");
            }
            this.ahm = jSONObject.optJSONObject("sub_templates");
            if (jSONObject.has("meta")) {
                jSONObjectOptJSONObject = jSONObject.optJSONObject("meta");
            } else {
                jSONObjectOptJSONObject = jSONObject.optJSONObject("template_info");
            }
            if (jSONObjectOptJSONObject != null) {
                if (jSONObject.has("body")) {
                    this.yo = true;
                    String strOptString = jSONObjectOptJSONObject.optString("version");
                    this.rz = strOptString;
                    if (TextUtils.isEmpty(strOptString)) {
                        this.rz = "3.0";
                    }
                } else {
                    this.rz = jSONObjectOptJSONObject.optString("sdk_version");
                }
                if (jSONObjectOptJSONObject.has("adType")) {
                    this.ct = jSONObjectOptJSONObject.optString("adType");
                }
                if (jSONObjectOptJSONObject.has("gestureThrough")) {
                    this.ra = com.bytedance.adsdk.ugeno.fi.rz.kgy(jSONObjectOptJSONObject.optString("gestureThrough"), true);
                }
            } else if (jSONObject.has("body")) {
                this.rz = "3.0";
                this.yo = true;
            }
            this.uq = jSONObject2;
            this.noq = jSONObject3;
        }
    }

    public boolean uq() {
        return this.yo;
    }

    public String ahm() {
        return this.rz;
    }

    public boolean rz(kgy kgyVar) {
        JSONObject jSONObjectCt;
        if (kgyVar == null || (jSONObjectCt = kgyVar.ct()) == null) {
            return false;
        }
        return TextUtils.equals(jSONObjectCt.optString(C4664b4.i.L), "absolute");
    }

    public yo(JSONObject jSONObject, JSONObject jSONObject2) {
        this(jSONObject, jSONObject2, null);
    }

    public void kgy(float f, float f2) {
        this.fi = f;
        this.gf = f2;
    }

    public kgy kgy() {
        return ct();
    }

    public boolean kgy(kgy kgyVar) {
        JSONObject jSONObjectCt;
        if (kgyVar == null || (jSONObjectCt = kgyVar.ct()) == null) {
            return false;
        }
        return TextUtils.equals(jSONObjectCt.optString("width"), "match_parent");
    }

    private void kgy(JSONObject jSONObject, JSONObject jSONObject2) {
        if (this.noq == null || jSONObject2 == null) {
            return;
        }
        try {
            String strOptString = this.noq.optString(jSONObject2.optString("targetId"));
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject(strOptString);
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("targetProps");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = jSONObjectOptJSONObject.opt(next);
                    if (TextUtils.equals(next, "events") && jSONObject3.has("events")) {
                        if (objOpt instanceof JSONArray) {
                            com.bytedance.adsdk.ugeno.fi.ahm.kgy(jSONObject3.optJSONArray("events"), (JSONArray) objOpt);
                        }
                    } else {
                        jSONObject3.put(next, objOpt);
                    }
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                jSONArrayOptJSONArray.put(jSONObject3);
                if (jSONObject.has("children")) {
                    return;
                }
                jSONObject.put("children", jSONArrayOptJSONArray);
            }
        } catch (JSONException unused) {
        }
    }
}
