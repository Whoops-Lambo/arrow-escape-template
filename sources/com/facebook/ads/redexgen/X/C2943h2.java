package com.facebook.ads.redexgen.X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2943h2<K, V> implements Set<Map.Entry<K, V>> {
    public final /* synthetic */ AbstractC2947h6 A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        int iA04 = this.A00.A04();
        for (Map.Entry<K, V> entry : collection) {
            this.A00.A0F(entry.getKey(), entry.getValue());
        }
        return iA04 != this.A00.A04();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.h2 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
    public C2943h2(AbstractC2947h6 abstractC2947h6) {
        this.A00 = abstractC2947h6;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.h2 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
    private final boolean A00(@Nullable Map.Entry<K, V> object) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.h2 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(@Nullable Object obj) {
        A00((Map.Entry) obj);
        throw null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.h2 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.A00.A0D();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.h2 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public final boolean contains(@Nullable Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        int index = this.A00.A05(entry.getKey());
        if (index < 0) {
            return false;
        }
        Object foundVal = this.A00.A0B(index, 1);
        return AbstractC2940gz.A04(foundVal, entry.getValue());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.h2 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.h2 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        return AbstractC2947h6.A03(this, obj);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.h2 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int i = 0;
        for (int iA04 = this.A00.A04() - 1; iA04 >= 0; iA04--) {
            int iHashCode = 0;
            Object objA0B = this.A00.A0B(iA04, 0);
            Object objA0B2 = this.A00.A0B(iA04, 1);
            int result = objA0B == null ? 0 : objA0B.hashCode();
            if (objA0B2 != null) {
                iHashCode = objA0B2.hashCode();
            }
            i += iHashCode ^ result;
        }
        return i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.h2 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.A00.A04() == 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.h2 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new C2945h4(this.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.h2 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.h2 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.h2 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.h2 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.A00.A04();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.h2 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.h2 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] array) {
        throw new UnsupportedOperationException();
    }
}
