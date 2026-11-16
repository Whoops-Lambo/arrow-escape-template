package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.du;
import defpackage.e80;
import defpackage.gg0;
import defpackage.n30;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC5065xb
public final class Hg implements F, Rg {

    @NotNull
    private final T0 a;

    @NotNull
    private final AbstractC5054x0 b;

    @NotNull
    private final Pg c;

    @Nullable
    private final Dd d;

    @Nullable
    private final E e;

    @NotNull
    private final Yg f;

    @NotNull
    private final Kg g;

    @Nullable
    private G h;

    @Nullable
    private Sg i;

    @NotNull
    private final List<A> j;

    @Nullable
    private A k;
    private boolean l;
    private boolean m;
    private int n;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a implements Lg {
        public a() {
        }

        @Override // com.ironsource.Lg
        public void a(Mg mg) {
            boolean z;
            mg.getClass();
            if (Hg.this.l) {
                return;
            }
            Hg hg = Hg.this;
            List<A> listB = mg.b();
            if (!(listB instanceof Collection) || !listB.isEmpty()) {
                Iterator<T> it = listB.iterator();
                while (it.hasNext()) {
                    if (((A) it.next()).A()) {
                        z = true;
                    }
                }
                z = false;
            } else {
                z = false;
            }
            hg.m = z;
            Hg.this.a(mg);
        }

        @Override // com.ironsource.Lg
        public void a(int i, String str) {
            str.getClass();
            if (Hg.this.l) {
                return;
            }
            Hg.this.c.a(i, str);
        }
    }

    private final void c(A a2) {
        if (this.l || h()) {
            if (!a2.A()) {
                a2.c();
                return;
            }
            Dd dd = this.d;
            if (dd != null) {
                dd.a(this.b.b().c(), false);
                return;
            }
            return;
        }
        E e = this.e;
        if (e != null) {
            a2.a(e);
        }
        Sg sg = this.i;
        if (sg != null) {
            sg.a(a2);
        }
        this.j.add(a2);
        if (this.j.size() == 1) {
            Sg sg2 = this.i;
            if (sg2 != null) {
                sg2.b(a2);
            }
            this.c.b(a2);
            return;
        }
        G g = this.h;
        if (g == null || !g.a(a2)) {
            return;
        }
        this.c.a(a2);
    }

    private final List<A> e() {
        G.c cVarC;
        List<A> listD;
        G g = this.h;
        return (g == null || (cVarC = g.c()) == null || (listD = cVarC.d()) == null) ? gg0.a : listD;
    }

    private final boolean h() {
        return this.k != null;
    }

    private final void i() {
        G g = this.h;
        G.b bVarD = g != null ? g.d() : null;
        if (bVarD == null || bVarD.e()) {
            this.c.a(509, "Mediation No fill");
            return;
        }
        if (bVarD.f()) {
            Sg sg = this.i;
            if (sg != null) {
                sg.a();
                return;
            }
            return;
        }
        for (A a2 : bVarD.a()) {
            this.n++;
            if (a2.A()) {
                this.m = false;
                b(a2);
            } else {
                a2.a(this);
            }
        }
    }

    @NotNull
    public final Pd f() {
        return this.f.b();
    }

    public final boolean g() {
        Iterator<A> it = this.j.iterator();
        while (it.hasNext()) {
            if (it.next().B()) {
                return true;
            }
        }
        return false;
    }

    public Hg(@NotNull T0 t0, @NotNull AbstractC5054x0 abstractC5054x0, boolean z, @NotNull Pg pg, @Nullable Dd dd, @Nullable E e) {
        t0.getClass();
        abstractC5054x0.getClass();
        pg.getClass();
        this.a = t0;
        this.b = abstractC5054x0;
        this.c = pg;
        this.d = dd;
        this.e = e;
        this.f = Yg.a.a.a(z, this);
        this.g = Kg.d.a(t0, abstractC5054x0);
        this.j = new ArrayList();
    }

    @Override // com.ironsource.Rg
    public void a(@NotNull Z4 z4) {
        Z4.a aVar;
        z4.getClass();
        Long lValueOf = null;
        IronLog.INTERNAL.verbose(C4911p0.a(this.a, n30.y("destroyReadyToShowInstances reason=", z4.a()), (String) null, 2, (Object) null));
        if (this.j.isEmpty()) {
            return;
        }
        String strC = this.b.b().c();
        for (A a2 : this.j) {
            if (a2.A()) {
                Dd dd = this.d;
                if (dd != null) {
                    dd.a(strC, false);
                }
            } else {
                a2.c();
            }
        }
        this.j.clear();
        if (z4 instanceof Z4.a) {
            aVar = (Z4.a) z4;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            lValueOf = Long.valueOf(aVar.c());
        }
        this.a.f().h().a(z4.a(), lValueOf);
    }

    @Override // com.ironsource.F
    public void b(@NotNull A a2) {
        Dd dd;
        a2.getClass();
        this.n--;
        c(a2);
        if (this.n <= 0 && this.m && (dd = this.d) != null) {
            dd.a(this.b.b().c(), false);
        }
    }

    public final void d(@NotNull A a2) {
        a2.getClass();
        Sg sg = this.i;
        if (sg != null) {
            sg.a(a2, this.b.m(), this.b.p());
        }
    }

    @Nullable
    public final A d() {
        G.c cVarC;
        G g = this.h;
        if (g == null || (cVarC = g.c()) == null) {
            return null;
        }
        return cVarC.c();
    }

    public final void b() {
        this.f.a();
    }

    public /* synthetic */ Hg(T0 t0, AbstractC5054x0 abstractC5054x0, boolean z, Pg pg, Dd dd, E e, int i, e80 e80Var) {
        this(t0, abstractC5054x0, z, pg, (i & 16) != 0 ? null : dd, (i & 32) != 0 ? null : e);
    }

    public final void c() {
        this.l = true;
        A a2 = this.k;
        if (a2 != null) {
            a2.b();
        }
    }

    public final void a(@NotNull D d) {
        d.getClass();
        this.g.a(d, new a());
    }

    public final void a(@NotNull J j, boolean z) {
        Sg sg;
        j.getClass();
        A aC = this.f.c();
        if (aC != null) {
            aC.b(z);
            this.f.a(aC);
            if (!z && (sg = this.i) != null) {
                sg.a(aC, e());
            }
            aC.a(j);
        }
    }

    @Override // com.ironsource.F
    public void a(@NotNull IronSourceError ironSourceError, @NotNull A a2) {
        ironSourceError.getClass();
        a2.getClass();
        this.n--;
        if (this.l) {
            return;
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Mg mg) {
        G gA = G.c.a(this.b, mg);
        this.h = gA;
        this.i = Sg.c.a(this.a, this.b, this.g.a(), mg, gA);
        i();
    }

    @Override // com.ironsource.Rg
    public void a(@NotNull A a2) {
        a2.getClass();
        this.k = a2;
        this.j.remove(a2);
    }

    @Override // com.ironsource.Rg
    public boolean a() {
        return !this.j.isEmpty();
    }

    @Override // com.ironsource.Rg
    @Nullable
    public A a(int i) {
        List<A> listE = e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listE) {
            if (((A) obj).x()) {
                arrayList.add(obj);
            }
        }
        return (A) du.d0(i, arrayList);
    }
}
