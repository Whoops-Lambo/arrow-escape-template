package defpackage;

import com.google.android.gms.internal.p002firebaseauthapi.zzakb;
import com.google.android.gms.internal.p002firebaseauthapi.zzakh;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class ir3 implements zzakh {
    public int a = 0;
    public final int b;
    public final /* synthetic */ zzakb c;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // java.util.Iterator
    public final Byte next() {
        int i = this.a;
        if (i < this.b) {
            this.a = i + 1;
            return Byte.valueOf(this.c.c(i));
        }
        d.v();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public ir3(zzakb zzakbVar) {
        this.c = zzakbVar;
        this.b = zzakbVar.d();
    }
}
