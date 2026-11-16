package com.bytedance.sdk.openadsdk.core.at.ahm.ct;

import android.content.Context;
import android.util.Log;
import com.bytedance.adsdk.ugeno.ct.at;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class ahm extends com.bytedance.adsdk.ugeno.ct.uq.rz {
    private boolean at;
    private float nu;

    @Override // com.bytedance.adsdk.ugeno.ct.uq.rz
    public boolean kgy(Object... objArr) {
        if (objArr != null && objArr.length >= 2) {
            if (com.bytedance.adsdk.ugeno.fi.rz.kgy(String.valueOf(objArr[1]), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                at atVar = this.kgy;
                if (atVar != null && !this.at) {
                    this.at = true;
                    atVar.kgy(this.ahm, this.noq, this.rz.ahm(), this.rz);
                }
                return true;
            }
            Object obj = this.ct.get("rate");
            if (obj != null) {
                this.nu = com.bytedance.adsdk.ugeno.fi.rz.kgy(String.valueOf(obj), 100);
            }
            float fKgy = com.bytedance.adsdk.ugeno.fi.rz.kgy(String.valueOf(objArr[0]), 100.0f);
            Log.d("UGBaseEventMonitor", "monitor: progress=" + fKgy + " mTargetProgress=" + this.nu);
            if (fKgy >= this.nu) {
                at atVar2 = this.kgy;
                if (atVar2 != null && !this.at) {
                    this.at = true;
                    atVar2.kgy(this.ahm, this.noq, this.rz.ahm(), this.rz);
                }
                return true;
            }
        }
        return false;
    }

    public ahm(Context context) {
        super(context);
        this.nu = 100.0f;
    }
}
