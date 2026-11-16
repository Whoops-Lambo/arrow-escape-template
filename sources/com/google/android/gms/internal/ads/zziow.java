package com.google.android.gms.internal.ads;

import defpackage.ml3;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zziow extends AbstractList {
    public static final zziox c = zziox.b(zziow.class);
    public final List a;
    public final zzioq b;

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List list = this.a;
        if (list.size() > i) {
            return list.get(i);
        }
        zzioq zzioqVar = this.b;
        if (zzioqVar.hasNext()) {
            list.add(zzioqVar.next());
            return get(i);
        }
        defpackage.d.v();
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new ml3(this, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        zziox zzioxVar = c;
        zzioxVar.a("potentially expensive size() call");
        zzioxVar.a("blowup running");
        while (true) {
            zzioq zzioqVar = this.b;
            boolean zHasNext = zzioqVar.hasNext();
            List list = this.a;
            if (!zHasNext) {
                return list.size();
            }
            list.add(zzioqVar.next());
        }
    }

    public zziow(ArrayList arrayList, zzioq zzioqVar) {
        this.a = arrayList;
        this.b = zzioqVar;
    }
}
