package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l0 implements qy {

    @NotNull
    private final ry key;

    @Override // defpackage.qy
    @NotNull
    public ry getKey() {
        return this.key;
    }

    public l0(ry ryVar) {
        ryVar.getClass();
        this.key = ryVar;
    }

    @Override // defpackage.sy
    public /* bridge */ <R> R fold(R r, @NotNull zr0 zr0Var) {
        return (R) qb5.g(this, r, zr0Var);
    }

    @Override // defpackage.sy
    @Nullable
    public /* bridge */ <E extends qy> E get(@NotNull ry ryVar) {
        return (E) qb5.h(this, ryVar);
    }

    @Override // defpackage.sy
    @NotNull
    public /* bridge */ sy minusKey(@NotNull ry ryVar) {
        return qb5.k(this, ryVar);
    }

    @Override // defpackage.sy
    @NotNull
    public /* bridge */ sy plus(@NotNull sy syVar) {
        return qb5.l(this, syVar);
    }
}
