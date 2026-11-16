package io.p071bidmachine.media3.common;

import android.util.SparseBooleanArray;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.x;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class l {
    public final SparseBooleanArray a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        SparseBooleanArray sparseBooleanArray = lVar.a;
        int i = x.a;
        SparseBooleanArray sparseBooleanArray2 = this.a;
        if (i >= 24) {
            return sparseBooleanArray2.equals(sparseBooleanArray);
        }
        if (sparseBooleanArray2.size() != sparseBooleanArray.size()) {
            return false;
        }
        for (int i2 = 0; i2 < sparseBooleanArray2.size(); i2++) {
            if (a(i2) != lVar.a(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int a(int i) {
        SparseBooleanArray sparseBooleanArray = this.a;
        a.f(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final int hashCode() {
        int i = x.a;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (i >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            size = (size * 31) + a(i2);
        }
        return size;
    }

    public l(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }
}
