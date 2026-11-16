package io.p071bidmachine.media3.exoplayer.audio;

import defpackage.mc2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class f {
    public static final f d = new mc2().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && this.b == fVar.b && this.c == fVar.c;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) << 2) + ((this.b ? 1 : 0) << 1) + (this.c ? 1 : 0);
    }

    public f(mc2 mc2Var) {
        this.a = mc2Var.a;
        this.b = mc2Var.b;
        this.c = mc2Var.c;
    }
}
