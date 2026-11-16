package defpackage;

import com.google.android.gms.internal.auth.zzea;
import com.google.android.gms.internal.auth.zzef;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class ta4 implements zzea {
    public int a = 0;
    public final int b;
    public final /* synthetic */ zzef c;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i < this.b) {
            this.a = i + 1;
            return Byte.valueOf(this.c.d(i));
        }
        d.v();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public ta4(zzef zzefVar) {
        this.c = zzefVar;
        this.b = zzefVar.h();
    }
}
