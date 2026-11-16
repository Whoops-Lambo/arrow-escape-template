package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class d52 extends ph {
    @Override // defpackage.dy
    @NotNull
    public sy getContext() {
        return cg0.a;
    }

    public d52(dy dyVar) {
        super(dyVar);
        if (dyVar != null && dyVar.getContext() != cg0.a) {
            d.r("Coroutines with restricted suspension must have EmptyCoroutineContext");
            throw null;
        }
    }
}
