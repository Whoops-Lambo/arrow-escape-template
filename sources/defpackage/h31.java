package defpackage;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class h31 implements Serializable {
    public final Object[] a;
    public final Object[] b;

    /* JADX WARN: Multi-variable type inference failed */
    public final Object readResolve() {
        Object[] objArr = this.a;
        boolean z = objArr instanceof q31;
        Object[] objArr2 = this.b;
        if (!z) {
            g31 g31Var = new g31(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                g31Var.b(objArr[i], objArr2[i]);
            }
            return g31Var.a(true);
        }
        q31 q31Var = (q31) objArr;
        g31 g31Var2 = new g31(q31Var.size());
        d03 it = q31Var.iterator();
        d03 it2 = ((u21) objArr2).iterator();
        while (it.hasNext()) {
            g31Var2.b(it.next(), it2.next());
        }
        return g31Var2.a(true);
    }

    public h31(i31 i31Var) {
        int i = ((d42) i31Var).f;
        Object[] objArr = new Object[i];
        Object[] objArr2 = new Object[i];
        d03 it = i31Var.entrySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objArr[i2] = entry.getKey();
            objArr2[i2] = entry.getValue();
            i2++;
        }
        this.a = objArr;
        this.b = objArr2;
    }
}
