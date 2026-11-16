package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.CustomRequestHeader;
import com.apm.insight.MonitorCrash;
import com.apm.insight.Npth;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.ra.noq;
import com.bytedance.sdk.component.utils.sx;
import com.bytedance.sdk.openadsdk.core.at;
import com.bytedance.sdk.openadsdk.core.lqi;
import com.bytedance.sdk.openadsdk.core.model.ioy;
import com.bytedance.sdk.openadsdk.core.ra;
import com.bytedance.sdk.openadsdk.core.settings.nu;
import com.bytedance.sdk.openadsdk.core.xh;
import com.bytedance.sdk.openadsdk.lqi.ct;
import com.bytedance.sdk.openadsdk.utils.ftg;
import com.bytedance.sdk.openadsdk.utils.mw;
import com.ironsource.Ba;
import com.ironsource.C4788i2;
import com.ironsource.R6;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import com.singular.sdk.internal.Constants;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.pv1;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class ApmHelper {
    private static String ct;
    private static ahm fi;
    private static boolean noq;
    private static rz yo;
    private static final String[] kgy = {"com.bytedance.sdk.component", "com.bytedance.sdk.mediation", BuildConfig.LIBRARY_PACKAGE_NAME, "com.com.bytedance.overseas.sdk", "com.pgl.ssdk", "com.bykv.vk", "com.iab.omid.library.bytedance2", "com.bytedance.adsdk"};
    private static final String[] ahm = {"libnms.so", "libtobEmbedPagEncrypt.so", "tt_ugen_layout.so"};
    private static volatile boolean rz = false;
    private static final AtomicBoolean uq = new AtomicBoolean(false);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        final String[] ahm;
        final String[] kgy;

        public static kgy kgy() {
            return new kgy(ApmHelper.kgy, ApmHelper.ahm);
        }

        public kgy(String[] strArr, String[] strArr2) {
            this.kgy = strArr;
            this.ahm = strArr2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface rz {
        void kgy(String str, String str2, Throwable th);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ahm {
        public final String ahm;
        public final String kgy;
        public final Throwable rz;

        public ahm(String str, String str2, Throwable th) {
            this.kgy = str;
            this.ahm = str2;
            this.rz = th;
        }
    }

    private static JSONObject ahm(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject3.put("host_app_id", ct);
            jSONObject2.putOpt("custom", jSONObject3);
            jSONObject2.put(R6.F, "Android");
            jSONObject2.put("os_version", Build.VERSION.RELEASE);
            jSONObject2.put("device_model", Build.MODEL);
            jSONObject2.put("device_brand", Build.BRAND);
            jSONObject2.put("sdk_version_name", "0.0.5");
            jSONObject2.put(Ba.b, "10000001");
            jSONObject2.put("update_version_code", BuildConfig.VERSION_CODE);
            jSONObject2.put("bd_did", str);
            jSONObject.putOpt("apm_id", "20000001");
            jSONObject.putOpt("header", jSONObject2);
            jSONObject.putOpt("local_time", Long.valueOf(System.currentTimeMillis()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("local_time_ms", System.currentTimeMillis()));
            jSONObject.putOpt("launch", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07c", "ev4gvQawecKS", "WfskmQeMf/WFW8JYnwWCJ1/3", 359);
            sx.rz("ApmHelper", e.getMessage());
            return jSONObject;
        }
    }

    @NonNull
    public static Pair<String, String> generateRequestHeader() {
        String string = "";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(R6.X0, com.bytedance.sdk.openadsdk.gm.kgy.ahm.kgy.kgy().ahm());
            jSONObject.put("ipv6", com.bytedance.sdk.openadsdk.fpp.uq.kgy.ahm("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, ""));
            jSONObject.put("region", xh.uq().lb());
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07c", "ev4gvQawecKS", "XOsjkBG9fcKyT8ZIiQK0AF7vKZAR", 380);
        }
        JSONObject jSONObjectEncryptType4WithNoWrapBase64 = PangleEncryptManager.encryptType4WithNoWrapBase64(jSONObject, new lqi(PangleEncryptConstant.CryptDataScene.UNKNOWN));
        String str = "0";
        if (jSONObjectEncryptType4WithNoWrapBase64 != null) {
            int iOptInt = jSONObjectEncryptType4WithNoWrapBase64.optInt("cypher");
            if (iOptInt == 4) {
                string = jSONObjectEncryptType4WithNoWrapBase64.optString("message");
                str = "4";
            } else if (iOptInt == 3) {
                string = jSONObjectEncryptType4WithNoWrapBase64.optString("message");
                str = Constants.SdidMigrationStatusCodes.DID_NOT_SEND_START_SESSION_WITH_SDID_YET;
            } else {
                string = jSONObject.toString();
            }
        }
        return new Pair<>(str, string);
    }

    public static boolean isIsInit() {
        return rz;
    }

    private static String[] kgy(JSONArray jSONArray, String[] strArr) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return (String[]) strArr.clone();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String strOptString = jSONArray.optString(i, "");
            if (!TextUtils.isEmpty(strOptString)) {
                String strTrim = strOptString.trim();
                if (!TextUtils.isEmpty(strTrim)) {
                    arrayList.add(strTrim);
                }
            }
        }
        return arrayList.isEmpty() ? (String[]) strArr.clone() : (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> nu() {
        HashMap map = new HashMap();
        map.put("pangle_webview_create_count", String.valueOf(noq.kgy.get()));
        ioy ioyVarFi = com.bytedance.sdk.openadsdk.utils.ahm.fi();
        if (ioyVarFi != null) {
            map.put("adType", String.valueOf(ioyVarFi.ezq()));
            map.put(Ba.b, String.valueOf(ioyVarFi.ol()));
            map.put("cid", ioyVarFi.wzd());
            map.put("reqId", ioyVarFi.wh());
            map.put("rit", ioyVarFi.bmz(C4788i2.f));
            int iIdg = ioyVarFi.idg();
            if (ioyVarFi.yjf() != 2) {
                iIdg = -1;
            }
            map.put("render_type", String.valueOf(iIdg));
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static kgy ra() {
        String strKgy = ct.kgy("apm_crash_package_names", "");
        if (TextUtils.isEmpty(strKgy)) {
            return kgy.kgy();
        }
        try {
            JSONObject jSONObjectJsonObjectInit = PangleNetworkBridge.jsonObjectInit(strKgy);
            return new kgy(kgy(jSONObjectJsonObjectInit.optJSONArray("package_names"), kgy), kgy(jSONObjectJsonObjectInit.optJSONArray("so_list"), ahm));
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07c", "ev4gvQawecKS", "XOs5tBOxStWBWd9wgx+pPFT8HpYMrGw=", Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE);
            return kgy.kgy();
        }
    }

    public static void reportCustomError(String str, String str2, Throwable th) {
        rz rzVar = yo;
        if (rzVar != null) {
            rzVar.kgy(str, str2, th);
        } else {
            fi = new ahm(str, str2, th);
        }
    }

    public static void reportPvFromBackGround() {
        if (noq) {
            ahm(at.kgy(xh.kgy()), ftg.um());
        }
    }

    public static void initAPM() {
        if (!com.bytedance.sdk.openadsdk.common.noq.kgy()) {
            try {
                String strUq = ra.ahm().uq();
                if (TextUtils.isEmpty(strUq)) {
                    return;
                }
                initApm(xh.kgy(), strUq);
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07c", "ev4gvQawecKS", "UuAkgSKMRA==", 95);
            }
        }
    }

    public static void initApm(final Context context, final String str) {
        if (com.bytedance.sdk.openadsdk.core.ra.ahm.kgy().ct() || !uq.compareAndSet(false, true) || rz) {
            return;
        }
        mw.kgy(new com.bytedance.sdk.component.gf.ahm.rz("init-apm") { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1
            @Override // java.lang.Runnable
            public void run() {
                if (!ApmHelper.rz) {
                    nu nuVarUq = xh.uq();
                    boolean unused = ApmHelper.noq = nuVarUq.vf();
                    String strUm = ftg.um();
                    if (ApmHelper.noq && !TextUtils.isEmpty(strUm)) {
                        String unused2 = ApmHelper.ct = str;
                        kgy kgyVarRa = ApmHelper.ra();
                        String[] strArr = kgyVarRa.kgy;
                        String strKgy = at.kgy(context);
                        try {
                            Npth.setCrashWaitTime(ct.kgy("apm_crash_wait_time", 10000));
                            Npth.enableLoopMonitor(false);
                            Npth.enableAnrInfo(false);
                            Npth.enableNativeDump(false);
                            Npth.enableActivityDump(false);
                            Npth.enableMessageDump(false);
                            MonitorCrash.setCustomRequestHeaderCallback(new CustomRequestHeader() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.1
                                @Override // com.apm.insight.CustomRequestHeader
                                public void addRequestHeader(HttpURLConnection httpURLConnection) {
                                    Pair<String, String> pairGenerateRequestHeader = ApmHelper.generateRequestHeader();
                                    httpURLConnection.setRequestProperty("cypher", (String) pairGenerateRequestHeader.first);
                                    httpURLConnection.setRequestProperty("transfer-param", (String) pairGenerateRequestHeader.second);
                                    httpURLConnection.setRequestProperty("x-pangle-target-idc", xh.uq().xxq());
                                }
                            });
                            final MonitorCrash monitorCrashInitSDK = MonitorCrash.initSDK(context, "10000001", 8304L, BuildConfig.VERSION_NAME, strArr);
                            monitorCrashInitSDK.setCustomDataCallback(new AttachUserData() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.2
                                @Override // com.apm.insight.AttachUserData
                                @Nullable
                                public Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                                    Map<? extends String, ? extends String> mapNu = ApmHelper.nu();
                                    boolean zContainsKey = mapNu.containsKey("render_type");
                                    MonitorCrash monitorCrash = monitorCrashInitSDK;
                                    if (zContainsKey) {
                                        monitorCrash.addTags("render_type", mapNu.get("render_type"));
                                        return mapNu;
                                    }
                                    monitorCrash.addTags("render_type", "-2");
                                    return mapNu;
                                }
                            });
                            if (nuVarUq.pxt()) {
                                monitorCrashInitSDK.config().setSoList(kgyVarRa.ahm);
                            }
                            monitorCrashInitSDK.config().setDeviceId(strKgy);
                            monitorCrashInitSDK.setReportUrl(strUm);
                            monitorCrashInitSDK.addTags("host_appid", str);
                            monitorCrashInitSDK.addTags("sdk_version", BuildConfig.VERSION_NAME);
                            rz unused3 = ApmHelper.yo = new rz() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.3
                                @Override // com.bytedance.sdk.openadsdk.ApmHelper.rz
                                public void kgy(String str2, String str3, Throwable th) {
                                    monitorCrashInitSDK.reportCustomErr(str2, str3, th);
                                }
                            };
                            boolean unused4 = ApmHelper.rz = true;
                            ApmHelper.rz(strKgy, strUm);
                            ahm ahmVar = ApmHelper.fi;
                            ahm unused5 = ApmHelper.fi = null;
                            if (ahmVar != null) {
                                ApmHelper.yo.kgy(ahmVar.kgy, ahmVar.ahm, ahmVar.rz);
                            }
                        } catch (Throwable th) {
                            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07c", "ev4gvQawecKSDoY=", "Sfsj", 195);
                            boolean unused6 = ApmHelper.rz = false;
                        }
                    }
                }
                ApmHelper.uq.set(false);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void rz(String str, String str2) {
        ahm(str, str2);
    }

    private static void ahm(String str, String str2) {
        if (com.bytedance.sdk.openadsdk.core.ra.ahm.kgy().ct() || TextUtils.isEmpty(str2)) {
            return;
        }
        String strN = pv1.n("https://", str2, "/monitor/collect/c/session?version_code=8304&device_platform=android&aid=10000001");
        xh.rz().kgy(ahm(str), strN);
    }
}
