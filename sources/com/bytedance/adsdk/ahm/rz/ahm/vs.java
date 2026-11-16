package com.bytedance.adsdk.ahm.rz.ahm;

import android.graphics.Path;
import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class vs implements rz {
    private final Path.FillType ahm;
    private final com.bytedance.adsdk.ahm.rz.kgy.uq ct;
    private final boolean kgy;
    private final boolean noq;
    private final String rz;
    private final com.bytedance.adsdk.ahm.rz.kgy.kgy uq;

    public com.bytedance.adsdk.ahm.rz.kgy.kgy ahm() {
        return this.uq;
    }

    public boolean ct() {
        return this.noq;
    }

    @Override // com.bytedance.adsdk.ahm.rz.ahm.rz
    public com.bytedance.adsdk.ahm.kgy.kgy.rz kgy(com.bytedance.adsdk.ahm.gf gfVar, com.bytedance.adsdk.ahm.yo yoVar, com.bytedance.adsdk.ahm.rz.rz.kgy kgyVar) {
        return new com.bytedance.adsdk.ahm.kgy.kgy.yo(gfVar, kgyVar, this);
    }

    public com.bytedance.adsdk.ahm.rz.kgy.uq rz() {
        return this.ct;
    }

    public String toString() {
        return h50.m(new StringBuilder("ShapeFill{color=, fillEnabled="), this.kgy, '}');
    }

    public Path.FillType uq() {
        return this.ahm;
    }

    public vs(String str, boolean z, Path.FillType fillType, com.bytedance.adsdk.ahm.rz.kgy.kgy kgyVar, com.bytedance.adsdk.ahm.rz.kgy.uq uqVar, boolean z2) {
        this.rz = str;
        this.kgy = z;
        this.ahm = fillType;
        this.uq = kgyVar;
        this.ct = uqVar;
        this.noq = z2;
    }

    public String kgy() {
        return this.rz;
    }
}
