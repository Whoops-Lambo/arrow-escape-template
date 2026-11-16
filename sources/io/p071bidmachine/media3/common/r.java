package io.p071bidmachine.media3.common;

import io.p071bidmachine.media3.common.util.x;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class r {
    public final long a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.a == ((r) obj).a;
    }

    static {
        new r(new q());
        x.G(0);
        x.G(1);
        x.G(2);
        x.G(3);
        x.G(4);
        x.G(5);
        x.G(6);
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) * 29791;
    }

    public r(q qVar) {
        int i = x.a;
        this.a = qVar.a;
    }
}
