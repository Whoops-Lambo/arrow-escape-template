package com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy;

import android.content.Context;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class noq extends yo {
    @Override // com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.yo
    public byte rz() {
        return (byte) 3;
    }

    public static String kgy(String str) {
        return pv1.n("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }

    public noq(Context context, com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy kgyVar) {
        super(context, kgyVar);
    }

    @Override // com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.yo, com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.rz
    public String ahm() {
        return com.bytedance.sdk.component.yo.kgy.yo.noq().rz().ct();
    }

    @Override // com.bytedance.sdk.component.yo.kgy.kgy.kgy.kgy.yo
    public byte kgy() {
        return (byte) 1;
    }
}
