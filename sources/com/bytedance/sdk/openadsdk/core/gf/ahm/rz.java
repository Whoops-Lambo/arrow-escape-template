package com.bytedance.sdk.openadsdk.core.gf.ahm;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.sx;
import com.bytedance.sdk.openadsdk.component.reward.rz.fi;
import com.bytedance.sdk.openadsdk.core.at;
import com.bytedance.sdk.openadsdk.core.model.fpp;
import com.bytedance.sdk.openadsdk.core.model.ikw;
import com.bytedance.sdk.openadsdk.core.model.ioy;
import com.bytedance.sdk.openadsdk.core.model.um;
import com.bytedance.sdk.openadsdk.core.ra;
import com.bytedance.sdk.openadsdk.core.uxe;
import com.bytedance.sdk.openadsdk.core.xh;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import com.singular.sdk.internal.UserDetailsUtils;
import com.tiktok.appevents.contents.TTContentsEventConstants;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.bb3;
import defpackage.nj;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class rz {
    private static String ahm = "";
    public static String kgy = "https://pag_open_icon_id/appicon.png";

    public static Map<String, String> ahm(ioy ioyVar) {
        HashMap map = null;
        if (ioyVar == null) {
            return null;
        }
        List<um> listBe = ioyVar.be();
        if (listBe != null && listBe.size() > 0) {
            map = new HashMap();
            for (um umVar : listBe) {
                if (umVar != null) {
                    map.put(umVar.kgy(), umVar.yo());
                }
            }
            um umVarPm = ioyVar.pm();
            if (umVarPm != null) {
                map.put(umVarPm.kgy(), umVarPm.yo());
            }
        }
        return map;
    }

    public static JSONObject kgy(boolean z, @NonNull ioy ioyVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("button_text", ioyVar.em());
            if (ioyVar.pm() != null) {
                if (ioyVar.pm() == null || TextUtils.isEmpty(ioyVar.pm().kgy())) {
                    jSONObject.put("icon", "");
                } else {
                    jSONObject.put("icon", ioyVar.pm().kgy());
                }
            }
            JSONArray jSONArray = new JSONArray();
            if (ioyVar.be() != null) {
                for (int i = 0; i < ioyVar.be().size(); i++) {
                    um umVar = ioyVar.be().get(i);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("height", umVar.rz());
                    jSONObject2.put("width", umVar.ahm());
                    jSONObject2.put("url", umVar.kgy());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("image", jSONArray);
            jSONObject.put("image_mode", ioyVar.rdw());
            jSONObject.put("interaction_type", ioyVar.any());
            jSONObject.put("interaction_method", ioyVar.znm());
            jSONObject.put("is_compliance_template", rz());
            jSONObject.put("title", ioyVar.ti());
            jSONObject.put(TTContentsEventConstants.Params.EVENT_PROPERTY_DESCRIPTION, ioyVar.ce());
            jSONObject.put("source", ioyVar.kt());
            JSONObject jSONObject3 = new JSONObject();
            fpp fppVarFt = ioyVar.ft();
            if (fppVarFt == null) {
                fppVarFt = new fpp();
            }
            jSONObject3.put("ceiling_time", fppVarFt.uq());
            jSONObject3.put("ceiling_ratio", fppVarFt.ct());
            jSONObject3.put("expand_ratio", fppVarFt.noq());
            jSONObject.put("interaction_params", jSONObject3);
            if (ioyVar.yv() != null) {
                jSONObject.put("comment_num", ioyVar.yv().ct());
                jSONObject.put("score", ioyVar.yv().uq());
                jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, ioyVar.yv().noq());
                jSONObject.put("app", ioyVar.yv().fi());
            }
            bb3 bb3VarJw = ioyVar.jw();
            if (bb3VarJw != null) {
                JSONObject jSONObjectB = bb3VarJw.b();
                jSONObjectB.put("video_duration", bb3VarJw.d * ((double) bb3VarJw.r));
                jSONObject.put("video", jSONObjectB);
            }
            if (ioyVar.vz() != null) {
                jSONObject.put("dynamic_creative", ioyVar.vz().gf());
            }
            return jSONObject;
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4CyBCqpswphaxVifAu49T+chhg==", "b+sghQ+9fcK1Xt5Rnw==", "XOs5thG5aNOJXNJ3nx6u", 461);
            return null;
        }
    }

    private static JSONObject rz(ioy ioyVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            uxe.kgy(jSONObject, ioyVar);
            return jSONObject;
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4CyBCqpswphaxVifAu49T+chhg==", "b+sghQ+9fcK1Xt5Rnw==", "XOs5tAeVZ8GP", 365);
            return jSONObject;
        }
    }

    public static boolean rz() {
        return true;
    }

    private static String ahm(ioy.kgy kgyVar) {
        com.bytedance.sdk.component.adexpress.kgy.rz.ahm ahmVarRz;
        if (kgyVar != null) {
            String strYo = kgyVar.yo();
            return (!TextUtils.isEmpty(strYo) || (ahmVarRz = com.bytedance.sdk.component.adexpress.kgy.ahm.ahm.rz(kgyVar.uq())) == null) ? strYo : ahmVarRz.ct();
        }
        return "";
    }

    public static JSONObject ahm() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("language", at.ahm());
            jSONObject.put("xSetting", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            uxe.rz(jSONObject3);
            jSONObject3.put("platform", "android");
            jSONObject.put("xAppInfo", jSONObject3);
            return jSONObject;
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4CyBCqpswphaxVifAu49T+chhg==", "b+sghQ+9fcK1Xt5Rnw==", "XOs5pQK7bOOBXtY=", 270);
            sx.rz("TemplateUtils", e.getMessage());
            return jSONObject;
        }
    }

    public static JSONObject kgy(float f, float f2, boolean z, @NonNull ioy ioyVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "android");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", f);
            jSONObject2.put("height", f2);
            if (z) {
                jSONObject2.put("isLandscape", true);
            }
            jSONObject.put("AdSize", jSONObject2);
            jSONObject.put("creative", kgy(false, ioyVar));
            jSONObject.put("template_Plugin", ahm(ioyVar.vz()));
            jSONObject.put("diff_template_Plugin", kgy(ioyVar.vz()));
            return jSONObject;
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4CyBCqpswphaxVifAu49T+chhg==", "b+sghQ+9fcK1Xt5Rnw==", "XOs5oQaxecuBXtJ0ghev", 76);
            return null;
        }
    }

    public static JSONObject kgy(ioy ioyVar) {
        return kgy(ioyVar, false, (JSONObject) null);
    }

    public static JSONObject kgy(ioy ioyVar, boolean z, JSONObject jSONObject) {
        JSONObject jSONObjectKgy = null;
        if (ioyVar == null) {
            return null;
        }
        try {
            jSONObjectKgy = kgy(ioyVar, false, z);
            if (jSONObjectKgy == null) {
                jSONObjectKgy = new JSONObject();
            }
            JSONObject jSONObject2 = new JSONObject();
            uxe.rz(jSONObject2);
            jSONObject2.put("platform", "android");
            jSONObjectKgy.put("xAppInfo", jSONObject2);
            if (jSONObject != null) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectKgy.put(next, jSONObject.get(next));
                }
            }
            JSONObject jSONObjectAhm = uxe.ahm(ioyVar);
            jSONObjectAhm.put("language", at.ahm());
            jSONObjectKgy.put("xSetting", jSONObjectAhm);
            return jSONObjectKgy;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4CyBCqpswphaxVifAu49T+chhg==", "b+sghQ+9fcK1Xt5Rnw==", "XOs5sQKoaO6OZcNViQOTK17gKA==", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            th.getMessage();
            return jSONObjectKgy;
        }
    }

    private static JSONObject kgy(ioy ioyVar, boolean z, boolean z2) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject = null;
        if (ioyVar != null) {
            try {
                String strFbw = ioyVar.fbw();
                if (strFbw != null) {
                    JSONObject jSONObjectJsonObjectInit = PangleNetworkBridge.jsonObjectInit(strFbw);
                    JSONArray jSONArrayOptJSONArray = jSONObjectJsonObjectInit.optJSONArray("creatives");
                    if (!z && !z2) {
                        jSONObject = new JSONObject();
                    } else {
                        JSONObject jSONObjectJsonObjectInit2 = (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= ioyVar.rz() || (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(ioyVar.rz())) == null) ? null : PangleNetworkBridge.jsonObjectInit(jSONObjectOptJSONObject.toString());
                        if (jSONObjectJsonObjectInit2 == null) {
                            return null;
                        }
                        jSONObject = jSONObjectJsonObjectInit2;
                    }
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 1) {
                        jSONArrayOptJSONArray.remove(0);
                        jSONObject.put("xRestCreatives", jSONArrayOptJSONArray);
                    }
                    jSONObjectJsonObjectInit.remove("creatives");
                    jSONObject.put("xRestResponse", jSONObjectJsonObjectInit);
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4CyBCqpswphaxVifAu49T+chhg==", "b+sghQ+9fcK1Xt5Rnw==", "S/s5sxawZeqFXtZ0ggWvAkjhIw==", 151);
                sx.kgy("TemplateUtils", "filterTemplateInfo", th);
                return jSONObject;
            }
        }
        return jSONObject;
    }

    public static JSONObject kgy(float f, float f2, boolean z, ioy ioyVar, String str, com.bytedance.sdk.openadsdk.core.at.yo.rz rzVar) {
        ahm = "";
        if (ioyVar == null) {
            return null;
        }
        try {
            JSONObject jSONObjectKgy = kgy(f, f2, z, ioyVar, str);
            if (rzVar != null) {
                rzVar.kgy("adv3");
            }
            ikw ikwVarIb = ioyVar.ib();
            if (ikwVarIb != null) {
                String strUq = ikwVarIb.uq();
                if (!TextUtils.isEmpty(strUq)) {
                    jSONObjectKgy.put("xTemplate", PangleNetworkBridge.jsonObjectInit(strUq));
                    ahm = "getTemplate success by local data";
                    if (rzVar != null) {
                        rzVar.ahm("local");
                        return jSONObjectKgy;
                    }
                } else {
                    String strKgy = com.bytedance.sdk.openadsdk.core.at.kgy.ahm.kgy().kgy("adv3", ikwVarIb.kgy(), ikwVarIb.ahm());
                    if (!TextUtils.isEmpty(strKgy)) {
                        jSONObjectKgy.put("xTemplate", PangleNetworkBridge.jsonObjectInit(strKgy));
                        ahm = "getTemplate success by db data";
                        if (rzVar != null) {
                            rzVar.ahm("local");
                            return jSONObjectKgy;
                        }
                    } else {
                        String str2 = "local db data is null id is " + ikwVarIb.kgy() + " md5 is " + ikwVarIb.ahm();
                        ahm = str2;
                        if (rzVar != null) {
                            rzVar.kgy(3, str2, "net");
                        }
                    }
                }
            }
            return jSONObjectKgy;
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4CyBCqpswphaxVifAu49T+chhg==", "b+sghQ+9fcK1Xt5Rnw==", "XOs5oQaxecuBXtJ0ghevHgg=", 203);
            String strO = nj.o(e, new StringBuilder("load template exception "));
            ahm = strO;
            if (rzVar != null) {
                rzVar.kgy(3, strO, "net");
            }
            return null;
        }
    }

    public static JSONObject kgy(float f, float f2, boolean z, ioy ioyVar, String str) {
        JSONObject jSONObject = null;
        if (ioyVar == null) {
            return null;
        }
        try {
            JSONObject jSONObjectKgy = kgy(ioyVar, true, true);
            if (jSONObjectKgy == null) {
                return null;
            }
            try {
                if (!fi.kgy(ioyVar)) {
                    kgy(jSONObjectKgy, ioyVar, str);
                }
                JSONObject jSONObjectAhm = uxe.ahm(ioyVar);
                jSONObjectAhm.put("language", at.ahm());
                jSONObjectKgy.put("xSetting", jSONObjectAhm);
                jSONObjectKgy.put("xAdInfo", kgy(str, rz(ioyVar), ioyVar));
                JSONObject jSONObject2 = new JSONObject();
                uxe.rz(jSONObject2);
                jSONObject2.put("platform", "android");
                jSONObjectKgy.put("xAppInfo", jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("width", f);
                jSONObject3.put("height", f2);
                if (z) {
                    jSONObject3.put("isLandscape", true);
                }
                jSONObjectKgy.put("xSize", jSONObject3);
                return jSONObjectKgy;
            } catch (Throwable th) {
                th = th;
                jSONObject = jSONObjectKgy;
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4CyBCqpswphaxVifAu49T+chhg==", "b+sghQ+9fcK1Xt5Rnw==", "XOs5oAS5Z+OBXtY=", 250);
                return jSONObject;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static void kgy(JSONObject jSONObject, ioy ioyVar, String str) {
        if (ioyVar == null || jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.has("h265_video")) {
                jSONObject.remove("h265_video");
            }
            bb3 bb3VarJw = ioyVar.jw();
            if (bb3VarJw != null) {
                JSONObject jSONObjectB = bb3VarJw.b();
                jSONObjectB.put("video_duration", bb3VarJw.d * ((double) bb3VarJw.r));
                jSONObject.put("video", jSONObjectB);
            } else if ("open_ad".equals(str)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("video_duration", xh.uq().lqi(String.valueOf(ioyVar.ws())));
                jSONObject.put("video", jSONObject2);
            }
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4CyBCqpswphaxVifAu49T+chhg==", "b+sghQ+9fcK1Xt5Rnw==", "WOYsmwS5RMaUT8VUjR2EKU/v", 294);
            e.getMessage();
        }
    }

    private static JSONObject kgy(String str, JSONObject jSONObject, ioy ioyVar) {
        if (ioyVar != null) {
            try {
                if ("open_ad".equals(str)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("app_name", ra.ahm().fi());
                    int iGf = ra.ahm().gf();
                    if (iGf != 0) {
                        int iIdg = ioyVar.idg();
                        if (9 == iIdg || 11 == iIdg) {
                            if (ra.ahm().ra()) {
                                jSONObject2.put("app_icon", kgy);
                            }
                        } else if (10 == iIdg) {
                            jSONObject2.put("app_icon", UserDetailsUtils.UserDetailsLiterals.AT.concat(String.valueOf(iGf)));
                        }
                    }
                    jSONObject.put("open_app_info", jSONObject2);
                }
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4CyBCqpswphaxVifAu49T+chhg==", "b+sghQ+9fcK1Xt5Rnw==", "XechmSKsee6OTNg=", Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE);
                return jSONObject;
            }
        }
        return jSONObject;
    }

    public static JSONObject kgy(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            return jSONObject;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject == null) {
            return jSONObject3;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("keys");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i);
                    if (jSONObject.has(strOptString)) {
                        jSONObject3.put(strOptString, jSONObject.opt(strOptString));
                    }
                }
                jSONObject3.put("xSetting", jSONObject.opt("xSetting"));
                jSONObject3.put("xAdInfo", jSONObject.opt("xAdInfo"));
                jSONObject3.put("xAppInfo", jSONObject.opt("xAppInfo"));
                jSONObject3.put("xSize", jSONObject.opt("xSize"));
                jSONObject3.put("dynamic_configs", jSONObject.opt("dynamic_configs"));
                jSONObject3.put("xTemplate", jSONObject.opt("xTemplate"));
                jSONObject3.put("xRestCreatives", jSONObject.opt("xRestCreatives"));
                jSONObject3.put("xRestResponse", jSONObject.opt("xRestResponse"));
                return jSONObject3;
            }
            return jSONObject;
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4CyBCqpswphaxVifAu49T+chhg==", "b+sghQ+9fcK1Xt5Rnw==", "XechgQauXcKNWttcmBSJJl3h", 353);
            return jSONObject;
        }
    }

    private static String kgy(ioy.kgy kgyVar) {
        if (kgyVar != null) {
            return kgyVar.fi();
        }
        return "";
    }

    public static String kgy() {
        return ahm;
    }

    public static String kgy(ioy ioyVar, String str) {
        List<um> listBe;
        if (ioyVar != null && (listBe = ioyVar.be()) != null && listBe.size() > 0) {
            for (um umVar : listBe) {
                if (umVar != null && TextUtils.equals(str, umVar.kgy())) {
                    return umVar.yo();
                }
            }
        }
        return null;
    }
}
