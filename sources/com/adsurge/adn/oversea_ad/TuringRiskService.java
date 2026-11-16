package com.adsurge.adn.oversea_ad;

import android.app.Activity;
import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import android.util.Log;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class TuringRiskService {
    public static LocationListener getLocationListener() {
        return (LocationListener) Carambola.f.b();
    }

    public static void setRemoteControlProtectionEnabled(boolean z) {
        Eridanus.b.set(z);
        Eridanus.d.set(z);
    }

    public static boolean setScreenProtectionEnabled(boolean z) {
        Window window;
        Raspberry.b.set(z);
        WeakReference weakReference = Raspberry.c;
        if (weakReference == null || (window = (Window) weakReference.get()) == null) {
            return true;
        }
        return z ? Raspberry.b(window) : Raspberry.a(window);
    }

    public static void setScreenViewingProtectionEnabled(boolean z) {
        if (z) {
            AtomicInteger atomicInteger = Eridanus.a;
            synchronized (atomicInteger) {
                atomicInteger.get();
                atomicInteger.set(-1);
            }
        } else {
            Eridanus.a();
        }
        Eridanus.c.set(z);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00c7  */
    /* JADX WARN: Multi-variable type inference failed */
    public static RiskDetectResp reqRiskDetectV2(Context context, boolean z, Map<Integer, String> map) {
        boolean z2;
        boolean z3;
        boolean z4;
        Olive olive;
        TuringSDK turingSDK;
        int iA = n0.a();
        if (iA != 0) {
            Log.i("TuringDebug", "init error : " + iA);
            olive = new Olive(iA);
        } else {
            String str = Nectarine.a;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                olive = new Olive(-10008);
            } else {
                Olive oliveB = Nectarine.b(context);
                if (oliveB != null && (oliveB.e & 1) != 0) {
                    z2 = z;
                    z2 = z;
                    z2 = true;
                }
                z2 = z;
                z2 = z;
                z2 = z;
                boolean z5 = z2;
                if (map != null && !map.isEmpty()) {
                    z5 = z2;
                    z5 = 2;
                }
                z5 = z2;
                if ((z5 & 1) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((z5 & 2) == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z3 && oliveB != null) {
                    if (Cumquat.b(context) && Math.abs(System.currentTimeMillis() - oliveB.c) >= oliveB.d) {
                        new Melon(null, true).a();
                    }
                } else if (!Cumquat.b(context)) {
                    if (!z4 || oliveB == null) {
                        olive = new Olive(-10012);
                    }
                } else {
                    FutureTask futureTaskA = new Melon(map, false).a();
                    try {
                        synchronized (o.class) {
                            turingSDK = o.J;
                        }
                        olive = (Olive) futureTaskA.get(turingSDK.w, TimeUnit.MILLISECONDS);
                    } catch (TimeoutException unused) {
                        if (z4 && oliveB != null) {
                            olive = oliveB;
                        } else {
                            olive = new Olive(-10004);
                        }
                    } catch (Exception e) {
                        Log.w("TuringFdJava", e);
                        if (!z4 || oliveB == null) {
                            olive = new Olive(-10015);
                        } else {
                            olive = oliveB;
                        }
                    }
                }
                olive = oliveB;
            }
        }
        return new l0(olive);
    }

    public static boolean screenProtect(Activity activity) {
        try {
            activity.getWindow().addFlags(8192);
            return true;
        } catch (Throwable th) {
            Log.e("", "screenProtect fail", th);
            return false;
        }
    }

    public static boolean screenUnProtect(Activity activity) {
        try {
            activity.getWindow().clearFlags(8192);
            return true;
        } catch (Throwable th) {
            Log.e("", "screenUnProtect fail", th);
            return false;
        }
    }

    public static RiskDetectResp reqRiskDetectV2(Context context, boolean z) {
        return reqRiskDetectV2(context, z, null);
    }

    public static RiskDetectResp reqRiskDetectV2(Context context) {
        return reqRiskDetectV2(context, true, null);
    }
}
