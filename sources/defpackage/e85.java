package defpackage;

import com.google.android.gms.internal.nearby.zzsy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class e85 extends zzsy {
    public boolean a;
    public final /* synthetic */ Object b;

    public e85(Object obj) {
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a) {
            d.v();
            return null;
        }
        this.a = true;
        return this.b;
    }
}
