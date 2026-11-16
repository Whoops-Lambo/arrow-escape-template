package com.bytedance.sdk.openadsdk.core.at.ct.ahm;

import android.content.Context;
import com.bytedance.adsdk.ugeno.ct.at;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class kgy extends com.bytedance.adsdk.ugeno.ct.uq.rz {
    private boolean nu;

    @Override // com.bytedance.adsdk.ugeno.ct.uq.rz
    public boolean kgy(Object... objArr) {
        Map<String, Object> map = this.ct;
        if (map != null && !map.isEmpty()) {
            try {
                Object obj = objArr[0];
                if (obj == null) {
                    return false;
                }
                int iKgy = com.bytedance.adsdk.ugeno.fi.rz.kgy(obj.toString(), -1);
                if (this.ct.containsKey("remainingSeconds")) {
                    Object obj2 = this.ct.get("remainingSeconds");
                    int iKgy2 = obj2 != null ? com.bytedance.adsdk.ugeno.fi.rz.kgy(String.valueOf(obj2), -1) : -1;
                    if ((iKgy == 0 || (iKgy2 >= 0 && iKgy == iKgy2)) && !this.nu) {
                        this.nu = true;
                        at atVar = this.kgy;
                        if (atVar != null) {
                            atVar.kgy(this.ahm, this.noq, this.rz.ahm(), this.rz);
                        }
                    }
                }
                return true;
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+yqQDfJs0YVEwxOBHq4hT+E/", "bskOmhayfeOPXdlwgx+pPFT8", "VuEjnBezew==", 52);
            }
        }
        return false;
    }

    public kgy(Context context) {
        super(context);
    }
}
