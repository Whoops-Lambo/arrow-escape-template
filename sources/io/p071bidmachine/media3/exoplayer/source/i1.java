package io.p071bidmachine.media3.exoplayer.source;

import defpackage.d31;
import defpackage.y32;
import io.p071bidmachine.media3.common.s0;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.x;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class i1 {
    public static final i1 d = new i1(new s0[0]);
    public final int a;
    public final y32 b;
    public int c;

    static {
        x.G(0);
    }

    public final s0 a(int i) {
        return (s0) this.b.get(i);
    }

    public final int b(s0 s0Var) {
        int iIndexOf = this.b.indexOf(s0Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i1.class != obj.getClass()) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return this.a == i1Var.a && this.b.equals(i1Var.b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }

    public final String toString() {
        return this.b.toString();
    }

    public i1(s0... s0VarArr) {
        y32 y32VarB = d31.B(s0VarArr);
        this.b = y32VarB;
        this.a = s0VarArr.length;
        int i = 0;
        while (i < y32VarB.d) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < y32VarB.d; i3++) {
                if (((s0) y32VarB.get(i)).equals(y32VarB.get(i3))) {
                    a.o("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }
}
