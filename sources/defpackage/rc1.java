package defpackage;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class rc1 implements is0, Serializable {
    private final int arity;

    @Override // defpackage.is0
    public int getArity() {
        return this.arity;
    }

    @NotNull
    public String toString() {
        p32.a.getClass();
        return r32.a(this);
    }

    public rc1(int i) {
        this.arity = i;
    }
}
