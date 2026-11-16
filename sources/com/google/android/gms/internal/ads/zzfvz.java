package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfvz extends zzgyt {
    public final LinkedList a = new LinkedList();

    @Override // com.google.android.gms.internal.ads.zzgyq, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        zzfvh zzfvhVar = (zzfvh) obj;
        int i = zzfvhVar.f;
        LinkedList linkedList = this.a;
        if (i != 3) {
            linkedList.add(zzfvhVar);
            return true;
        }
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            zzfvh zzfvhVar2 = (zzfvh) listIterator.next();
            if (zzfvhVar2.f == 3) {
                double d = zzfvhVar2.e;
                double d2 = zzfvhVar.e;
                if (d < d2 || (d == d2 && zzfvhVar2.a() > zzfvhVar.a())) {
                    listIterator.set(zzfvhVar);
                    zzfvhVar = zzfvhVar2;
                }
            }
        }
        linkedList.add(zzfvhVar);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgyq, com.google.android.gms.internal.ads.zzgys
    public final /* synthetic */ Object c() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzgyt, com.google.android.gms.internal.ads.zzgyq
    public final /* synthetic */ Collection d() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final LinkedList e() {
        return this.a;
    }
}
