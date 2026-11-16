package androidx.collection;

import defpackage.ec1;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/collection/MutableMapEntry;", "K", "V", "", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class MutableMapEntry<K, V> implements Map.Entry<K, V>, ec1 {
    public final Object[] a;
    public final Object[] b;
    public final int c;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a[this.c];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b[this.c];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object[] objArr = this.b;
        int i = this.c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public MutableMapEntry(Object[] objArr, Object[] objArr2, int i) {
        objArr.getClass();
        objArr2.getClass();
        this.a = objArr;
        this.b = objArr2;
        this.c = i;
    }
}
