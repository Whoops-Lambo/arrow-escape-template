package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class fy extends ph {

    @Nullable
    private final sy _context;

    @Nullable
    private transient dy intercepted;

    public fy(dy dyVar) {
        this(dyVar, dyVar != null ? dyVar.getContext() : null);
    }

    @Override // defpackage.dy
    @NotNull
    public sy getContext() {
        sy syVar = this._context;
        syVar.getClass();
        return syVar;
    }

    @NotNull
    public final dy intercepted() {
        dy dyVar = this.intercepted;
        if (dyVar != null) {
            return dyVar;
        }
        uy uyVar = (uy) getContext().get(h42.c);
        dy oc0Var = uyVar != null ? new oc0(uyVar, this) : this;
        this.intercepted = oc0Var;
        return oc0Var;
    }

    @Override // defpackage.ph
    public void releaseIntercepted() {
        dy dyVar = this.intercepted;
        if (dyVar != null && dyVar != this) {
            qy qyVar = getContext().get(h42.c);
            qyVar.getClass();
            oc0 oc0Var = (oc0) dyVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = oc0.h;
            while (atomicReferenceFieldUpdater.get(oc0Var) == l41.b) {
            }
            Object obj = atomicReferenceFieldUpdater.get(oc0Var);
            qo qoVar = obj instanceof qo ? (qo) obj : null;
            if (qoVar != null) {
                qoVar.o();
            }
        }
        this.intercepted = jv.b;
    }

    public fy(dy dyVar, sy syVar) {
        super(dyVar);
        this._context = syVar;
    }
}
