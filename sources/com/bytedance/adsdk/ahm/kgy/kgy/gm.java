package com.bytedance.adsdk.ahm.kgy.kgy;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class gm implements com.bytedance.adsdk.ahm.kgy.ahm.kgy.InterfaceC0185kgy, rz {
    private final boolean ahm;
    private final com.bytedance.adsdk.ahm.kgy.ahm.kgy<?, Float> ct;
    private final String kgy;
    private final com.bytedance.adsdk.ahm.kgy.ahm.kgy<?, Float> noq;
    private final List<com.bytedance.adsdk.ahm.kgy.ahm.kgy.InterfaceC0185kgy> rz = new ArrayList();
    private final com.bytedance.adsdk.ahm.rz.ahm.fpp.kgy uq;
    private final com.bytedance.adsdk.ahm.kgy.ahm.kgy<?, Float> yo;

    @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy.InterfaceC0185kgy
    public void kgy() {
        for (int i = 0; i < this.rz.size(); i++) {
            this.rz.get(i).kgy();
        }
    }

    public com.bytedance.adsdk.ahm.rz.ahm.fpp.kgy ahm() {
        return this.uq;
    }

    public com.bytedance.adsdk.ahm.kgy.ahm.kgy<?, Float> ct() {
        return this.yo;
    }

    public boolean noq() {
        return this.ahm;
    }

    public com.bytedance.adsdk.ahm.kgy.ahm.kgy<?, Float> rz() {
        return this.ct;
    }

    public com.bytedance.adsdk.ahm.kgy.ahm.kgy<?, Float> uq() {
        return this.noq;
    }

    public gm(com.bytedance.adsdk.ahm.rz.rz.kgy kgyVar, com.bytedance.adsdk.ahm.rz.ahm.fpp fppVar) {
        this.kgy = fppVar.kgy();
        this.ahm = fppVar.noq();
        this.uq = fppVar.ahm();
        com.bytedance.adsdk.ahm.kgy.ahm.kgy<Float, Float> kgyVarKgy = fppVar.uq().kgy();
        this.ct = kgyVarKgy;
        com.bytedance.adsdk.ahm.kgy.ahm.kgy<Float, Float> kgyVarKgy2 = fppVar.rz().kgy();
        this.noq = kgyVarKgy2;
        com.bytedance.adsdk.ahm.kgy.ahm.kgy<Float, Float> kgyVarKgy3 = fppVar.ct().kgy();
        this.yo = kgyVarKgy3;
        kgyVar.kgy(kgyVarKgy);
        kgyVar.kgy(kgyVarKgy2);
        kgyVar.kgy(kgyVarKgy3);
        kgyVarKgy.kgy(this);
        kgyVarKgy2.kgy(this);
        kgyVarKgy3.kgy(this);
    }

    @Override // com.bytedance.adsdk.ahm.kgy.kgy.rz
    public void kgy(List<rz> list, List<rz> list2) {
    }

    public void kgy(com.bytedance.adsdk.ahm.kgy.ahm.kgy.InterfaceC0185kgy interfaceC0185kgy) {
        this.rz.add(interfaceC0185kgy);
    }
}
