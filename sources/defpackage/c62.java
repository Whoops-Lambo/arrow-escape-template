package defpackage;

import com.google.android.gms.internal.ads.b0;
import com.google.android.gms.internal.ads.zzifx;
import com.google.protobuf.ByteString;
import com.google.protobuf.l;
import com.google.protobuf.u1;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class c62 implements Iterator {
    public final /* synthetic */ int a = 1;
    public final ArrayDeque b;
    public Object c;

    public c62(zzifx zzifxVar) {
        if (!(zzifxVar instanceof b0)) {
            this.b = null;
            this.c = (iy4) zzifxVar;
            return;
        }
        b0 b0Var = (b0) zzifxVar;
        ArrayDeque arrayDeque = new ArrayDeque(b0Var.g);
        this.b = arrayDeque;
        arrayDeque.push(b0Var);
        zzifx zzifxVar2 = b0Var.d;
        while (zzifxVar2 instanceof b0) {
            b0 b0Var2 = (b0) zzifxVar2;
            this.b.push(b0Var2);
            zzifxVar2 = b0Var2.d;
        }
        this.c = (iy4) zzifxVar2;
    }

    public l a() {
        l lVar;
        l lVar2 = (l) this.c;
        l lVar3 = null;
        if (lVar2 == null) {
            d.v();
            return null;
        }
        do {
            ArrayDeque arrayDeque = this.b;
            if (arrayDeque != null && !arrayDeque.isEmpty()) {
                ByteString byteString = ((u1) arrayDeque.pop()).c;
                while (byteString instanceof u1) {
                    u1 u1Var = (u1) byteString;
                    arrayDeque.push(u1Var);
                    byteString = u1Var.b;
                }
                lVar = (l) byteString;
            }
            this.c = lVar3;
            return lVar2;
        } while (lVar.isEmpty());
        lVar3 = lVar;
        this.c = lVar3;
        return lVar2;
    }

    public iy4 b() {
        iy4 iy4Var;
        iy4 iy4Var2 = (iy4) this.c;
        iy4 iy4Var3 = null;
        if (iy4Var2 == null) {
            d.v();
            return null;
        }
        do {
            ArrayDeque arrayDeque = this.b;
            if (arrayDeque != null && !arrayDeque.isEmpty()) {
                zzifx zzifxVar = ((b0) arrayDeque.pop()).e;
                while (zzifxVar instanceof b0) {
                    b0 b0Var = (b0) zzifxVar;
                    arrayDeque.push(b0Var);
                    zzifxVar = b0Var.d;
                }
                iy4Var = (iy4) zzifxVar;
            }
            this.c = iy4Var3;
            return iy4Var2;
        } while (iy4Var.n() == 0);
        iy4Var3 = iy4Var;
        this.c = iy4Var3;
        return iy4Var2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return ((l) this.c) != null;
            default:
                return ((iy4) this.c) != null;
        }
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        switch (this.a) {
            case 0:
                return a();
            default:
                return b();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public c62(ByteString byteString) {
        if (byteString instanceof u1) {
            u1 u1Var = (u1) byteString;
            ArrayDeque arrayDeque = new ArrayDeque(u1Var.e);
            this.b = arrayDeque;
            arrayDeque.push(u1Var);
            ByteString byteString2 = u1Var.b;
            while (byteString2 instanceof u1) {
                u1 u1Var2 = (u1) byteString2;
                this.b.push(u1Var2);
                byteString2 = u1Var2.b;
            }
            this.c = (l) byteString2;
            return;
        }
        this.b = null;
        this.c = (l) byteString;
    }
}
