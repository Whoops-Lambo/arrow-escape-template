package com.bytedance.adsdk.ugeno.ct.uq;

import android.content.Context;
import defpackage.jc1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class fi extends rz {
    private int at;
    private int nu;
    private int twf;

    @Override // com.bytedance.adsdk.ugeno.ct.uq.rz
    public boolean kgy(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            int iKgy = com.bytedance.adsdk.ugeno.fi.rz.kgy(String.valueOf(objArr[0]), -1);
            int iKgy2 = com.bytedance.adsdk.ugeno.fi.rz.kgy(String.valueOf(objArr[1]), -1);
            int iKgy3 = com.bytedance.adsdk.ugeno.fi.rz.kgy(String.valueOf(objArr[2]), -1);
            Map<String, Object> map = this.ct;
            if (map == null || map.isEmpty()) {
                HashMap map2 = new HashMap();
                jc1.u(iKgy, map2, "fromIndex", iKgy2, "toIndex");
                map2.put("type", Integer.valueOf(iKgy3));
                Iterator<com.bytedance.adsdk.ugeno.ct.yo.kgy> it = this.rz.ahm().iterator();
                while (it.hasNext()) {
                    it.next().ahm(map2);
                }
                this.kgy.kgy(this.ahm, this.noq, this.rz.ahm(), this.rz);
            } else {
                Object obj = this.ct.get("fromIndex");
                if (obj != null) {
                    this.nu = com.bytedance.adsdk.ugeno.fi.rz.kgy(String.valueOf(obj), -1);
                }
                if (this.ct.get("toIndex") != null) {
                    this.at = com.bytedance.adsdk.ugeno.fi.rz.kgy(String.valueOf(this.ct.get("toIndex")), -1);
                }
                if (this.ct.get("type") != null) {
                    this.twf = com.bytedance.adsdk.ugeno.fi.rz.kgy(String.valueOf(this.ct.get("type")), -1);
                }
                if (iKgy == this.nu && iKgy2 == this.at && iKgy3 == this.twf) {
                    this.kgy.kgy(this.ahm, this.noq, this.rz.ahm(), this.rz);
                }
            }
        }
        return false;
    }

    public fi(Context context) {
        super(context);
        this.nu = -1;
        this.at = -1;
        this.twf = -1;
    }
}
