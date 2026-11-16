package defpackage;

import android.content.Context;
import android.util.Log;
import com.facebook.a0;
import com.facebook.appevents.d;
import com.facebook.appevents.n;
import com.facebook.internal.e;
import com.facebook.internal.k0;
import com.facebook.internal.v0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class t7 {
    public static final HashMap a = qh1.W(new dt1(s7.a, "MOBILE_APP_INSTALL"), new dt1(s7.b, "CUSTOM_APP_EVENTS"));

    public static final JSONObject a(s7 s7Var, e eVar, String str, boolean z, Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", a.get(s7Var));
        if (!d.c) {
            Log.w("d", "initStore should have been called before calling setUserID");
            d.a();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = d.a;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str2 = d.b;
            reentrantReadWriteLock.readLock().unlock();
            if (str2 != null) {
                jSONObject.put("app_user_id", str2);
            }
            v0.V(jSONObject, eVar, str, z, context);
            try {
                v0.W(context, jSONObject);
            } catch (Exception e) {
                n nVar = k0.c;
                e.toString();
                synchronized (a0.b) {
                }
            }
            JSONObject jSONObjectR = v0.r();
            if (jSONObjectR != null) {
                Iterator<String> itKeys = jSONObjectR.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectR.get(next));
                }
            }
            jSONObject.put("application_package_name", context.getPackageName());
            return jSONObject;
        } catch (Throwable th) {
            d.a.readLock().unlock();
            throw th;
        }
    }
}
