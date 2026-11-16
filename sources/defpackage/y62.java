package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class y62 implements dy, ez {
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(y62.class, Object.class, "result");
    public final dy a;

    @Nullable
    private volatile Object result;

    public final Object b() throws Throwable {
        Object obj = this.result;
        dz dzVar = dz.b;
        if (obj == dzVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            dz dzVar2 = dz.a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, dzVar, dzVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != dzVar) {
                    obj = this.result;
                }
            }
            return dz.a;
        }
        if (obj == dz.c) {
            return dz.a;
        }
        if (obj instanceof j52) {
            throw ((j52) obj).a;
        }
        return obj;
    }

    @Override // defpackage.ez
    public final ez getCallerFrame() {
        dy dyVar = this.a;
        if (dyVar instanceof ez) {
            return (ez) dyVar;
        }
        return null;
    }

    @Override // defpackage.dy
    public final sy getContext() {
        return this.a.getContext();
    }

    @Override // defpackage.dy
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            dz dzVar = dz.b;
            if (obj2 == dzVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, dzVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != dzVar) {
                    }
                }
                return;
            }
            dz dzVar2 = dz.a;
            if (obj2 != dzVar2) {
                e32.i("Already resumed");
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b;
            dz dzVar3 = dz.c;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, dzVar2, dzVar3)) {
                    this.a.resumeWith(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == dzVar2);
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.a;
    }

    public y62(dy dyVar, dz dzVar) {
        this.a = dyVar;
        this.result = dzVar;
    }
}
