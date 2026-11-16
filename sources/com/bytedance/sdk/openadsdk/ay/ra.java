package com.bytedance.sdk.openadsdk.ay;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.os.Vibrator;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class ra {
    public static WeakReference<kgy> kgy;
    protected static final float[] ahm = new float[3];
    protected static final float[] rz = new float[3];
    protected static final float[] uq = new float[9];
    protected static final float[] ct = new float[3];

    public static void ahm(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<kgy> weakReference = kgy;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "aOsjhgyuQdKC", "SPoshxeQYNSUT9l6lQOvO1jhPZA=", 69);
            yo.kgy("SensorHub", "startListenGyroscope error", th);
        }
    }

    public static void kgy(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<kgy> weakReference = kgy;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "aOsjhgyuQdKC", "SPoshxeQYNSUT9l8jxKlJF78IpgGqGzV", 53);
            yo.kgy("SensorHub", "startListenAccelerometer error", th);
        }
    }

    public static void rz(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<kgy> weakReference = kgy;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "aOsjhgyuQdKC", "SPoshxeQYNSUT9lxhR+lKUnPLpYGsGzVgV7eUoI=", 85);
            yo.kgy("SensorHub", "startListenLinearAcceleration error", th);
        }
    }

    public static void uq(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<kgy> weakReference = kgy;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "aOsjhgyuQdKC", "SPoshxeQYNSUT9lvgwWhPFLhI6MGv33Ikg==", 102);
            yo.kgy("SensorHub", "startListenRotationVector err", th);
        }
    }

    public static void kgy(kgy kgyVar) {
        kgy = new WeakReference<>(kgyVar);
    }

    public static void kgy(Context context, SensorEventListener sensorEventListener) {
    }

    public static void kgy(Context context, long j) {
        if (context == null) {
            return;
        }
        ((Vibrator) context.getSystemService("vibrator")).vibrate(j);
    }
}
