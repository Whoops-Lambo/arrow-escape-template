package com.bytedance.adsdk.ahm.rz.ahm;

import android.graphics.PointF;
import defpackage.h50;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class kus {
    private PointF ahm;
    private final List<com.bytedance.adsdk.ahm.rz.kgy> kgy;
    private boolean rz;

    public boolean ahm() {
        return this.rz;
    }

    public void kgy(kus kusVar, kus kusVar2, float f) {
        if (this.ahm == null) {
            this.ahm = new PointF();
        }
        this.rz = kusVar.ahm() || kusVar2.ahm();
        if (kusVar.rz().size() != kusVar2.rz().size()) {
            kusVar.rz().size();
            kusVar2.rz().size();
        }
        int iMin = Math.min(kusVar.rz().size(), kusVar2.rz().size());
        int size = this.kgy.size();
        List<com.bytedance.adsdk.ahm.rz.kgy> list = this.kgy;
        if (size < iMin) {
            for (int size2 = list.size(); size2 < iMin; size2++) {
                this.kgy.add(new com.bytedance.adsdk.ahm.rz.kgy());
            }
        } else if (list.size() > iMin) {
            for (int size3 = this.kgy.size() - 1; size3 >= iMin; size3--) {
                List<com.bytedance.adsdk.ahm.rz.kgy> list2 = this.kgy;
                list2.remove(list2.size() - 1);
            }
        }
        PointF pointFKgy = kusVar.kgy();
        PointF pointFKgy2 = kusVar2.kgy();
        kgy(com.bytedance.adsdk.ahm.noq.ct.kgy(pointFKgy.x, pointFKgy2.x, f), com.bytedance.adsdk.ahm.noq.ct.kgy(pointFKgy.y, pointFKgy2.y, f));
        for (int size4 = this.kgy.size() - 1; size4 >= 0; size4--) {
            com.bytedance.adsdk.ahm.rz.kgy kgyVar = kusVar.rz().get(size4);
            com.bytedance.adsdk.ahm.rz.kgy kgyVar2 = kusVar2.rz().get(size4);
            PointF pointFKgy3 = kgyVar.kgy();
            PointF pointFAhm = kgyVar.ahm();
            PointF pointFRz = kgyVar.rz();
            PointF pointFKgy4 = kgyVar2.kgy();
            PointF pointFAhm2 = kgyVar2.ahm();
            PointF pointFRz2 = kgyVar2.rz();
            this.kgy.get(size4).kgy(com.bytedance.adsdk.ahm.noq.ct.kgy(pointFKgy3.x, pointFKgy4.x, f), com.bytedance.adsdk.ahm.noq.ct.kgy(pointFKgy3.y, pointFKgy4.y, f));
            this.kgy.get(size4).ahm(com.bytedance.adsdk.ahm.noq.ct.kgy(pointFAhm.x, pointFAhm2.x, f), com.bytedance.adsdk.ahm.noq.ct.kgy(pointFAhm.y, pointFAhm2.y, f));
            this.kgy.get(size4).rz(com.bytedance.adsdk.ahm.noq.ct.kgy(pointFRz.x, pointFRz2.x, f), com.bytedance.adsdk.ahm.noq.ct.kgy(pointFRz.y, pointFRz2.y, f));
        }
    }

    public List<com.bytedance.adsdk.ahm.rz.kgy> rz() {
        return this.kgy;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ShapeData{numCurves=");
        sb.append(this.kgy.size());
        sb.append("closed=");
        return h50.m(sb, this.rz, '}');
    }

    public kus(PointF pointF, boolean z, List<com.bytedance.adsdk.ahm.rz.kgy> list) {
        this.ahm = pointF;
        this.rz = z;
        this.kgy = new ArrayList(list);
    }

    public kus() {
        this.kgy = new ArrayList();
    }

    public PointF kgy() {
        return this.ahm;
    }

    public void kgy(boolean z) {
        this.rz = z;
    }

    public void kgy(float f, float f2) {
        if (this.ahm == null) {
            this.ahm = new PointF();
        }
        this.ahm.set(f, f2);
    }
}
