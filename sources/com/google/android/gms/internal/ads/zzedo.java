package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.unity3d.services.UnityAdsConstants;
import defpackage.kc4;
import defpackage.uy3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzedo extends zzgdi {
    public final SensorManager a;
    public final Sensor b;
    public float c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public Float d = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public long e = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
    public int f = 0;
    public boolean g = false;
    public boolean h = false;
    public zzeec i = null;
    public boolean j = false;

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.La)).booleanValue()) {
                    if (!this.j && (sensorManager = this.a) != null && (sensor = this.b) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.j = true;
                        com.google.android.gms.ads.internal.util.zze.zza("Listening for flick gestures.");
                    }
                    if (this.a == null || this.b == null) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzi("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdi
    public final void a(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.La)).booleanValue()) {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            if (this.e + ((long) ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Na)).intValue()) < jCurrentTimeMillis) {
                this.f = 0;
                this.e = jCurrentTimeMillis;
                this.g = false;
                this.h = false;
                this.c = this.d.floatValue();
            }
            float fFloatValue = this.d.floatValue() + (sensorEvent.values[1] * 4.0f);
            this.d = Float.valueOf(fFloatValue);
            float f = this.c;
            uy3 uy3Var = zzbjr.Ma;
            float fFloatValue2 = ((Float) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var)).floatValue() + f;
            Float f2 = this.d;
            if (fFloatValue > fFloatValue2) {
                this.c = f2.floatValue();
                this.h = true;
            } else if (f2.floatValue() < this.c - ((Float) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var)).floatValue()) {
                this.c = this.d.floatValue();
                this.g = true;
            }
            if (this.d.isInfinite()) {
                this.d = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            if (this.g && this.h) {
                com.google.android.gms.ads.internal.util.zze.zza("Flick detected.");
                this.e = jCurrentTimeMillis;
                int i = this.f + 1;
                this.f = i;
                this.g = false;
                this.h = false;
                zzeec zzeecVar = this.i;
                if (zzeecVar != null) {
                    if (i == ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Oa)).intValue()) {
                        zzeecVar.e(new kc4(1), zzeeb.c);
                    }
                }
            }
        }
    }

    public zzedo(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.a = sensorManager;
        if (sensorManager != null) {
            this.b = sensorManager.getDefaultSensor(4);
        } else {
            this.b = null;
        }
    }
}
