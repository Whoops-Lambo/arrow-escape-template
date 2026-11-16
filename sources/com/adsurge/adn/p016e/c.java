package com.adsurge.adn.p016e;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;
import com.adsurge.adn.N.b;
import com.adsurge.adn.ads.AdSurgeAdFormat;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class c implements b {
    public static final long j = ((long) b.a("odcsdi", 0, (AdSurgeAdFormat) null, (String) null)) * 1000;
    public final SensorManager a;
    public Sensor b;
    public Sensor c;
    public final a d = new a();
    public float[] e = null;
    public float[] f = null;
    public int[] g = {-999, -999, -999};
    public final AtomicBoolean h = new AtomicBoolean(false);
    public long i = -1;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements SensorEventListener {
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public a() {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            int type = sensorEvent.sensor.getType();
            if (type == 1) {
                c.this.e = sensorEvent.values;
            } else if (type == 2) {
                c.this.f = sensorEvent.values;
            }
            c cVar = c.this;
            if (cVar.e == null || cVar.f == null) {
                return;
            }
            cVar.c();
            c.this.stop();
        }
    }

    public final void c() {
        float[] fArr = new float[3];
        float[] fArr2 = new float[9];
        SensorManager.getRotationMatrix(fArr2, null, this.e, this.f);
        SensorManager.getOrientation(fArr2, fArr);
        this.g = new int[]{(int) Math.toDegrees(fArr[1]), (int) Math.toDegrees(fArr[2]), (int) Math.toDegrees(fArr[0])};
    }

    @Override // com.adsurge.adn.p016e.b
    public int[] a() {
        int[] iArr = this.g;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        return iArr;
    }

    @Override // com.adsurge.adn.p016e.b
    public boolean b() {
        return this.h.get();
    }

    public final void d() {
        Sensor sensor;
        if (com.adsurge.adn.p007b.b.a && this.h.compareAndSet(false, true)) {
            if (this.b == null || this.c == null) {
                this.b = com.adsurge.adn.p016e.a.b().a(1);
                this.c = com.adsurge.adn.p016e.a.b().a(2);
            }
            SensorManager sensorManager = this.a;
            if (sensorManager == null || (sensor = this.b) == null || this.c == null) {
                return;
            }
            sensorManager.registerListener(this.d, sensor, 1);
            this.a.registerListener(this.d, this.c, 1);
        }
    }

    public final void e() {
        if (this.h.compareAndSet(true, false)) {
            SensorManager sensorManager = this.a;
            if (sensorManager != null) {
                try {
                    sensorManager.unregisterListener(this.d);
                } catch (Throwable unused) {
                }
            }
            this.e = null;
            this.f = null;
        }
    }

    public c(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.a = sensorManager;
        if (sensorManager != null) {
            this.b = com.adsurge.adn.p016e.a.b().a(1);
            this.c = com.adsurge.adn.p016e.a.b().a(2);
        }
    }

    @Override // com.adsurge.adn.p016e.b
    public void start() {
        if (SystemClock.elapsedRealtime() - this.i < j) {
            return;
        }
        this.i = SystemClock.elapsedRealtime();
        d();
    }

    @Override // com.adsurge.adn.p016e.b
    public void stop() {
        e();
    }
}
