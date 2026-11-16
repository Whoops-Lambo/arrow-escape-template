package com.adsurge.adn.p016e;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.adsurge.adn.N.b;
import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.adsurge.adn.p032j0.d;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class a {
    public static volatile a f;
    public AtomicBoolean b = new AtomicBoolean(false);
    public final int[] e = {9, 1};
    public ConcurrentHashMap d = new ConcurrentHashMap();
    public SensorManager a = (SensorManager) com.adsurge.adn.s1.a.b().a().getSystemService("sensor");
    public int c = b.a("sotms", 0, (AdSurgeAdFormat) null, (String) null);

    /* JADX INFO: renamed from: com.adsurge.adn.e.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public final class RunnableC0108a implements Runnable {
        public int a;

        public RunnableC0108a(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            Sensor defaultSensor;
            int i = this.a;
            if (i >= 0) {
                a aVar = a.this;
                int[] iArr = aVar.e;
                if (i <= iArr.length - 1 && (defaultSensor = aVar.a.getDefaultSensor(iArr[i])) != null) {
                    a.this.d.put(Integer.valueOf(defaultSensor.getType()), defaultSensor);
                }
            }
        }
    }

    public static a b() {
        if (f == null) {
            synchronized (a.class) {
                try {
                    if (f == null) {
                        f = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public void c() {
        int[] iArr;
        int length;
        if (com.adsurge.adn.p007b.b.a) {
            if (this.b.getAndSet(true)) {
                return;
            }
            if (this.a == null) {
                this.a = (SensorManager) com.adsurge.adn.s1.a.b().a().getSystemService("sensor");
            }
            if (this.a == null) {
                return;
            }
            boolean z = b.a("sole", 0, (AdSurgeAdFormat) null, (String) null) == 1;
            Sensor defaultSensor = this.a.getDefaultSensor(1);
            if (defaultSensor != null) {
                this.d.put(1, defaultSensor);
            }
            Sensor defaultSensor2 = this.a.getDefaultSensor(2);
            if (defaultSensor2 != null) {
                this.d.put(2, defaultSensor2);
            }
            if (!z) {
                if (a() || (length = (iArr = this.e).length) == 0) {
                    return;
                }
                Sensor defaultSensor3 = this.a.getDefaultSensor(iArr[0]);
                if (defaultSensor3 != null) {
                    this.d.put(Integer.valueOf(defaultSensor3.getType()), defaultSensor3);
                }
                for (int i = 1; i < length; i++) {
                    d.b().postDelayed(new RunnableC0108a(i), this.c * i);
                }
                return;
            }
            List<Sensor> sensorList = this.a.getSensorList(-1);
            if (sensorList == null || sensorList.size() <= 0) {
                return;
            }
            for (Sensor sensor : sensorList) {
                int type = sensor.getType();
                for (int i2 : this.e) {
                    if (type == i2) {
                        this.d.put(Integer.valueOf(type), sensor);
                    }
                }
            }
        }
    }

    public Sensor a(int i) {
        SensorManager sensorManager;
        if (a() && (sensorManager = this.a) != null) {
            return sensorManager.getDefaultSensor(i);
        }
        c();
        return (Sensor) this.d.get(Integer.valueOf(i));
    }

    public final boolean a() {
        return this.c <= 0;
    }
}
