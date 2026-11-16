package defpackage;

import com.google.android.gms.internal.ads.zziow;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ml3 implements Iterator {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ AbstractCollection c;

    public /* synthetic */ ml3(AbstractCollection abstractCollection, int i) {
        this.a = i;
        this.c = abstractCollection;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        AbstractCollection abstractCollection = this.c;
        switch (i) {
            case 0:
                pl3 pl3Var = (pl3) abstractCollection;
                return this.b < pl3Var.d() - pl3Var.c();
            case 1:
                kg4 kg4Var = (kg4) abstractCollection;
                return this.b < kg4Var.b.c[kg4Var.a + 1] - kg4Var.c();
            case 2:
                zziow zziowVar = (zziow) abstractCollection;
                return this.b < zziowVar.a.size() || zziowVar.b.hasNext();
            default:
                return this.b < ((md5) ((yg2) abstractCollection).b).e;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        AbstractCollection abstractCollection = this.c;
        switch (i) {
            case 0:
                int i2 = this.b;
                pl3 pl3Var = (pl3) abstractCollection;
                if (i2 >= pl3Var.d() - pl3Var.c()) {
                    d.v();
                    return null;
                }
                ql3 ql3Var = pl3Var.b;
                Object obj = ql3Var.b[pl3Var.c() + i2];
                this.b = i2 + 1;
                return obj;
            case 1:
                int i3 = this.b;
                kg4 kg4Var = (kg4) abstractCollection;
                int i4 = kg4Var.a;
                ql3 ql3Var2 = kg4Var.b;
                if (i3 >= ql3Var2.c[i4 + 1] - kg4Var.c()) {
                    d.v();
                    return null;
                }
                Object obj2 = ql3Var2.b[kg4Var.c() + i3];
                this.b = i3 + 1;
                return obj2;
            case 2:
                int i5 = this.b;
                zziow zziowVar = (zziow) abstractCollection;
                List list = zziowVar.a;
                if (i5 >= list.size()) {
                    list.add(zziowVar.b.next());
                    return next();
                }
                int i6 = this.b;
                this.b = i6 + 1;
                return list.get(i6);
            default:
                int i7 = this.b;
                this.b = i7 + 1;
                md5 md5Var = (md5) ((yg2) abstractCollection).b;
                return md5Var.d(md5Var.d[i7] & 31);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
