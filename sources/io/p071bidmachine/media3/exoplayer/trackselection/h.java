package io.p071bidmachine.media3.exoplayer.trackselection;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.explorestack.protobuf.z;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.common.w0;
import io.p071bidmachine.media3.exoplayer.source.i1;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class h extends w0 {
    public static final h D = new h(new g());
    public final boolean A;
    public final SparseArray B;
    public final SparseBooleanArray C;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    static {
        z.p(1000, 1001, 1002, 1003, 1004);
        z.p(1005, 1006, 1007, 1008, 1009);
        z.p(1010, 1011, 1012, 1013, 1014);
        x.G(1015);
        x.G(1016);
        x.G(1017);
        x.G(1018);
    }

    @Override // io.p071bidmachine.media3.common.w0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (super.equals(hVar) && this.u == hVar.u && this.v == hVar.v && this.w == hVar.w && this.x == hVar.x && this.y == hVar.y && this.z == hVar.z && this.A == hVar.A) {
                SparseBooleanArray sparseBooleanArray = hVar.C;
                SparseBooleanArray sparseBooleanArray2 = this.C;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    for (int i = 0; i < size; i++) {
                        if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = hVar.B;
                    SparseArray sparseArray2 = this.B;
                    int size2 = sparseArray2.size();
                    if (sparseArray.size() == size2) {
                        for (int i2 = 0; i2 < size2; i2++) {
                            int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray2.valueAt(i2);
                                Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        i1 i1Var = (i1) entry.getKey();
                                        if (!map2.containsKey(i1Var) || !Objects.equals(entry.getValue(), map2.get(i1Var))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public h(g gVar) {
        super(gVar);
        this.u = gVar.u;
        this.v = gVar.v;
        this.w = gVar.w;
        this.x = gVar.x;
        this.y = gVar.y;
        this.z = gVar.z;
        this.A = gVar.A;
        this.B = gVar.B;
        this.C = gVar.C;
    }

    @Override // io.p071bidmachine.media3.common.w0
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.u ? 1 : 0)) * 961) + (this.v ? 1 : 0)) * 961) + (this.w ? 1 : 0)) * 28629151) + (this.x ? 1 : 0)) * 31) + (this.y ? 1 : 0)) * 31) + (this.z ? 1 : 0)) * 961) + (this.A ? 1 : 0)) * 31;
    }
}
