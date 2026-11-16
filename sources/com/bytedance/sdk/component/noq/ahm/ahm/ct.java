package com.bytedance.sdk.component.noq.ahm.ahm;

import com.bytedance.sdk.component.noq.fpp;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ct implements noq {
    @Override // com.bytedance.sdk.component.noq.ahm.ahm.noq
    public boolean kgy(com.bytedance.sdk.component.noq.ahm.rz.rz rzVar, fpp fppVar, com.bytedance.sdk.component.noq.ahm.rz.kgy kgyVar) {
        List<com.bytedance.sdk.component.noq.ahm.rz.rz> copyOnWriteArrayList;
        String strFpp = rzVar.fpp();
        Map<String, List<com.bytedance.sdk.component.noq.ahm.rz.rz>> mapGf = rzVar.dg().gf();
        rzVar.nu();
        rzVar.kgy();
        synchronized (mapGf) {
            try {
                copyOnWriteArrayList = mapGf.get(strFpp);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                    mapGf.put(strFpp, copyOnWriteArrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(rzVar);
            if (copyOnWriteArrayList.size() <= 1) {
                return true;
            }
            rzVar.nu();
            rzVar.kgy();
            return false;
        }
    }

    @Override // com.bytedance.sdk.component.noq.ahm.ahm.noq
    public String kgy() {
        return "check_duplicate";
    }
}
