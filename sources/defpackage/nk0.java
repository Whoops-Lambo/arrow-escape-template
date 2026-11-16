package defpackage;

import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class nk0 {
    public final Object a;
    public final int b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof nk0)) {
            return false;
        }
        nk0 nk0Var = (nk0) obj;
        return this.a == nk0Var.a && this.b == nk0Var.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }

    public nk0(int i, MessageLite messageLite) {
        this.a = messageLite;
        this.b = i;
    }
}
