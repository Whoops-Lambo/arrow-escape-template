package com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy;

import android.content.Context;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class uq extends kgy {
    @Override // com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.kgy
    public byte uq() {
        return (byte) 0;
    }

    public static String rz(String str) {
        return pv1.n("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }

    public uq(Context context, com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy kgyVar) {
        super(context, kgyVar);
    }

    @Override // com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.kgy, com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.rz
    public String ahm() {
        com.bytedance.sdk.component.yo.kgy.kgy.ct ctVarRz = com.bytedance.sdk.component.yo.kgy.yo.noq().rz();
        if (ctVarRz != null) {
            return ctVarRz.kgy();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.rz
    public long noq() {
        return com.bytedance.sdk.component.yo.kgy.yo.kgy.ahm();
    }

    @Override // com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.kgy
    public byte rz() {
        return (byte) 1;
    }
}
