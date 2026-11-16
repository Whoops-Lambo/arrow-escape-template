package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zznw {
    public final zzs a;
    public final SparseArray b;

    public final boolean a(int i) {
        return this.a.a.get(i);
    }

    public zznw(zzs zzsVar, SparseArray sparseArray) {
        this.a = zzsVar;
        SparseBooleanArray sparseBooleanArray = zzsVar.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            zzgvz.i(i, sparseBooleanArray.size());
            int iKeyAt = sparseBooleanArray.keyAt(i);
            zznv zznvVar = (zznv) sparseArray.get(iKeyAt);
            zznvVar.getClass();
            sparseArray2.append(iKeyAt, zznvVar);
        }
        this.b = sparseArray2;
    }
}
