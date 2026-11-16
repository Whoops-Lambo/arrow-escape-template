package defpackage;

import com.facebook.a0;
import com.facebook.appevents.f;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.f0;
import com.facebook.internal.v0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class bi0 {
    public static boolean b;
    public static final bi0 a = new bi0();
    public static final ArrayList c = new ArrayList();
    public static final HashSet d = new HashSet();

    public final synchronized void a() {
        if (lz.a.contains(this)) {
            return;
        }
        try {
            f0 f0VarQueryAppSettings = FetchedAppSettingsManager.queryAppSettings(a0.b(), false);
            if (f0VarQueryAppSettings == null) {
                return;
            }
            String str = f0VarQueryAppSettings.m;
            if (str != null && str.length() > 0) {
                JSONObject jSONObject = new JSONObject(str);
                c.clear();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    if (jSONObject2 != null) {
                        if (jSONObject2.optBoolean("is_deprecated_event")) {
                            HashSet hashSet = d;
                            next.getClass();
                            hashSet.add(next);
                        } else {
                            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("deprecated_param");
                            next.getClass();
                            ArrayList arrayList = new ArrayList();
                            ai0 ai0Var = new ai0();
                            ai0Var.a = next;
                            ai0Var.b = arrayList;
                            if (jSONArrayOptJSONArray != null) {
                                ai0Var.b = v0.h(jSONArrayOptJSONArray);
                            }
                            c.add(ai0Var);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            lz.a(this, th);
        }
    }

    public static final void b(ArrayList arrayList) {
        if (lz.a.contains(bi0.class)) {
            return;
        }
        try {
            arrayList.getClass();
            if (b) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (d.contains(((f) it.next()).e)) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th) {
            lz.a(bi0.class, th);
        }
    }
}
