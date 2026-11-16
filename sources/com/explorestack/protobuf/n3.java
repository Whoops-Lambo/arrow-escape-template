package com.explorestack.protobuf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class n3 {
    public final Object a;
    public final int b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj;
        return this.a == n3Var.a && this.b == n3Var.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }

    public n3(int i, MessageLite messageLite) {
        this.a = messageLite;
        this.b = i;
    }
}
