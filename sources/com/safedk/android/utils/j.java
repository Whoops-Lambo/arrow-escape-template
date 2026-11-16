package com.safedk.android.utils;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class j {
    public static final String a = "sdk_key";
    public static final String b = "userUUID";
    public static final String c = "configuration";
    public static final String d = "last_reported_device_at";
    public static final String e = "last_reported_version";
    public static final String f = "configETag";
    public static final String g = "sdk_version";
    public static final String h = "versionCode";
    public static final int i = -1;
    public static final String j = "";
    private static final String k = "SharedPreferencesUtils";
    private static final String l = "offlineMode";
    private static final String m = "age";
    private static final String n = "region";
    private static final String o = "last_foreground_time";
    private static final String p = "last_foreground_report";
    private static final String q = "sdk_versions";
    private static final String r = "is_reported";
    private static final String v = "safedk_stored_version";
    private static final String w = "§§";
    private final SharedPreferences s;
    private boolean t;
    private JSONObject u;

    public j(SharedPreferences sharedPreferences, boolean z) {
        this.s = sharedPreferences;
        this.t = z;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006d A[Catch: JSONException -> 0x006b, Throwable -> 0x0094, TRY_LEAVE, TryCatch #0 {JSONException -> 0x006b, blocks: (B:8:0x0057, B:11:0x005f, B:13:0x0065, B:16:0x006d), top: B:26:0x0057, outer: #1 }] */
    private void a(Map<String, String> map) {
        try {
            this.u = new JSONObject(this.s.getString(q, JsonUtils.EMPTY_JSON));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String sdkUUIDByPackage = SdksMapping.getSdkUUIDByPackage(key);
                Logger.d(k, "addDiscoveredVersionsToVersionsJson sdkPackage=", key, ", version=", value, ", uuid=", sdkUUIDByPackage);
                if (sdkUUIDByPackage == null) {
                    Logger.d(k, "UUID for sdkPackage ", key, "is empty and will not be added to sdkVersionsJson");
                } else {
                    try {
                        if (sdkUUIDByPackage.length() > 0 && value != null && value.length() > 0) {
                            this.u.put(sdkUUIDByPackage, value);
                        } else {
                            Logger.d(k, "UUID for sdkPackage ", key, "is empty and will not be added to sdkVersionsJson");
                        }
                    } catch (JSONException e2) {
                        Logger.d(k, "error in addDiscoveredVersionsToVersionsJson", e2);
                    }
                }
            }
            a(this.u);
        } catch (Throwable th) {
            Logger.e(k, "Exception in addDiscoveredVersionsToVersionsJson", th);
        }
    }

    private void a(JSONObject jSONObject) {
        SharedPreferences.Editor editorEdit = this.s.edit();
        editorEdit.putString(q, jSONObject.toString());
        Logger.d(k, "saveSdkVersions saved (", Integer.valueOf(jSONObject.length()), " items) : ", jSONObject.toString());
        editorEdit.apply();
    }

    public String a() {
        return this.s.getString(b, null);
    }

    public boolean b() {
        return this.s.getBoolean(l, this.t);
    }

    public Integer c() {
        int i2 = this.s.getInt("age", -1);
        if (i2 < 0) {
            return null;
        }
        return new Integer(i2);
    }

    public String d() {
        return this.s.getString("region", null);
    }

    public Bundle e() {
        Logger.d(k, "getConfiguration started");
        return a(this.s, c);
    }

    public long f() {
        return this.s.getLong(d, 0L);
    }

    public int g() {
        return this.s.getInt(e, 0);
    }

    public long h() {
        return this.s.getLong(o, 0L);
    }

    public long i() {
        return this.s.getLong(p, 0L);
    }

    public JSONObject j() {
        return this.u;
    }

    public void a(long j2) {
        SharedPreferences.Editor editorEdit = this.s.edit();
        editorEdit.putLong(o, j2);
        editorEdit.apply();
    }

    public String k() {
        return this.s.getString(f, null);
    }

    public void a(String str) {
        SharedPreferences.Editor editorEdit = this.s.edit();
        editorEdit.putString(b, str);
        editorEdit.apply();
    }

    public boolean l() {
        return this.s.contains(c);
    }

    public void a(Bundle bundle) {
        try {
            SharedPreferences.Editor editorEdit = this.s.edit();
            String strO = o();
            String strA = a();
            editorEdit.clear();
            a(editorEdit, c, bundle);
            if (strO != null) {
                editorEdit.putString(v, strO);
            }
            if (strA != null) {
                editorEdit.putString(b, strA);
            }
            editorEdit.apply();
        } catch (Throwable th) {
            Logger.e(k, "Caught exception : ", th.getMessage(), th);
        }
    }

    public static void a(SharedPreferences.Editor editor, String str, Bundle bundle) {
        String str2 = str + w;
        for (String str3 : bundle.keySet()) {
            Object obj = bundle.get(str3);
            if (obj == null) {
                editor.remove(str2 + str3);
            } else if (obj instanceof Integer) {
                editor.putInt(str2 + str3, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                editor.putLong(str2 + str3, ((Long) obj).longValue());
            } else if (obj instanceof Boolean) {
                editor.putBoolean(str2 + str3, ((Boolean) obj).booleanValue());
            } else if (obj instanceof CharSequence) {
                editor.putString(str2 + str3, ((CharSequence) obj).toString());
            } else {
                if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 0 && (arrayList.get(0) instanceof String)) {
                        editor.putStringSet(str2 + str3, new HashSet(arrayList));
                    }
                }
                if (obj instanceof Bundle) {
                    a(editor, str2 + str3, (Bundle) obj);
                }
            }
        }
    }

    public static Bundle a(SharedPreferences sharedPreferences, String str) {
        Logger.d(k, "loadPreferencesBundle started, key=", str);
        Bundle bundle = new Bundle();
        Map<String, ?> all = sharedPreferences.getAll();
        String str2 = str + w;
        HashSet<String> hashSet = new HashSet();
        for (String str3 : all.keySet()) {
            if (str3.startsWith(str2)) {
                String strB = b(str3, str2);
                if (!strB.contains(w)) {
                    Object obj = all.get(str3);
                    if (obj != null) {
                        if (obj instanceof Integer) {
                            bundle.putInt(strB, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(strB, ((Long) obj).longValue());
                        } else if (obj instanceof Boolean) {
                            bundle.putBoolean(strB, ((Boolean) obj).booleanValue());
                        } else if (obj instanceof CharSequence) {
                            bundle.putString(strB, ((CharSequence) obj).toString());
                        } else if (obj instanceof HashSet) {
                            bundle.putStringArrayList(strB, new ArrayList<>((HashSet) obj));
                        }
                    }
                } else {
                    hashSet.add(a(strB, w));
                }
            }
        }
        for (String str4 : hashSet) {
            bundle.putBundle(str4, a(sharedPreferences, str2 + str4));
        }
        return bundle;
    }

    public static String a(String str, String str2) {
        if (b(str) || str2 == null) {
            return str;
        }
        if (str2.length() == 0) {
            return "";
        }
        int iIndexOf = str.indexOf(str2);
        if (iIndexOf == -1) {
            return str;
        }
        return str.substring(0, iIndexOf);
    }

    public static boolean b(String str) {
        return str == null || str.length() == 0;
    }

    public static String b(String str, String str2) {
        if (!b(str) && !b(str2) && str.startsWith(str2)) {
            return str.substring(str2.length());
        }
        return str;
    }

    public void a(int i2, String str) {
        try {
            SharedPreferences.Editor editorEdit = this.s.edit();
            editorEdit.putInt(h, i2);
            editorEdit.putString("sdk_key", str);
            Logger.d(k, "save sdk key ", str, ", version code ", Integer.valueOf(i2));
            editorEdit.apply();
        } catch (Throwable th) {
            Logger.d(k, "Caught exception", th);
        }
    }

    public String m() {
        String string = this.s.getString("sdk_key", null);
        Logger.d(k, "read sdk key ", string);
        return string;
    }

    public int n() {
        int i2 = this.s.getInt(h, 0);
        Logger.d(k, "read version code ", Integer.valueOf(i2));
        return i2;
    }

    public void c(String str) {
        SharedPreferences.Editor editorEdit = this.s.edit();
        editorEdit.putString(v, str);
        editorEdit.apply();
    }

    public String o() {
        return this.s.getString(v, null);
    }
}
