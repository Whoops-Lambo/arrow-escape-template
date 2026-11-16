package com.bytedance.sdk.component.noq.ahm.ahm;

import android.text.TextUtils;
import com.bytedance.sdk.component.noq.fpp;
import com.bytedance.sdk.component.utils.dg;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ahm implements noq {
    @Override // com.bytedance.sdk.component.noq.ahm.ahm.noq
    public boolean kgy(com.bytedance.sdk.component.noq.ahm.rz.rz rzVar, fpp fppVar, com.bytedance.sdk.component.noq.ahm.rz.kgy kgyVar) {
        if (TextUtils.isEmpty(rzVar.fi())) {
            String strKgy = kgy(rzVar);
            rzVar.ahm(strKgy);
            rzVar.kgy(strKgy);
        }
        rzVar.kgy();
        return true;
    }

    @Override // com.bytedance.sdk.component.noq.ahm.ahm.noq
    public String kgy() {
        return "generate_key";
    }

    private String kgy(com.bytedance.sdk.component.noq.ahm.rz.rz rzVar) {
        return dg.kgy(rzVar.kgy());
    }
}
