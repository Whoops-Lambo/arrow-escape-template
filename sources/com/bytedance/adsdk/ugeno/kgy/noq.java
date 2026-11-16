package com.bytedance.adsdk.ugeno.kgy;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class noq {
    private List<kgy> ahm;
    private List<rz> kgy;
    private Context rz;
    private com.bytedance.adsdk.ugeno.ahm.rz uq;

    private void uq() {
        this.ahm = new ArrayList();
        List<rz> list = this.kgy;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.kgy.size(); i++) {
            rz rzVar = this.kgy.get(i);
            if (rzVar != null) {
                this.ahm.add(new kgy(this.rz, this.uq, rzVar));
            }
        }
    }

    public void ahm() {
        List<kgy> list = this.ahm;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (kgy kgyVar : this.ahm) {
            if (kgyVar != null) {
                kgyVar.kgy();
            }
        }
    }

    public kgy kgy(String str) {
        List<kgy> list = this.ahm;
        if (list != null && !list.isEmpty()) {
            for (kgy kgyVar : this.ahm) {
                if (kgyVar != null && TextUtils.equals(kgyVar.ct(), str)) {
                    return kgyVar;
                }
            }
        }
        return null;
    }

    public void rz() {
        List<kgy> list = this.ahm;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (kgy kgyVar : this.ahm) {
            if (kgyVar != null) {
                kgyVar.rz();
            }
        }
    }

    public noq(Context context, com.bytedance.adsdk.ugeno.ahm.rz rzVar, List<rz> list) {
        this.uq = rzVar;
        this.rz = context;
        this.kgy = list;
        uq();
    }

    public void ahm(Canvas canvas) {
        List<kgy> list = this.ahm;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (kgy kgyVar : this.ahm) {
            if (kgyVar != null) {
                kgyVar.ahm(canvas);
            }
        }
    }

    public void kgy(Canvas canvas) {
        List<kgy> list = this.ahm;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (kgy kgyVar : this.ahm) {
            if (kgyVar != null) {
                kgyVar.kgy(canvas);
            }
        }
    }

    public void kgy(int i, int i2) {
        List<kgy> list = this.ahm;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (kgy kgyVar : this.ahm) {
            if (kgyVar != null) {
                kgyVar.kgy(i, i2);
            }
        }
    }

    public void kgy() {
        List<kgy> list = this.ahm;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (kgy kgyVar : this.ahm) {
            if (kgyVar != null) {
                kgyVar.uq();
            }
        }
    }
}
