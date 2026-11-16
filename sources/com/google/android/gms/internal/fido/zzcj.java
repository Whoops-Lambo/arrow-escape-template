package com.google.android.gms.internal.fido;

import defpackage.d14;
import defpackage.pv1;
import defpackage.s04;
import defpackage.tb5;
import defpackage.w24;
import defpackage.w44;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcj extends zzcd implements NavigableMap {
    public static final w44 f;
    public static final zzcj g;
    public final transient e c;
    public final transient zzcc d;
    public final transient zzcj e;

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    static {
        w44 w44Var = w44.a;
        f = w44Var;
        e eVarB = zzck.B(w44Var);
        d14 d14Var = zzcc.b;
        g = new zzcj(eVarB, c.e, null);
    }

    public static zzcj k(Comparator comparator) {
        if (w44.a.equals(comparator)) {
            return g;
        }
        e eVarB = zzck.B(comparator);
        d14 d14Var = zzcc.b;
        return new zzcj(eVarB, c.e, null);
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.c.d;
    }

    @Override // com.google.android.gms.internal.fido.zzcd
    /* JADX INFO: renamed from: d */
    public final zzby values() {
        return this.d;
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        e eVar = this.c;
        zzck zzckVar = eVar.e;
        if (zzckVar != null) {
            return zzckVar;
        }
        e eVarX = eVar.x();
        eVar.e = eVarX;
        eVarX.e = eVar;
        return eVarX;
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        zzcj zzcjVar = this.e;
        if (zzcjVar == null) {
            boolean zIsEmpty = isEmpty();
            e eVar = this.c;
            if (zIsEmpty) {
                Comparator comparator = eVar.d;
                return k((comparator instanceof zzcs ? (zzcs) comparator : new s04(comparator)).d());
            }
            zzck zzckVarX = eVar.e;
            if (zzckVarX == null) {
                zzckVarX = eVar.x();
                eVar.e = zzckVarX;
                zzckVarX.e = eVar;
            }
            zzcjVar = new zzcj((e) zzckVarX, this.d.n(), this);
        }
        return zzcjVar;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.c.first();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0005  */
    @Override // com.google.android.gms.internal.fido.zzcd, java.util.Map
    public final Object get(Object obj) {
        int iBinarySearch;
        e eVar = this.c;
        if (obj == null) {
            iBinarySearch = -1;
        } else {
            try {
                iBinarySearch = Collections.binarySearch(eVar.f, obj, eVar.d);
                if (iBinarySearch < 0) {
                    iBinarySearch = -1;
                }
            } catch (ClassCastException unused) {
            }
        }
        if (iBinarySearch == -1) {
            return null;
        }
        return this.d.get(iBinarySearch);
    }

    @Override // com.google.android.gms.internal.fido.zzcd
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ zzcf keySet() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.fido.zzcd, java.util.Map
    public final /* synthetic */ Set keySet() {
        return this.c;
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.c.last();
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.c;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    public final zzcj r(int i, int i2) {
        zzcc zzccVar = this.d;
        if (i == 0) {
            if (i2 == zzccVar.size()) {
                return this;
            }
            i = 0;
        }
        e eVar = this.c;
        return i == i2 ? k(eVar.d) : new zzcj(eVar.F(i, i2), zzccVar.subList(i, i2), null);
    }

    @Override // java.util.Map
    public final int size() {
        return this.d.size();
    }

    @Override // com.google.android.gms.internal.fido.zzcd, java.util.Map
    public final /* synthetic */ Collection values() {
        return this.d;
    }

    public zzcj(e eVar, zzcc zzccVar, zzcj zzcjVar) {
        this.c = eVar;
        this.d = zzccVar;
        this.e = zzcjVar;
    }

    public static zzcj j(TreeMap treeMap) {
        boolean zEquals;
        Comparator comparator = treeMap.comparator();
        int i = 1;
        final w44 w44Var = f;
        if (comparator == null) {
            zEquals = true;
        } else {
            zEquals = w44Var.equals(comparator);
        }
        Collection collectionEntrySet = treeMap.entrySet();
        if (collectionEntrySet == null) {
            Iterator it = collectionEntrySet.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            collectionEntrySet = arrayList;
        }
        Map.Entry[] entryArr = (Map.Entry[]) collectionEntrySet.toArray(zzcd.b);
        int length = entryArr.length;
        if (length != 0) {
            int i2 = 0;
            if (length != 1) {
                Object[] objArr = new Object[length];
                Object[] objArr2 = new Object[length];
                if (zEquals) {
                    while (i2 < length) {
                        Map.Entry entry = entryArr[i2];
                        Objects.requireNonNull(entry);
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        tb5.F(key, value);
                        objArr[i2] = key;
                        objArr2[i2] = value;
                        i2++;
                    }
                } else {
                    Arrays.sort(entryArr, 0, length, new Comparator() { // from class: com.google.android.gms.internal.fido.zzcg
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            Map.Entry entry2 = (Map.Entry) obj;
                            Map.Entry entry3 = (Map.Entry) obj2;
                            Objects.requireNonNull(entry2);
                            Objects.requireNonNull(entry3);
                            return w44Var.compare(entry2.getKey(), entry3.getKey());
                        }
                    });
                    Map.Entry entry2 = entryArr[0];
                    Objects.requireNonNull(entry2);
                    Object key2 = entry2.getKey();
                    objArr[0] = key2;
                    Object value2 = entry2.getValue();
                    objArr2[0] = value2;
                    tb5.F(objArr[0], value2);
                    while (i < length) {
                        Map.Entry entry3 = entryArr[i - 1];
                        Objects.requireNonNull(entry3);
                        Map.Entry entry4 = entryArr[i];
                        Objects.requireNonNull(entry4);
                        Object key3 = entry4.getKey();
                        Object value3 = entry4.getValue();
                        tb5.F(key3, value3);
                        objArr[i] = key3;
                        objArr2[i] = value3;
                        if (w44Var.compare(key2, key3) != 0) {
                            i++;
                            key2 = key3;
                        } else {
                            defpackage.d.r(pv1.o("Multiple entries with same key: ", String.valueOf(entry3), " and ", String.valueOf(entry4)));
                            return null;
                        }
                    }
                }
                return new zzcj(new e(zzcc.r(length, objArr), w44Var), zzcc.r(length, objArr2), null);
            }
            Map.Entry entry5 = entryArr[0];
            Objects.requireNonNull(entry5);
            Object key4 = entry5.getKey();
            Object value4 = entry5.getValue();
            Object[] objArr3 = {key4};
            for (int i3 = 0; i3 < 1; i3++) {
                if (objArr3[i3] == null) {
                    defpackage.d.w(pv1.k(i3, "at index "));
                    return null;
                }
            }
            e eVar = new e(zzcc.r(1, objArr3), w44Var);
            Object[] objArr4 = {value4};
            while (i2 < 1) {
                if (objArr4[i2] != null) {
                    i2++;
                } else {
                    defpackage.d.w(pv1.k(i2, "at index "));
                    return null;
                }
            }
            return new zzcj(eVar, zzcc.r(1, objArr4), null);
        }
        return k(w44Var);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        Map.Entry entryCeilingEntry = ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return entryCeilingEntry.getKey();
    }

    @Override // com.google.android.gms.internal.fido.zzcd, java.util.Map
    public final /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    @Override // com.google.android.gms.internal.fido.zzcd
    public final zzcf f() {
        if (isEmpty()) {
            return d.j;
        }
        return new w24(this);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().r().get(0);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        Map.Entry entryFloorEntry = floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return entryFloorEntry.getKey();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        Map.Entry entryHigherEntry = higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return entryHigherEntry.getKey();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().r().get(this.d.size() - 1);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        Map.Entry entryLowerEntry = lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return entryLowerEntry.getKey();
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final zzcj headMap(Object obj, boolean z) {
        obj.getClass();
        return r(0, this.c.D(obj, z));
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final zzcj subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.c.d.compare(obj, obj2) <= 0) {
            return headMap(obj2, z2).tailMap(obj, z);
        }
        defpackage.d.r(zzbo.a("expected fromKey <= toKey but %s > %s", obj, obj2));
        return null;
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final zzcj tailMap(Object obj, boolean z) {
        obj.getClass();
        return r(this.c.E(obj, z), this.d.size());
    }
}
