package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import defpackage.vt3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaoi implements zzagr {
    public final zzagr a;
    public final zzaof b;
    public final SparseArray c = new SparseArray();
    public boolean d;

    @Override // com.google.android.gms.internal.ads.zzagr
    public final zzaia b(int i, int i2) {
        if (i2 != 3 && i2 != 5) {
            this.d = true;
        }
        zzagr zzagrVar = this.a;
        if (i2 != 3) {
            return zzagrVar.b(i, i2);
        }
        SparseArray sparseArray = this.c;
        vt3 vt3Var = (vt3) sparseArray.get(i);
        if (vt3Var != null) {
            return vt3Var;
        }
        vt3 vt3Var2 = new vt3(zzagrVar.b(i, 3), this.b);
        sparseArray.put(i, vt3Var2);
        return vt3Var2;
    }

    @Override // com.google.android.gms.internal.ads.zzagr
    public final void j(zzahr zzahrVar) {
        this.a.j(zzahrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagr
    public final void zzw() {
        this.a.zzw();
        if (!this.d) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            ((vt3) sparseArray.valueAt(i)).i = true;
            i++;
        }
    }

    public zzaoi(zzagr zzagrVar, zzaof zzaofVar) {
        this.a = zzagrVar;
        this.b = zzaofVar;
    }
}
