package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class xi2 extends m2 implements np1, ro, ms0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(xi2.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int e;

    @Override // defpackage.m2
    public final n2[] e() {
        return new yi2[2];
    }

    public final boolean k(Object obj, Object obj2) {
        int i;
        n2[] n2VarArr;
        tx txVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !s71.b(obj3, obj)) {
                return false;
            }
            if (s71.b(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.e;
            if ((i2 & 1) != 0) {
                this.e = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.e = i3;
            n2[] n2VarArr2 = this.a;
            while (true) {
                yi2[] yi2VarArr = (yi2[]) n2VarArr2;
                if (yi2VarArr != null) {
                    for (yi2 yi2Var : yi2VarArr) {
                        if (yi2Var != null) {
                            AtomicReference atomicReference = yi2Var.a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 == null || obj4 == (txVar = qb5.d)) {
                                    break;
                                }
                                tx txVar2 = qb5.c;
                                if (obj4 != txVar2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, txVar2)) {
                                            ((qo) obj4).resumeWith(az2.a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, txVar)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.e;
                    if (i == i3) {
                        this.e = i3 + 1;
                        return true;
                    }
                    n2VarArr = this.a;
                }
                n2VarArr2 = n2VarArr;
                i3 = i;
            }
        }
    }

    @Override // defpackage.ms0
    public final bp0 a(sy syVar, int i, ck ckVar) {
        return (((i < 0 || i >= 2) && i != -2) || ckVar != ck.b) ? at.n(this, syVar, i, ckVar) : this;
    }

    @Override // defpackage.m2
    public final n2 c() {
        return new yi2();
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0103 A[Catch: all -> 0x0063, TryCatch #1 {all -> 0x0063, blocks: (B:35:0x0095, B:37:0x009d, B:40:0x00a4, B:41:0x00a8, B:43:0x00ab, B:54:0x00d0, B:57:0x00e0, B:58:0x00fc, B:64:0x010c, B:61:0x0103, B:63:0x0109, B:45:0x00b1, B:49:0x00b8, B:24:0x005f, B:34:0x0087, B:29:0x0070, B:31:0x0074), top: B:72:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:? A[LOOP:0: B:58:0x00fc->B:77:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0041: MOVE (r1 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:66), block:B:17:0x0041 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r1v0, types: [m2, xi2] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2, types: [m2] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [xi2] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, xi2] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [yi2] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [n2] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [yi2] */
    /* JADX WARN: Type inference failed for: r4v7, types: [yi2] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00df -> B:35:0x0095). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.bp0
    public final java.lang.Object collect(defpackage.cp0 r17, defpackage.dy r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xi2.collect(cp0, dy):java.lang.Object");
    }

    @Override // defpackage.lp1
    public final void d() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // defpackage.vi2
    public final Object getValue() {
        Object obj = f.get(this);
        if (obj == nd4.a) {
            return null;
        }
        return obj;
    }

    public final boolean i(Object obj, Object obj2) {
        tx txVar = nd4.a;
        if (obj == null) {
            obj = txVar;
        }
        if (obj2 == null) {
            obj2 = txVar;
        }
        return k(obj, obj2);
    }

    public final void j(Object obj) {
        if (obj == null) {
            obj = nd4.a;
        }
        k(null, obj);
    }

    public xi2(Object obj) {
        this._state$volatile = obj;
    }

    @Override // defpackage.lp1, defpackage.cp0
    public final Object emit(Object obj, dy dyVar) {
        j(obj);
        return az2.a;
    }

    @Override // defpackage.lp1
    public final boolean f(Object obj) {
        j(obj);
        return true;
    }
}
