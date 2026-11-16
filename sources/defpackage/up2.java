package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@z92
public final class up2 {

    @NotNull
    public static final sp2 Companion = new sp2();
    public final long a;
    public final long b;
    public final long c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof up2) && this.a == ((up2) obj).a;
    }

    public /* synthetic */ up2(int i, long j, long j2, long j3) {
        if (1 != (i & 1)) {
            ep0.J(i, 1, rp2.a.getDescriptor());
            throw null;
        }
        this.a = j;
        this.b = (i & 2) == 0 ? j * 1000 : j2;
        if ((i & 4) == 0) {
            this.c = j / 1000;
        } else {
            this.c = j3;
        }
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return n30.o(new StringBuilder("Time(ms="), this.a, ')');
    }

    public up2(long j) {
        this.a = j;
        this.b = j * 1000;
        this.c = j / 1000;
    }
}
