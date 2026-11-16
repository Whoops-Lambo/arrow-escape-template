package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class nw4 implements Iterable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public nw4(yh2 yh2Var, String str) {
        this.a = 2;
        this.b = str;
        this.c = yh2Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return new bm3(((List) obj).iterator(), ((List) obj2).iterator(), 1);
            case 1:
                return new bm3(((List) obj).iterator(), ((List) obj2).iterator(), 2);
            default:
                yh2 yh2Var = (yh2) obj2;
                return yh2Var.c.h(yh2Var, (String) obj);
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                p91 p91Var = new p91(", ");
                StringBuilder sb = new StringBuilder();
                sb.append('[');
                p91Var.a(sb, iterator());
                sb.append(']');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ nw4(Object obj, List list, List list2, int i) {
        this.a = i;
        this.b = list;
        this.c = list2;
    }
}
