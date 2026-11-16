package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class tw {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(tw.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(tw.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public abstract boolean d();

    public final void b() {
        b.set(this, null);
    }

    public final tw c() {
        Object obj = a.get(this);
        if (obj == h00.b) {
            return null;
        }
        return (tw) obj;
    }

    public tw(f82 f82Var) {
        this._prev$volatile = f82Var;
    }

    public final void e() {
        tw twVar;
        tw twVarC;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            tw twVar2 = (tw) atomicReferenceFieldUpdater.get(this);
            while (twVar2 != null && twVar2.d()) {
                twVar2 = (tw) atomicReferenceFieldUpdater.get(twVar2);
            }
            tw twVarC2 = c();
            twVarC2.getClass();
            while (twVarC2.d() && (twVarC = twVarC2.c()) != null) {
                twVarC2 = twVarC;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(twVarC2);
                if (((tw) obj) == null) {
                    twVar = null;
                } else {
                    twVar = twVar2;
                }
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(twVarC2, obj, twVar)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(twVarC2) != obj) {
                    }
                }
            }
            if (twVar2 != null) {
                a.set(twVar2, twVarC2);
            }
            if (!twVarC2.d() || twVarC2.c() == null) {
                if (twVar2 == null || !twVar2.d()) {
                    return;
                }
            }
        }
    }
}
