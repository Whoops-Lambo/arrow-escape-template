package defpackage;

import com.google.android.gms.internal.measurement.zzae;
import com.google.android.gms.internal.measurement.zzas;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class bm3 implements Iterator {
    public final /* synthetic */ int a;
    public final Iterator b;
    public final Iterator c;

    public bm3(zzae zzaeVar, Iterator it, Iterator it2) {
        this.a = 0;
        this.b = it;
        this.c = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b.hasNext()) {
                    return true;
                }
                return this.c.hasNext();
            case 1:
                return this.b.hasNext() || this.c.hasNext();
            default:
                return this.b.hasNext() || this.c.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Iterator it = this.c;
        Iterator it2 = this.b;
        switch (i) {
            case 0:
                if (it2.hasNext()) {
                    return new zzas(((Integer) it2.next()).toString());
                }
                if (it.hasNext()) {
                    return new zzas((String) it.next());
                }
                d.v();
                return null;
            case 1:
                return it2.hasNext() ? it2.next() : it.next();
            default:
                return it2.hasNext() ? it2.next() : it.next();
        }
    }

    public /* synthetic */ bm3(Iterator it, Iterator it2, int i) {
        this.a = i;
        this.b = it;
        this.c = it2;
    }
}
