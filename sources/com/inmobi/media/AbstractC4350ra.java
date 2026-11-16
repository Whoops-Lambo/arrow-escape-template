package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.ra, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4350ra {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public static boolean c;
    public static boolean d;
    public static JSONObject e;
    public static JSONObject f;

    public static final JSONObject a() {
        synchronized (b) {
            if (d) {
                Objects.toString(f);
                return f;
            }
            d = true;
            Context context = AbstractC4221mk.a;
            String string = null;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                string = Cb.a(context, "unified_id_info_store").a.getString("publisher_provided_unified_id", null);
            }
            try {
                try {
                    f = new JSONObject(string);
                } catch (NullPointerException e2) {
                    e2.getMessage();
                }
            } catch (JSONException e3) {
                e3.getMessage();
            }
            Objects.toString(f);
            return f;
        }
    }

    public static final void b(JSONObject jSONObject) {
        synchronized (a) {
            try {
                e = jSONObject;
                c = true;
                Context context = AbstractC4221mk.a;
                if (context != null) {
                    ConcurrentHashMap concurrentHashMap = Db.b;
                    Db dbA = Cb.a(context, "unified_id_info_store");
                    JSONObject jSONObject2 = e;
                    if (jSONObject2 == null) {
                        dbA.a("ufids");
                    } else {
                        dbA.a("ufids", String.valueOf(jSONObject2), false);
                    }
                    SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
                    JSONObject jSONObject3 = e;
                    if (jSONObject3 == null) {
                        editorEdit.remove("InMobi_unifiedId");
                    } else {
                        editorEdit.putString("InMobi_unifiedId", String.valueOf(jSONObject3));
                    }
                    editorEdit.apply();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void a(JSONObject jSONObject) {
        synchronized (b) {
            try {
                Objects.toString(f);
                Objects.toString(jSONObject);
                f = jSONObject;
                d = true;
                Context context = AbstractC4221mk.a;
                if (context != null) {
                    ConcurrentHashMap concurrentHashMap = Db.b;
                    Db dbA = Cb.a(context, "unified_id_info_store");
                    JSONObject jSONObject2 = f;
                    if (jSONObject2 == null) {
                        dbA.a("publisher_provided_unified_id");
                    } else {
                        dbA.a("publisher_provided_unified_id", String.valueOf(jSONObject2), false);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final JSONObject b() {
        synchronized (a) {
            if (c) {
                return e;
            }
            c = true;
            Context context = AbstractC4221mk.a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                String string = Cb.a(context, "unified_id_info_store").a.getString("ufids", null);
                if (string != null) {
                    try {
                        e = new JSONObject(string);
                    } catch (JSONException e2) {
                        e2.getMessage();
                    }
                    return e;
                }
            }
            return null;
        }
    }
}
