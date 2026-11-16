package defpackage;

import com.google.android.gms.internal.p002firebaseauthapi.zzba;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class ju3 extends zzba {
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

    public ju3(String str) {
        this.a = str;
    }
}
