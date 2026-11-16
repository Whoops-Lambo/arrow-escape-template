package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import defpackage.p32;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Lm {
    public static C4533y1 a;

    public static void a(boolean z) {
        C4533y1 c4533y1 = a;
        if (c4533y1 == null) {
            return;
        }
        if (z) {
            c4533y1.b = null;
        } else if (c4533y1.b == null) {
            AbstractC4221mk.h.submit(new defpackage.u(8));
        }
    }

    public static void b() {
        String str;
        try {
            C4533y1 c4533y1 = a;
            if (c4533y1 == null || (str = c4533y1.b) == null) {
                return;
            }
            Kc.a((byte) 2, "Lm", "Publisher device Id is ".concat(str));
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void c() {
        boolean z;
        boolean zBooleanValue;
        C4533y1 c4533y1;
        try {
            Context context = AbstractC4221mk.a;
            if (context != null) {
                C4533y1 c4533y2 = new C4533y1();
                try {
                    p32.a(AdvertisingIdClient.class).getSimpleName();
                    try {
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                        advertisingIdInfo.getClass();
                        c4533y2.b = advertisingIdInfo.getId();
                        c4533y2.a(advertisingIdInfo.isLimitAdTrackingEnabled());
                        a = c4533y2;
                        Boolean bool = AbstractC4247ni.b;
                        if (bool == null) {
                            Context context2 = AbstractC4221mk.a;
                            z = false;
                            if (context2 != null) {
                                ConcurrentHashMap concurrentHashMap = Db.b;
                                AbstractC4247ni.b = Boolean.valueOf(Cb.a(context2, "user_info_store").a.getBoolean("user_age_restricted", false));
                            }
                            Boolean bool2 = AbstractC4247ni.b;
                            if (bool2 != null) {
                                zBooleanValue = bool2.booleanValue();
                            }
                            if (z || (c4533y1 = a) == null) {
                            }
                            c4533y1.b = null;
                            return;
                        }
                        zBooleanValue = bool.booleanValue();
                        z = zBooleanValue;
                        if (z) {
                        }
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static final void d() {
        c();
    }

    public static void a() {
        try {
            c();
            b();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
