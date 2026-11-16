package com.fyber.inneractive.sdk.cache;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class o {
    public final SharedPreferences a;

    public final void a(HashMap map) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            String str = (String) entry.getKey();
            if (value == null) {
                editorEdit.remove(str);
            } else if (value instanceof Boolean) {
                editorEdit.putBoolean(str, ((Boolean) value).booleanValue());
            } else if (value instanceof Integer) {
                editorEdit.putInt(str, ((Integer) value).intValue());
            } else if (value instanceof Float) {
                editorEdit.putFloat(str, ((Float) value).floatValue());
            } else if (value instanceof Long) {
                editorEdit.putLong(str, ((Long) value).longValue());
            } else if (value instanceof String) {
                editorEdit.putString(str, (String) value);
            } else if (value instanceof Set) {
                HashSet hashSet = new HashSet();
                for (Object obj : (Set) value) {
                    if (obj instanceof String) {
                        hashSet.add((String) obj);
                    }
                }
                editorEdit.putStringSet(str, hashSet);
            } else {
                editorEdit.putString(str, value.toString());
            }
        }
        editorEdit.apply();
    }

    public o(Context context) {
        this.a = context.getSharedPreferences("DtResponseHeaders", 0);
    }
}
