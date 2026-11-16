package com.bytedance.adsdk.ahm.rz.ahm;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class dg implements rz {
    private final List<rz> ahm;
    private final String kgy;
    private final boolean rz;

    public List<rz> ahm() {
        return this.ahm;
    }

    @Override // com.bytedance.adsdk.ahm.rz.ahm.rz
    public com.bytedance.adsdk.ahm.kgy.kgy.rz kgy(com.bytedance.adsdk.ahm.gf gfVar, com.bytedance.adsdk.ahm.yo yoVar, com.bytedance.adsdk.ahm.rz.rz.kgy kgyVar) {
        return new com.bytedance.adsdk.ahm.kgy.kgy.uq(gfVar, kgyVar, this, yoVar);
    }

    public boolean rz() {
        return this.rz;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.kgy + "' Shapes: " + Arrays.toString(this.ahm.toArray()) + '}';
    }

    public dg(String str, List<rz> list, boolean z) {
        this.kgy = str;
        this.ahm = list;
        this.rz = z;
    }

    public String kgy() {
        return this.kgy;
    }
}
