package com.tiktok.util;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class TTKeyValueStore {
    private SharedPreferences preferences;

    public String get(String str) {
        SharedPreferences sharedPreferences = this.preferences;
        return sharedPreferences == null ? "" : sharedPreferences.getString(str, null);
    }

    public int getInt(String str) {
        return this.preferences.getInt(str, 0);
    }

    public void set(HashMap<String, Object> map) {
        SharedPreferences sharedPreferences = this.preferences;
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            editorEdit.putString(entry.getKey(), entry.getValue().toString());
        }
        editorEdit.apply();
    }

    public TTKeyValueStore(Context context) {
        this.preferences = null;
        try {
            this.preferences = context.getApplicationContext().getSharedPreferences(TTConst.TTSDK_KEY_VALUE_STORE, 0);
        } catch (Throwable unused) {
        }
    }

    public void set(String str, Object obj) {
        SharedPreferences sharedPreferences = this.preferences;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putString(str, obj.toString()).apply();
    }
}
