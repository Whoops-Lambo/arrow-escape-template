package defpackage;

import com.google.android.gms.internal.fido.zzdc;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class b44 extends zzdc {
    public static final Object b = new Object();
    public Object a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.a;
        Object obj2 = b;
        if (obj != obj2) {
            this.a = obj2;
            return obj;
        }
        d.v();
        return null;
    }

    public b44(Object obj) {
        this.a = obj;
    }
}
