package com.bytedance.sdk.openadsdk.component.reward.rz;

import com.bytedance.sdk.openadsdk.core.model.ioy;
import com.bytedance.sdk.openadsdk.core.model.jpc;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.download.Command;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class fi {
    private static Integer ahm;
    private static Boolean kgy;
    private static Integer rz;
    private static Integer uq;

    public static boolean kgy(ioy ioyVar) {
        if (ioyVar == null) {
            return false;
        }
        boolean z = ioyVar.yjf() == 2;
        boolean z2 = ioyVar.idg() == 11;
        boolean zUg = ioyVar.ug();
        jpc jpcVarSt = ioyVar.st();
        return z && z2 && !zUg && !(jpcVarSt != null && (jpcVarSt.kgy() == 1 || jpcVarSt.kgy() == 2));
    }

    public static int fi() {
        if (ahm == null) {
            int iKgy = com.bytedance.sdk.openadsdk.lqi.ct.kgy("unify_web_close_backup_config", "interval", 10000);
            ahm = Integer.valueOf(iKgy > 1000 ? iKgy : 10000);
        }
        return ahm.intValue();
    }

    public static int uq() {
        if (rz == null) {
            int i = 1;
            int iKgy = com.bytedance.sdk.openadsdk.lqi.ct.kgy("unify_web_config", "video_preload_type", 1);
            if (iKgy >= 0 && iKgy <= 2) {
                i = iKgy;
            }
            rz = Integer.valueOf(i);
        }
        return rz.intValue();
    }

    public static boolean yo() {
        if (kgy == null) {
            kgy = Boolean.valueOf(com.bytedance.sdk.openadsdk.lqi.ct.kgy("unify_web_close_backup_config", a.k, 1) == 1);
        }
        return kgy.booleanValue();
    }

    public static boolean ahm() {
        if (kgy() == 1) {
            return true;
        }
        return false;
    }

    public static boolean ct() {
        if (uq() == 1 || uq() == 2) {
            return true;
        }
        return false;
    }

    public static boolean noq() {
        if (uq() == 1) {
            return true;
        }
        return false;
    }

    public static boolean rz() {
        if (kgy() == 2) {
            return true;
        }
        return false;
    }

    public static int kgy() {
        if (uq == null) {
            int i = 2;
            int iKgy = com.bytedance.sdk.openadsdk.lqi.ct.kgy("unify_web_refresh", 2);
            if (iKgy >= 0 && iKgy <= 2) {
                i = iKgy;
            }
            uq = Integer.valueOf(i);
        }
        return uq.intValue();
    }

    public static void kgy(final int i, final String str, final ioy ioyVar, final Map<String, String> map) {
        com.bytedance.sdk.openadsdk.dg.uq.kgy("unify_web_preload_video", false, new com.bytedance.sdk.openadsdk.dg.ahm() { // from class: com.bytedance.sdk.openadsdk.component.reward.rz.fi.1
            @Override // com.bytedance.sdk.openadsdk.dg.ahm
            public com.bytedance.sdk.openadsdk.dg.kgy.rz kgy() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_cache", i);
                jSONObject.put("video_url", str);
                ioy ioyVar2 = ioyVar;
                if (ioyVar2 != null) {
                    jSONObject.put("req_id", ioyVar2.wh());
                }
                Map map2 = map;
                if (map2 != null && !map2.isEmpty()) {
                    jSONObject.put("range", map.get(Command.HTTP_HEADER_RANGE));
                }
                return com.bytedance.sdk.openadsdk.dg.kgy.uq.ahm().kgy("unify_web_preload_video").ahm(jSONObject.toString());
            }
        });
    }
}
