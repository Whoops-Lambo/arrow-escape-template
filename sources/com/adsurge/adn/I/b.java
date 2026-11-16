package com.adsurge.adn.I;

import androidx.core.app.NotificationCompat;
import com.adsurge.adn.N.d;
import com.adsurge.adn.Y0.c;
import com.singular.sdk.internal.UserDetailsUtils;
import defpackage.h50;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class b {
    public final JSONObject a = new JSONObject();

    public String toString() {
        return this.a.toString();
    }

    public b(boolean z) {
        b(d.b().a());
        a(Thread.currentThread().getId());
        if (!z) {
            a(a());
        }
    }

    public final String a() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int i = 4;
        if (4 >= stackTrace.length) {
            return "Unknown";
        }
        StackTraceElement stackTraceElement = stackTrace[4];
        String className = stackTraceElement.getClassName();
        while (true) {
            if (!className.equals(b.class.getName()) && !className.equals(a.class.getName())) {
                StringBuilder sbQ = h50.q(className, UserDetailsUtils.UserDetailsLiterals.DOT);
                sbQ.append(stackTraceElement.getMethodName());
                return sbQ.toString();
            }
            i++;
            if (i >= stackTrace.length) {
                return "Unknown";
            }
            stackTraceElement = stackTrace[i];
            className = stackTraceElement.getClassName();
        }
    }

    public final void b(long j) {
        a("ts", Long.valueOf(j));
    }

    public void b(String str) {
        a(NotificationCompat.CATEGORY_MESSAGE, str);
    }

    public JSONObject b() {
        return this.a;
    }

    public void a(c cVar) {
        if (cVar != null) {
            a("biz", cVar.c());
        }
    }

    public final void a(long j) {
        a("thread", Long.valueOf(j));
    }

    public final void a(String str) {
        a("func", str);
    }

    public final void a(String str, Object obj) {
        if (com.adsurge.adn.K.b.a(str) || str == null || str.isEmpty() || obj == null) {
            return;
        }
        try {
            this.a.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
