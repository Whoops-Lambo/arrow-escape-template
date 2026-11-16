package defpackage;

import com.google.android.gms.internal.consent_sdk.zzpi;
import com.google.android.gms.internal.consent_sdk.zzpm;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class v55 implements zzpi {
    public int a = 0;
    public final int b;
    public final /* synthetic */ zzpm c;

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

    public v55(zzpm zzpmVar) {
        this.c = zzpmVar;
        this.b = zzpmVar.h();
    }
}
