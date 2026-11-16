package androidx.datastore.core;

import defpackage.bp0;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.pp1;
import defpackage.wz2;
import defpackage.z62;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/datastore/core/SingleProcessCoordinator;", "Landroidx/datastore/core/InterProcessCoordinator;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SingleProcessCoordinator implements InterProcessCoordinator {
    public final pp1 a;
    public final AtomicInt b;
    public final z62 c;

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.InterProcessCoordinator
    public final Object a(zr0 zr0Var, fy fyVar) throws Throwable {
        SingleProcessCoordinator$tryLock$1 singleProcessCoordinator$tryLock$1;
        pp1 pp1Var;
        boolean z;
        Throwable th;
        if (fyVar instanceof SingleProcessCoordinator$tryLock$1) {
            singleProcessCoordinator$tryLock$1 = (SingleProcessCoordinator$tryLock$1) fyVar;
            int i = singleProcessCoordinator$tryLock$1.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                singleProcessCoordinator$tryLock$1.v = i - Integer.MIN_VALUE;
            } else {
                singleProcessCoordinator$tryLock$1 = new SingleProcessCoordinator$tryLock$1(this, fyVar);
            }
        } else {
            singleProcessCoordinator$tryLock$1 = new SingleProcessCoordinator$tryLock$1(this, fyVar);
        }
        Object obj = singleProcessCoordinator$tryLock$1.t;
        int i2 = singleProcessCoordinator$tryLock$1.v;
        if (i2 != 0) {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = singleProcessCoordinator$tryLock$1.s;
            pp1Var = singleProcessCoordinator$tryLock$1.r;
            try {
                wz2.a0(obj);
                if (z) {
                    pp1Var.g(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z) {
                    pp1Var.g(null);
                }
                throw th;
            }
        }
        wz2.a0(obj);
        pp1 pp1Var2 = this.a;
        boolean zF = pp1Var2.f();
        try {
            Object objValueOf = Boolean.valueOf(zF);
            singleProcessCoordinator$tryLock$1.r = pp1Var2;
            singleProcessCoordinator$tryLock$1.s = zF;
            singleProcessCoordinator$tryLock$1.v = 1;
            Object objInvoke = zr0Var.invoke(objValueOf, singleProcessCoordinator$tryLock$1);
            Object obj2 = dz.a;
            if (objInvoke == obj2) {
                return obj2;
            }
            pp1Var = pp1Var2;
            z = zF;
            obj = objInvoke;
            if (z) {
                pp1Var.g(null);
            }
            return obj;
        } catch (Throwable th3) {
            pp1Var = pp1Var2;
            z = zF;
            th = th3;
            if (z) {
                pp1Var.g(null);
            }
            throw th;
        }
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public final bp0 b() {
        return this.c;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public final Object c(fy fyVar) {
        return new Integer(this.b.a.get());
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public final Object d(dy dyVar) {
        return new Integer(this.b.a.incrementAndGet());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r8 == r5) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.datastore.core.SingleProcessCoordinator] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v6, types: [pp1] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.wr0 r7, defpackage.fy r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.datastore.core.SingleProcessCoordinator$lock$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.datastore.core.SingleProcessCoordinator$lock$1 r0 = (androidx.datastore.core.SingleProcessCoordinator$lock$1) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessCoordinator$lock$1 r0 = new androidx.datastore.core.SingleProcessCoordinator$lock$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.t
            int r1 = r0.v
            r2 = 2
            r3 = 1
            r4 = 0
            dz r5 = defpackage.dz.a
            if (r1 == 0) goto L41
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            java.lang.Object r6 = r0.r
            kotlinx.coroutines.sync.Mutex r6 = (kotlinx.coroutines.sync.Mutex) r6
            defpackage.wz2.a0(r8)     // Catch: java.lang.Throwable -> L2f
            goto L60
        L2f:
            r7 = move-exception
            goto L66
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r6)
            return r4
        L37:
            pp1 r6 = r0.s
            java.lang.Object r7 = r0.r
            wr0 r7 = (defpackage.wr0) r7
            defpackage.wz2.a0(r8)
            goto L53
        L41:
            defpackage.wz2.a0(r8)
            r0.r = r7
            pp1 r6 = r6.a
            r0.s = r6
            r0.v = r3
            java.lang.Object r8 = r6.e(r0)
            if (r8 != r5) goto L53
            goto L5f
        L53:
            r0.r = r6     // Catch: java.lang.Throwable -> L2f
            r0.s = r4     // Catch: java.lang.Throwable -> L2f
            r0.v = r2     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r5) goto L60
        L5f:
            return r5
        L60:
            pp1 r6 = (defpackage.pp1) r6
            r6.g(r4)
            return r8
        L66:
            pp1 r6 = (defpackage.pp1) r6
            r6.g(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessCoordinator.e(wr0, fy):java.lang.Object");
    }

    public SingleProcessCoordinator(String str) {
        str.getClass();
        this.a = new pp1();
        this.b = new AtomicInt();
        this.c = new z62(new SingleProcessCoordinator$updateNotifications$1(2, null));
    }
}
