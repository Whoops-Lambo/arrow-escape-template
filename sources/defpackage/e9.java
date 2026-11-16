package defpackage;

import androidx.compose.ui.graphics.painter.Painter;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class e9 extends f9 {
    public final Painter a;
    public final kl2 b;

    @Override // defpackage.f9
    public final Painter a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9)) {
            return false;
        }
        e9 e9Var = (e9) obj;
        return this.a.equals(e9Var.a) && this.b.equals(e9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.a + ", result=" + this.b + ')';
    }

    public e9(Painter painter, kl2 kl2Var) {
        this.a = painter;
        this.b = kl2Var;
    }
}
