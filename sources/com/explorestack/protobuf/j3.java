package com.explorestack.protobuf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class j3 {
    public final Descriptors.Descriptor a;
    public final int b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof j3)) {
            return false;
        }
        j3 j3Var = (j3) obj;
        return this.a == j3Var.a && this.b == j3Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 65535) + this.b;
    }

    public j3(Descriptors.Descriptor descriptor, int i) {
        this.a = descriptor;
        this.b = i;
    }
}
