package com.bytedance.sdk.openadsdk.core.nu;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.sx;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.at;
import com.bytedance.sdk.openadsdk.core.kus;
import com.bytedance.sdk.openadsdk.core.ra;
import com.bytedance.sdk.openadsdk.core.settings.nu;
import com.bytedance.sdk.openadsdk.core.xh;
import com.bytedance.sdk.openadsdk.dg.uq;
import com.bytedance.sdk.openadsdk.lqi.ct;
import com.bytedance.sdk.openadsdk.utils.ftg;
import com.mbridge.msdk.MBridgeConstans;
import com.pgl.ssdk.ces.out.PglSSCallBack;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSSManager;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
class kgy {
    private volatile boolean ahm;
    private PglSSManager kgy;
    private volatile boolean rz = true;
    private volatile boolean uq = false;

    public synchronized void kgy() {
        Set<String> setSa;
        if (com.bytedance.sdk.openadsdk.core.ra.ahm.kgy().ct()) {
            return;
        }
        if (!this.ahm) {
            try {
                Context contextKgy = xh.kgy();
                String strUq = ra.ahm().uq();
                if (TextUtils.isEmpty(strUq)) {
                    strUq = ra.kgy(MBridgeConstans.APP_ID, Long.MAX_VALUE);
                }
                if (TextUtils.isEmpty(strUq)) {
                    return;
                }
                String strKgy = at.kgy(contextKgy);
                String strAhm = com.bytedance.sdk.openadsdk.gm.kgy.ahm.kgy.kgy().ahm();
                PglSSConfig pglSSConfigBuild = PglSSConfig.builder().setAppId(strUq).setOVRegionType(2).setAdsdkVersion(BuildConfig.VERSION_NAME).build();
                String strAhm2 = com.bytedance.sdk.openadsdk.fpp.uq.kgy.ahm("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
                HashMap map = new HashMap();
                if (!TextUtils.isEmpty(strAhm2)) {
                    map.put(PglSSConfig.CUSTOMINFO_KEY_IPV6, strAhm2);
                }
                Set<String> setAx = nu.ahm().ax();
                if (setAx != null && !setAx.isEmpty()) {
                    map.put(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, setAx);
                }
                String strUm = ftg.um();
                if (!TextUtils.isEmpty(strUm)) {
                    map.put(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST, strUm);
                }
                if (!com.bytedance.sdk.openadsdk.utils.ahm.ahm() || (setSa = nu.ahm().sa()) == null || setSa.isEmpty()) {
                    map.put(PglSSConfig.CUSTOMINFO_KEY_ADS_URL_BACKUP, new HashSet());
                } else {
                    map.put(PglSSConfig.CUSTOMINFO_KEY_ADS_URL_BACKUP, setSa);
                }
                map.put(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC, nu.ahm().xxq());
                String strKgy2 = ct.kgy(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, "");
                if (!TextUtils.isEmpty(strKgy2)) {
                    map.put(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, strKgy2);
                }
                pglSSConfigBuild.setCustomInfo(map);
                pglSSConfigBuild.setCallBack(new PglSSCallBack() { // from class: com.bytedance.sdk.openadsdk.core.nu.kgy.1
                    @Override // com.pgl.ssdk.ces.out.PglSSCallBack
                    public void reportSoftDecData(final String str, final String str2) {
                        uq.kgy(str, false, new com.bytedance.sdk.openadsdk.dg.ahm() { // from class: com.bytedance.sdk.openadsdk.core.nu.kgy.1.1
                            @Override // com.bytedance.sdk.openadsdk.dg.ahm
                            @Nullable
                            public com.bytedance.sdk.openadsdk.dg.kgy.rz kgy() throws Exception {
                                return com.bytedance.sdk.openadsdk.dg.kgy.uq.ahm().kgy(str).ahm(str2);
                            }
                        });
                    }
                });
                PglSSManager.init(contextKgy, pglSSConfigBuild, null, null, strKgy, strAhm);
                gf();
                this.ahm = true;
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiW", "dt0ekQiVZNeM", "UuAkgQ==", 136);
                ra();
                this.ahm = false;
            }
            try {
                if (this.rz) {
                    rz(PglSSManager.getLoadError());
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiW", "dt0ekQiVZNeM", "UuAkgQ==", 146);
                sx.rz("mssdk", th2.getMessage());
            }
        }
    }

    private boolean fi() {
        if (!this.ahm && this.rz) {
            kgy();
        }
        return this.ahm;
    }

    private void gf() {
        if (this.kgy == null) {
            this.kgy = PglSSManager.getInstance();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    private Class ra() {
        try {
            this.rz = true;
            return PglSSManager.class;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiW", "dt0ekQiVZNeM", "Uv0Amge5ZeKYQ8RJ", 366);
            this.rz = false;
            return PglSSManager.class;
        }
    }

    private void rz(final String str) {
        if (this.uq || TextUtils.isEmpty(str)) {
            return;
        }
        xh.ct().kgy(new com.bytedance.sdk.openadsdk.dg.ahm() { // from class: com.bytedance.sdk.openadsdk.core.nu.kgy.4
            @Override // com.bytedance.sdk.openadsdk.dg.ahm
            public com.bytedance.sdk.openadsdk.dg.kgy.rz kgy() throws Exception {
                return com.bytedance.sdk.openadsdk.dg.kgy.uq.ahm().kgy("secsdk_init_error").ahm(str);
            }
        }, false);
        this.uq = true;
    }

    public int yo() {
        if (this.rz) {
            return PglSSManager.getInitStatus();
        }
        return 5;
    }

    public kgy() {
        kgy();
    }

    public void ahm(String str) {
        if (fi()) {
            gf();
            PglSSManager pglSSManager = this.kgy;
            if (pglSSManager != null) {
                pglSSManager.setDeviceId(str);
            }
        }
    }

    public String ct() {
        if (!fi()) {
            return "";
        }
        gf();
        PglSSManager pglSSManager = this.kgy;
        if (pglSSManager == null) {
            return "";
        }
        return pglSSManager.getSofChara();
    }

    public long noq() {
        if (!fi()) {
            return 0L;
        }
        gf();
        PglSSManager pglSSManager = this.kgy;
        if (pglSSManager == null) {
            return 0L;
        }
        return pglSSManager.getECForBidding();
    }

    public String uq() {
        String strAhm = com.bytedance.sdk.openadsdk.core.rz.kgy().ahm("sec_token", "");
        if (fi()) {
            gf();
            PglSSManager pglSSManager = this.kgy;
            if (pglSSManager != null) {
                String token = pglSSManager.getToken();
                if (!TextUtils.isEmpty(token) && !TextUtils.equals(strAhm, token)) {
                    com.bytedance.sdk.openadsdk.core.rz.kgy().kgy("sec_token", token);
                }
                return token;
            }
        }
        return strAhm;
    }

    public boolean ahm() {
        return this.ahm;
    }

    public void rz() {
        if (fi()) {
            gf();
            if (this.kgy != null) {
                kus.ahm().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nu.kgy.3
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            HashMap map = new HashMap();
                            map.put(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ, xh.uq().gm());
                            kgy.this.kgy.setCustomInfo(map);
                        } catch (Throwable th) {
                            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiW", "dt0ekQiVZNeMDoQ=", "Sfsj", 245);
                            sx.rz("MSSdkImpl", "setCustomInfo", th.getMessage());
                        }
                    }
                });
            }
        }
    }

