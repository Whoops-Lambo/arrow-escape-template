package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class sg2 implements Iterator {
    public final /* synthetic */ int a = 1;
    public int b;
    public Iterator c;
    public final /* synthetic */ AbstractMap d;

    public sg2(rg2 rg2Var) {
        this.d = rg2Var;
        this.b = rg2Var.b.size();
    }

    public Iterator a() {
        if (this.c == null) {
            this.c = ((rg2) this.d).f.entrySet().iterator();
        }
        return this.c;
    }

    public Iterator b() {
        if (this.c == null) {
            this.c = ((kt3) this.d).c.entrySet().iterator();
        }
        return this.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        AbstractMap abstractMap = this.d;
        switch (i) {
            case 0:
                int i2 = this.b;
                return (i2 > 0 && i2 <= ((rg2) abstractMap).b.size()) || a().hasNext();
            default:
                kt3 kt3Var = (kt3) abstractMap;
                return this.b + 1 < kt3Var.b || (!kt3Var.c.isEmpty() && b().hasNext());
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        AbstractMap abstractMap = this.d;
        switch (i) {
            case 0:
                if (a().hasNext()) {
                    return (Map.Entry) a().next();
                }
                List list = ((rg2) abstractMap).b;
                int i2 = this.b - 1;
                this.b = i2;
                return (Map.Entry) list.get(i2);
            default:
                int i3 = this.b + 1;
                this.b = i3;
                kt3 kt3Var = (kt3) abstractMap;
                return i3 < kt3Var.b ? (jt3) kt3Var.a[i3] : (Map.Entry) b().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                kt3 kt3Var = (kt3) this.d;
                int i = kt3.f;
                kt3Var.g();
                int i2 = this.b;
                if (i2 >= kt3Var.b) {
                    b().remove();
                    return;
                } else {
                    this.b = i2 - 1;
                    kt3Var.d(i2);
                    return;
                }
        }
    }

    public sg2(kt3 kt3Var) {
        Objects.requireNonNull(kt3Var);
        this.d = kt3Var;
        this.b = -1;
    }
}
