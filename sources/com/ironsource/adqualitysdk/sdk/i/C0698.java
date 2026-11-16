package com.ironsource.adqualitysdk.sdk.i;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ܫ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C0698 implements SensorEventListener {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ float[] f1773;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ float[] f1774;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ CopyOnWriteArrayList f1775;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ CopyOnWriteArrayList f1776;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public C0698(CopyOnWriteArrayList copyOnWriteArrayList, CopyOnWriteArrayList copyOnWriteArrayList2, float[] fArr, float[] fArr2) {
        this.f1776 = copyOnWriteArrayList;
        this.f1775 = copyOnWriteArrayList2;
        this.f1774 = fArr;
        this.f1773 = fArr2;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            this.f1776.add((float[]) sensorEvent.values.clone());
            return;
        }
        if (type != 2) {
            if (type == 4) {
                this.f1775.add((float[]) sensorEvent.values.clone());
                return;
            } else {
                if (type != 6) {
                    return;
                }
                this.f1774[0] = sensorEvent.values[0];
                return;
            }
        }
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f1773;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        fArr2[0] = (float) Math.sqrt((f3 * f3) + (f2 * f2) + (f * f));
    }
}
