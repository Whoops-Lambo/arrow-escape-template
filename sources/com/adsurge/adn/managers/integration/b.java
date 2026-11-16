package com.adsurge.adn.managers.integration;

import android.content.Context;
import com.adsurge.adn.I0.e;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class b {
    public static final List a = Arrays.asList(new c(), new d(), new a());
    public static final AtomicBoolean b = new AtomicBoolean(false);

    public static JSONObject a(Context context, List list) {
        e eVar = new e();
        eVar.a("v", 1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            IntegrationProbe integrationProbe = (IntegrationProbe) it.next();
            String strKey = integrationProbe.key();
            if (integrationProbe.isEnabled()) {
                eVar.a(strKey, integrationProbe.collect(context));
            }
        }
        return eVar.a();
    }

    public static boolean a() {
        return com.adsurge.adn.N.b.a("odciss", 1) == 1;
    }

    public static void a(Context context) {
        if (context != null) {
            try {
                if (a() && b.compareAndSet(false, true)) {
                    com.adsurge.adn.w1.b.a(6001503, (com.adsurge.adn.Y0.c) null, (Integer) null, (Integer) null, new com.adsurge.adn.Y0.d(a(context, a)));
                }
            } catch (Throwable unused) {
            }
        }
    }
}
