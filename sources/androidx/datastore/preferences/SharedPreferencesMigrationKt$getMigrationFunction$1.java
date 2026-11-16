package androidx.datastore.preferences;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import defpackage.as0;
import defpackage.az2;
import defpackage.du;
import defpackage.dy;
import defpackage.eu;
import defpackage.rh1;
import defpackage.t50;
import defpackage.ul2;
import defpackage.wz2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@t50(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "sharedPrefs", "Landroidx/datastore/migrations/SharedPreferencesView;", "currentData"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class SharedPreferencesMigrationKt$getMigrationFunction$1 extends ul2 implements as0 {
    public /* synthetic */ SharedPreferencesView r;
    public /* synthetic */ Preferences s;

    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SharedPreferencesMigrationKt$getMigrationFunction$1 sharedPreferencesMigrationKt$getMigrationFunction$1 = new SharedPreferencesMigrationKt$getMigrationFunction$1(3, (dy) obj3);
        sharedPreferencesMigrationKt$getMigrationFunction$1.r = (SharedPreferencesView) obj;
        sharedPreferencesMigrationKt$getMigrationFunction$1.s = (Preferences) obj2;
        return sharedPreferencesMigrationKt$getMigrationFunction$1.invokeSuspend(az2.a);
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        wz2.a0(obj);
        SharedPreferencesView sharedPreferencesView = this.r;
        Preferences preferences = this.s;
        Set setKeySet = preferences.a().keySet();
        ArrayList arrayList = new ArrayList(eu.f(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((Preferences.Key) it.next()).a);
        }
        Map<String, ?> all = sharedPreferencesView.a.getAll();
        all.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            boolean zContains = true;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it2.next();
            String key = next.getKey();
            Set set = sharedPreferencesView.b;
            if (set != null) {
                zContains = set.contains(key);
            }
            if (zContains) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(rh1.U(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = du.E0((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        MutablePreferences mutablePreferencesC = preferences.c();
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String str = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                str.getClass();
                mutablePreferencesC.g(new Preferences.Key(str), value2);
            } else if (value2 instanceof Float) {
                str.getClass();
                mutablePreferencesC.g(new Preferences.Key(str), value2);
            } else if (value2 instanceof Integer) {
                str.getClass();
                mutablePreferencesC.g(new Preferences.Key(str), value2);
            } else if (value2 instanceof Long) {
                str.getClass();
                mutablePreferencesC.g(new Preferences.Key(str), value2);
            } else if (value2 instanceof String) {
                str.getClass();
                mutablePreferencesC.g(new Preferences.Key(str), value2);
            } else if (value2 instanceof Set) {
                mutablePreferencesC.g(PreferencesKeys.a(str), (Set) value2);
            }
        }
        return new MutablePreferences(new LinkedHashMap(mutablePreferencesC.a()), true);
    }
}
