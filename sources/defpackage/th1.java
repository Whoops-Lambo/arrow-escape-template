package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class th1 extends n1 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public th1(List list) {
        list.getClass();
        this.b = list;
    }

    @Override // defpackage.i0, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                String strGroup = ((vh1) obj).a.group(i);
                return strGroup == null ? "" : strGroup;
            default:
                List list = (List) obj;
                if (i >= 0 && i <= eu.o(this)) {
                    return list.get(eu.o(this) - i);
                }
                StringBuilder sbS = jc1.s(i, "Element index ", " must be in range [");
                sbS.append(new j71(0, eu.o(this), 1));
                sbS.append("].");
                throw new IndexOutOfBoundsException(sbS.toString());
        }
    }

    @Override // defpackage.i0
    /* JADX INFO: renamed from: getSize */
    public final int getC() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((vh1) obj).a.groupCount() + 1;
            default:
                return ((List) obj).size();
        }
    }

    @Override // defpackage.n1, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // defpackage.n1, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.a) {
            case 1:
                return new p52(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // defpackage.n1, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // defpackage.n1, java.util.List
    public ListIterator listIterator() {
        switch (this.a) {
            case 1:
                return new p52(this, 0);
            default:
                return super.listIterator();
        }
    }

    public th1(vh1 vh1Var) {
        this.b = vh1Var;
    }

    @Override // defpackage.n1, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.a) {
            case 1:
                return new p52(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
