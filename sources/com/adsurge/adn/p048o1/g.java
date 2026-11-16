package com.adsurge.adn.p048o1;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.adsurge.adn.Y0.c;
import com.adsurge.adn.Y0.d;
import com.adsurge.adn.w1.b;
import com.adsurge.adn.x1.m;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g {
    public static void b(int i, c cVar) {
        b.a(9130030, cVar, (Integer) 3, Integer.valueOf(a(i)), m.a());
    }

    public static void a(String str, c cVar, Throwable th) {
        if (str.length() > 256) {
            str = str.substring(0, 256);
        }
        String stackTraceString = Log.getStackTraceString(th);
        d dVar = new d();
        dVar.a(NotificationCompat.CATEGORY_MESSAGE, str + "...\nstack: " + stackTraceString);
        b.a(9130030, cVar, (Integer) 4, (Integer) 0, dVar);
    }

    public static void b() {
        b.a(9130040, (c) null);
    }

    public static void b(long j, c cVar) {
        b.a(9130030, cVar, (Integer) 5, Integer.valueOf(a((int) j)), (d) null);
    }

    public static void a(int i, c cVar, String str) {
        d dVar;
        if (i > 100) {
            dVar = new d();
            dVar.a(NotificationCompat.CATEGORY_MESSAGE, str);
        } else {
            dVar = null;
        }
        b.a(9130030, cVar, (Integer) 2, Integer.valueOf(a(i)), dVar);
    }

    public static void a(c cVar) {
        b.a(9130031, cVar, (Integer) 1, (Integer) 1, m.a());
    }

    public static void a() {
        b.a(9130031, (c) null, (Integer) 1, (Integer) 2, (d) null);
    }

    public static void a(int i, String str) {
        d dVar = new d();
        dVar.a(NotificationCompat.CATEGORY_MESSAGE, str);
        b.a(6001700, (c) null, Integer.valueOf(i), dVar);
    }

    public static void a(long j, c cVar) {
        b.a(9130030, cVar, (Integer) 6, Integer.valueOf(a((int) j)), (d) null);
    }

    public static void a(int i, c cVar) {
        b.a(9130030, cVar, (Integer) 1, Integer.valueOf(a(i)), (d) null);
    }

    public static void a(String str, c cVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("eventId", -1);
            if (iOptInt == -1) {
                return;
            }
            int iOptInt2 = jSONObject.optInt("enumCode", -1);
            int iOptInt3 = jSONObject.optInt(IronSourceConstants.EVENTS_ERROR_CODE, -1);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extra");
            d dVar = null;
            Integer numValueOf = iOptInt2 == -1 ? null : Integer.valueOf(iOptInt2);
            Integer numValueOf2 = iOptInt3 == -1 ? null : Integer.valueOf(iOptInt3);
            if (jSONObjectOptJSONObject != null) {
                dVar = new d(jSONObjectOptJSONObject);
            }
            b.a(iOptInt, cVar, numValueOf, numValueOf2, dVar);
        } catch (Exception unused) {
        }
    }

    public static int a(int i) {
        if (i > 100) {
            return 100;
        }
        return i / 5;
    }
}
