package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ka, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class C4831ka {
    private static final String b = "ka";
    private static final String c = "supersonic_shared_preferen";
    private static final String d = "version";
    private static final String e = "back_button_state";
    private static final String f = "search_keys";
    private static final String g = "^\\d+_\\d+$";
    private static C4831ka h;
    private SharedPreferences a;

    public boolean a(String str, String str2, String str3) {
        String string = this.a.getString("ssaUserData", null);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(string);
            if (jSONObjectJsonObjectInit.isNull(str2)) {
                return false;
            }
            JSONObject jSONObject = jSONObjectJsonObjectInit.getJSONObject(str2);
            if (jSONObject.isNull(str3)) {
                return false;
            }
            jSONObject.getJSONObject(str3).put("timestamp", str);
            SharedPreferences.Editor editorEdit = this.a.edit();
            editorEdit.putString("ssaUserData", jSONObjectJsonObjectInit.toString());
            editorEdit.apply();
            return true;
        } catch (JSONException e2) {
            C4950r4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return false;
        }
    }

    public C4990t8.a b() {
        int i = Integer.parseInt(this.a.getString(e, "2"));
        if (i == 0) {
            return C4990t8.a.None;
        }
        if (i == 1) {
            return C4990t8.a.Device;
        }
        return i == 2 ? C4990t8.a.Controller : C4990t8.a.Controller;
    }

    public void c(String str) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putString(e, str);
        editorEdit.apply();
    }

    public List<String> d() {
        String string = this.a.getString(f, null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            C4871me c4871me = new C4871me(string);
            if (c4871me.a(C4664b4.i.R)) {
                try {
                    arrayList.addAll(c4871me.a((JSONArray) c4871me.b(C4664b4.i.R)));
                    return arrayList;
                } catch (JSONException e2) {
                    C4950r4.d().a(e2);
                    IronLog.INTERNAL.error(e2.toString());
                }
            }
        }
        return arrayList;
    }

    public void e(String str) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putString(f, str);
        editorEdit.apply();
    }

    private C4831ka(Context context) {
        this.a = context.getSharedPreferences("supersonic_shared_preferen", 0);
    }

    public static synchronized C4831ka e() {
        return h;
    }

    public String c() {
        return this.a.getString("version", C4788i2.f);
    }

    private boolean b(String str) {
        return str.matches(g);
    }

    public void d(String str) {
        if (c().equalsIgnoreCase(str)) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putString("version", str);
        editorEdit.apply();
    }

    public void a(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public String a(String str) {
        String string = this.a.getString(str, null);
        return string != null ? string : JsonUtils.EMPTY_JSON;
    }

    public static synchronized C4831ka a(Context context) {
        try {
            if (h == null) {
                h = new C4831ka(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return h;
    }

    public ArrayList<String> a() {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strArr = (String[]) this.a.getAll().keySet().toArray(new String[0]);
        SharedPreferences.Editor editorEdit = this.a.edit();
        for (String str : strArr) {
            if (b(str)) {
                arrayList.add(str);
                editorEdit.remove(str);
            }
        }
        editorEdit.apply();
        return arrayList;
    }
}
