package androidx.datastore.preferences.core;

import com.ironsource.C4664b4;
import defpackage.dt1;
import defpackage.du;
import defpackage.e32;
import defpackage.eu;
import defpackage.jc1;
import defpackage.rc1;
import defpackage.rh1;
import defpackage.s71;
import defpackage.wr0;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/datastore/preferences/core/MutablePreferences;", "Landroidx/datastore/preferences/core/Preferences;", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MutablePreferences extends Preferences {
    public final LinkedHashMap a;
    public final AtomicBoolean b;

    /* JADX INFO: renamed from: androidx.datastore.preferences.core.MutablePreferences$toString$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "entry", "", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    final class AnonymousClass1 extends rc1 implements wr0 {
        public static final AnonymousClass1 i = new AnonymousClass1(1);

        @Override // defpackage.wr0
        public final Object invoke(Object obj) {
            String strValueOf;
            Map.Entry entry = (Map.Entry) obj;
            entry.getClass();
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) C4664b4.j.d);
                int i2 = 0;
                for (byte b : (byte[]) value) {
                    i2++;
                    if (i2 > 1) {
                        sb.append((CharSequence) ", ");
                    }
                    sb.append((CharSequence) String.valueOf((int) b));
                }
                sb.append((CharSequence) C4664b4.j.e);
                strValueOf = sb.toString();
            } else {
                strValueOf = String.valueOf(entry.getValue());
            }
            return jc1.o(((Preferences.Key) entry.getKey()).a, " = ", new StringBuilder("  "), strValueOf);
        }
    }

    @Override // androidx.datastore.preferences.core.Preferences
    public final Map a() {
        dt1 dt1Var;
        Set<Map.Entry> setEntrySet = this.a.entrySet();
        int iU = rh1.U(eu.f(setEntrySet, 10));
        if (iU < 16) {
            iU = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iU);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                dt1Var = new dt1(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                dt1Var = new dt1(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(dt1Var.a, dt1Var.b);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    public final void d() {
        if (this.b.a.get()) {
            e32.i("Do mutate preferences once returned to DataStore.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    public final boolean equals(Object obj) {
        boolean zB;
        if (obj instanceof MutablePreferences) {
            LinkedHashMap linkedHashMap = ((MutablePreferences) obj).a;
            LinkedHashMap linkedHashMap2 = this.a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    zB = s71.b(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    zB = true;
                                } else {
                                    zB = false;
                                }
                            } else {
                                zB = false;
                            }
                            if (!zB) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = this.a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return du.g0(this.a.entrySet(), ",\n", "{\n", "\n}", AnonymousClass1.i, 24);
    }

    public MutablePreferences(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new AtomicBoolean(z);
    }

    @Override // androidx.datastore.preferences.core.Preferences
    public final Object b(Preferences.Key key) {
        key.getClass();
        Object obj = this.a.get(key);
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            return Arrays.copyOf(bArr, bArr.length);
        }
        return obj;
    }

    public final void e(Preferences.Key key) {
        key.getClass();
        d();
        this.a.remove(key);
    }

    public final void f(Preferences.Key key, Object obj) {
        key.getClass();
        g(key, obj);
    }

    public final void g(Preferences.Key key, Object obj) {
        key.getClass();
        d();
        if (obj == null) {
            e(key);
            return;
        }
        boolean z = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.a;
        if (z) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(du.E0((Set) obj));
            setUnmodifiableSet.getClass();
            linkedHashMap.put(key, setUnmodifiableSet);
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(key, Arrays.copyOf(bArr, bArr.length));
        } else {
            linkedHashMap.put(key, obj);
        }
    }

    public /* synthetic */ MutablePreferences(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
