package com.bytedance.sdk.openadsdk.utils;

import com.ironsource.mediationsdk.metadata.a;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.SoftReference;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class ahm {
    private static Boolean ahm;
    private static Boolean ct;
    private static Boolean fi;
    private static volatile com.bytedance.sdk.component.fi.rz.ct gf;
    public static SoftReference<com.bytedance.sdk.openadsdk.core.model.ioy> kgy;
    private static Boolean noq;
    private static Boolean rz;
    private static Boolean uq;
    private static Boolean yo;

    public static boolean ahm() {
        try {
            if (rz == null) {
                boolean z = true;
                if (com.bytedance.sdk.openadsdk.lqi.ct.kgy("net_opt_multiple_domain_retry", 0) != 1) {
                    z = false;
                }
                rz = Boolean.valueOf(z);
            }
            return rz.booleanValue();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "euoYgQqweg==", "XuAslw+5RNKMXt5NgBSEJ1bvJJsxuX3VmQ==", 57);
            return false;
        }
    }

    public static boolean ct() {
        try {
            if (noq == null) {
                noq = Boolean.valueOf(com.bytedance.sdk.openadsdk.lqi.ct.kgy("lp_optimize", false));
            }
            return noq.booleanValue();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "euoYgQqweg==", "XuAslw+5R8KXZuc=", 105);
            return false;
        }
    }

    public static boolean noq() {
        try {
            if (yo == null) {
                yo = Boolean.valueOf(com.bytedance.sdk.openadsdk.lqi.ct.kgy("iab_history_v2_enabled", false));
            }
            return yo.booleanValue();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "euoYgQqweg==", "Uv0ElAGUYNSURcVEukOFJlrsIZAH", Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
            return false;
        }
    }

    public static boolean rz() {
        try {
            if (uq == null) {
                boolean z = true;
                if (com.bytedance.sdk.openadsdk.lqi.ct.kgy("iv_rv_load_show_new", 0) != 1) {
                    z = false;
                }
                uq = Boolean.valueOf(z);
            }
            return uq.booleanValue();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "euoYgQqweg==", "XuAslw+5RciBTvZZohS3", 73);
            return false;
        }
    }

    public static boolean uq() {
        try {
            if (ct == null) {
                ct = Boolean.valueOf(com.bytedance.sdk.openadsdk.lqi.ct.kgy("lp_redirect_monitor", false));
            }
            return ct.booleanValue();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "euoYgQqweg==", "Uv0Amg21fciSb9lcjh2lLA==", 88);
            return false;
        }
    }

    public static boolean yo() {
        try {
            if (fi == null) {
                fi = Boolean.valueOf(com.bytedance.sdk.openadsdk.lqi.ct.kgy("progress_bar_fix", 0) == 1);
            }
            return fi.booleanValue();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "euoYgQqweg==", "XuAslw+5WdWPTcVYnwKCKUnIJI0=", 129);
            return true;
        }
    }

    public static com.bytedance.sdk.openadsdk.core.model.ioy fi() {
        SoftReference<com.bytedance.sdk.openadsdk.core.model.ioy> softReference = kgy;
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    public static com.bytedance.sdk.component.fi.rz.ct gf() {
        if (gf != null) {
            return gf;
        }
        com.bytedance.sdk.component.fi.rz.ct ctVar = new com.bytedance.sdk.component.fi.rz.ct();
        try {
            JSONObject jSONObject = (JSONObject) com.bytedance.sdk.openadsdk.lqi.ct.kgy("net_multi_domain_config", (Object) null, com.bytedance.sdk.openadsdk.lqi.ahm.kgy);
            if (jSONObject != null) {
                ctVar.kgy = jSONObject.optInt(a.k, 0) == 1;
                ctVar.ahm = jSONObject.optInt("fail_count", 10);
                ctVar.rz = jSONObject.optLong("interval", 1800000L);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "euoYgQqweg==", "XOs5uwaoTciNS95Trx6uLlLp", 177);
            th.getMessage();
        }
        gf = ctVar;
        Objects.toString(gf);
        return gf;
    }

    public static boolean kgy() {
        if (ahm == null) {
            try {
                ahm = Boolean.valueOf(com.bytedance.sdk.openadsdk.lqi.ct.kgy("stability_sinking", 0) == 1);
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "euoYgQqweg==", "Uv0PgBCRZsmJXthPqR+hKlfrKQ==", 36);
                ahm = Boolean.FALSE;
            }
        }
        return ahm.booleanValue();
    }

    public static void kgy(com.bytedance.sdk.openadsdk.core.model.ioy ioyVar) {
        if (ioyVar == null) {
            return;
        }
        kgy = new SoftReference<>(ioyVar);
    }
}
