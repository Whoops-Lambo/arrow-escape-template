package defpackage;

import com.google.android.gms.internal.play_billing.zzi;
import com.google.android.gms.internal.play_billing.zzo;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class f05 extends wz2 {
    public final AtomicReferenceFieldUpdater e;
    public final AtomicReferenceFieldUpdater f;
    public final AtomicReferenceFieldUpdater g;
    public final AtomicReferenceFieldUpdater h;
    public final AtomicReferenceFieldUpdater i;

    @Override // defpackage.wz2
    public final void c0(n25 n25Var, n25 n25Var2) {
        this.f.lazySet(n25Var, n25Var2);
    }

    @Override // defpackage.wz2
    public final void f0(n25 n25Var, Thread thread) {
        this.e.lazySet(n25Var, thread);
    }

    @Override // defpackage.wz2
    public final boolean g0(zzo zzoVar, qr4 qr4Var, qr4 qr4Var2) {
        return zzi.a(this.h, zzoVar, qr4Var, qr4Var2);
    }

    @Override // defpackage.wz2
    public final boolean h0(zzo zzoVar, Object obj, Object obj2) {
        return zzi.a(this.i, zzoVar, obj, obj2);
    }

    @Override // defpackage.wz2
    public final boolean i0(zzo zzoVar, n25 n25Var, n25 n25Var2) {
        return zzi.a(this.g, zzoVar, n25Var, n25Var2);
    }

    public f05(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.e = atomicReferenceFieldUpdater;
        this.f = atomicReferenceFieldUpdater2;
        this.g = atomicReferenceFieldUpdater3;
        this.h = atomicReferenceFieldUpdater4;
        this.i = atomicReferenceFieldUpdater5;
    }
}
