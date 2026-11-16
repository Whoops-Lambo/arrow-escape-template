package com.bytedance.sdk.component.adexpress.dynamic.ct;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.ahm.twf;
import com.ironsource.C4664b4;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import com.singular.sdk.internal.UserDetailsUtils;
import com.tiktok.appevents.contents.TTContentsEventConstants;
import com.unity3d.services.UnityAdsConstants;
import defpackage.h50;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class noq {
    private static HashMap<String, String> yo;
    private JSONObject ahm;
    private rz ct;
    private JSONObject kgy;
    private com.bytedance.sdk.component.adexpress.dynamic.uq.uq noq;
    private com.bytedance.sdk.component.adexpress.dynamic.uq.rz rz;
    private kgy uq;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        float ahm;
        float kgy;
        boolean rz;

        public static kgy kgy(JSONObject jSONObject) {
            kgy kgyVar = new kgy();
            if (jSONObject != null) {
                kgyVar.kgy = (float) jSONObject.optDouble("width");
                kgyVar.ahm = (float) jSONObject.optDouble("height");
                kgyVar.rz = jSONObject.optBoolean("isLandscape");
            }
            return kgyVar;
        }
    }

    static {
        HashMap<String, String> map = new HashMap<>();
        yo = map;
        map.put("subtitle", TTContentsEventConstants.Params.EVENT_PROPERTY_DESCRIPTION);
        yo.put("source", "source|app.app_name");
        yo.put("screenshot", "dynamic_creative.screenshot");
    }

    private void ahm(com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar) {
        com.bytedance.sdk.component.adexpress.dynamic.uq.rz rzVar;
        Object objKgy;
        Object objKgy2;
        Object objKgy3;
        Object objKgy4;
        if (fiVar == null || (rzVar = this.rz) == null || (objKgy = rzVar.kgy("image.0.url")) == null) {
            return;
        }
        String strValueOf = String.valueOf(objKgy);
        if (TextUtils.isEmpty(strValueOf) || (objKgy2 = this.rz.kgy("title")) == null) {
            return;
        }
        String strValueOf2 = String.valueOf(objKgy2);
        if (TextUtils.isEmpty(strValueOf2) || (objKgy3 = this.rz.kgy(TTContentsEventConstants.Params.EVENT_PROPERTY_DESCRIPTION)) == null) {
            return;
        }
        String strValueOf3 = String.valueOf(objKgy3);
        if (TextUtils.isEmpty(strValueOf3) || (objKgy4 = this.rz.kgy("icon")) == null) {
            return;
        }
        String strValueOf4 = String.valueOf(objKgy4);
        if (TextUtils.isEmpty(strValueOf4)) {
            return;
        }
        Object objKgy5 = this.rz.kgy("app.app_name");
        Object objKgy6 = this.rz.kgy("source");
        if (objKgy5 == null && objKgy6 == null) {
            return;
        }
        if (objKgy5 == null) {
            objKgy5 = objKgy6;
        }
        String strValueOf5 = String.valueOf(objKgy5);
        if (TextUtils.isEmpty(strValueOf5)) {
            return;
        }
        fiVar.kgy("imageUrl", strValueOf);
        fiVar.kgy("title", strValueOf2);
        fiVar.kgy(TTContentsEventConstants.Params.EVENT_PROPERTY_DESCRIPTION, strValueOf3);
        fiVar.kgy("icon", strValueOf4);
        fiVar.kgy("app_name", strValueOf5);
        fiVar.kgy(true);
    }

    public com.bytedance.sdk.component.adexpress.dynamic.uq.fi kgy(JSONObject jSONObject) {
        JSONObject jSONObject2;
        String strOptString = jSONObject.optString("type");
        String strOptString2 = jSONObject.optString("id");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("values");
        gf.kgy(strOptString, jSONObjectOptJSONObject);
        JSONObject jSONObjectKgy = gf.kgy(strOptString, gf.kgy(jSONObject.optJSONArray("sceneValues")), jSONObjectOptJSONObject);
        com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar = new com.bytedance.sdk.component.adexpress.dynamic.uq.fi();
        if (TextUtils.isEmpty(strOptString2)) {
            fiVar.ahm(String.valueOf(fiVar.hashCode()));
        } else {
            fiVar.ahm(strOptString2);
        }
        if (jSONObjectOptJSONObject != null) {
            ahm(fiVar);
            fiVar.rz((float) jSONObjectOptJSONObject.optDouble("x"));
            fiVar.uq((float) jSONObjectOptJSONObject.optDouble("y"));
            fiVar.ct((float) jSONObjectOptJSONObject.optDouble("width"));
            fiVar.noq((float) jSONObjectOptJSONObject.optDouble("height"));
            fiVar.yo(jSONObjectOptJSONObject.optInt("remainWidth"));
            com.bytedance.sdk.component.adexpress.dynamic.uq.ct ctVar = new com.bytedance.sdk.component.adexpress.dynamic.uq.ct();
            ctVar.kgy(strOptString);
            ctVar.ahm(jSONObjectOptJSONObject.optString("data"));
            ctVar.rz(jSONObjectOptJSONObject.optString("dataExtraInfo"));
            com.bytedance.sdk.component.adexpress.dynamic.uq.noq noqVarKgy = com.bytedance.sdk.component.adexpress.dynamic.uq.noq.kgy(jSONObjectOptJSONObject);
            ctVar.kgy(noqVarKgy);
            com.bytedance.sdk.component.adexpress.dynamic.uq.noq noqVarKgy2 = com.bytedance.sdk.component.adexpress.dynamic.uq.noq.kgy(jSONObjectKgy);
            if (noqVarKgy2 == null) {
                ctVar.ahm(noqVarKgy);
            } else {
                ctVar.ahm(noqVarKgy2);
            }
            kgy(noqVarKgy);
            kgy(noqVarKgy2);
            if (TextUtils.equals(strOptString, "video-image-budget") && (jSONObject2 = this.ahm) != null) {
                kgy(ctVar, jSONObject2.optInt("image_mode"));
            }
            String strAhm = ctVar.ahm();
            com.bytedance.sdk.component.adexpress.dynamic.uq.noq noqVarCt = ctVar.ct();
            if (yo.containsKey(strAhm) && !noqVarCt.dpp()) {
                noqVarCt.sx(yo.get(strAhm));
            }
            String strRz = noqVarCt.dpp() ? ctVar.rz() : kgy(ctVar.rz());
            if (com.bytedance.sdk.component.adexpress.uq.ahm()) {
                if (TextUtils.equals(strAhm, "star") || TextUtils.equals(strAhm, "text_star")) {
                    strRz = kgy("dynamic_creative.score_exact_i18n|");
                }
                if (TextUtils.equals(strAhm, "score-count") || TextUtils.equals(strAhm, "score-count-type-1") || TextUtils.equals(strAhm, "score-count-type-2")) {
                    strRz = kgy("dynamic_creative.comment_num_i18n|");
                }
                if ("root".equals(strAhm) && noqVarKgy.any()) {
                    strRz = kgy("image.0.url");
                }
            }
            if (TextUtils.isEmpty(kgy()) || !(TextUtils.equals("logo-union", strOptString) || TextUtils.equals("logo", strOptString))) {
                ctVar.ahm(strRz);
            } else {
                StringBuilder sbQ = h50.q(strRz, "adx:");
                sbQ.append(kgy());
                ctVar.ahm(sbQ.toString());
            }
            fiVar.kgy(ctVar);
        }
        return fiVar;
    }

    public noq(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.kgy = jSONObject;
        this.ahm = jSONObject2;
        this.rz = new com.bytedance.sdk.component.adexpress.dynamic.uq.rz(jSONObject2);
        this.uq = kgy.kgy(jSONObject3);
        this.noq = com.bytedance.sdk.component.adexpress.dynamic.uq.uq.kgy(jSONObject4);
    }

    private void kgy(com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar) {
        int iKgy;
        if (fiVar == null) {
            return;
        }
        if (com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().rz() != null) {
            iKgy = com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().rz().dg();
        } else {
            iKgy = com.bytedance.sdk.component.adexpress.uq.yo.kgy(com.bytedance.sdk.component.adexpress.uq.kgy());
        }
        int iAhm = com.bytedance.sdk.component.adexpress.uq.yo.ahm(com.bytedance.sdk.component.adexpress.uq.kgy(), iKgy);
        kgy kgyVar = this.uq;
        float fMin = kgyVar.rz ? kgyVar.kgy : Math.min(kgyVar.kgy, iAhm);
        if (this.uq.ahm == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fiVar.ct(fMin);
            fiVar.ra().ct().ra("auto");
            fiVar.noq(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        fiVar.ct(fMin);
        int iAhm2 = com.bytedance.sdk.component.adexpress.uq.yo.ahm(com.bytedance.sdk.component.adexpress.uq.kgy(), com.bytedance.sdk.component.adexpress.uq.yo.ahm(com.bytedance.sdk.component.adexpress.uq.kgy()));
        kgy kgyVar2 = this.uq;
        boolean z = kgyVar2.rz;
        float fMin2 = kgyVar2.ahm;
        if (!z) {
            fMin2 = Math.min(fMin2, iAhm2);
        }
        fiVar.noq(fMin2);
        fiVar.ra().ct().ra("fixed");
    }

    public com.bytedance.sdk.component.adexpress.dynamic.uq.fi kgy(JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar) {
        int length;
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("type");
        if (TextUtils.equals(strOptString, "custom-component-vessel")) {
            int iOptInt = jSONObject.optInt("componentId");
            if (this.noq != null) {
                rz rzVar = new rz();
                this.ct = rzVar;
                JSONObject jSONObjectKgy = rzVar.kgy(this.noq.kgy, iOptInt, jSONObject);
                if (jSONObjectKgy != null) {
                    jSONObject = jSONObjectKgy;
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVarKgy = kgy(jSONObject);
        fiVarKgy.kgy(fiVar);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
        if (jSONArrayOptJSONArray == null) {
            fiVarKgy.kgy((List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi>) null);
            return fiVarKgy;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONArray jSONArrayOptJSONArray2 = jSONArrayOptJSONArray.optJSONArray(i);
            if (jSONArrayOptJSONArray2 != null) {
                ArrayList arrayList3 = new ArrayList();
                if (TextUtils.equals(strOptString, "tag-group")) {
                    length = fiVarKgy.ra().ct().gc();
                } else {
                    length = jSONArrayOptJSONArray2.length();
                }
                for (int i2 = 0; i2 < length; i2++) {
                    com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVarKgy2 = kgy(jSONArrayOptJSONArray2.optJSONObject(i2), fiVarKgy);
                    if (com.bytedance.sdk.component.adexpress.uq.ahm() && "skip-with-time".equals(fiVarKgy.ra().ahm()) && !C4664b4.i.T.equals(fiVarKgy.ioy()) && !TextUtils.isEmpty(fiVarKgy.ioy())) {
                        fiVarKgy2.rz(fiVarKgy.ioy());
                    }
                    arrayList.add(fiVarKgy2);
                    arrayList3.add(fiVarKgy2);
                }
                arrayList2.add(arrayList3);
            }
        }
        if (arrayList.size() > 0) {
            fiVarKgy.kgy(arrayList);
        }
        if (arrayList2.size() > 0) {
            fiVarKgy.ahm(arrayList2);
        }
        return fiVarKgy;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.uq.fi kgy(double d, int i, double d2, String str, twf twfVar) {
        JSONObject jSONObjectJsonObjectInit;
        this.rz.kgy();
        try {
            jSONObjectJsonObjectInit = PangleNetworkBridge.jsonObjectInit(this.noq.ahm);
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "f/cjlA61auuBU9hImDiuLlfvOZAR", "UuArmQKobOOZRNZQhRKMKULhOIE=", 76);
            jSONObjectJsonObjectInit = null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVarKgy = kgy(uq.kgy(this.kgy, jSONObjectJsonObjectInit), (com.bytedance.sdk.component.adexpress.dynamic.uq.fi) null);
        kgy(fiVarKgy);
        ct ctVar = new ct(d, i, d2, str, twfVar);
        ct.kgy kgyVar = new ct.kgy();
        kgy kgyVar2 = this.uq;
        kgyVar.kgy = kgyVar2.kgy;
        kgyVar.ahm = kgyVar2.ahm;
        kgyVar.rz = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        ctVar.kgy(kgyVar);
        ctVar.kgy(fiVarKgy, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ctVar.kgy();
        com.bytedance.sdk.component.adexpress.dynamic.uq.ahm ahmVar = ctVar.kgy;
        if (ahmVar.uq == 65536.0f) {
            return null;
        }
        return ahmVar.noq;
    }

    private void kgy(com.bytedance.sdk.component.adexpress.dynamic.uq.ct ctVar, int i) {
        int iLastIndexOf;
        if (i != 5 && i != 15 && i != 50 && i != 154) {
            ctVar.kgy("image");
            String strKgy = gf.kgy("image");
            com.bytedance.sdk.component.adexpress.dynamic.uq.noq noqVarCt = ctVar.ct();
            noqVarCt.sx(strKgy);
            ctVar.yo().sx(strKgy);
            String strKgy2 = gf.kgy("image", "clickArea");
            if (!TextUtils.isEmpty(strKgy2)) {
                noqVarCt.vs(strKgy2);
                ctVar.yo().vs(strKgy2);
            }
            JSONObject jSONObjectBe = noqVarCt.be();
            if (jSONObjectBe != null) {
                noqVarCt.ioy(jSONObjectBe.optString("imageLottieTosPath"));
                noqVarCt.at(jSONObjectBe.optBoolean("animationsLoop"));
                noqVarCt.jpc(jSONObjectBe.optInt("lottieAppNameMaxLength"));
                noqVarCt.wy(jSONObjectBe.optInt("lottieAdDescMaxLength"));
                noqVarCt.ft(jSONObjectBe.optInt("lottieAdTitleMaxLength"));
            }
            ctVar.ahm(strKgy);
            if (strKgy != null && (iLastIndexOf = strKgy.lastIndexOf(UserDetailsUtils.UserDetailsLiterals.DOT)) > 0) {
                String strSubstring = strKgy.substring(0, iLastIndexOf);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("width", kgy(strSubstring.concat(".width")));
                    jSONObject.put("height", kgy(strSubstring.concat(".height")));
                } catch (JSONException e) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "f/cjlA61auuBU9hImDiuLlfvOZAR", "S/wilgaveu6NS9BYuhikLVTMOJEEuX0=", 394);
                }
                ctVar.rz(jSONObject.toString());
            }
            noqVarCt.aan();
            return;
        }
        ctVar.kgy("video");
        String strKgy3 = gf.kgy("video");
        ctVar.ct().sx(strKgy3);
        String strKgy4 = gf.kgy("video", "clickArea");
        if (!TextUtils.isEmpty(strKgy4)) {
            ctVar.ct().vs(strKgy4);
            ctVar.yo().vs(strKgy4);
        }
        ctVar.yo().sx(strKgy3);
        ctVar.ahm(strKgy3);
        ctVar.ct().eq();
    }

    private String kgy(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (String str2 : str.split("\\|")) {
            if (this.rz.ahm(str2)) {
                String strValueOf = String.valueOf(this.rz.kgy(str2));
                if (!TextUtils.isEmpty(strValueOf)) {
                    return strValueOf;
                }
            }
        }
        return "";
    }

    private String kgy() {
        Object objKgy;
        com.bytedance.sdk.component.adexpress.dynamic.uq.rz rzVar = this.rz;
        return (rzVar == null || (objKgy = rzVar.kgy("adx_name")) == null) ? "" : String.valueOf(objKgy);
    }

    private void kgy(com.bytedance.sdk.component.adexpress.dynamic.uq.noq noqVar) {
        if (noqVar == null) {
            return;
        }
        String strUf = noqVar.uf();
        if (com.bytedance.sdk.component.adexpress.uq.ahm()) {
            String strRz = com.bytedance.sdk.component.adexpress.uq.yo.rz(com.bytedance.sdk.component.adexpress.uq.kgy());
            if ("zh".equals(strRz)) {
                strRz = "cn";
            }
            if (!TextUtils.isEmpty(strRz) && noqVar.noq() != null) {
                String strOptString = noqVar.noq().optString(strRz);
                if (!TextUtils.isEmpty(strOptString)) {
                    strUf = strOptString;
                }
            }
        }
        if (TextUtils.isEmpty(strUf)) {
            return;
        }
        int iIndexOf = strUf.indexOf("{{");
        int iIndexOf2 = strUf.indexOf("}}");
        if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf2 >= iIndexOf) {
            String strKgy = kgy(strUf.substring(iIndexOf + 2, iIndexOf2));
            StringBuilder sb = new StringBuilder(strUf.substring(0, iIndexOf));
            if (!TextUtils.isEmpty(strKgy)) {
                sb.append(strKgy);
            }
            sb.append(strUf.substring(iIndexOf2 + 2));
            noqVar.at(sb.toString());
            return;
        }
        noqVar.at(strUf);
    }
}
