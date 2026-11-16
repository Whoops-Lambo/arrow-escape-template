package defpackage;

import com.google.android.gms.internal.ads.zziet;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class le1 implements Iterator {
    public final /* synthetic */ int a;
    public int b;
    public Map.Entry c;
    public Map.Entry d;
    public final /* synthetic */ AbstractMap e;

    public le1(zziet zzietVar) {
        this.a = 1;
        Objects.requireNonNull(zzietVar);
        this.e = zzietVar;
        this.c = zzietVar.e.d;
        this.d = null;
        this.b = zzietVar.d;
    }

    public me1 a() {
        me1 me1Var = (me1) this.c;
        ne1 ne1Var = (ne1) this.e;
        if (me1Var == ne1Var.e) {
            d.v();
            return null;
        }
        if (ne1Var.d != this.b) {
            d.o();
            return null;
        }
        this.c = me1Var.d;
        this.d = me1Var;
        return me1Var;
    }

    public wx4 b() {
        zziet zzietVar = (zziet) this.e;
        wx4 wx4Var = (wx4) this.c;
        if (wx4Var == zzietVar.e) {
            d.v();
            return null;
        }
        if (zzietVar.d != this.b) {
            d.o();
            return null;
        }
        this.c = wx4Var.d;
        this.d = wx4Var;
        return wx4Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        AbstractMap abstractMap = this.e;
        switch (i) {
            case 0:
                return ((me1) this.c) != ((ne1) abstractMap).e;
            default:
                return ((wx4) this.c) != ((zziet) abstractMap).e;
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.a) {
            case 0:
                return a();
            default:
                return b();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        AbstractMap abstractMap = this.e;
        switch (i) {
            case 0:
                ne1 ne1Var = (ne1) abstractMap;
                me1 me1Var = (me1) this.d;
                if (me1Var == null) {
                    y.b();
                } else {
                    ne1Var.c(me1Var, true);
                    this.d = null;
                    this.b = ne1Var.d;
                }
                break;
            default:
                wx4 wx4Var = (wx4) this.d;
                if (wx4Var == null) {
                    y.b();
                } else {
                    zziet zzietVar = (zziet) abstractMap;
                    zzietVar.b(wx4Var, true);
                    this.d = null;
                    this.b = zzietVar.d;
                }
                break;
        }
    }

    public le1(ne1 ne1Var) {
        this.a = 0;
        this.e = ne1Var;
        this.c = ne1Var.e.d;
        this.d = null;
        this.b = ne1Var.d;
    }
}
