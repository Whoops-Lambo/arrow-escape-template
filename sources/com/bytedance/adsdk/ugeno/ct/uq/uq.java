package com.bytedance.adsdk.ugeno.ct.uq;

import android.content.Context;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class uq extends rz implements com.bytedance.adsdk.ugeno.ct.kgy.uq {
    private com.bytedance.adsdk.ugeno.ct.kgy.rz nu;

    @Override // com.bytedance.adsdk.ugeno.ct.uq.rz
    public boolean kgy(Object... objArr) {
        com.bytedance.adsdk.ugeno.ct.kgy.kgy kgyVarGbb = this.ahm.gbb();
        if (kgyVarGbb == null) {
            return false;
        }
        com.bytedance.adsdk.ugeno.ct.kgy.rz rzVarKgy = kgyVarGbb.kgy(this.noq);
        this.nu = rzVarKgy;
        if (rzVarKgy != null) {
            rzVarKgy.kgy(this);
            return false;
        }
        kgyVarGbb.kgy(this.noq, new com.bytedance.adsdk.ugeno.ct.kgy.ahm());
        return false;
    }

    public uq(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.ct.kgy.uq
    public void kgy(String str) {
        Log.d("UGBaseEventMonitor", "receive: ");
        this.kgy.kgy(this.ahm, this.noq, this.rz.ahm(), this.rz);
    }
}
