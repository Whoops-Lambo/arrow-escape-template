package com.bytedance.sdk.openadsdk.lqi;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.utils.gm;
import com.bytedance.sdk.component.utils.jpc;
import com.bytedance.sdk.openadsdk.activity.single.fi;
import com.bytedance.sdk.openadsdk.component.reward.kgy.um;
import com.bytedance.sdk.openadsdk.core.ioy;
import com.bytedance.sdk.openadsdk.core.kus;
import com.bytedance.sdk.openadsdk.core.lqi;
import com.bytedance.sdk.openadsdk.core.model.sx;
import com.bytedance.sdk.openadsdk.core.model.uf;
import com.bytedance.sdk.openadsdk.core.ra;
import com.bytedance.sdk.openadsdk.core.settings.gf;
import com.bytedance.sdk.openadsdk.core.settings.nu;
import com.bytedance.sdk.openadsdk.core.xh;
import com.bytedance.sdk.openadsdk.utils.ftg;
import com.bytedance.sdk.openadsdk.utils.mw;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import com.singular.sdk.internal.Constants;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.h50;
import defpackage.n30;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class ct {
    public static String ahm;
    private static volatile uq uq;
    private static final AtomicBoolean rz = new AtomicBoolean(false);
    public static final ConcurrentHashMap<String, Object> kgy = new ConcurrentHashMap<>();

    private static int ahm(String str) {
        JSONObject jSONObject = (JSONObject) kgy("rviv_close_button_backup", (Object) null, ahm.kgy);
        if (TextUtils.isEmpty(str) || jSONObject == null) {
            return -1;
        }
        try {
            Object obj = jSONObject.get(str);
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
            return -1;
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE58FsilP6yqM", "aPo/lBe5bt6jT9lJiQOVPFLiPg==", "XOs5tg+zesKiS9RWmQGELVfvNA==", 542);
            e.getMessage();
            return -1;
        }
    }

    public static int kgy(com.bytedance.sdk.openadsdk.component.reward.kgy.ahm ahmVar) {
        if (ahmVar == null) {
            return -1;
        }
        if (ahmVar.yx) {
            fi fiVar = ahmVar.oyj;
            if (fiVar instanceof com.bytedance.sdk.openadsdk.activity.single.ct) {
                if (((com.bytedance.sdk.openadsdk.activity.single.ct) fiVar).kgy) {
                    return ahm("one_more_mutlti_endcard");
                }
                um umVar = ahmVar.vg;
                if (umVar != null && umVar.sx()) {
                    return ahm("one_more_mutlti_double_endcard");
                }
            }
            return -1;
        }
        if (uf.ahm(ahmVar.ahm)) {
            if (uf.fi(ahmVar.ahm)) {
                return ahm("playable_link_endcard");
            }
            return uf.noq(ahmVar.ahm) ? ahm("pure_playable") : ahm("playable");
        }
        um umVar2 = ahmVar.vg;
        if (umVar2 == null || !umVar2.sx()) {
            return (sx.uq(ahmVar.ahm) || sx.ahm(ahmVar.ahm)) ? ahm("direct_landingpage") : ahm(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
        }
        return ahm("double_endcard");
    }

    public static boolean fi() {
        return kgy("no_call_close", 0) == 1;
    }

    public static boolean gf() {
        return kgy("iv_rv_top_bar_listen_new", 0) == 1;
    }

    public static boolean rz() {
        return kgy("ad_load_and_render_opt", a.k, 0) == 1;
    }

    public static boolean ct() {
        if (!rz() || kgy("ad_load_and_render_opt", "sync_barrier_switch_opt", 0) != 1) {
            return false;
        }
        return true;
    }

    public static int noq() {
        if (!rz()) {
            return 0;
        }
        return kgy("ad_load_and_render_opt", "webview_preload_cache", 0);
    }

    private static uq ra() {
        return kgy(xh.kgy(), ra.ahm().uq());
    }

    public static boolean uq() {
        if (!rz() || kgy("ad_load_and_render_opt", "thread_switch_opt", 0) != 1) {
            return false;
        }
        return true;
    }

    public static int yo() {
        if (!rz()) {
            return 0;
        }
        return kgy("ad_load_and_render_opt", "webview_preload_cache_v3", 0);
    }

    public static void ahm() {
        uq uqVarRa;
        if (com.bytedance.sdk.openadsdk.core.ra.ahm.kgy().ct() || (uqVarRa = ra()) == null || rz.getAndSet(true)) {
            return;
        }
        uqVarRa.kgy();
    }

    public static String kgy() {
        rz rzVarAhm;
        SharedPreferences sharedPreferencesKgy;
        try {
            uq uqVarRa = ra();
            if (uqVarRa == null || (rzVarAhm = uqVarRa.ahm()) == null || (sharedPreferencesKgy = rzVarAhm.kgy()) == null) {
                return null;
            }
            return new JSONObject(sharedPreferencesKgy.getAll()).toString();
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE58FsilP6yqM", "aPo/lBe5bt6jT9lJiQOVPFLiPg==", "XOs5pheuaNOFTc5+gx+mIVw=", 273);
            com.bytedance.sdk.component.utils.sx.kgy("StrategyUtils", "getStrategyConfig error", e);
            return null;
        }
    }

    public static int kgy(String str, int i) {
        uq uqVarRa = ra();
        return uqVarRa != null ? uqVarRa.kgy(str, i) : i;
    }

    public static boolean kgy(String str, boolean z) {
        uq uqVarRa = ra();
        return uqVarRa != null ? uqVarRa.kgy(str, z) : z;
    }

    public static boolean kgy(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Context contextKgy = xh.kgy();
            if (contextKgy == null) {
                return false;
            }
            String str2 = "pag_adn_strategy_center";
            if (!gm.kgy(contextKgy)) {
                str2 = "pag_adn_strategy_center_" + gm.rz(contextKgy);
            }
            SharedPreferences sharedPreferences = contextKgy.getSharedPreferences(str2, 0);
            if (sharedPreferences == null) {
                return false;
            }
            return sharedPreferences.edit().remove(str).commit();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE58FsilP6yqM", "aPo/lBe5bt6jT9lJiQOVPFLiPg==", "SesgmhW5RciDS9t+gx+mIVw=", Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE);
            com.bytedance.sdk.component.utils.sx.kgy("StrategyUtils", "remove local config error", th);
            return false;
        }
    }

    public static String kgy(String str, String str2) {
        uq uqVarRa = ra();
        return uqVarRa != null ? uqVarRa.kgy(str, str2) : str2;
    }

    public static <T> T kgy(String str, T t, ahm.kgy<T> kgyVar) {
        uq uqVarRa = ra();
        return uqVarRa != null ? (T) uqVarRa.kgy(str, t, kgyVar) : t;
    }

    public static int kgy(String str, String str2, int i) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String strI = h50.i(str, "_", str2);
            ConcurrentHashMap<String, Object> concurrentHashMap = kgy;
            Object obj = concurrentHashMap.get(strI);
            if (obj != null && (obj instanceof Integer)) {
                return ((Integer) obj).intValue();
            }
            try {
                String strKgy = ra().kgy(str, "");
                if (!TextUtils.isEmpty(strKgy)) {
                    int iOptInt = PangleNetworkBridge.jsonObjectInit(strKgy).optInt(str2, i);
                    concurrentHashMap.put(strI, Integer.valueOf(iOptInt));
                    return iOptInt;
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE58FsilP6yqM", "aPo/lBe5bt6jT9lJiQOVPFLiPg==", "XOs5vA2oS96jRdlbhRaKO1Tg", 408);
                com.bytedance.sdk.component.utils.sx.rz("StrategyUtils", th.getMessage());
            }
        }
        return i;
    }

    public static String kgy(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String strI = h50.i(str, "_", str2);
            ConcurrentHashMap<String, Object> concurrentHashMap = kgy;
            Object obj = concurrentHashMap.get(strI);
            if (obj != null && (obj instanceof String)) {
                return (String) obj;
            }
            try {
                String strKgy = ra().kgy(str, "");
                if (!TextUtils.isEmpty(strKgy)) {
                    String strOptString = PangleNetworkBridge.jsonObjectInit(strKgy).optString(str2, str3);
                    concurrentHashMap.put(strI, strOptString);
                    return strOptString;
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE58FsilP6yqM", "aPo/lBe5bt6jT9lJiQOVPFLiPg==", "XOs5pheuYMmHaM5+gx+mIVzEPpoN", 434);
                com.bytedance.sdk.component.utils.sx.rz("StrategyUtils", th.getMessage());
            }
        }
        return str3;
    }

    public static uq kgy(final Context context, final String str) {
        if (uq == null) {
            synchronized (ct.class) {
                try {
                    if (uq == null) {
                        try {
                            uq uqVar = new uq(new noq() { // from class: com.bytedance.sdk.openadsdk.lqi.ct.1
                                @Override // com.bytedance.sdk.openadsdk.lqi.noq
                                public String ct() {
                                    String strKgy = ftg.kgy("/api/ad/union/sdk/strategies/adn", false, true);
                                    ct.ahm = strKgy;
                                    return strKgy;
                                }

                                @Override // com.bytedance.sdk.openadsdk.lqi.noq
                                public Context ahm() {
                                    Context context2 = context;
                                    return context2 != null ? context2 : xh.kgy();
                                }

                                @Override // com.bytedance.sdk.openadsdk.lqi.noq
                                public JSONObject kgy(JSONObject jSONObject) {
                                    String strKgy = ioy.kgy(jSONObject.optInt("cypher", -1), jSONObject.optString("message"));
                                    if (!TextUtils.isEmpty(strKgy)) {
                                        try {
                                            return PangleNetworkBridge.jsonObjectInit(strKgy);
                                        } catch (Throwable th) {
                                            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE58FsilP6yqM", "aPo/lBe5bt6jT9lJiQOVPFLiPtFS", "X+sumge5", 174);
                                        }
                                    }
                                    return jSONObject;
                                }

                                @Override // com.bytedance.sdk.openadsdk.lqi.noq
                                public JSONObject noq() {
                                    try {
                                        JSONObject jSONObjectKgy = gf.kgy(jpc.kgy(xh.kgy(), 0L));
                                        if (!jSONObjectKgy.has(MBridgeConstans.APP_ID)) {
                                            if (!TextUtils.isEmpty(str)) {
                                                jSONObjectKgy.put(MBridgeConstans.APP_ID, str);
                                            } else {
                                                if (TextUtils.isEmpty(ra.ahm().uq())) {
                                                    return null;
                                                }
                                                jSONObjectKgy.put(MBridgeConstans.APP_ID, ra.ahm().uq());
                                            }
                                        }
                                        return ioy.kgy(PangleEncryptConstant.CryptDataScene.STRATEGY, jSONObjectKgy);
                                    } catch (Throwable th) {
                                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE58FsilP6yqM", "aPo/lBe5bt6jT9lJiQOVPFLiPtFS", "XOs5pwatfMKTXvVSiAg=", 128);
                                        com.bytedance.sdk.component.utils.sx.rz("StrategyUtils", th.getMessage());
                                        return null;
                                    }
                                }

                                @Override // com.bytedance.sdk.openadsdk.lqi.noq
                                public Map<String, String> yo() {
                                    HashMap map = new HashMap();
                                    map.put(Command.HTTP_HEADER_USER_AGENT, ftg.uq());
                                    String strAhm = com.bytedance.sdk.openadsdk.fpp.uq.kgy.ahm("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
                                    if (!strAhm.isEmpty()) {
                                        JSONObject jSONObject = new JSONObject();
                                        try {
                                            jSONObject.put("ipv6", strAhm);
                                        } catch (JSONException e) {
                                            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE58FsilP6yqM", "aPo/lBe5bt6jT9lJiQOVPFLiPtFS", "XOs5vQa9bcKSWQ==", 143);
                                        }
                                        JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject, new lqi(PangleEncryptConstant.CryptDataScene.UNKNOWN));
                                        if (jSONObjectEncryptType4 != null) {
                                            map.put("transfer-param", jSONObjectEncryptType4.optString("message"));
                                            if (jSONObjectEncryptType4.optInt("cypher") == 4) {
                                                map.put("cypher", "4");
                                            } else {
                                                map.put("cypher", Constants.SdidMigrationStatusCodes.DID_NOT_SEND_START_SESSION_WITH_SDID_YET);
                                            }
                                        }
                                    }
                                    try {
                                        map.put("x-pangle-target-idc", nu.ahm().xxq());
                                    } catch (Throwable th) {
                                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE58FsilP6yqM", "aPo/lBe5bt6jT9lJiQOVPFLiPtFS", "XOs5vQa9bcKSWQ==", 159);
                                    }
                                    return map;
                                }

                                @Override // com.bytedance.sdk.openadsdk.lqi.noq
                                public boolean fi() {
                                    return com.bytedance.sdk.openadsdk.core.ra.ahm.kgy().ct();
                                }

                                @Override // com.bytedance.sdk.openadsdk.lqi.noq
                                public String rz() {
                                    if (!gm.kgy(ahm())) {
                                        return "pag_adn_strategy_center_" + gm.rz(ahm());
                                    }
                                    return "pag_adn_strategy_center";
                                }

                                @Override // com.bytedance.sdk.openadsdk.lqi.noq
                                public Handler uq() {
                                    return kus.ahm();
                                }

                                @Override // com.bytedance.sdk.openadsdk.lqi.noq
                                public ExecutorService kgy() {
                                    return mw.ct();
                                }

                                @Override // com.bytedance.sdk.openadsdk.lqi.noq
                                public HandlerThread kgy(String str2, int i) {
                                    return com.bytedance.sdk.component.utils.fi.kgy(str2, i);
                                }
                            });
                            uq = uqVar;
                            uqVar.kgy(new kgy() { // from class: com.bytedance.sdk.openadsdk.lqi.ct.2
                                @Override // com.bytedance.sdk.openadsdk.lqi.kgy
                                public void ahm() {
                                    com.bytedance.sdk.openadsdk.um.rz.ahm(new com.bytedance.sdk.openadsdk.um.uq() { // from class: com.bytedance.sdk.openadsdk.lqi.ct.2.2
                                        @Override // com.bytedance.sdk.openadsdk.um.uq
                                        public com.bytedance.sdk.openadsdk.um.ahm.kgy kgy() {
                                            return n30.e("strategy_fetch");
                                        }
                                    });
                                    com.bytedance.sdk.openadsdk.noq.kgy.kgy().ahm();
                                    com.bytedance.sdk.openadsdk.ay.kgy.rz.kgy().ahm();
                                    com.bytedance.sdk.openadsdk.utils.ioy.ahm();
                                    HashMap map = new HashMap();
                                    String strKgy = ct.kgy(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, "");
                                    if (!TextUtils.isEmpty(strKgy)) {
                                        map.put(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, strKgy);
                                    }
                                    com.bytedance.sdk.openadsdk.core.nu.rz.kgy(map);
                                }

                                @Override // com.bytedance.sdk.openadsdk.lqi.kgy
                                public void kgy(int i, String str2) {
                                    com.bytedance.sdk.openadsdk.um.rz.rz(new com.bytedance.sdk.openadsdk.um.uq() { // from class: com.bytedance.sdk.openadsdk.lqi.ct.2.3
                                        @Override // com.bytedance.sdk.openadsdk.um.uq
                                        public com.bytedance.sdk.openadsdk.um.ahm.kgy kgy() {
                                            return n30.e("strategy_fetch");
                                        }
                                    });
                                    com.bytedance.sdk.openadsdk.utils.ioy.kgy(ct.ahm);
                                }

                                @Override // com.bytedance.sdk.openadsdk.lqi.kgy
                                public void kgy() {
                                    com.bytedance.sdk.openadsdk.um.rz.kgy(new com.bytedance.sdk.openadsdk.um.uq() { // from class: com.bytedance.sdk.openadsdk.lqi.ct.2.1
                                        @Override // com.bytedance.sdk.openadsdk.um.uq
                                        public com.bytedance.sdk.openadsdk.um.ahm.kgy kgy() {
                                            return n30.e("strategy_fetch");
                                        }
                                    });
                                }
                            });
                        } catch (Throwable th) {
                            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE58FsilP6yqM", "aPo/lBe5bt6jT9lJiQOVPFLiPg==", "UuAkgTCoe8aUT9BErxSuPF78", 242);
                            th.getMessage();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return uq;
    }
}
