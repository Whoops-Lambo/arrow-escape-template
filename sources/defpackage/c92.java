package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class c92 extends f82 {
    public final /* synthetic */ AtomicReferenceArray e;

    @Override // defpackage.f82
    public final int g() {
        return b92.f;
    }

    @Override // defpackage.f82
    public final void h(int i, sy syVar) {
        this.e.set(i, b92.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + ']';
    }

    public c92(long j, c92 c92Var, int i) {
        super(j, c92Var, i);
        this.e = new AtomicReferenceArray(b92.f);
    }
}
