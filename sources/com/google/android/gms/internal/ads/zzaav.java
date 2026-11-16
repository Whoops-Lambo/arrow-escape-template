package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaav extends zzbk {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final SparseArray D;
    public final SparseBooleanArray E;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public zzaav(zzaaw zzaawVar) {
        a(zzaawVar);
        this.w = zzaawVar.w;
        this.x = zzaawVar.x;
        this.y = zzaawVar.y;
        this.z = zzaawVar.z;
        this.A = zzaawVar.A;
        this.B = zzaawVar.B;
        this.C = zzaawVar.C;
        SparseArray sparseArray = zzaawVar.D;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.D = sparseArray2;
        this.E = zzaawVar.E.clone();
    }

    public zzaav() {
        this.D = new SparseArray();
        this.E = new SparseBooleanArray();
        this.w = true;
        this.x = true;
        this.y = true;
        this.z = true;
        this.A = true;
        this.B = true;
        this.C = true;
    }
}
