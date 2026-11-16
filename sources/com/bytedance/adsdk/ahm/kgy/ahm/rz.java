package com.bytedance.adsdk.ahm.kgy.ahm;

import android.graphics.Color;
import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class rz implements kgy.InterfaceC0185kgy {
    private final kgy<Integer, Integer> ahm;
    private final kgy<Float, Float> ct;
    private final kgy.InterfaceC0185kgy kgy;
    private final kgy<Float, Float> noq;
    private final kgy<Float, Float> rz;
    private final kgy<Float, Float> uq;
    private boolean yo = true;

    public void kgy(Paint paint) {
        if (this.yo) {
            this.yo = false;
            double dFloatValue = ((double) this.uq.yo().floatValue()) * 0.017453292519943295d;
            float fFloatValue = this.ct.yo().floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = this.ahm.yo().intValue();
            paint.setShadowLayer(this.noq.yo().floatValue(), fSin, fCos, Color.argb(Math.round(this.rz.yo().floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }

    public rz(kgy.InterfaceC0185kgy interfaceC0185kgy, com.bytedance.adsdk.ahm.rz.rz.kgy kgyVar, com.bytedance.adsdk.ahm.ct.ra raVar) {
        this.kgy = interfaceC0185kgy;
        kgy<Integer, Integer> kgyVarKgy = raVar.kgy().kgy();
        this.ahm = kgyVarKgy;
        kgyVarKgy.kgy(this);
        kgyVar.kgy(kgyVarKgy);
        kgy<Float, Float> kgyVarKgy2 = raVar.ahm().kgy();
        this.rz = kgyVarKgy2;
        kgyVarKgy2.kgy(this);
        kgyVar.kgy(kgyVarKgy2);
        kgy<Float, Float> kgyVarKgy3 = raVar.rz().kgy();
        this.uq = kgyVarKgy3;
        kgyVarKgy3.kgy(this);
        kgyVar.kgy(kgyVarKgy3);
        kgy<Float, Float> kgyVarKgy4 = raVar.uq().kgy();
        this.ct = kgyVarKgy4;
        kgyVarKgy4.kgy(this);
        kgyVar.kgy(kgyVarKgy4);
        kgy<Float, Float> kgyVarKgy5 = raVar.ct().kgy();
        this.noq = kgyVarKgy5;
        kgyVarKgy5.kgy(this);
        kgyVar.kgy(kgyVarKgy5);
    }

    @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy.InterfaceC0185kgy
    public void kgy() {
        this.yo = true;
        this.kgy.kgy();
    }
}
