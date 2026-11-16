package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class np2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(np2.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public ii0[] a;

    public final void a(ii0 ii0Var) {
        ii0Var.d((ji0) this);
        ii0[] ii0VarArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (ii0VarArr == null) {
            ii0VarArr = new ii0[4];
            this.a = ii0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= ii0VarArr.length) {
            ii0VarArr = (ii0[]) Arrays.copyOf(ii0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.a = ii0VarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        ii0VarArr[i] = ii0Var;
        ii0Var.b = i;
        c(i);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[LOOP:0: B:9:0x003a->B:21:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007a A[EDGE_INSN: B:24:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a A[EDGE_INSN: B:25:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final ii0 b(int i) {
        int i2;
        int i3;
        Object[] objArr;
        int i4;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.a;
        objArr2.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            d(i, atomicIntegerFieldUpdater.get(this));
            int i5 = (i - 1) / 2;
            if (i > 0) {
                ii0 ii0Var = objArr2[i];
                ii0Var.getClass();
                Object obj2 = objArr2[i5];
                obj2.getClass();
                if (ii0Var.compareTo(obj2) < 0) {
                    d(i, i5);
                    c(i5);
                } else {
                    while (true) {
                        i2 = i * 2;
                        i3 = i2 + 1;
                        if (i3 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        objArr = this.a;
                        objArr.getClass();
                        i4 = i2 + 2;
                        if (i4 < atomicIntegerFieldUpdater.get(this)) {
                            comparable3 = objArr[i4];
                            comparable3.getClass();
                            obj = objArr[i3];
                            obj.getClass();
                            if (comparable3.compareTo(obj) >= 0) {
                                i4 = i3;
                            }
                        } else {
                            i4 = i3;
                        }
                        comparable = objArr[i];
                        comparable.getClass();
                        comparable2 = objArr[i4];
                        comparable2.getClass();
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        d(i, i4);
                        i = i4;
                    }
                }
            } else {
                while (true) {
                    i2 = i * 2;
                    i3 = i2 + 1;
                    if (i3 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    objArr = this.a;
                    objArr.getClass();
                    i4 = i2 + 2;
                    if (i4 < atomicIntegerFieldUpdater.get(this)) {
                        comparable3 = objArr[i4];
                        comparable3.getClass();
                        obj = objArr[i3];
                        obj.getClass();
                        if (comparable3.compareTo(obj) >= 0) {
                            i4 = i3;
                        }
                    } else {
                        i4 = i3;
                    }
                    comparable = objArr[i];
                    comparable.getClass();
                    comparable2 = objArr[i4];
                    comparable2.getClass();
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    d(i, i4);
                    i = i4;
                }
            }
        }
        ii0 ii0Var2 = objArr2[atomicIntegerFieldUpdater.get(this)];
        ii0Var2.getClass();
        ii0Var2.d(null);
        ii0Var2.b = -1;
        objArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return ii0Var2;
    }

    public final void c(int i) {
        while (i > 0) {
            ii0[] ii0VarArr = this.a;
            ii0VarArr.getClass();
            int i2 = (i - 1) / 2;
            ii0 ii0Var = ii0VarArr[i2];
            ii0Var.getClass();
            ii0 ii0Var2 = ii0VarArr[i];
            ii0Var2.getClass();
            if (ii0Var.compareTo(ii0Var2) <= 0) {
                return;
            }
            d(i, i2);
            i = i2;
        }
    }

    public final void d(int i, int i2) {
        ii0[] ii0VarArr = this.a;
        ii0VarArr.getClass();
        ii0 ii0Var = ii0VarArr[i2];
        ii0Var.getClass();
        ii0 ii0Var2 = ii0VarArr[i];
        ii0Var2.getClass();
        ii0VarArr[i] = ii0Var;
        ii0VarArr[i2] = ii0Var2;
        ii0Var.b = i;
        ii0Var2.b = i2;
    }
}
