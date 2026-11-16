package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.init.PAGBidCallback;
import com.bytedance.sdk.openadsdk.api.init.PAGBidError;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.ftg;
import com.bytedance.sdk.openadsdk.utils.gbb;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.ironsource.R6;
import com.mbridge.msdk.playercommon.PlayerErrorConstant;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class uq extends ikw {
    private static volatile ArrayList<String> kgy;
    private int ahm = 12288;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy extends JSONObject {
        private ArrayList<String> kgy;

        public ArrayList<String> kgy() {
            return this.kgy;
        }

        @Override // org.json.JSONObject
        @NonNull
        public JSONObject put(@NonNull String str, boolean z) throws JSONException {
            ArrayList<String> arrayList = this.kgy;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, z);
        }

        @Override // org.json.JSONObject
        @NonNull
        public JSONObject putOpt(@Nullable String str, @Nullable Object obj) throws JSONException {
            ArrayList<String> arrayList = this.kgy;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.putOpt(str, obj);
        }

        public kgy(boolean z) {
            if (z) {
                this.kgy = new ArrayList<>();
            }
        }

        @Override // org.json.JSONObject
        @NonNull
        public JSONObject put(@NonNull String str, double d) throws JSONException {
            ArrayList<String> arrayList = this.kgy;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, d);
        }

        @Override // org.json.JSONObject
        @NonNull
        public JSONObject put(@NonNull String str, int i) throws JSONException {
            ArrayList<String> arrayList = this.kgy;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, i);
        }

        @Override // org.json.JSONObject
        @NonNull
        public JSONObject put(@NonNull String str, long j) throws JSONException {
            ArrayList<String> arrayList = this.kgy;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, j);
        }

        @Override // org.json.JSONObject
        @NonNull
        public JSONObject put(@NonNull String str, @Nullable Object obj) throws JSONException {
            ArrayList<String> arrayList = this.kgy;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, obj);
        }
    }

    private void ct() {
        JSONObject jSONObject = (JSONObject) com.bytedance.sdk.openadsdk.lqi.ct.kgy("bid_tok_con", (Object) null, com.bytedance.sdk.openadsdk.lqi.ahm.kgy);
        if (jSONObject == null) {
            return;
        }
        this.ahm = jSONObject.optInt("en_m_l", this.ahm);
    }

    private void fi(final String str) {
        try {
            com.bytedance.sdk.openadsdk.um.rz.kgy(new com.bytedance.sdk.openadsdk.um.uq() { // from class: com.bytedance.sdk.openadsdk.core.uq.2
                @Override // com.bytedance.sdk.openadsdk.um.uq
                public com.bytedance.sdk.openadsdk.um.ahm.kgy kgy() {
                    com.bytedance.sdk.openadsdk.um.ahm.kgy kgyVar = new com.bytedance.sdk.openadsdk.um.ahm.kgy();
                    kgyVar.ahm("bidding_token");
                    kgyVar.ct("new");
                    kgyVar.yo(uq.this.ra(str).toString());
                    return kgyVar;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "eecpkQqybvOPQdJTqxSuLUnvOZoR", "Ses9mhGoXciLT9lumBCyPA==", 203);
            com.bytedance.sdk.component.utils.sx.rz("BiddingTokenGenerator", th.getMessage());
        }
    }

    private void gf(final String str) {
        try {
            com.bytedance.sdk.openadsdk.um.rz.ahm(new com.bytedance.sdk.openadsdk.um.uq() { // from class: com.bytedance.sdk.openadsdk.core.uq.3
                @Override // com.bytedance.sdk.openadsdk.um.uq
                public com.bytedance.sdk.openadsdk.um.ahm.kgy kgy() {
                    com.bytedance.sdk.openadsdk.um.ahm.kgy kgyVar = new com.bytedance.sdk.openadsdk.um.ahm.kgy();
                    kgyVar.ahm("bidding_token");
                    kgyVar.ct("new");
                    kgyVar.yo(uq.this.ra(str).toString());
                    return kgyVar;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "eecpkQqybvOPQdJTqxSuLUnvOZoR", "Ses9mhGoXciLT9lumRKjLUj9", Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);
            com.bytedance.sdk.component.utils.sx.rz("BiddingTokenGenerator", th.getMessage());
        }
    }

    private static void kgy(JSONObject jSONObject, PAGBiddingRequest pAGBiddingRequest, String str) throws Throwable {
        jSONObject.put("is_init", kus.ct() ? 1 : 0);
        String strGf = xh.uq().gf();
        String strWy = xh.uq().wy();
        if (strGf != null && strWy != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("version", strGf);
            jSONObject2.put("param", strWy);
            jSONObject.put("abtest", jSONObject2);
        }
        jSONObject.put("language", at.ahm());
        jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
        jSONObject.put("package_name", ftg.noq());
        if (pAGBiddingRequest != null) {
            jSONObject.put("user_data", ioy.kgy(TextUtils.isEmpty(pAGBiddingRequest.getSlotId()) ? null : new AdSlot.Builder().setCodeId(pAGBiddingRequest.getSlotId()).build()));
        }
        jSONObject.put("ts", System.currentTimeMillis() / 1000);
        String strAhm = com.bytedance.sdk.openadsdk.fpp.uq.kgy.ahm("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
        if (strAhm.isEmpty()) {
            String strAhm2 = com.bytedance.sdk.openadsdk.fpp.uq.kgy.ahm("ttopenadsdk", "key_ipv4", "");
            if (!strAhm2.isEmpty()) {
                jSONObject.put("ipv4", strAhm2);
            }
        } else {
            jSONObject.put("ipv6", strAhm);
        }
        jSONObject.put("adx_id", str);
        jSONObject.put("target_region", xh.uq().xxq());
        com.bytedance.sdk.openadsdk.gm.kgy.ahm.kgy.kgy().kgy(jSONObject);
        String strKgy = at.kgy(xh.kgy());
        if (!TextUtils.isEmpty(strKgy)) {
            try {
                jSONObject.put("did", Long.parseLong(strKgy));
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "eecpkQqybvOPQdJTqxSuLUnvOZoR", "WuopsQKoaPOPaN5ZiBiuL2/hJpAN", Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
            }
        }
        if (pAGBiddingRequest != null) {
            jSONObject.put("banner", ikw.kgy(pAGBiddingRequest));
        }
        com.bytedance.sdk.openadsdk.core.settings.nu nuVarUq = xh.uq();
        jSONObject.put("app_reg", com.bytedance.sdk.openadsdk.core.ra.ahm.kgy().noq() ? 1 : 0);
        Context contextKgy = xh.kgy();
        jSONObject.put("apk-sign", com.bytedance.sdk.openadsdk.common.rz.gf());
        jSONObject.put("screen_scale", gbb.yo(contextKgy));
        jSONObject.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.uq.ahm());
        jSONObject.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.uq.rz());
        jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.uq.uq());
        jSONObject.put("app_running_time", (System.currentTimeMillis() - kus.kgy()) / 1000);
        jSONObject.put("js_render_ver", com.bytedance.sdk.openadsdk.core.gf.ra.rz());
        jSONObject.put("js_render_v3_ver", com.bytedance.sdk.openadsdk.core.gf.ra.uq());
        jSONObject.put("gp_v_name", DeviceUtils.ct(contextKgy));
        jSONObject.put("gp_v_code", DeviceUtils.noq(contextKgy));
        jSONObject.put("vendor", Build.MANUFACTURER);
        jSONObject.put(R6.B, Build.MODEL);
        jSONObject.put("user_agent_device", ftg.ahm());
        jSONObject.put("user_agent_webview", ftg.uq());
        jSONObject.put("sys_compiling_time", at.ahm(contextKgy));
        jSONObject.put("screen_height", gbb.noq(contextKgy));
        jSONObject.put("screen_width", gbb.uq(contextKgy));
        jSONObject.put("rom_version", com.bytedance.sdk.openadsdk.utils.wy.kgy());
        jSONObject.put("carrier_name", com.bytedance.sdk.openadsdk.utils.vg.kgy());
        jSONObject.put("os_version", Build.VERSION.RELEASE);
        jSONObject.put("conn_type", ftg.yo(contextKgy));
        if (nuVarUq.wy("boot")) {
            jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
        }
        ftg.kgy(jSONObject);
        jSONObject.put("board", Build.BOARD);
        jSONObject.put("timezone", ftg.ft());
        jSONObject.put("device_city", ftg.lqi());
        jSONObject.put("cpu_num", com.bytedance.sdk.openadsdk.utils.ra.ahm());
        jSONObject.put("density", gbb.gf(contextKgy));
        DeviceUtils.kgy(jSONObject);
        com.bytedance.sdk.openadsdk.core.nu.rz.kgy(jSONObject);
        com.bytedance.sdk.openadsdk.utils.fi.kgy(jSONObject, contextKgy);
        jSONObject.put("is_multi", !com.bytedance.sdk.component.utils.gm.kgy(contextKgy));
        com.bytedance.sdk.openadsdk.utils.fi.ahm(jSONObject, contextKgy);
        com.bytedance.sdk.openadsdk.noq.ahm.kgy().kgy(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject ra(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("adx_id", str);
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "eecpkQqybvOPQdJTqxSuLUnvOZoR", "XOsjkBG9fcKlUsNPjQ==", 229);
            return jSONObject;
        }
    }

    private void yo(final String str) {
        try {
            com.bytedance.sdk.openadsdk.um.rz.rz(new com.bytedance.sdk.openadsdk.um.uq() { // from class: com.bytedance.sdk.openadsdk.core.uq.1
                @Override // com.bytedance.sdk.openadsdk.um.uq
                public com.bytedance.sdk.openadsdk.um.ahm.kgy kgy() {
                    com.bytedance.sdk.openadsdk.um.ahm.kgy kgyVar = new com.bytedance.sdk.openadsdk.um.ahm.kgy();
                    kgyVar.ahm("bidding_token");
                    kgyVar.ct("new");
                    kgyVar.yo(uq.this.ra(str).toString());
                    return kgyVar;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "eecpkQqybvOPQdJTqxSuLUnvOZoR", "Ses9mhGoXciLT9l7jRis", 186);
            com.bytedance.sdk.component.utils.sx.rz("BiddingTokenGenerator", th.getMessage());
        }
    }

    private void kgy(final int i, final int i2, final String str, final String str2) {
        com.bytedance.sdk.openadsdk.dg.uq.kgy("bid_tok_len_over_lim", false, new com.bytedance.sdk.openadsdk.dg.ahm() { // from class: com.bytedance.sdk.openadsdk.core.uq.4
            @Override // com.bytedance.sdk.openadsdk.dg.ahm
            @Nullable
            public com.bytedance.sdk.openadsdk.dg.kgy.rz kgy() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("len_bef_rm", i);
                jSONObject.put("len_af_rm", i2);
                jSONObject.put("len_lm", uq.this.ahm);
                jSONObject.put("re_f_key", str2);
                jSONObject.put("adx_id", str);
                return com.bytedance.sdk.openadsdk.dg.kgy.uq.ahm().kgy("bid_tok_len_over_lim").ahm(jSONObject.toString());
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.vg
    public void kgy(PAGBiddingRequest pAGBiddingRequest, PAGBidCallback pAGBidCallback) {
        PAGBidError pAGBidError;
        int length;
        String adxId = "";
        try {
            ct();
            if (pAGBidCallback == null) {
                return;
            }
            ftg.at("getBiddingToken");
            if (pAGBiddingRequest != null && pAGBiddingRequest.getAdxId() != null) {
                adxId = pAGBiddingRequest.getAdxId();
            }
            fi(adxId);
            String strJc = xh.uq().jc();
            String str = null;
            if (!com.bytedance.sdk.openadsdk.core.ra.ahm.kgy().noq()) {
                pAGBidError = new PAGBidError(40060, gf.kgy(40060));
            } else if (com.bytedance.sdk.openadsdk.core.ra.ahm.kgy().uq()) {
                pAGBidError = new PAGBidError(10007, gf.kgy(10007));
            } else if (!com.bytedance.sdk.openadsdk.core.ra.ahm.kgy().gf()) {
                pAGBidError = new PAGBidError(10008, gf.kgy(10008));
            } else if (TextUtils.isEmpty(strJc)) {
                pAGBidError = new PAGBidError(10011, gf.kgy(10011));
                kgy(5, pAGBiddingRequest);
            } else if (!ikw.noq(strJc) || xh.uq().uf(adxId)) {
                pAGBidError = null;
            } else {
                pAGBidError = new PAGBidError(GamesActivityResultCodes.RESULT_NETWORK_FAILURE, gf.kgy(GamesActivityResultCodes.RESULT_NETWORK_FAILURE));
                kgy(2, pAGBiddingRequest);
            }
            if (pAGBidError != null) {
                pAGBidCallback.onBiddingTokenFailed(pAGBidError);
                yo(adxId);
                return;
            }
            if (com.bytedance.sdk.openadsdk.core.ra.ahm.kgy().nu() && ra.ahm().twf()) {
                pAGBidCallback.onBiddingTokenFailed(new PAGBidError(GamesActivityResultCodes.RESULT_APP_MISCONFIGURED, gf.kgy(GamesActivityResultCodes.RESULT_APP_MISCONFIGURED)));
                yo(adxId);
                kgy(3, pAGBiddingRequest);
                return;
            }
            com.bytedance.sdk.openadsdk.core.nu.rz.kgy();
            kgy kgyVar = new kgy(kgy == null);
            kgy(kgyVar, pAGBiddingRequest, adxId);
            ArrayList<String> arrayListKgy = kgyVar.kgy();
            if (arrayListKgy != null) {
                kgy = arrayListKgy;
            }
            JSONObject jSONObjectKgy = ikw.kgy(kgyVar);
            int i = -1;
            int size = kgy != null ? kgy.size() - 1 : -1;
            while (true) {
                length = jSONObjectKgy.toString().getBytes().length;
                if (length > this.ahm) {
                    if (i < 0) {
                        i = length;
                    }
                    if (size < 0) {
                        break;
                    }
                    str = kgy.get(size);
                    kgyVar.remove(str);
                    size--;
                    jSONObjectKgy = ikw.kgy(kgyVar);
                } else {
                    break;
                }
            }
            if (jSONObjectKgy.length() > 0) {
                jSONObjectKgy.put("target_region", xh.uq().xxq());
            }
            pAGBidCallback.onBiddingTokenCollected(jSONObjectKgy.toString());
            gf(adxId);
            if (i >= 0) {
                kgy(i, length, adxId, str);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "eecpkQqybvOPQdJTqxSuLUnvOZoR", "XOs5twq4bc6OTeNShxSu", 386);
            pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10010, PlayerErrorConstant.UNKNOW_ERROR));
            kgy(4, pAGBiddingRequest);
            yo("");
        }
    }
}
