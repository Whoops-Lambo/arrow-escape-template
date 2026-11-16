package com.bytedance.sdk.openadsdk.lqi;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class rz {
    private final Context ahm;
    private SharedPreferences kgy;
    private final String rz;

    public void kgy(JSONObject jSONObject) {
        try {
            SharedPreferences sharedPreferencesKgy = kgy();
            if (sharedPreferencesKgy != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesKgy.edit();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        if (!TextUtils.isEmpty(next)) {
                            Object obj = jSONObject.get(next);
                            if (obj instanceof Integer) {
                                editorEdit.putInt(next, ((Integer) obj).intValue());
                            } else if (obj instanceof Long) {
                                editorEdit.putLong(next, ((Long) obj).longValue());
                            } else if (obj instanceof String) {
                                editorEdit.putString(next, (String) obj);
                            } else if (obj instanceof Boolean) {
                                editorEdit.putBoolean(next, ((Boolean) obj).booleanValue());
                            } else if (obj instanceof Float) {
                                editorEdit.putFloat(next, ((Float) obj).floatValue());
                            } else if (obj instanceof Double) {
                                editorEdit.putFloat(next, ((Double) obj).floatValue());
                            } else {
                                editorEdit.putString(next, String.valueOf(obj));
                            }
                        }
                    } catch (Throwable th) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE58FsilP6yqM", "aN4Ymwqo", "S/s5vxCzZw==", 70);
                        Log.e("SPUnit", th.getMessage());
                    }
                }
                editorEdit.apply();
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE58FsilP6yqM", "aN4Ymwqo", "S/s5vxCzZw==", 77);
            Log.e("SPUnit", th2.getMessage());
        }
    }

    public rz(Context context, String str) {
        this.ahm = context;
        this.rz = str;
    }

    public long ahm(String str, long j) {
        try {
            SharedPreferences sharedPreferencesKgy = kgy();
            if (sharedPreferencesKgy != null && sharedPreferencesKgy.contains(str)) {
                return sharedPreferencesKgy.getLong(str, j);
            }
            return j;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE58FsilP6yqM", "aN4Ymwqo", "XOs5uQyybg==", 128);
            Log.i("SPUnit", this.rz + th.getMessage());
            return j;
        }
    }

    public void ahm() {
        SharedPreferences sharedPreferencesKgy = kgy();
        if (sharedPreferencesKgy != null) {
            SharedPreferences.Editor editorEdit = sharedPreferencesKgy.edit();
            editorEdit.clear();
            editorEdit.commit();
        }
    }

    public SharedPreferences kgy() {
        Context context;
        SharedPreferences sharedPreferences = this.kgy;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        if (TextUtils.isEmpty(this.rz) || (context = this.ahm) == null) {
            return null;
        }
        try {
            this.kgy = context.getSharedPreferences(this.rz, 0);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE58FsilP6yqM", "aN4Ymwqo", "XOs5pgu9e8KEesVYihSyLVXtKIY=", 36);
            Log.e("SPUnit", th.getMessage());
        }
        return this.kgy;
    }

    public void kgy(String str, long j) {
        try {
            SharedPreferences sharedPreferencesKgy = kgy();
            if (sharedPreferencesKgy != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesKgy.edit();
                editorEdit.putLong(str, j);
                editorEdit.apply();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE58FsilP6yqM", "aN4Ymwqo", "S/s5uQyybg==", 92);
            Log.e("SPUnit", th.getMessage());
        }
    }

    public int kgy(String str, int i) {
        try {
            SharedPreferences sharedPreferencesKgy = kgy();
            if (sharedPreferencesKgy != null && sharedPreferencesKgy.contains(str)) {
                return sharedPreferencesKgy.getInt(str, i);
            }
            return i;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE58FsilP6yqM", "aN4Ymwqo", "XOs5vA2o", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            Log.i("SPUnit", this.rz + th.getMessage());
            return i;
        }
    }

    public String kgy(String str, String str2) {
        try {
            SharedPreferences sharedPreferencesKgy = kgy();
            if (sharedPreferencesKgy != null && sharedPreferencesKgy.contains(str)) {
                return sharedPreferencesKgy.getString(str, str2);
            }
            return str2;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE58FsilP6yqM", "aN4Ymwqo", "XOs5pheuYMmH", 142);
            Log.i("SPUnit", this.rz + th.getMessage());
            return str2;
        }
    }

    public boolean kgy(String str, boolean z) {
        try {
            SharedPreferences sharedPreferencesKgy = kgy();
            if (sharedPreferencesKgy != null && sharedPreferencesKgy.contains(str)) {
                return sharedPreferencesKgy.getBoolean(str, z);
            }
            return z;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE58FsilP6yqM", "aN4Ymwqo", "XOs5twyzZcKBRA==", 170);
            Log.i("SPUnit", this.rz + th.getMessage());
            return z;
        }
    }

    public <T> T kgy(String str, T t, ahm.kgy<T> kgyVar) {
        String string;
        T tAhm;
        if (str != null && !str.isEmpty()) {
            try {
                SharedPreferences sharedPreferencesKgy = kgy();
                if (sharedPreferencesKgy != null && sharedPreferencesKgy.contains(str) && (string = sharedPreferencesKgy.getString(str, null)) != null && kgyVar != null && (tAhm = kgyVar.ahm(string)) != null) {
                    return tAhm;
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE58FsilP6yqM", "aN4Ymwqo", "XOs5ugG2bMSU", 198);
                Log.i("SPUnit", this.rz + th.getMessage());
            }
        }
        return t;
    }
}
