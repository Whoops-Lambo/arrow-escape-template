package com.bytedance.sdk.openadsdk.dg;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.sx;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.at;
import com.bytedance.sdk.openadsdk.core.kus;
import com.bytedance.sdk.openadsdk.core.model.ioy;
import com.bytedance.sdk.openadsdk.core.xh;
import com.bytedance.sdk.openadsdk.utils.ftg;
import com.bytedance.sdk.openadsdk.utils.mw;
import com.ironsource.C4664b4;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.t;
import com.singular.sdk.internal.Constants;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class uq {
    private static volatile uq kgy;

    public static void uq() {
        kgy("disk_log", false, new ahm() { // from class: com.bytedance.sdk.openadsdk.dg.uq.7
            @Override // com.bytedance.sdk.openadsdk.dg.ahm
            public com.bytedance.sdk.openadsdk.dg.kgy.rz kgy() throws Exception {
                JSONObject jSONObject = new JSONObject();
                File file = new File(CacheDirFactory.getRootDir());
                long j = 0;
                if (file.exists() && file.isDirectory()) {
                    for (File file2 : file.listFiles()) {
                        long jKgy = uq.kgy(file2);
                        j += jKgy;
                        jSONObject.put(file2.getName(), jKgy);
                    }
                }
                if (j < 524288000) {
                    return null;
                }
                return com.bytedance.sdk.openadsdk.dg.kgy.uq.ahm().kgy("disk_log").ahm(jSONObject.toString());
            }
        });
    }

    public void kgy(final JSONObject jSONObject) {
        if (jSONObject == null) {
            sx.kgy("adRevenuePangle", "You must pass adRevenue json to pangle");
            return;
        }
        Object objOpt = jSONObject.opt("device_ad_mediation_platform");
        if (!(objOpt instanceof String) || TextUtils.isEmpty((String) objOpt)) {
            sx.kgy("adRevenuePangle", "You must pass device_ad_mediation_platform to pangle");
        } else {
            sx.kgy("adRevenuePangle", "pangle", "You successfully passed the parameters to pangle. The parameters are:", jSONObject);
            kgy(Constants.ADMON_REVENUE, true, new ahm() { // from class: com.bytedance.sdk.openadsdk.dg.uq.6
                @Override // com.bytedance.sdk.openadsdk.dg.ahm
                public com.bytedance.sdk.openadsdk.dg.kgy.rz kgy() throws Exception {
                    try {
                        jSONObject.put("event", 272);
                        jSONObject.put("uuid", at.rz(xh.kgy()));
                        String strKgy = "";
                        try {
                            if (at.kgy(xh.kgy()) != null) {
                                strKgy = at.kgy(xh.kgy());
                            }
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                        jSONObject.put("device_id", strKgy);
                        jSONObject.put("platform", "android");
                        jSONObject.put("partner", "PangleSDK");
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                    return com.bytedance.sdk.openadsdk.dg.kgy.uq.ahm().kgy(Constants.ADMON_REVENUE).ahm(jSONObject.toString());
                }
            });
        }
    }

    public void rz() {
        kgy("blind_mode_status", true, new ahm() { // from class: com.bytedance.sdk.openadsdk.dg.uq.5
            @Override // com.bytedance.sdk.openadsdk.dg.ahm
            public com.bytedance.sdk.openadsdk.dg.kgy.rz kgy() throws Exception {
                return com.bytedance.sdk.openadsdk.dg.kgy.uq.ahm().kgy("blind_mode_status");
            }
        });
    }

    private uq() {
    }

    public static void ahm(final ioy ioyVar) {
        if (ftg.kgy(ioyVar) != null && !TextUtils.isEmpty(ioyVar.gj())) {
            kgy("download_gecko_start", false, new ahm() { // from class: com.bytedance.sdk.openadsdk.dg.uq.14
                @Override // com.bytedance.sdk.openadsdk.dg.ahm
                @Nullable
                public com.bytedance.sdk.openadsdk.dg.kgy.rz kgy() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("url", ioyVar.wn());
                    jSONObject.put("channel_name", ioyVar.gj());
                    return com.bytedance.sdk.openadsdk.dg.kgy.uq.ahm().kgy("download_gecko_start").kgy(ioyVar.ezq()).ahm(jSONObject.toString());
                }
            });
        }
    }

    private boolean rz(com.bytedance.sdk.openadsdk.dg.kgy.uq uqVar) {
        return uqVar == null;
    }

    public void ahm(final com.bytedance.sdk.openadsdk.dg.kgy.uq uqVar) {
        if (rz(uqVar)) {
            return;
        }
        uqVar.kgy("show_backup_endcard");
        xh.ct().kgy(new ahm() { // from class: com.bytedance.sdk.openadsdk.dg.uq.17
            @Override // com.bytedance.sdk.openadsdk.dg.ahm
            public com.bytedance.sdk.openadsdk.dg.kgy.rz kgy() throws Exception {
                return uqVar;
            }
        });
    }

    public static void ahm() {
        mw.ahm(new com.bytedance.sdk.component.gf.ahm.rz("showFailLog") { // from class: com.bytedance.sdk.openadsdk.dg.uq.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    uq.kgy().kgy("show_fail_log", new JSONObject());
                } catch (Throwable th) {
                    sx.rz("StatsLogManager", th.getMessage());
                }
            }
        });
    }

    public static void kgy(final ioy ioyVar) {
        if (ioyVar == null) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        kgy("bidding_receive", false, new ahm() { // from class: com.bytedance.sdk.openadsdk.dg.uq.1
            @Override // com.bytedance.sdk.openadsdk.dg.ahm
            @Nullable
            public com.bytedance.sdk.openadsdk.dg.kgy.rz kgy() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("reveice_ts", jCurrentTimeMillis);
                if (ioyVar.ezq() == 3) {
                    jSONObject.put("is_icon_only", ioyVar.bmz() ? 1 : 0);
                }
                return com.bytedance.sdk.openadsdk.dg.kgy.uq.ahm().kgy("bidding_receive").ahm(jSONObject.toString());
            }
        });
    }

    public static void kgy(ioy ioyVar, final long j) {
        if (ioyVar == null) {
            return;
        }
        kgy("bidding_load", false, new ahm() { // from class: com.bytedance.sdk.openadsdk.dg.uq.8
            @Override // com.bytedance.sdk.openadsdk.dg.ahm
            @Nullable
            public com.bytedance.sdk.openadsdk.dg.kgy.rz kgy() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j);
                return com.bytedance.sdk.openadsdk.dg.kgy.uq.ahm().kgy("bidding_load").ahm(jSONObject.toString());
            }
        });
    }

    public static void kgy(final String str, final com.bytedance.sdk.openadsdk.uq.ct.ahm.kgy kgyVar) {
        if (kgyVar == null) {
            return;
        }
        kgy(str, false, new ahm() { // from class: com.bytedance.sdk.openadsdk.dg.uq.13
            @Override // com.bytedance.sdk.openadsdk.dg.ahm
            @Nullable
            public com.bytedance.sdk.openadsdk.dg.kgy.rz kgy() throws Exception {
                JSONObject jSONObjectRz = kgyVar.rz();
                if (jSONObjectRz == null) {
                    jSONObjectRz = new JSONObject();
                }
                ioy ioyVarKgy = kgyVar.kgy();
                jSONObjectRz.put("req_id", ioyVarKgy.wh());
                com.bytedance.sdk.openadsdk.uq.ct.ahm.rz rzVarCt = kgyVar.ct();
                if (rzVarCt != null) {
                    rzVarCt.kgy(jSONObjectRz);
                }
                return com.bytedance.sdk.openadsdk.dg.kgy.uq.ahm().kgy(str).kgy(ioyVarKgy.ezq()).ahm(jSONObjectRz.toString());
            }
        });
    }

    public static void kgy(final ioy ioyVar, final JSONObject jSONObject) {
        if (ftg.kgy(ioyVar) == null || TextUtils.isEmpty(ioyVar.gj())) {
            return;
        }
        kgy("download_gecko_end", false, new ahm() { // from class: com.bytedance.sdk.openadsdk.dg.uq.15
            @Override // com.bytedance.sdk.openadsdk.dg.ahm
            @Nullable
            public com.bytedance.sdk.openadsdk.dg.kgy.rz kgy() throws Exception {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", ioyVar.wn());
                jSONObject2.put("channel_name", ioyVar.gj());
                jSONObject2.put("data", jSONObject);
                return com.bytedance.sdk.openadsdk.dg.kgy.uq.ahm().kgy("download_gecko_end").kgy(ioyVar.ezq()).ahm(jSONObject2.toString());
            }
        });
    }

    public void kgy(final com.bytedance.sdk.openadsdk.dg.kgy.uq uqVar) {
        if (rz(uqVar)) {
            return;
        }
        uqVar.kgy("express_ad_render");
        xh.ct().kgy(new ahm() { // from class: com.bytedance.sdk.openadsdk.dg.uq.16
            @Override // com.bytedance.sdk.openadsdk.dg.ahm
            public com.bytedance.sdk.openadsdk.dg.kgy.rz kgy() throws Exception {
                return uqVar;
            }
        });
    }

    public void kgy(final long j, final long j2) {
        final long j3 = j2 - j;
        kgy("general_label", false, new ahm() { // from class: com.bytedance.sdk.openadsdk.dg.uq.2
            @Override // com.bytedance.sdk.openadsdk.dg.ahm
            public com.bytedance.sdk.openadsdk.dg.kgy.rz kgy() throws Exception {
                int i = !kus.ahm.get() ? 1 : 0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("starttime", j);
                    jSONObject.put("endtime", j2);
                    jSONObject.put("start_type", i);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.dg.kgy.uq.ahm().kgy("general_label").fi(String.valueOf(j3)).ahm(jSONObject.toString());
            }
        });
    }

    public void kgy(final String str, final JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            return;
        }
        kgy(str, false, new ahm() { // from class: com.bytedance.sdk.openadsdk.dg.uq.4
            @Override // com.bytedance.sdk.openadsdk.dg.ahm
            public com.bytedance.sdk.openadsdk.dg.kgy.rz kgy() throws Exception {
                return com.bytedance.sdk.openadsdk.dg.kgy.uq.ahm().kgy(str).ahm(jSONObject.toString());
            }
        });
    }

    public static uq kgy() {
        if (kgy == null) {
            synchronized (uq.class) {
                try {
                    if (kgy == null) {
                        kgy = new uq();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kgy;
    }

    public static long kgy(File file) {
        if (file.isFile()) {
            return file.length();
        }
        long jKgy = 0;
        for (File file2 : file.listFiles()) {
            jKgy += kgy(file2);
        }
        return jKgy;
    }

    public static void kgy(String str, boolean z, ahm ahmVar) {
        kgy(str, z, -1, ahmVar);
    }

    public static void kgy(String str, boolean z, int i, ahm ahmVar) {
        if (!TextUtils.isEmpty(str) && rz.kgy(str, i)) {
            xh.ct().kgy(ahmVar, z);
        }
    }

    public static void kgy(long j, long j2, final String str, final int i) {
        if (j == 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        final long j3 = jElapsedRealtime - j;
        final long j4 = jElapsedRealtime - j2;
        final long j5 = j2 - j;
        kgy("ad_show_cost_time", false, new ahm() { // from class: com.bytedance.sdk.openadsdk.dg.uq.9
            @Override // com.bytedance.sdk.openadsdk.dg.ahm
            public com.bytedance.sdk.openadsdk.dg.kgy.rz kgy() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j3);
                jSONObject.put("renderDuration", j4);
                jSONObject.put("showToRenderDuration", j5);
                jSONObject.put("tag", str);
                jSONObject.put("renderType", i);
                return com.bytedance.sdk.openadsdk.dg.kgy.uq.ahm().kgy("ad_show_cost_time").ahm(jSONObject.toString());
            }
        });
    }

    public static void kgy(int i, String str) {
        kgy(i, str, 0, (String) null);
    }

    public static void kgy(final int i, final String str, final int i2, final String str2) {
        kgy("ipv6_req", false, new ahm<com.bytedance.sdk.openadsdk.dg.kgy.rz>() { // from class: com.bytedance.sdk.openadsdk.dg.uq.10
            @Override // com.bytedance.sdk.openadsdk.dg.ahm
            @Nullable
            public com.bytedance.sdk.openadsdk.dg.kgy.rz kgy() throws Exception {
                String str3;
                JSONObject jSONObject = new JSONObject();
                int i3 = i;
                if (i3 == 1) {
                    str3 = "success";
                } else if (i3 == -1) {
                    jSONObject.put(t.d, i2);
                    jSONObject.put("error_msg", str2);
                    str3 = C4664b4.g.e;
                } else {
                    str3 = "start";
                }
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("url", str);
                }
                jSONObject.put("status", str3);
                return com.bytedance.sdk.openadsdk.dg.kgy.uq.ahm().kgy("ipv6_req").ahm(jSONObject.toString());
            }
        });
    }

    public static void kgy(final String str, final boolean z) {
        kgy("img_error_param", false, new ahm() { // from class: com.bytedance.sdk.openadsdk.dg.uq.11
            @Override // com.bytedance.sdk.openadsdk.dg.ahm
            @Nullable
            public com.bytedance.sdk.openadsdk.dg.kgy.rz kgy() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new", z ? 1 : 0);
                    jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, str);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.dg.kgy.uq.ahm().kgy("img_error_param").ahm(jSONObject.toString());
            }
        });
    }

    public static void kgy(final boolean z) {
        kgy("web_container_reuse", false, new ahm() { // from class: com.bytedance.sdk.openadsdk.dg.uq.12
            @Override // com.bytedance.sdk.openadsdk.dg.ahm
            @Nullable
            public com.bytedance.sdk.openadsdk.dg.kgy.rz kgy() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_hit", z ? 1 : 0);
                return com.bytedance.sdk.openadsdk.dg.kgy.uq.ahm().kgy("web_container_reuse").ahm(jSONObject.toString());
            }
        });
    }
}
