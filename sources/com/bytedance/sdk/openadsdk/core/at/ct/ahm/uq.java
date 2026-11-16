package com.bytedance.sdk.openadsdk.core.at.ct.ahm;

import android.content.Context;
import com.bytedance.adsdk.ugeno.ct.at;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class uq extends com.bytedance.adsdk.ugeno.ct.uq.rz {
    private boolean nu;

    @Override // com.bytedance.adsdk.ugeno.ct.uq.rz
    public boolean kgy(Object... objArr) {
        Map<String, Object> map = this.ct;
        if (map == null || map.isEmpty()) {
            return false;
        }
        long jLongValue = ((Long) objArr[0]).longValue() / 1000;
        long jLongValue2 = ((Long) objArr[1]).longValue() / 1000;
        if (jLongValue <= 0) {
            this.nu = false;
        }
        boolean zContainsKey = this.ct.containsKey("percent");
        Map<String, Object> map2 = this.ct;
        if (zContainsKey) {
            Object obj = map2.get("percent");
            float fKgy = obj != null ? com.bytedance.adsdk.ugeno.fi.rz.kgy(String.valueOf(obj), -1.0f) : -1.0f;
            if (fKgy >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && jLongValue >= (fKgy / 100.0f) * jLongValue2 && !this.nu) {
                this.nu = true;
                at atVar = this.kgy;
                if (atVar != null) {
                    atVar.kgy(this.ahm, this.noq, this.rz.ahm(), this.rz);
                }
            }
        } else {
            boolean zContainsKey2 = map2.containsKey("remainingSeconds");
            Map<String, Object> map3 = this.ct;
            if (zContainsKey2) {
                Object obj2 = map3.get("remainingSeconds");
                int iKgy = obj2 != null ? com.bytedance.adsdk.ugeno.fi.rz.kgy(String.valueOf(obj2), -1) : -1;
                long j = jLongValue2 - jLongValue;
                if (iKgy >= 0 && j <= iKgy && !this.nu) {
                    this.nu = true;
                    at atVar2 = this.kgy;
                    if (atVar2 != null) {
                        atVar2.kgy(this.ahm, this.noq, this.rz.ahm(), this.rz);
                    }
                }
            } else {
                Object obj3 = map3.get("interval");
                if (jLongValue >= (obj3 != null ? com.bytedance.adsdk.ugeno.fi.rz.kgy(String.valueOf(obj3), -1) : -1) && !this.nu) {
                    this.nu = true;
                    at atVar3 = this.kgy;
                    if (atVar3 != null) {
                        atVar3.kgy(this.ahm, this.noq, this.rz.ahm(), this.rz);
                    }
                }
            }
        }
        return true;
    }

    public uq(Context context) {
        super(context);
    }
}
