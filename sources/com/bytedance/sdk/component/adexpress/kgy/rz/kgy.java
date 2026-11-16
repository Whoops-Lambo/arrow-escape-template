package com.bytedance.sdk.component.adexpress.kgy.rz;

import android.text.TextUtils;
import android.util.Pair;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.C4664b4;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import defpackage.q63;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class kgy {
    private String ahm;
    private ahm ct;
    private String kgy;
    private String noq;
    private String rz;
    private List<C0205kgy> uq;
    private Map<String, kgy> yo = new ConcurrentHashMap();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ahm {
        private String ahm;
        private String kgy;
        private List<Pair<String, String>> rz;

        public void ahm(String str) {
            this.ahm = str;
        }

        public String kgy() {
            return this.kgy;
        }

        public List<Pair<String, String>> ahm() {
            return this.rz;
        }

        public void kgy(String str) {
            this.kgy = str;
        }

        public void kgy(List<Pair<String, String>> list) {
            this.rz = list;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.kgy.rz.kgy$kgy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class C0205kgy {
        private String ahm;
        private String kgy;
        private int rz;

        public String ahm() {
            return this.ahm;
        }

        public boolean equals(Object obj) {
            String str;
            if (!(obj instanceof C0205kgy)) {
                return this == obj;
            }
            String str2 = this.kgy;
            if (str2 != null) {
                C0205kgy c0205kgy = (C0205kgy) obj;
                if (str2.equals(c0205kgy.kgy()) && (str = this.ahm) != null && str.equals(c0205kgy.ahm())) {
                    return true;
                }
            }
            return false;
        }

        public String kgy() {
            return this.kgy;
        }

        public int rz() {
            return this.rz;
        }

        public void ahm(String str) {
            this.ahm = str;
        }

        public void kgy(String str) {
            this.kgy = str;
        }

        public void kgy(int i) {
            this.rz = i;
        }
    }

    public static kgy ct(String str) {
        if (str == null) {
            return null;
        }
        try {
            return kgy(PangleNetworkBridge.jsonObjectInit(str));
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJsyYdD2VjCHK8sXuI=", "b+sghTO3buqPTtJR", "S+8/hgau", 327);
            return null;
        }
    }

    public static kgy kgy(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return null;
        }
        kgy kgyVar = new kgy();
        kgyVar.kgy(jSONObject.optString("name"));
        kgyVar.ahm(jSONObject.optString("version"));
        kgyVar.rz(jSONObject.optString(C4664b4.i.Z));
        kgyVar.uq(jSONObject.optString("template_fetch_url", ""));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                C0205kgy c0205kgy = new C0205kgy();
                c0205kgy.kgy(jSONObjectOptJSONObject2.optString("url"));
                c0205kgy.ahm(jSONObjectOptJSONObject2.optString("md5"));
                c0205kgy.kgy(jSONObjectOptJSONObject2.optInt(AppLovinEventTypes.USER_COMPLETED_LEVEL));
                arrayList.add(c0205kgy);
            }
        }
        kgyVar.kgy(arrayList);
        try {
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("engines");
            if (jSONObjectOptJSONObject3 != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    kgy kgyVarKgy = kgy(jSONObjectOptJSONObject3.optJSONObject(next));
                    if (kgyVarKgy != null) {
                        kgyVar.kgy().put(next, kgyVarKgy);
                    }
                }
            }
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJsyYdD2VjCHK8sXuI=", "b+sghTO3buqPTtJR", "S+8/hgau", 373);
            e.getMessage();
        }
        if (jSONObject.has("resources_archive") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("resources_archive")) != null) {
            ahm ahmVar = new ahm();
            ahmVar.kgy(jSONObjectOptJSONObject.optString("url"));
            ahmVar.ahm(jSONObjectOptJSONObject.optString("md5"));
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("map");
            if (jSONObjectOptJSONObject4 != null) {
                Iterator<String> itKeys2 = jSONObjectOptJSONObject4.keys();
                ArrayList arrayList2 = new ArrayList();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    q63.A(arrayList2, next2, jSONObjectOptJSONObject4.optString(next2));
                }
                ahmVar.kgy(arrayList2);
            }
            kgyVar.kgy(ahmVar);
        }
        if (kgyVar.fi()) {
            return kgyVar;
        }
        return null;
    }

    public String ahm() {
        return this.kgy;
    }

    public JSONObject gf() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("name", ahm());
            jSONObject.putOpt("version", rz());
            jSONObject.putOpt(C4664b4.i.Z, uq());
            if (!TextUtils.isEmpty(this.noq)) {
                jSONObject.put("template_fetch_url", this.noq);
            }
            JSONArray jSONArray = new JSONArray();
            if (noq() != null) {
                for (C0205kgy c0205kgy : noq()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", c0205kgy.kgy());
                    jSONObject2.putOpt("md5", c0205kgy.ahm());
                    jSONObject2.putOpt(AppLovinEventTypes.USER_COMPLETED_LEVEL, Integer.valueOf(c0205kgy.rz()));
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.putOpt("resources", jSONArray);
            if (!this.yo.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                boolean z = false;
                for (String str : this.yo.keySet()) {
                    kgy kgyVar = this.yo.get(str);
                    if (kgyVar != null) {
                        jSONObject3.put(str, kgyVar.gf());
                        z = true;
                    }
                }
                if (z) {
                    jSONObject.put("engines", jSONObject3);
                }
            }
            ahm ahmVarCt = ct();
            if (ahmVarCt != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("url", ahmVarCt.kgy);
                jSONObject4.put("md5", ahmVarCt.ahm);
                JSONObject jSONObject5 = new JSONObject();
                List<Pair<String, String>> listAhm = ahmVarCt.ahm();
                if (listAhm != null) {
                    for (Pair<String, String> pair : listAhm) {
                        jSONObject5.put((String) pair.first, pair.second);
                    }
                }
                jSONObject4.put("map", jSONObject5);
                jSONObject.putOpt("resources_archive", jSONObject4);
            }
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJsyYdD2VjCHK8sXuI=", "b+sghTO3buqPTtJR", "T+EAmge5Ze2TRdk=", 233);
            return null;
        }
    }

    public List<C0205kgy> noq() {
        if (this.uq == null) {
            this.uq = new ArrayList();
        }
        return this.uq;
    }

    public String rz() {
        return this.ahm;
    }

    public String uq() {
        return this.rz;
    }

    public String yo() {
        return this.noq;
    }

    public boolean fi() {
        if (!TextUtils.isEmpty(uq()) && !TextUtils.isEmpty(rz()) && !TextUtils.isEmpty(ahm())) {
            return true;
        }
        return false;
    }

    public String ra() {
        JSONObject jSONObjectGf;
        if (fi() && (jSONObjectGf = gf()) != null) {
            return jSONObjectGf.toString();
        }
        return null;
    }

    public void ahm(String str) {
        this.ahm = str;
    }

    public void rz(String str) {
        this.rz = str;
    }

    public void uq(String str) {
        this.noq = str;
    }

    public ahm ct() {
        return this.ct;
    }

    public void kgy(String str) {
        this.kgy = str;
    }

    public void kgy(ahm ahmVar) {
        this.ct = ahmVar;
    }

    public void kgy(List<C0205kgy> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.uq = list;
    }

    public Map<String, kgy> kgy() {
        return this.yo;
    }
}
