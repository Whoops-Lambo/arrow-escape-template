package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class e52 extends d52 implements is0 {
    private final int arity;

    @Override // defpackage.is0
    public int getArity() {
        return this.arity;
    }

    public e52(int i, dy dyVar) {
        super(dyVar);
        this.arity = i;
    }

    @Override // defpackage.ph
    @NotNull
    public String toString() {
        if (getCompletion() == null) {
            p32.a.getClass();
            return r32.a(this);
        }
        return super.toString();
    }
}
