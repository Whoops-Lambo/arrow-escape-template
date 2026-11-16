package defpackage;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class af2 {
    public final SharedPreferences a;

    public final void a(String str) {
        this.a.edit().remove(str).apply();
    }

    public final LinkedHashMap c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, ?> all = this.a.getAll();
        all.getClass();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            key.getClass();
            if (kk2.L(key, "settings-", false) && (value instanceof String)) {
                linkedHashMap.put(key, value);
            }
        }
        return linkedHashMap;
    }

    public af2(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final void b(String str, Set set) {
        set.getClass();
        SharedPreferences sharedPreferences = this.a;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        for (String str2 : sharedPreferences.getAll().keySet()) {
            str2.getClass();
            if (kk2.L(str2, str, false) && !set.contains(dk2.g0(str2, str))) {
                editorEdit.remove(str2);
            }
        }
        editorEdit.apply();
    }

    public final void d(String str, String str2) {
        str2.getClass();
        this.a.edit().putString(str, str2).apply();
    }
}
