package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class e91 extends o91 implements hv {
    public final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e91(c91 c91Var) {
        super(true);
        boolean z = true;
        I(c91Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o91.b;
        kr krVar = (kr) atomicReferenceFieldUpdater.get(this);
        lr lrVar = krVar instanceof lr ? (lr) krVar : null;
        if (lrVar == null) {
            z = false;
            break;
        }
        o91 o91VarH = lrVar.h();
        while (!o91VarH.C()) {
            kr krVar2 = (kr) atomicReferenceFieldUpdater.get(o91VarH);
            lr lrVar2 = krVar2 instanceof lr ? (lr) krVar2 : null;
            if (lrVar2 == null) {
                z = false;
                break;
            }
            o91VarH = lrVar2.h();
        }
        this.c = z;
    }

    @Override // defpackage.o91
    public final boolean E() {
        return true;
    }

    @Override // defpackage.o91
    public final boolean C() {
        return this.c;
    }

    public final boolean a0() {
        return M(az2.a);
    }
}
