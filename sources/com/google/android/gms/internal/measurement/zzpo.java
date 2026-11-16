package com.google.android.gms.internal.measurement;

import defpackage.i45;
import defpackage.r45;
import defpackage.s45;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzpo {
    public final AtomicReferenceArray a;
    public final zzog b;

    public final zzom a(int i, String str, boolean z) {
        AtomicReferenceArray atomicReferenceArray = this.a;
        zzom zzomVar = (zzom) atomicReferenceArray.get(i);
        if (zzomVar != null) {
            return zzomVar;
        }
        i45 i45VarA = this.b.a(str, z);
        while (!atomicReferenceArray.compareAndSet(i, null, i45VarA)) {
            if (atomicReferenceArray.get(i) != null) {
                zzom zzomVar2 = (zzom) atomicReferenceArray.get(i);
                zzomVar2.getClass();
                return zzomVar2;
            }
        }
        return i45VarA;
    }

    public final zzom b(int i, long j, String str) {
        AtomicReferenceArray atomicReferenceArray = this.a;
        zzom zzomVar = (zzom) atomicReferenceArray.get(i);
        if (zzomVar != null) {
            return zzomVar;
        }
        r45 r45Var = new r45(str, this.b.a, j);
        while (!atomicReferenceArray.compareAndSet(i, null, r45Var)) {
            if (atomicReferenceArray.get(i) != null) {
                zzom zzomVar2 = (zzom) atomicReferenceArray.get(i);
                zzomVar2.getClass();
                return zzomVar2;
            }
        }
        return r45Var;
    }

    public final zzom c(int i, String str, String str2) {
        AtomicReferenceArray atomicReferenceArray = this.a;
        zzom zzomVar = (zzom) atomicReferenceArray.get(i);
        if (zzomVar != null) {
            return zzomVar;
        }
        s45 s45Var = new s45(str, this.b.a, str2);
        while (!atomicReferenceArray.compareAndSet(i, null, s45Var)) {
            if (atomicReferenceArray.get(i) != null) {
                zzom zzomVar2 = (zzom) atomicReferenceArray.get(i);
                zzomVar2.getClass();
                return zzomVar2;
            }
        }
        return s45Var;
    }

    public zzpo(zzog zzogVar, int i) {
        this.b = zzogVar;
        this.a = new AtomicReferenceArray(i);
    }
}
