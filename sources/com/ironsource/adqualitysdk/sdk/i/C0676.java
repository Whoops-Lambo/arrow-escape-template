package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.provider.Settings;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ڽ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C0676 implements InterfaceC0759 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Context f1734;

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0759
    public final String getName() {
        return StringFog.decrypt("blHxYsgX5VdtWMpm0A3lVw==\n", "DDSZA75+iiU=\n");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:49:0x0133  */
    /* JADX WARN: Code duplicated, block: B:53:0x0155  */
    /* JADX WARN: Code duplicated, block: B:54:0x0156 A[Catch: Exception -> 0x015f, TRY_LEAVE, TryCatch #0 {Exception -> 0x015f, blocks: (B:51:0x0140, B:54:0x0156), top: B:84:0x0140 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0175  */
    /* JADX WARN: Code duplicated, block: B:64:0x017a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0184  */
    /* JADX WARN: Code duplicated, block: B:68:0x0186  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b4 A[Catch: Exception -> 0x01e6, TryCatch #3 {Exception -> 0x01e6, blocks: (B:69:0x018c, B:71:0x01b4, B:72:0x01c4, B:74:0x01d1, B:75:0x01e1), top: B:88:0x018c }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01d1 A[Catch: Exception -> 0x01e6, TryCatch #3 {Exception -> 0x01e6, blocks: (B:69:0x018c, B:71:0x01b4, B:72:0x01c4, B:74:0x01d1, B:75:0x01e1), top: B:88:0x018c }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00ee A[SYNTHETIC] */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0759
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final C1071 mo569() throws Throwable {
        int i;
        HandlerThread handlerThread;
        Sensor sensor;
        int i2;
        float size;
        Float fValueOf;
        boolean z;
        Float fValueOf2;
        String strDecrypt;
        JSONObject jSONObjectJsonObjectInit;
        int i3;
        ArrayList arrayList = new ArrayList();
        SensorManager sensorManager = (SensorManager) this.f1734.getSystemService(StringFog.decrypt("ivBq3A3n\n", "+ZUEr2KVMYk=\n"));
        if (sensorManager == null) {
            arrayList.add(60);
            return new C1071(false, arrayList, null, StringFog.decrypt("6t0VskTgIIjX2RykWbIYh9jOGqhH8w+F3A==\n", "ubh7wSuSbek=\n"));
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(4);
        Sensor defaultSensor3 = sensorManager.getDefaultSensor(6);
        Sensor defaultSensor4 = sensorManager.getDefaultSensor(2);
        if (defaultSensor2 == null) {
            arrayList.add(61);
        }
        if (defaultSensor3 == null) {
            arrayList.add(62);
        }
        CopyOnWriteArrayList<float[]> copyOnWriteArrayList = new CopyOnWriteArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        float[] fArr = {Float.NaN};
        CountDownLatch countDownLatch = new CountDownLatch(1);
        HandlerThread handlerThread2 = new HandlerThread(StringFog.decrypt("ibdenHls0iyqvmWYYXbSLJizW41jYM8=\n", "y9I2/Q8FvV4=\n"));
        handlerThread2.start();
        Handler handler = new Handler(handlerThread2.getLooper());
        C0698 c0698 = new C0698(copyOnWriteArrayList, copyOnWriteArrayList2, new float[]{Float.NaN}, fArr);
        if (defaultSensor != null) {
            i = 0;
            try {
                sensorManager.registerListener(c0698, defaultSensor, 0, handler);
            } catch (InterruptedException unused) {
                handlerThread = handlerThread2;
                sensor = defaultSensor;
                Thread.currentThread().interrupt();
                sensorManager.unregisterListener(c0698);
                handlerThread.quitSafely();
                double dM568 = m568(copyOnWriteArrayList);
                if (copyOnWriteArrayList.isEmpty()) {
                    size = 0.0f;
                } else {
                    i2 = 0;
                    for (float[] fArr2 : copyOnWriteArrayList) {
                        if (Math.abs(fArr2[2]) + Math.abs(fArr2[1]) + Math.abs(fArr2[0]) < 0.05f) {
                            i2++;
                        }
                    }
                    size = i2 / copyOnWriteArrayList.size();
                }
                if (copyOnWriteArrayList.isEmpty()) {
                    arrayList.add(60);
                }
                if (size > 0.9f) {
                    arrayList.add(63);
                }
                double dM569 = m568(copyOnWriteArrayList2);
                i3 = Settings.System.getInt(this.f1734.getContentResolver(), StringFog.decrypt("V0DJWcvIb29WStxU2shVflc=\n", "JCO7PK6mMA0=\n"), -1);
                if (i3 < 0) {
                    fValueOf = null;
                } else {
                    fValueOf = Float.valueOf(i3 / 255.0f);
                }
                if (fValueOf != null) {
                    arrayList.add(64);
                }
                if (defaultSensor3 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (Float.isNaN(fArr[0])) {
                    fValueOf2 = null;
                } else {
                    fValueOf2 = Float.valueOf(fArr[0]);
                }
                jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
                jSONObjectJsonObjectInit.put(StringFog.decrypt("w+6qsn4CN4LP6L2yYDEkn8vsp7R3\n", "oo3J1xJnRe0=\n"), dM568);
                jSONObjectJsonObjectInit.put(StringFog.decrypt("z866W+tdFG7N4alG8V8Vfc0=\n", "qLfINJg+ex4=\n"), dM569);
                jSONObjectJsonObjectInit.put(StringFog.decrypt("NjIPs8KcDOMjOS+9+5oX\n", "TFd93I/zeIo=\n"), size);
                if (fValueOf != null) {
                    jSONObjectJsonObjectInit.put(StringFog.decrypt("NMNGadojI8Elwg==\n", "VrEvDrJXTaQ=\n"), fValueOf.floatValue());
                }
                jSONObjectJsonObjectInit.put(StringFog.decrypt("lOiyQ3HaA4eJ+6Q=\n", "/InBEwO/cPQ=\n"), z);
                if (fValueOf2 != null) {
                    jSONObjectJsonObjectInit.put(StringFog.decrypt("BzMLnHmywwQsOwmeeJXeFQ88C4Z0\n", "alJs8hzGqmc=\n"), fValueOf2.floatValue());
                }
                strDecrypt = jSONObjectJsonObjectInit.toString();
                return new C1071(arrayList.isEmpty(), arrayList, strDecrypt, null);
            } catch (Throwable th) {
                th = th;
                handlerThread = handlerThread2;
                sensorManager.unregisterListener(c0698);
                handlerThread.quitSafely();
                throw th;
            }
        } else {
            i = 0;
        }
        if (defaultSensor2 != null) {
            sensorManager.registerListener(c0698, defaultSensor2, i, handler);
        }
        if (defaultSensor3 != null) {
            sensorManager.registerListener(c0698, defaultSensor3, i, handler);
        }
        if (defaultSensor4 != null) {
            sensorManager.registerListener(c0698, defaultSensor4, i, handler);
        }
        handlerThread = handlerThread2;
        sensor = defaultSensor;
        try {
            try {
                handler.postDelayed(new RunnableC0687(countDownLatch), 500L);
                countDownLatch.await(600L, TimeUnit.MILLISECONDS);
                sensorManager.unregisterListener(c0698);
            } catch (Throwable th2) {
                th = th2;
                sensorManager.unregisterListener(c0698);
                handlerThread.quitSafely();
                throw th;
            }
        } catch (InterruptedException unused2) {
            Thread.currentThread().interrupt();
            sensorManager.unregisterListener(c0698);
        }
        handlerThread.quitSafely();
        double dM5610 = m568(copyOnWriteArrayList);
        if (copyOnWriteArrayList.isEmpty()) {
            size = 0.0f;
        } else {
            i2 = 0;
            while (r5.hasNext()) {
                if (Math.abs(fArr2[2]) + Math.abs(fArr2[1]) + Math.abs(fArr2[0]) < 0.05f) {
                    i2++;
                }
            }
            size = i2 / copyOnWriteArrayList.size();
        }
        if (copyOnWriteArrayList.isEmpty() && sensor != null) {
            arrayList.add(60);
        }
        if (size > 0.9f) {
            arrayList.add(63);
        }
        double dM5611 = m568(copyOnWriteArrayList2);
        try {
            i3 = Settings.System.getInt(this.f1734.getContentResolver(), StringFog.decrypt("V0DJWcvIb29WStxU2shVflc=\n", "JCO7PK6mMA0=\n"), -1);
            if (i3 < 0) {
                fValueOf = null;
            } else {
                fValueOf = Float.valueOf(i3 / 255.0f);
            }
        } catch (Exception unused3) {
        }
        if (fValueOf != null && fValueOf.floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            arrayList.add(64);
        }
        if (defaultSensor3 != null) {
            z = true;
        } else {
            z = false;
        }
        if (Float.isNaN(fArr[0])) {
            fValueOf2 = null;
        } else {
            fValueOf2 = Float.valueOf(fArr[0]);
        }
        try {
            jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            jSONObjectJsonObjectInit.put(StringFog.decrypt("w+6qsn4CN4LP6L2yYDEkn8vsp7R3\n", "oo3J1xJnRe0=\n"), dM5610);
            jSONObjectJsonObjectInit.put(StringFog.decrypt("z866W+tdFG7N4alG8V8Vfc0=\n", "qLfINJg+ex4=\n"), dM5611);
            jSONObjectJsonObjectInit.put(StringFog.decrypt("NjIPs8KcDOMjOS+9+5oX\n", "TFd93I/zeIo=\n"), size);
            if (fValueOf != null) {
                jSONObjectJsonObjectInit.put(StringFog.decrypt("NMNGadojI8Elwg==\n", "VrEvDrJXTaQ=\n"), fValueOf.floatValue());
            }
            jSONObjectJsonObjectInit.put(StringFog.decrypt("lOiyQ3HaA4eJ+6Q=\n", "/InBEwO/cPQ=\n"), z);
            if (fValueOf2 != null) {
                jSONObjectJsonObjectInit.put(StringFog.decrypt("BzMLnHmywwQsOwmeeJXeFQ88C4Z0\n", "alJs8hzGqmc=\n"), fValueOf2.floatValue());
            }
            strDecrypt = jSONObjectJsonObjectInit.toString();
        } catch (Exception unused4) {
            strDecrypt = StringFog.decrypt("zTE=\n", "tkxtXGCK4hY=\n");
        }
        return new C1071(arrayList.isEmpty(), arrayList, strDecrypt, null);
    }

    public C0676(Context context) {
        this.f1734 = context;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static double m568(CopyOnWriteArrayList copyOnWriteArrayList) {
        if (copyOnWriteArrayList.size() < 2) {
            return 0.0d;
        }
        double size = 0.0d;
        for (int i = 0; i <= 2; i++) {
            Iterator it = copyOnWriteArrayList.iterator();
            double d = 0.0d;
            while (it.hasNext()) {
                d += (double) ((float[]) it.next())[i];
            }
            double size2 = d / ((double) copyOnWriteArrayList.size());
            Iterator it2 = copyOnWriteArrayList.iterator();
            double d2 = 0.0d;
            while (it2.hasNext()) {
                double d3 = ((double) ((float[]) it2.next())[i]) - size2;
                d2 += d3 * d3;
            }
            size += d2 / ((double) copyOnWriteArrayList.size());
        }
        return size / 3.0d;
    }
}
