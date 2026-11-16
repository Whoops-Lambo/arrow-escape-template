package com.adsurge.adn.oversea_ad;

import android.util.Log;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class v extends Thread {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ITuringDeviceInfoProvider c;
    public final /* synthetic */ Object d;

    public v(AtomicBoolean atomicBoolean, HashMap map, ITuringDeviceInfoProvider iTuringDeviceInfoProvider, Object obj) {
        this.a = atomicBoolean;
        this.b = map;
        this.c = iTuringDeviceInfoProvider;
        this.d = obj;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        super.run();
        if (!this.a.get()) {
            try {
                HashMap map = this.b;
                String imei = this.c.getImei();
                if (imei == null) {
                    imei = "";
                }
                map.put("274", imei);
                HashMap map2 = this.b;
                String imsi = this.c.getImsi();
                if (imsi == null) {
                    imsi = "";
                }
                map2.put("276", imsi);
                HashMap map3 = this.b;
                String androidId = this.c.getAndroidId();
                if (androidId == null) {
                    androidId = "";
                }
                map3.put("275", androidId);
            } catch (Throwable unused) {
                Log.w("Turing", "invoke info impl exception");
            }
            synchronized (this.d) {
                this.d.notify();
            }
        }
    }
}
