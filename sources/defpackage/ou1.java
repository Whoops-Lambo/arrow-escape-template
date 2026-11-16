package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class ou1 {
    public final ArrayList a;
    public int b;
    public boolean c;
    public tx d;

    @NotNull
    private volatile /* synthetic */ Object interceptors$delegate;

    public abstract boolean d();

    public final lu1 b(tx txVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == txVar) {
                lu1 lu1Var = new lu1(txVar, tu1.e);
                arrayList.set(i, lu1Var);
                return lu1Var;
            }
            if (obj instanceof lu1) {
                lu1 lu1Var2 = (lu1) obj;
                if (lu1Var2.a == txVar) {
                    return lu1Var2;
                }
            }
        }
        return null;
    }

    public final int c(tx txVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == txVar || ((obj instanceof lu1) && ((lu1) obj).a == txVar)) {
                return i;
            }
        }
        return -1;
    }

    public final boolean e(tx txVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == txVar) {
                return true;
            }
            if ((obj instanceof lu1) && ((lu1) obj).a == txVar) {
                return true;
            }
        }
        return false;
    }

    public ou1(tx... txVarArr) {
        l93.a();
        this.a = eu.C(Arrays.copyOf(txVarArr, txVarArr.length));
        this.interceptors$delegate = null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:34:0x007f A[LOOP:2: B:33:0x007d->B:34:0x007f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x008b A[LOOP:1: B:26:0x005b->B:36:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x008e A[EDGE_INSN: B:48:0x008e->B:37:0x008e BREAK  A[LOOP:1: B:26:0x005b->B:36:0x008b], SYNTHETIC] */
    public final Object a(Object obj, Object obj2, fy fyVar) {
        pu1 v50Var;
        ArrayList arrayList;
        int iO;
        int i;
        Object obj3;
        lu1 lu1Var;
        List list;
        int size;
        int i2;
        int iO2;
        lu1 lu1Var2;
        sy context = fyVar.getContext();
        if (((List) this.interceptors$delegate) == null) {
            int i3 = this.b;
            if (i3 == 0) {
                this.interceptors$delegate = gg0.a;
                this.c = false;
                this.d = null;
            } else {
                ArrayList arrayList2 = this.a;
                if (i3 == 1 && (iO2 = eu.o(arrayList2)) >= 0) {
                    int i4 = 0;
                    while (true) {
                        Object obj4 = arrayList2.get(i4);
                        if (obj4 instanceof lu1) {
                            lu1Var2 = (lu1) obj4;
                        } else {
                            lu1Var2 = null;
                        }
                        if (lu1Var2 != null && !lu1Var2.c.isEmpty()) {
                            List list2 = lu1Var2.c;
                            lu1Var2.d = true;
                            this.interceptors$delegate = list2;
                            this.c = false;
                            this.d = lu1Var2.a;
                        } else if (i4 != iO2) {
                            i4++;
                        } else {
                            arrayList = new ArrayList();
                            iO = eu.o(arrayList2);
                            if (iO >= 0) {
                                i = 0;
                                while (true) {
                                    obj3 = arrayList2.get(i);
                                    if (obj3 instanceof lu1) {
                                        lu1Var = (lu1) obj3;
                                    } else {
                                        lu1Var = null;
                                    }
                                    if (lu1Var != null) {
                                        list = lu1Var.c;
                                        arrayList.ensureCapacity(list.size() + arrayList.size());
                                        size = list.size();
                                        for (i2 = 0; i2 < size; i2++) {
                                            arrayList.add(list.get(i2));
                                        }
                                    }
                                    if (i != iO) {
                                        break;
                                        break;
                                    }
                                    i++;
                                }
                            }
                            this.interceptors$delegate = arrayList;
                            this.c = false;
                            this.d = null;
                        }
                    }
                } else {
                    arrayList = new ArrayList();
                    iO = eu.o(arrayList2);
                    if (iO >= 0) {
                        i = 0;
                        while (true) {
                            obj3 = arrayList2.get(i);
                            if (obj3 instanceof lu1) {
                                lu1Var = (lu1) obj3;
                            } else {
                                lu1Var = null;
                            }
                            if (lu1Var != null) {
                                list = lu1Var.c;
                                arrayList.ensureCapacity(list.size() + arrayList.size());
                                size = list.size();
                                while (i2 < size) {
                                    arrayList.add(list.get(i2));
                                }
                            }
                            if (i != iO) {
                                break;
                            }
                            i++;
                        }
                    }
                    this.interceptors$delegate = arrayList;
                    this.c = false;
                    this.d = null;
                }
            }
        }
        this.c = true;
        List list3 = (List) this.interceptors$delegate;
        list3.getClass();
        boolean zD = d();
        obj.getClass();
        obj2.getClass();
        context.getClass();
        if (!qu1.a && !zD) {
            v50Var = new tl2(obj2, obj, list3);
        } else {
            v50Var = new v50(obj, list3, obj2, context);
        }
        return v50Var.a(obj2, fyVar);
    }

    public final void f(tx txVar, as0 as0Var) {
        txVar.getClass();
        lu1 lu1VarB = b(txVar);
        if (lu1VarB != null) {
            List list = (List) this.interceptors$delegate;
            if (!this.a.isEmpty() && list != null && !this.c && os2.x(list)) {
                if (s71.b(this.d, txVar)) {
                    list.add(as0Var);
                } else if (txVar == du.h0(this.a) || c(txVar) == eu.o(this.a)) {
                    lu1 lu1VarB2 = b(txVar);
                    lu1VarB2.getClass();
                    if (lu1VarB2.d) {
                        lu1VarB2.c = du.B0(lu1VarB2.c);
                        lu1VarB2.d = false;
                    }
                    lu1VarB2.c.add(as0Var);
                    list.add(as0Var);
                }
                this.b++;
                return;
            }
            if (lu1VarB.d) {
                lu1VarB.c = du.B0(lu1VarB.c);
                lu1VarB.d = false;
            }
            lu1VarB.c.add(as0Var);
            this.b++;
            this.interceptors$delegate = null;
            this.c = false;
            this.d = null;
            return;
        }
        throw new a81("Phase " + txVar + " was not registered for this pipeline");
    }
}
