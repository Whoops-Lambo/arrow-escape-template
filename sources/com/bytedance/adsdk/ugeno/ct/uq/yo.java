package com.bytedance.adsdk.ugeno.ct.uq;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class yo extends rz {
    @Override // com.bytedance.adsdk.ugeno.ct.uq.rz
    public boolean kgy(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            int iKgy = com.bytedance.adsdk.ugeno.fi.rz.kgy(String.valueOf(objArr[0]), 0);
            Map<String, Object> map = this.ct;
            if (map == null || map.isEmpty()) {
                this.kgy.kgy(this.ahm, this.noq, this.rz.ahm(), this.rz);
            } else {
                Object obj = this.ct.get("type");
                if (iKgy == (obj != null ? com.bytedance.adsdk.ugeno.fi.rz.kgy(String.valueOf(obj), 0) : 0)) {
                    this.kgy.kgy(this.ahm, this.noq, this.rz.ahm(), this.rz);
                }
            }
        }
        return false;
    }

    public yo(Context context) {
        super(context);
    }
}
