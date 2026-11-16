package com.bytedance.adsdk.ahm.rz.ahm;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class fi {
    private final com.bytedance.adsdk.ahm.rz.kgy.fi ahm;
    private final kgy kgy;
    private final com.bytedance.adsdk.ahm.rz.kgy.uq rz;
    private final boolean uq;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum kgy {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public com.bytedance.adsdk.ahm.rz.kgy.fi ahm() {
        return this.ahm;
    }

    public kgy kgy() {
        return this.kgy;
    }

    public com.bytedance.adsdk.ahm.rz.kgy.uq rz() {
        return this.rz;
    }

    public boolean uq() {
        return this.uq;
    }

    public fi(kgy kgyVar, com.bytedance.adsdk.ahm.rz.kgy.fi fiVar, com.bytedance.adsdk.ahm.rz.kgy.uq uqVar, boolean z) {
        this.kgy = kgyVar;
        this.ahm = fiVar;
        this.rz = uqVar;
        this.uq = z;
    }
}
