package com.google.android.gms.internal.ads;

import defpackage.e32;
import defpackage.pv1;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzied extends zziee implements Iterable {
    public final ArrayList a = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof zzied) && ((zzied) obj).a.equals(this.a);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    public final String c() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        if (size == 1) {
            return ((zziee) arrayList.get(0)).c();
        }
        e32.i(pv1.l(size, "Array must have size 1, but has size ", new StringBuilder(String.valueOf(size).length() + 37)));
        return null;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
