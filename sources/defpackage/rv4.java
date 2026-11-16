package defpackage;

import com.google.android.gms.internal.games_v2.zzhu;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class rv4 implements zzhu {
    public final Iterator a;
    public boolean b;
    public Object c;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.b) {
            return this.a.next();
        }
        Object obj = this.c;
        this.b = false;
        this.c = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.b) {
            e32.i("Can't remove after you've peeked at next");
        } else {
            this.a.remove();
        }
    }

    public rv4(Iterator it) {
        it.getClass();
        this.a = it;
    }
}
