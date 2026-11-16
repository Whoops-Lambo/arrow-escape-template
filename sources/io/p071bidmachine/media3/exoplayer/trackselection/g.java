package io.p071bidmachine.media3.exoplayer.trackselection;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import io.p071bidmachine.media3.common.v0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class g extends v0 {
    public final boolean A;
    public final SparseArray B;
    public final SparseBooleanArray C;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public final void d(int i) {
        this.t.remove(Integer.valueOf(i));
    }

    public g(h hVar) {
        b(hVar);
        this.u = hVar.u;
        this.v = hVar.v;
        this.w = hVar.w;
        this.x = hVar.x;
        this.y = hVar.y;
        this.z = hVar.z;
        this.A = hVar.A;
        SparseArray sparseArray = hVar.B;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.B = sparseArray2;
        this.C = hVar.C.clone();
    }

    @Override // io.p071bidmachine.media3.common.v0
    public final v0 c(String[] strArr) {
        super.c(strArr);
        return this;
    }

    public g() {
        this.B = new SparseArray();
        this.C = new SparseBooleanArray();
        this.u = true;
        this.v = true;
        this.w = true;
        this.x = true;
        this.y = true;
        this.z = true;
        this.A = true;
    }
}
