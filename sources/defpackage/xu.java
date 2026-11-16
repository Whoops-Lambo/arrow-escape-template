package defpackage;

import com.google.android.gms.internal.ads.zzgvz;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class xu implements Iterator {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public int d;
    public final /* synthetic */ Object e;

    public xu(uq4 uq4Var) {
        Objects.requireNonNull(uq4Var);
        this.e = uq4Var;
        this.b = uq4Var.e;
        this.c = uq4Var.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public abstract Object a(int i);

    public abstract Object b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.c >= 0;
            default:
                return this.c >= 0;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.e;
        Object objA = null;
        switch (i) {
            case 0:
                av avVar = (av) obj;
                if (avVar.e != this.b) {
                    d.o();
                } else if (!hasNext()) {
                    d.v();
                } else {
                    int i2 = this.c;
                    this.d = i2;
                    objA = a(i2);
                    int i3 = this.c + 1;
                    this.c = i3 < avVar.f ? i3 : -1;
                }
                break;
            default:
                uq4 uq4Var = (uq4) obj;
                if (uq4Var.e != this.b) {
                    d.o();
                } else if (!hasNext()) {
                    d.v();
                } else {
                    int i4 = this.c;
                    this.d = i4;
                    objA = b(i4);
                    int i5 = this.c + 1;
                    this.c = i5 < uq4Var.f ? i5 : -1;
                }
                break;
        }
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                av avVar = (av) obj;
                if (avVar.e != this.b) {
                    d.o();
                } else {
                    fs1.n("no calls to next() since the last call to remove()", this.d >= 0);
                    this.b += 32;
                    avVar.remove(avVar.t()[this.d]);
                    this.c--;
                    this.d = -1;
                }
                break;
            default:
                uq4 uq4Var = (uq4) obj;
                if (uq4Var.e != this.b) {
                    d.o();
                } else {
                    zzgvz.g("no calls to next() since the last call to remove()", this.d >= 0);
                    this.b += 32;
                    uq4Var.remove(uq4Var.f()[this.d]);
                    this.c--;
                    this.d = -1;
                }
                break;
        }
    }

    public xu(av avVar) {
        this.e = avVar;
        this.b = avVar.e;
        this.c = avVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }
}
