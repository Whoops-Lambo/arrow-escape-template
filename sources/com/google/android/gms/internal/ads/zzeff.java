package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.kc4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeff extends zzgdi {
    public final Context a;
    public SensorManager b;
    public Sensor c;
    public long d;
    public int e;
    public zzeec f;
    public boolean g;

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Ga)).booleanValue()) {
                    if (this.b == null) {
                        SensorManager sensorManager2 = (SensorManager) this.a.getSystemService("sensor");
                        this.b = sensorManager2;
                        if (sensorManager2 == null) {
                            int i = com.google.android.gms.ads.internal.util.zze.zza;
                            zzo.zzi("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.c = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.g && (sensorManager = this.b) != null && (sensor = this.c) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.d = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - ((long) ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Ia)).intValue());
                        this.g = true;
                        com.google.android.gms.ads.internal.util.zze.zza("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdi
    public final void a(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Ga)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0] / 9.80665f;
            float f2 = fArr[1] / 9.80665f;
            float f3 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f3 * f3) + (f2 * f2) + (f * f))) >= ((Float) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Ha)).floatValue()) {
                long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                if (this.d + ((long) ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Ia)).intValue()) <= jCurrentTimeMillis) {
                    if (this.d + ((long) ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Ja)).intValue()) < jCurrentTimeMillis) {
                        this.e = 0;
                    }
                    com.google.android.gms.ads.internal.util.zze.zza("Shake detected.");
                    this.d = jCurrentTimeMillis;
                    int i = this.e + 1;
                    this.e = i;
                    zzeec zzeecVar = this.f;
                    if (zzeecVar != null) {
                        if (i == ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Ka)).intValue()) {
                            zzeecVar.e(new kc4(0), zzeeb.c);
                        }
                    }
                }
            }
        }
    }

    public zzeff(Context context) {
        this.a = context;
    }
}
