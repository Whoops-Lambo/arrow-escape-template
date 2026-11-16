package com.adsurge.adn.p032j0;

import android.os.SystemClock;
import com.adsurge.adn.Y0.c;
import com.adsurge.adn.Y0.i;
import com.adsurge.adn.Y0.v;
import com.singular.sdk.internal.Constants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class e {
    public static final String a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        public long a = -1;
        public long b = -1;
        public int c;
    }

    static {
        a = com.adsurge.adn.J0.a.a ? "DLPerf" : Constants.RequestBody.EXTRA_ATTRIBUTES_KEY;
    }

    public static void a(int i, long j, int i2, c cVar) {
        if (j < 0) {
            return;
        }
        i iVar = new i(i);
        iVar.b(j);
        iVar.b(i2);
        iVar.a(cVar);
        v.a(iVar);
        if (com.adsurge.adn.J0.a.a) {
            com.adsurge.adn.J0.a.a(a, "templateId = %s, event id = %s,  duration = %s , expValue = %s", cVar == null ? "" : cVar.a(), Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(i2));
        }
    }

    public static a b() {
        a aVarA = a();
        aVarA.a = SystemClock.elapsedRealtime();
        return aVarA;
    }

    public static void b(int i, a aVar, c cVar) {
        aVar.b = SystemClock.elapsedRealtime();
        a(i, aVar, cVar);
    }

    public static void a(int i, a aVar, c cVar) {
        long j = aVar.a;
        if (j >= 0) {
            long j2 = aVar.b;
            if (j2 < 0) {
                return;
            }
            a(i, j2 - j, aVar.c, cVar);
        }
    }

    public static a a() {
        return new a();
    }
}
