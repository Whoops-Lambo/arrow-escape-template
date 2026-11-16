package com.explorestack.protobuf;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class q8 {
    public List a;
    public List b;
    public List c;
    public List d;
    public List e;

    static {
        z5 z5Var = new z5(5);
        z5Var.b = new q8();
        z5Var.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8)) {
            return false;
        }
        q8 q8Var = (q8) obj;
        return Arrays.equals(new Object[]{this.a, this.b, this.c, this.d, this.e}, new Object[]{q8Var.a, q8Var.b, q8Var.c, q8Var.d, q8Var.e});
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }
}
