package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzgwz extends zzhbp {
    public Object a;
    public int b = 2;

    public abstract Object a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzgvz.f(this.b != 4);
        int i = this.b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.b = 4;
            this.a = a();
            if (this.b != 3) {
                this.b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.b = 2;
            Object obj = this.a;
            this.a = null;
            return obj;
        }
        defpackage.d.v();
        return null;
    }
}
