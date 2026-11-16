package com.moloco.sdk.internal.ilrd;

import com.moloco.sdk.k1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class m implements n {
    public final k1 a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.a.equals(((m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Max(impression=" + this.a + ')';
    }

    public m(k1 k1Var) {
        this.a = k1Var;
    }
}
