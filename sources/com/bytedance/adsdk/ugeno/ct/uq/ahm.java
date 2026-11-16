package com.bytedance.adsdk.ugeno.ct.uq;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.ct.dg;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class ahm extends rz implements com.bytedance.adsdk.ugeno.kgy.ahm {
    private String nu;

    private boolean gf() {
        dg dgVarRz;
        com.bytedance.adsdk.ugeno.ahm.rz rzVar = this.ahm;
        return (rzVar == null || rzVar.mca() == null || (dgVarRz = this.ahm.mca().rz()) == null || !dgVarRz.kgy("animateState", "")) ? false : true;
    }

    @Override // com.bytedance.adsdk.ugeno.ct.uq.rz
    public boolean kgy(Object... objArr) {
        Object obj;
        com.bytedance.adsdk.ugeno.ahm.rz rzVarGf;
        com.bytedance.adsdk.ugeno.kgy.kgy kgyVarTwf;
        Map<String, Object> map = this.ct;
        if (map == null || map.size() <= 0 || (obj = this.ct.get("name")) == null) {
            return false;
        }
        String strValueOf = String.valueOf(obj);
        if (TextUtils.isEmpty(strValueOf)) {
            return false;
        }
        Object obj2 = this.ct.get("state");
        if (obj2 != null) {
            this.nu = String.valueOf(obj2);
        }
        com.bytedance.adsdk.ugeno.ahm.rz rzVar = this.ahm;
        com.bytedance.adsdk.ugeno.ahm.rz rzVarAhm = rzVar.ahm(rzVar);
        if (rzVarAhm != null && (rzVarGf = rzVarAhm.gf(strValueOf)) != null && (kgyVarTwf = rzVarGf.twf(strValueOf)) != null) {
            kgyVarTwf.kgy(this);
        }
        return false;
    }

    public ahm(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.ahm
    public void ahm() {
        com.bytedance.adsdk.ugeno.ct.at atVar;
        if (!gf()) {
            if ((TextUtils.equals(this.nu, CampaignEx.JSON_NATIVE_VIDEO_COMPLETE) || TextUtils.isEmpty(this.nu)) && (atVar = this.kgy) != null) {
                atVar.kgy(this.ahm, this.noq, this.rz.ahm(), this.rz);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.ahm
    public void kgy() {
        com.bytedance.adsdk.ugeno.ct.at atVar;
        if (gf()) {
            return;
        }
        if ((TextUtils.equals(this.nu, "start") || TextUtils.isEmpty(this.nu)) && (atVar = this.kgy) != null) {
            atVar.kgy(this.ahm, this.noq, this.rz.ahm(), this.rz);
        }
    }
}