    public void kgy(String str) {
        if (fi()) {
            gf();
            PglSSManager pglSSManager = this.kgy;
            if (pglSSManager != null) {
                pglSSManager.setGaid(str);
            }
        }
    }

    public void kgy(final Map<String, Object> map) {
        if (fi()) {
            gf();
            if (this.kgy != null) {
                kus.ahm().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nu.kgy.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            kgy.this.kgy.setCustomInfo(map);
                        } catch (Throwable th) {
                            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiW", "dt0ekQiVZNeMDoU=", "Sfsj", Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE);
                            sx.rz("MSSdkImpl", "setCustomInfo", th.getMessage());
                        }
                    }
                });
            }
        }
    }

    public void kgy(String str, Map<String, Object> map) {
        if (fi()) {
            gf();
            PglSSManager pglSSManager = this.kgy;
            if (pglSSManager != null) {
                pglSSManager.reportNow(str, map);
            }
        }
    }

    public void kgy(MotionEvent motionEvent) {
        if (ahm()) {
            gf();
            PglSSManager pglSSManager = this.kgy;
            if (pglSSManager != null) {
                pglSSManager.checkEventVirtual(motionEvent);
            }
        }
    }

    public Map<String, String> kgy(String str, byte[] bArr) {
        Map<String, String> featureHash;
        return (!fi() || (featureHash = this.kgy.getFeatureHash(str, bArr)) == null) ? new HashMap() : featureHash;
    }
}
