package defpackage;

import com.google.android.gms.internal.consent_sdk.zzeb;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class xa4 extends zzeb {
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

    public xa4(Object obj) {
        this.a = obj;
    }
}
