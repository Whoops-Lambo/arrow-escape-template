package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class kq extends f82 {
    public final gk e;
    public final /* synthetic */ AtomicReferenceArray f;

    @Override // defpackage.f82
    public final int g() {
        return ik.b;
    }

    @Override // defpackage.f82
    public final void h(int i, sy syVar) {
        gk gkVar;
        int i2 = ik.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.f.get(i * 2);
        while (true) {
            Object objL = l(i);
            boolean z2 = objL instanceof q73;
            gkVar = this.e;
            if (z2 || (objL instanceof r73)) {
                if (k(i, objL, z ? ik.j : ik.k)) {
                    n(i, null);
                    m(i, !z);
                    if (z) {
                        gkVar.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (objL == ik.j || objL == ik.k) {
                    break;
                }
                if (objL != ik.g && objL != ik.f) {
                    if (objL == ik.i || objL == ik.d || objL == ik.l) {
                        return;
                    }
                    wb0.d(objL, "unexpected state: ");
                    return;
                }
            }
        }
        n(i, null);
        if (z) {
            gkVar.getClass();
        }
    }

    public final boolean k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object l(int i) {
        return this.f.get((i * 2) + 1);
    }

    public final void m(int i, boolean z) {
        if (z) {
            gk gkVar = this.e;
            gkVar.getClass();
            gkVar.I((this.c * ((long) ik.b)) + ((long) i));
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.f.set(i * 2, obj);
    }

    public final void o(int i, Object obj) {
        this.f.set((i * 2) + 1, obj);
    }

    public kq(long j, kq kqVar, gk gkVar, int i) {
        super(j, kqVar, i);
        this.e = gkVar;
        this.f = new AtomicReferenceArray(ik.b * 2);
    }
}
