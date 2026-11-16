package defpackage;

import com.google.android.gms.internal.games_v2.zzil;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zv4 extends zzil {
    public final Object a;
    public boolean b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            d.v();
            return null;
        }
        this.b = true;
        return this.a;
    }

    public zv4(Object obj) {
        this.a = obj;
    }
}
