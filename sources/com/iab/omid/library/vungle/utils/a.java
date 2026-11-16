package com.iab.omid.library.vungle.utils;

import android.content.Context;
import com.iab.omid.library.vungle.adsession.DeviceCategory;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static Context a;
    private static volatile DeviceCategory b;

    public static DeviceCategory a() {
        if (b == null && a != null) {
            b();
        }
        return b == null ? DeviceCategory.OTHER : b;
    }

    private static synchronized void b() {
        if (a == null || b != null) {
            return;
        }
        try {
            b = a(a.getResources().getConfiguration().uiMode & 15);
        } catch (RuntimeException unused) {
        }
    }

    private static DeviceCategory a(int i) {
        if (i != 1) {
            return i != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV;
        }
        return DeviceCategory.MOBILE;
    }

    public static void a(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            a = applicationContext;
            if (applicationContext == null) {
                a = context;
            }
        }
        b = null;
    }
}
