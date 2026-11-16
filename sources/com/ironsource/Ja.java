package com.ironsource;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import defpackage.az2;
import defpackage.e80;
import defpackage.r70;
import defpackage.u81;
import defpackage.v81;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC5065xb
public final class Ja implements Fa {

    @NotNull
    private final C4911p0 a;

    @NotNull
    private final C4699d3 b;
    private final long c;
    private final long d;

    @NotNull
    private Ga e;

    @NotNull
    private final U2 f;

    @NotNull
    private final Ff g;

    @NotNull
    private final InterfaceC4986t4 h;
    private final boolean i;

    @NotNull
    private L0 j;

    @NotNull
    private InterfaceC5090z0 k;

    @NotNull
    private V2 l;

    @NotNull
    private Sa m;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a implements V2 {
        public a() {
        }

        public void a() {
            Ja.this.m().onAdLeftApplication();
        }

        public void b() {
            Ja.this.m().k();
        }

        public void c() {
            Ja.this.m().i();
        }

        @Override // com.ironsource.J0
        public void e() {
            Ja.this.m().onAdClicked();
        }

        @Override // com.ironsource.V2
        public /* bridge */ /* synthetic */ az2 g() {
            a();
            return az2.a;
        }

        @Override // com.ironsource.V2
        public /* bridge */ /* synthetic */ az2 h() {
            c();
            return az2.a;
        }

        @Override // com.ironsource.V2
        public /* bridge */ /* synthetic */ az2 j() {
            b();
            return az2.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b implements L0 {
        public b() {
        }

        @Override // com.ironsource.L0
        public void b(IronSourceError ironSourceError) {
            Ja.this.l().b(ironSourceError);
        }

        @Override // com.ironsource.L0
        public void a(C5000u0 c5000u0) {
            c5000u0.getClass();
            Ja.this.l().a(c5000u0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class c implements InterfaceC5090z0 {
        public c() {
        }

        @Override // com.ironsource.InterfaceC5090z0
        public void c(IronSourceError ironSourceError) {
            Ja.this.m().d(ironSourceError);
        }

        @Override // com.ironsource.InterfaceC5090z0
        public void a(LevelPlayAdInfo levelPlayAdInfo) {
            levelPlayAdInfo.getClass();
            Ja.this.m().onAdDisplayed(levelPlayAdInfo);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class d implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ S2 b;
        final /* synthetic */ AbstractC4860m3 c;
        final /* synthetic */ Long d;

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Ja ja, S2 s2, AbstractC4860m3 abstractC4860m3) {
            Ja.a(ja, s2, abstractC4860m3, false, 4, (Object) null);
        }

        public d(S2 s2, AbstractC4860m3 abstractC4860m3, Long l) {
            this.b = s2;
            this.c = abstractC4860m3;
            this.d = l;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Ja.this.j().getViewTreeObserver().isAlive()) {
                Ja.this.j().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            boolean zA = Fg.a(Ja.this.j(), new Rect());
            Ja ja = Ja.this;
            if (zA) {
                ja.a().a(new u81(Ja.this, this.b, this.c, 1));
            } else {
                ja.a().a(new v81(Ja.this, this.b, this.d, 1));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Ja ja, S2 s2, Long l) {
            ja.a((Sa) new Ma(ja, s2, l));
        }
    }

    @Override // com.ironsource.Fa
    public void c() {
        this.m.c();
    }

    @Override // com.ironsource.Fa
    public void d() {
        this.m.d();
    }

    @NotNull
    public final V2 e() {
        return this.l;
    }

    @Override // com.ironsource.Fa
    public void f() {
        this.m.f();
    }

    @NotNull
    public final L0 g() {
        return this.j;
    }

    @NotNull
    public final InterfaceC5090z0 h() {
        return this.k;
    }

    @NotNull
    public final U2 i() {
        return this.f;
    }

    @NotNull
    public final C4699d3 j() {
        return this.b;
    }

    public final long k() {
        return this.c;
    }

    @NotNull
    public final Sa l() {
        return this.m;
    }

    @NotNull
    public final Ga m() {
        return this.e;
    }

    @NotNull
    public final Ff n() {
        return this.g;
    }

    @NotNull
    public final InterfaceC4986t4 o() {
        return this.h;
    }

    public final long p() {
        return this.d;
    }

    public final void q() {
        this.a.f().h().h("Banner view is not visible");
    }

    public Ja(@NotNull C4911p0 c4911p0, @NotNull C4699d3 c4699d3, long j, long j2, @NotNull Ga ga, @NotNull U2 u2, @NotNull Ff ff, @NotNull InterfaceC4986t4 interfaceC4986t4, boolean z) {
        c4911p0.getClass();
        c4699d3.getClass();
        ga.getClass();
        u2.getClass();
        ff.getClass();
        interfaceC4986t4.getClass();
        this.a = c4911p0;
        this.b = c4699d3;
        this.c = j;
        this.d = j2;
        this.e = ga;
        this.f = u2;
        this.g = ff;
        this.h = interfaceC4986t4;
        this.i = z;
        this.j = new b();
        this.k = new c();
        this.l = new a();
        this.m = new Ka(this, false, 2, null);
    }

    public final void a(@NotNull C5000u0 c5000u0, @NotNull S2 s2, @Nullable S2 s3, @NotNull AbstractC4860m3 abstractC4860m3, boolean z, @Nullable Long l) {
        c5000u0.getClass();
        s2.getClass();
        abstractC4860m3.getClass();
        s2.a(this.b.getViewBinder(), this.k);
        LevelPlayAdInfo levelPlayAdInfoC = c5000u0.c();
        if (levelPlayAdInfoC != null) {
            this.e.onAdLoaded(levelPlayAdInfoC);
        } else {
            IronLog.INTERNAL.error(C4911p0.a(this.a, "adInfo is null in handleLoadSuccess", (String) null, 2, (Object) null));
        }
        if (s3 != null) {
            s3.a(false);
        }
        if (z) {
            this.m = new Oa(this, s2);
        } else {
            a(s2, abstractC4860m3, l);
        }
    }

    public final void b(@NotNull Ga ga) {
        ga.getClass();
        this.e = ga;
    }

    @Override // com.ironsource.Fa
    public void b() {
        this.m.b();
    }

    public final void a(@NotNull L0 l0) {
        l0.getClass();
        this.j = l0;
    }

    public final void a(@NotNull InterfaceC5090z0 interfaceC5090z0) {
        interfaceC5090z0.getClass();
        this.k = interfaceC5090z0;
    }

    public final void a(@NotNull V2 v2) {
        v2.getClass();
        this.l = v2;
    }

    public final void a(@NotNull Sa sa) {
        sa.getClass();
        this.m = sa;
    }

    public /* synthetic */ Ja(C4911p0 c4911p0, C4699d3 c4699d3, long j, long j2, Ga ga, U2 u2, Ff ff, InterfaceC4986t4 interfaceC4986t4, boolean z, int i, e80 e80Var) {
        Ff ef;
        if ((i & 64) != 0) {
            ef = new Ef(null, null, null, 7, null);
        } else {
            ef = ff;
        }
        this(c4911p0, c4699d3, j, j2, ga, u2, ef, interfaceC4986t4, z);
    }

    public final void a(@NotNull String str) {
        str.getClass();
        this.a.f().h().f("Banner Reload Strategy - ".concat(str));
    }

    @NotNull
    public final C4911p0 a() {
        return this.a;
    }

    public final void a(@Nullable IronSourceError ironSourceError, @NotNull S2 s2, @NotNull AbstractC4860m3 abstractC4860m3, boolean z, boolean z2, @Nullable Long l) {
        s2.getClass();
        abstractC4860m3.getClass();
        this.e.a(ironSourceError);
        if (z2) {
            this.m = new Oa(this, s2);
        } else if (z) {
            a(s2, abstractC4860m3, l);
        } else {
            a(s2, abstractC4860m3, this.i);
        }
    }

    public final void a(@NotNull S2 s2, @NotNull AbstractC4860m3 abstractC4860m3, @Nullable Long l) {
        s2.getClass();
        abstractC4860m3.getClass();
        this.a.b(new r70(this, s2, abstractC4860m3, l, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ja ja, S2 s2, AbstractC4860m3 abstractC4860m3, Long l) {
        int i = 0;
        if (Fg.a(ja.b, new Rect())) {
            ja.a.a(new u81(ja, s2, abstractC4860m3, i));
        } else if (!ja.b.getViewTreeObserver().isAlive()) {
            ja.a.a(new v81(ja, s2, l, i));
        } else {
            ja.b.getViewTreeObserver().addOnGlobalLayoutListener(ja.new d(s2, abstractC4860m3, l));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ja ja, S2 s2, AbstractC4860m3 abstractC4860m3) {
        a(ja, s2, abstractC4860m3, false, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ja ja, S2 s2, Long l) {
        ja.m = new Ma(ja, s2, l);
    }

    public static /* synthetic */ void a(Ja ja, S2 s2, AbstractC4860m3 abstractC4860m3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        ja.a(s2, abstractC4860m3, z);
    }

    public final void a(@NotNull S2 s2, @NotNull AbstractC4860m3 abstractC4860m3, boolean z) {
        s2.getClass();
        abstractC4860m3.getClass();
        S2 s2A = this.f.a(false);
        Pa pa = new Pa(this, s2, s2A, this.h.a(), z);
        a(abstractC4860m3);
        this.m = pa;
        s2A.a(this.j);
    }

    private final void a(AbstractC4860m3 abstractC4860m3) {
        this.a.f().h().a(abstractC4860m3.c(), abstractC4860m3.b(), abstractC4860m3.a());
    }

    @Override // com.ironsource.Fa
    public void a(@NotNull Ga ga) {
        ga.getClass();
        this.e = ga;
    }
}
