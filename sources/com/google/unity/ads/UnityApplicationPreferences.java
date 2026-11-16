package com.google.unity.ads;

import android.app.Activity;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class UnityApplicationPreferences {
    private final SharedPreferences defaultSharedPreferences;

    public int getInt(String str) {
        return this.defaultSharedPreferences.getInt(str, 0);
    }

    public String getString(String str) {
        return this.defaultSharedPreferences.getString(str, null);
    }

    public void setInt(String str, int i) {
        SharedPreferences.Editor editorEdit = this.defaultSharedPreferences.edit();
        editorEdit.putInt(str, i);
        editorEdit.apply();
    }

    public void setString(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.defaultSharedPreferences.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public UnityApplicationPreferences(Activity activity) {
        this.defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(activity);
    }
}
