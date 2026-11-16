package com.bytedance.sdk.component.ahm.kgy.kgy.kgy;

import android.text.TextUtils;
import com.bytedance.sdk.component.ahm.kgy.at;
import com.bytedance.sdk.component.ahm.kgy.nu;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class uq extends nu {
    public noq gf;
    public kgy ra;

    @Override // com.bytedance.sdk.component.ahm.kgy.nu
    public com.bytedance.sdk.component.ahm.kgy.uq ahm() {
        return this.gf;
    }

    public uq(nu.kgy kgyVar) {
        super(kgyVar);
        noq noqVar = new noq();
        this.gf = noqVar;
        this.ra = new kgy(noqVar.ahm());
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.nu
    public com.bytedance.sdk.component.ahm.kgy.ahm kgy(at atVar) {
        atVar.kgy(this);
        if (atVar.uq() != null && atVar.uq().kgy() != null && !TextUtils.isEmpty(atVar.uq().kgy().toString())) {
            if (kgy.kgy != null && kgy.kgy.ahm() && this.ra.ct() && !"setting".equals(atVar.fi())) {
                ahm ahmVar = new ahm(atVar, this.ra);
                this.ra.rz().add(ahmVar);
                return ahmVar;
            }
            ahm ahmVar2 = new ahm(atVar, this.gf);
            this.gf.rz().add(ahmVar2);
            return ahmVar2;
        }
        return null;
    }
}
