package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class yh2 {
    public final vq a;
    public final boolean b;
    public final x41 c;
    public final int d;

    public static yh2 a(char c) {
        return new yh2(new x41(new wq(c), 25), false, xq.a, Integer.MAX_VALUE);
    }

    public yh2(x41 x41Var, boolean z, vq vqVar, int i) {
        this.c = x41Var;
        this.b = z;
        this.a = vqVar;
        this.d = i;
    }

    public final List b(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itH = this.c.h(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            xh2 xh2Var = (xh2) itH;
            if (xh2Var.hasNext()) {
                arrayList.add((String) xh2Var.next());
            } else {
                return Collections.unmodifiableList(arrayList);
            }
        }
    }
}
