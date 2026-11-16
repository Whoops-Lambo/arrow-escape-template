package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class m0 extends AbstractList {
    public static final AtomicInteger e = new AtomicInteger();
    public Handler a;
    public final ArrayList c;
    public final String b = String.valueOf(Integer.valueOf(e.incrementAndGet()));
    public final ArrayList d = new ArrayList();

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        k0 k0Var = (k0) obj;
        k0Var.getClass();
        return this.c.add(k0Var);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.c.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof k0) {
            return super.contains((k0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (k0) this.c.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof k0) {
            return super.indexOf((k0) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof k0) {
            return super.lastIndexOf((k0) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof k0) {
            return super.remove((k0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        k0 k0Var = (k0) obj;
        k0Var.getClass();
        return (k0) this.c.set(i, k0Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    public m0(k0... k0VarArr) {
        List listAsList = Arrays.asList(k0VarArr);
        listAsList.getClass();
        this.c = new ArrayList(listAsList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        k0 k0Var = (k0) obj;
        k0Var.getClass();
        this.c.add(i, k0Var);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return (k0) this.c.remove(i);
    }

    public m0(Collection collection) {
        this.c = new ArrayList(collection);
    }
}
