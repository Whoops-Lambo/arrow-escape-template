package com.bytedance.sdk.openadsdk.ay.ahm;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.fpz.rz;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class kgy {
    private List<C0229kgy> ahm;
    private String kgy;
    private List<C0229kgy> rz;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ay.ahm.kgy$kgy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class C0229kgy {
        private String ahm;
        private String kgy;
        private int rz;

        public static C0229kgy kgy(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            C0229kgy c0229kgy = new C0229kgy();
            c0229kgy.kgy = jSONObject.optString("url");
            c0229kgy.ahm = jSONObject.optString("md5");
            c0229kgy.rz = jSONObject.optInt("type");
            return c0229kgy;
        }

        public boolean equals(Object obj) {
            String str;
            if (!(obj instanceof C0229kgy)) {
                return this == obj;
            }
            String str2 = this.kgy;
            if (str2 != null) {
                C0229kgy c0229kgy = (C0229kgy) obj;
                if (str2.equals(c0229kgy.kgy) && (str = this.ahm) != null && str.equals(c0229kgy.ahm)) {
                    return true;
                }
            }
            return false;
        }

        public String kgy() {
            return this.kgy;
        }
    }

    public void kgy(String str) {
        this.kgy = str;
    }

    public List<C0229kgy> rz() {
        return this.rz;
    }

    public static kgy ahm(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObjectJsonObjectInit = PangleNetworkBridge.jsonObjectInit(str);
            kgy kgyVar = new kgy();
            kgyVar.kgy(jSONObjectJsonObjectInit.optString("version"));
            JSONArray jSONArrayOptJSONArray = jSONObjectJsonObjectInit.optJSONArray("resources");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    C0229kgy c0229kgyKgy = C0229kgy.kgy(jSONArrayOptJSONArray.optJSONObject(i));
                    if (c0229kgyKgy != null) {
                        if (c0229kgyKgy.rz == 1) {
                            arrayList.add(c0229kgyKgy);
                        } else if (c0229kgyKgy.rz == 2 && arrayList2.size() < 10) {
                            arrayList2.add(c0229kgyKgy);
                        }
                    }
                }
            }
            kgyVar.kgy(arrayList);
            kgyVar.ahm(arrayList2);
            return kgyVar;
        } catch (JSONException e) {
            rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQTbFmw4VG", "a+IsjAK+ZcKyT8RwgxWlJA==", "S+8/hgau", 74);
            return null;
        }
    }

    public void kgy(List<C0229kgy> list) {
        this.ahm = list;
    }

    public String kgy() {
        return this.kgy;
    }

    public List<C0229kgy> ahm() {
        return this.ahm;
    }

    public void ahm(List<C0229kgy> list) {
        this.rz = list;
    }
}
