package com.bytedance.adsdk.ahm.rz;

import android.annotation.SuppressLint;
import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class kgy {
    private final PointF ahm;
    private final PointF kgy;
    private final PointF rz;

    public void ahm(float f, float f2) {
        this.ahm.set(f, f2);
    }

    public void kgy(float f, float f2) {
        this.kgy.set(f, f2);
    }

    public void rz(float f, float f2) {
        this.rz.set(f, f2);
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.rz.x), Float.valueOf(this.rz.y), Float.valueOf(this.kgy.x), Float.valueOf(this.kgy.y), Float.valueOf(this.ahm.x), Float.valueOf(this.ahm.y));
    }

    public kgy() {
        this.kgy = new PointF();
        this.ahm = new PointF();
        this.rz = new PointF();
    }

    public PointF ahm() {
        return this.ahm;
    }

    public PointF kgy() {
        return this.kgy;
    }

    public PointF rz() {
        return this.rz;
    }

    public kgy(PointF pointF, PointF pointF2, PointF pointF3) {
        this.kgy = pointF;
        this.ahm = pointF2;
        this.rz = pointF3;
    }
}
