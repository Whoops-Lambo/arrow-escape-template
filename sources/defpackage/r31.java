package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class r31 extends o31 {
    public final Comparator d;

    public r31(Comparator comparator) {
        super(4);
        comparator.getClass();
        this.d = comparator;
    }

    @Override // defpackage.o31
    public final o31 h(Iterable iterable) {
        throw null;
    }

    @Override // defpackage.o31
    public final /* bridge */ /* synthetic */ q31 i() {
        throw null;
    }

    public final f42 j() {
        f42 f42Var;
        Object[] objArrCopyOf = this.a;
        int i = this.b;
        Comparator comparator = this.d;
        if (i == 0) {
            int i2 = t31.f;
            f42Var = gq1.a != comparator ? new f42(y32.e, comparator) : f42.h;
        } else {
            int i3 = t31.f;
            tb5.d(i, objArrCopyOf);
            Arrays.sort(objArrCopyOf, 0, i, comparator);
            int i4 = 1;
            for (int i5 = 1; i5 < i; i5++) {
                Object obj = objArrCopyOf[i5];
                if (comparator.compare(obj, objArrCopyOf[i4 - 1]) != 0) {
                    objArrCopyOf[i4] = obj;
                    i4++;
                }
            }
            Arrays.fill(objArrCopyOf, i4, i, (Object) null);
            if (i4 < objArrCopyOf.length / 2) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            }
            f42Var = new f42(d31.t(i4, objArrCopyOf), comparator);
        }
        this.b = f42Var.g.size();
        this.c = true;
        return f42Var;
    }

    @Override // defpackage.o31, defpackage.t21
    public final t21 c(Object obj) {
        super.c(obj);
        return this;
    }

    @Override // defpackage.o31
    /* JADX INFO: renamed from: g */
    public final o31 c(Object obj) {
        super.c(obj);
        return this;
    }
}
