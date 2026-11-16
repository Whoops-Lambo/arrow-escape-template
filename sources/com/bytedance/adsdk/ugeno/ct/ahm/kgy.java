package com.bytedance.adsdk.ugeno.ct.ahm;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.ct.yo;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class kgy {
    public static final HashSet<String> kgy = new HashSet<>(Arrays.asList("convert", "dislike", "openAppPermission", "openAppPolicy", "openPrivacy", "openAppFunction", CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "skip", "videoControl", "pauseVideo", "resumeVideo", FyberMediationAdapter.KEY_MUTE_VIDEO, "preventEvent"));
    protected yo.kgy ahm;
    protected String ct;
    protected String fi;
    protected Map<String, Object> noq;
    protected com.bytedance.adsdk.ugeno.ahm.rz rz;
    protected String uq;
    protected String yo;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ct.ahm.kgy$kgy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class C0191kgy {
        public static kgy kgy(com.bytedance.adsdk.ugeno.ahm.rz rzVar, String str, yo.kgy kgyVar) {
            if (kgyVar == null) {
                return null;
            }
            com.bytedance.adsdk.ugeno.ct.ahm ahmVarKgy = com.bytedance.adsdk.ugeno.ct.uq.kgy(kgyVar.ahm());
            if (ahmVarKgy == null && (TextUtils.isEmpty(kgyVar.kgy()) || !TextUtils.equals(kgyVar.kgy(), "global"))) {
                ahmVarKgy = com.bytedance.adsdk.ugeno.ct.uq.kgy(kgyVar.ct());
            }
            if (ahmVarKgy == null) {
                return new rz(rzVar, str, kgyVar);
            }
            kgy kgyVarKgy = ahmVarKgy.kgy(rzVar, str, kgyVar);
            return kgyVarKgy == null ? new rz(rzVar, str, kgyVar) : kgyVarKgy;
        }
    }

    public abstract void kgy();

    private void ct() {
        yo.kgy kgyVar = this.ahm;
        if (kgyVar == null) {
            return;
        }
        this.uq = kgyVar.kgy();
        this.ct = this.ahm.ahm();
        Map<String, Object> mapRz = this.ahm.rz();
        this.noq = mapRz;
        if (mapRz == null || mapRz.isEmpty() || !this.noq.containsKey("emitCustomEvent") || !(this.noq.get("emitCustomEvent") instanceof String)) {
            return;
        }
        this.fi = (String) this.noq.get("emitCustomEvent");
    }

    public boolean uq() {
        return !TextUtils.isEmpty(this.fi);
    }

    public kgy(com.bytedance.adsdk.ugeno.ahm.rz rzVar, String str, yo.kgy kgyVar) {
        this.rz = rzVar;
        this.ahm = kgyVar;
        this.yo = str;
        ct();
    }

    public void ahm() {
        rz();
    }

    public void rz() {
        if (uq()) {
            yo.kgy kgyVar = new yo.kgy();
            kgyVar.kgy("custom");
            kgyVar.ahm("emit");
            HashMap map = new HashMap();
            map.put("name", this.fi);
            kgyVar.kgy(map);
            new ahm(this.rz, this.ct, kgyVar).kgy();
        }
    }
}
