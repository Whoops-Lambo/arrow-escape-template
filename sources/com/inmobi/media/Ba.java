package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.CrashConfig;
import defpackage.cm2;
import defpackage.eu;
import defpackage.gd1;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Ba {
    public static final gd1 a = new cm2(new defpackage.v2(3));
    public static final Aa b;
    public static final V5 c;
    public static final Kb d;

    static {
        long jCurrentTimeMillis = System.currentTimeMillis();
        b = new Aa();
        d = new Kb(a());
        Context context = AbstractC4221mk.a;
        if (context != null) {
            c = new V5(context, a(), (C4518xd) AbstractC4221mk.f.getValue());
        }
        if (a().getCrashConfig().getReportSessionInfo()) {
            C4483w5 c4483w5 = C4483w5.d;
            c4483w5.getClass();
            Db dbA = Ea.a();
            if (dbA != null) {
                dbA.a(c4483w5.a, jCurrentTimeMillis, true);
            }
            Db dbA2 = Ea.a();
            if (dbA2 != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                dbA2.a("s-cnt", 0, false);
            }
        }
        if (AbstractC4133jg.a.getCrashConfig().getReportOOMInfo()) {
            for (AbstractC4537y5 abstractC4537y5 : eu.z(C4510x5.d, C4456v5.d)) {
                abstractC4537y5.getClass();
                Db dbA3 = Ea.a();
                if (dbA3 != null) {
                    dbA3.a(abstractC4537y5.a, jCurrentTimeMillis, true);
                }
            }
        }
    }

    public static final C4569za b() {
        return new C4569za(T9.b());
    }

    public static void a(JSONObject jSONObject, boolean z, long j) throws JSONException {
        jSONObject.getClass();
        if (!a().getCrashConfig().getReportSessionInfo() || !z) {
            return;
        }
        C4483w5 c4483w5 = C4483w5.d;
        c4483w5.getClass();
        Db dbA = Ea.a();
        long j2 = 0;
        if (dbA != null) {
            String str = c4483w5.a;
            str.getClass();
            long j3 = dbA.a.getLong(str, 0L);
            String str2 = c4483w5.b;
            if (j3 == 0) {
                dbA.a(str2, j, true);
            } else {
                dbA.a(str2, j - j3, true);
            }
        }
        Db dbA2 = Ea.a();
        if (dbA2 != null) {
            String str3 = c4483w5.b;
            str3.getClass();
            j2 = dbA2.a.getLong(str3, 0L);
        }
        jSONObject.put("crashFreeSessionLength", j2);
        Db dbA3 = Ea.a();
        int i = 0;
        if (dbA3 != null) {
            i = dbA3.a.getInt("s-cnt", 0);
        }
        jSONObject.put("crashFreeSessionCount", i);
    }

    public static void c() {
        Db dbA;
        if (a().getCrashConfig().getReportSessionInfo() && (dbA = Ea.a()) != null) {
            dbA.a("s-cnt", dbA.a.getInt("s-cnt", 0) + 1, false);
        }
        V5 v5 = c;
        if (v5 != null) {
            Iterator it = v5.c.iterator();
            while (it.hasNext()) {
                ((U5) it.next()).a();
            }
        }
        Kb kb = d;
        kb.getClass();
        AbstractC4447un.a(new Hb(kb, null));
        ((C4518xd) AbstractC4221mk.f.getValue()).a(new int[]{2, 1, 152, 150, 151}, kb.d);
        J4 j4 = AbstractC4563z4.a;
        AbstractC4563z4.a("crashReporting", b);
    }

    public static void a(C4120j3 c4120j3) {
        c4120j3.getClass();
        Kb kb = d;
        kb.getClass();
        if (kb.a.getCatchConfig().getEnabled() && kb.c.b.a()) {
            AbstractC4447un.a(new Gb(kb, c4120j3, null));
        }
    }

    public static CrashConfig a() {
        return (CrashConfig) AbstractC4563z4.a.a(CrashConfig.class);
    }
}
