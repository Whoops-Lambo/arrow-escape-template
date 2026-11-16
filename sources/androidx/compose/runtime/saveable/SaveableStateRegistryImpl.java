package androidx.compose.runtime.saveable;

import defpackage.d;
import defpackage.dk2;
import defpackage.e32;
import defpackage.eu;
import defpackage.qh1;
import defpackage.sr0;
import defpackage.wr0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateRegistryImpl;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "runtime-saveable_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class SaveableStateRegistryImpl implements SaveableStateRegistry {
    public final wr0 a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Map b() {
        LinkedHashMap linkedHashMapI0 = qh1.i0(this.b);
        for (Map.Entry entry : this.c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object objInvoke = ((sr0) list.get(0)).invoke();
                if (objInvoke == null) {
                    continue;
                } else {
                    if (!a(objInvoke)) {
                        e32.i("Check failed.");
                        return null;
                    }
                    linkedHashMapI0.put(str, eu.a(objInvoke));
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Object objInvoke2 = ((sr0) list.get(i)).invoke();
                    if (objInvoke2 != null && !a(objInvoke2)) {
                        e32.i("Check failed.");
                        return null;
                    }
                    arrayList.add(objInvoke2);
                }
                linkedHashMapI0.put(str, arrayList);
            }
        }
        return linkedHashMapI0;
    }

    public SaveableStateRegistryImpl(Map map, wr0 wr0Var) {
        LinkedHashMap linkedHashMap;
        this.a = wr0Var;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        this.b = linkedHashMap;
        this.c = new LinkedHashMap();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final boolean a(Object obj) {
        obj.getClass();
        return ((Boolean) this.a.invoke(obj)).booleanValue();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final SaveableStateRegistry.Entry c(final String str, final sr0 sr0Var) {
        str.getClass();
        if (!dk2.Z(str)) {
            LinkedHashMap linkedHashMap = this.c;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(sr0Var);
            return new SaveableStateRegistry.Entry() { // from class: androidx.compose.runtime.saveable.SaveableStateRegistryImpl$registerProvider$3
                @Override // androidx.compose.runtime.saveable.SaveableStateRegistry.Entry
                public final void c() {
                    LinkedHashMap linkedHashMap2 = this.a.c;
                    String str2 = str;
                    List list = (List) linkedHashMap2.remove(str2);
                    if (list != null) {
                        list.remove(sr0Var);
                    }
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    linkedHashMap2.put(str2, list);
                }
            };
        }
        d.r("Registered key is empty or blank");
        return null;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Object d(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = this.b;
        List list = (List) linkedHashMap.remove(str);
        if (list != null && !list.isEmpty()) {
            if (list.size() > 1) {
                linkedHashMap.put(str, list.subList(1, list.size()));
            }
            return list.get(0);
        }
        return null;
    }
}
