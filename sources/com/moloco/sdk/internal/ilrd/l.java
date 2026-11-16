package com.moloco.sdk.internal.ilrd;

import com.moloco.sdk.i1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class l implements n {
    public final i1 a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.a.equals(((l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LevelPlay(impression=" + this.a + ')';
    }

    public l(i1 i1Var) {
        this.a = i1Var;
    }
}
