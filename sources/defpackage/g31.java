package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class g31 {
    public Object[] a;
    public int b = 0;
    public f31 c;

    public final d42 a(boolean z) {
        f31 f31Var;
        f31 f31Var2;
        if (z && (f31Var2 = this.c) != null) {
            throw f31Var2.a();
        }
        d42 d42VarK = d42.k(this.b, this.a, this);
        if (!z || (f31Var = this.c) == null) {
            return d42VarK;
        }
        throw f31Var.a();
    }

    public final void b(Object obj, Object obj2) {
        int i = (this.b + 1) * 2;
        Object[] objArr = this.a;
        if (i > objArr.length) {
            this.a = Arrays.copyOf(objArr, t21.f(objArr.length, i));
        }
        l93.h(obj, obj2);
        Object[] objArr2 = this.a;
        int i2 = this.b;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.b = i2 + 1;
    }

    public final void c(Set set) {
        if (set != null) {
            int size = (set.size() + this.b) * 2;
            Object[] objArr = this.a;
            if (size > objArr.length) {
                this.a = Arrays.copyOf(objArr, t21.f(objArr.length, size));
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            b(entry.getKey(), entry.getValue());
        }
    }

    public g31(int i) {
        this.a = new Object[i * 2];
    }
}
