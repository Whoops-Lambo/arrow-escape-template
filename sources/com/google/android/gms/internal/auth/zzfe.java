package com.google.android.gms.internal.auth;

import defpackage.c94;
import defpackage.e32;
import defpackage.o94;
import defpackage.sv4;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzfe extends o94 implements RandomAccess, zzff {
    public final List b;

    static {
        new zzfe((Object) null);
    }

    public zzfe(int i) {
        ArrayList arrayList = new ArrayList(i);
        super(true);
        this.b = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        zza();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        List list = this.b;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzef) {
            zzef zzefVar = (zzef) obj;
            String strN = zzefVar.h() == 0 ? "" : zzefVar.n(zzfa.a);
            if (zzefVar.o()) {
                list.set(i, strN);
            }
            return strN;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, zzfa.a);
        c94 c94Var = sv4.a;
        int length = bArr.length;
        c94Var.getClass();
        if (c94.b(0, length, bArr)) {
            list.set(i, str);
        }
        return str;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zza();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof zzef)) {
            return new String((byte[]) obj2, zzfa.a);
        }
        zzef zzefVar = (zzef) obj2;
        return zzefVar.h() == 0 ? "" : zzefVar.n(zzfa.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final zzez zzd(int i) {
        List list = this.b;
        if (i < list.size()) {
            e32.a();
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new zzfe(arrayList);
    }

    @Override // com.google.android.gms.internal.auth.zzff
    public final zzff zze() {
        return this.a ? new zzhe(this) : this;
    }

    @Override // com.google.android.gms.internal.auth.zzff
    public final List zzg() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // defpackage.o94, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        zza();
        if (collection instanceof zzff) {
            collection = ((zzff) collection).zzg();
        }
        boolean zAddAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // defpackage.o94, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.o94, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        zza();
        Object objRemove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof zzef) {
            zzef zzefVar = (zzef) objRemove;
            Charset charset = zzfa.a;
            if (zzefVar.h() == 0) {
                return "";
            }
            return zzefVar.n(charset);
        }
        return new String((byte[]) objRemove, zzfa.a);
    }

    public zzfe() {
        this(10);
    }

    public zzfe(ArrayList arrayList) {
        super(true);
        this.b = arrayList;
    }

    public zzfe(Object obj) {
        super(false);
        this.b = Collections.EMPTY_LIST;
    }

    @Override // defpackage.o94, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
