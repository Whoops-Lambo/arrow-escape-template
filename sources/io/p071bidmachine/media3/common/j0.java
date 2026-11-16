package io.p071bidmachine.media3.common;

import android.util.SparseBooleanArray;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.x;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class j0 {
    public final l a;

    static {
        new SparseBooleanArray();
        a.i(!false);
        x.G(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0) {
            return this.a.equals(((j0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public j0(l lVar) {
        this.a = lVar;
    }
}
