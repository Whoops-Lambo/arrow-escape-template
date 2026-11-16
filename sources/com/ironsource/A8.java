package com.ironsource;

import android.util.Log;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class A8 {
    private static A8 b;
    private O5 a;

    private A8() {
    }

    public static void a(C4853le.a aVar, Map<String, Object> map) {
        O5 o5 = a().a;
        if (o5 == null) {
            Log.d(G5.a, G5.V);
            return;
        }
        if (map != null) {
            map.put("eventid", Integer.valueOf(aVar.b));
        }
        o5.a(aVar.a, map);
    }

    public static void a(I5 i5, C5080y8 c5080y8) {
        if (i5 != null) {
            try {
                a().a = new O5(i5, c5080y8);
            } catch (Exception e) {
                C4950r4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    public static void a(C4853le.a aVar) {
        a(aVar, new HashMap());
    }

    private static A8 a() {
        if (b == null) {
            b = new A8();
        }
        return b;
    }
}
