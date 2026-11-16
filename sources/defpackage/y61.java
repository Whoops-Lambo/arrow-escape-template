package defpackage;

import android.os.Build;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class y61 {
    public String a;
    public w61 b;
    public JSONArray c;
    public String d;
    public String e;
    public String f;
    public Long g;

    public final boolean a() {
        String str = this.f;
        Long l = this.g;
        w61 w61Var = this.b;
        int i = w61Var == null ? -1 : x61.$EnumSwitchMapping$0[w61Var.ordinal()];
        if (i == 1) {
            return (this.c == null || l == null) ? false : true;
        }
        if (i != 2) {
            return ((i != 3 && i != 4 && i != 5) || str == null || l == null) ? false : true;
        }
        return (str == null || this.e == null || l == null) ? false : true;
    }

    public final String toString() {
        Long l = this.g;
        w61 w61Var = this.b;
        int i = w61Var == null ? -1 : x61.$EnumSwitchMapping$0[w61Var.ordinal()];
        JSONObject jSONObject = null;
        try {
            if (i == 1) {
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray = this.c;
                if (jSONArray != null) {
                    jSONObject2.put("feature_names", jSONArray);
                }
                if (l != null) {
                    jSONObject2.put("timestamp", l);
                }
                jSONObject = jSONObject2;
            } else if (i == 2 || i == 3 || i == 4 || i == 5) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("device_os_version", Build.VERSION.RELEASE);
                jSONObject3.put("device_model", Build.MODEL);
                String str = this.d;
                if (str != null) {
                    jSONObject3.put("app_version", str);
                }
                if (l != null) {
                    jSONObject3.put("timestamp", l);
                }
                String str2 = this.e;
                if (str2 != null) {
                    jSONObject3.put("reason", str2);
                }
                String str3 = this.f;
                if (str3 != null) {
                    jSONObject3.put("callstack", str3);
                }
                if (w61Var != null) {
                    jSONObject3.put("type", w61Var);
                }
                jSONObject = jSONObject3;
            }
        } catch (JSONException unused) {
        }
        if (jSONObject == null) {
            String string = new JSONObject().toString();
            string.getClass();
            return string;
        }
        String string2 = jSONObject.toString();
        string2.getClass();
        return string2;
    }

    public final void b() {
        if (!a()) {
            return;
        }
        z61.g(this.a, toString());
    }
}
