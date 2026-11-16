package com.bytedance.adsdk.ahm.rz.ahm;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class at implements rz {
    private final com.bytedance.adsdk.ahm.rz.kgy.ahm ahm;
    private final boolean ct;
    private final String kgy;
    private final com.bytedance.adsdk.ahm.rz.kgy.ahm rz;
    private final com.bytedance.adsdk.ahm.rz.kgy.at uq;

    public com.bytedance.adsdk.ahm.rz.kgy.ahm ahm() {
        return this.ahm;
    }

    public boolean ct() {
        return this.ct;
    }

    @Override // com.bytedance.adsdk.ahm.rz.ahm.rz
    public com.bytedance.adsdk.ahm.kgy.kgy.rz kgy(com.bytedance.adsdk.ahm.gf gfVar, com.bytedance.adsdk.ahm.yo yoVar, com.bytedance.adsdk.ahm.rz.rz.kgy kgyVar) {
        return new com.bytedance.adsdk.ahm.kgy.kgy.dg(gfVar, kgyVar, this);
    }

    public com.bytedance.adsdk.ahm.rz.kgy.ahm rz() {
        return this.rz;
    }

    public com.bytedance.adsdk.ahm.rz.kgy.at uq() {
        return this.uq;
    }

    public at(String str, com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVar, com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVar2, com.bytedance.adsdk.ahm.rz.kgy.at atVar, boolean z) {
        this.kgy = str;
        this.ahm = ahmVar;
        this.rz = ahmVar2;
        this.uq = atVar;
        this.ct = z;
    }

    public String kgy() {
        return this.kgy;
    }
}
