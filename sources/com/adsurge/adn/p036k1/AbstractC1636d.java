package com.adsurge.adn.p036k1;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.adsurge.adn.I0.e;
import com.adsurge.adn.J.a;
import com.adsurge.adn.N.b;
import com.adsurge.adn.Q.g;
import com.adsurge.adn.u1.c;
import java.util.Map;

/* JADX INFO: renamed from: com.adsurge.adn.k1.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC1636d {
    public static int a;
    public static volatile SharedPreferences b;

    static {
        int iA = b.a("freqdct", 0);
        a = iA;
        b = iA > 0 ? a.d().a().getSharedPreferences("com.qq.e.dlcci", 0) : null;
    }

    public static void a() {
        if (!b()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - b.getLong("dcflcm", 0L) >= 86400000) {
                SharedPreferences.Editor editorEdit = b.edit();
                boolean z = false;
                for (Map.Entry<String, ?> entry : b.getAll().entrySet()) {
                    entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof String) {
                        String str = (String) value;
                        if (!TextUtils.isEmpty(str) && jCurrentTimeMillis - new e(str).a().optLong("fct") > ((long) a) * 3600000) {
                            editorEdit.remove(entry.getKey());
                            z = true;
                        }
                    }
                }
                if (z) {
                    editorEdit.apply();
                }
            }
        }
    }

    public static void b(c cVar) {
        g gVarA0;
        if (!b() && (gVarA0 = cVar.a0()) != null && !gVarA0.u() && !gVarA0.f) {
            gVarA0.f = true;
            String strI = gVarA0.i();
            e eVar = new e(b.getString(strI, ""));
            int iOptInt = eVar.a().optInt("tct") + 1;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jOptLong = eVar.a().optLong("fct");
            if (jOptLong <= 0) {
                jOptLong = jCurrentTimeMillis;
            }
            eVar.a("freqId", strI);
            eVar.a("max", gVarA0.h());
            eVar.a("fct", jOptLong);
            eVar.a("lct", jCurrentTimeMillis);
            eVar.a("tct", iOptInt);
            b.edit().putString(strI, eVar.toString()).apply();
        }
    }

    public static boolean b() {
        return b == null;
    }

    public static String a(c cVar) {
        g gVarA0;
        if (!b() && (gVarA0 = cVar.a0()) != null && !gVarA0.u()) {
            String string = b.getString(gVarA0.i(), "");
            if (!TextUtils.isEmpty(string)) {
                return new e(string).a("max", gVarA0.h()).toString();
            }
        }
        return "";
    }
}
