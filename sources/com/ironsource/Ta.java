package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import defpackage.az2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC5065xb
public final class Ta implements Fa {

    @NotNull
    private final C4911p0 a;

    @NotNull
    private final C4699d3 b;

    @NotNull
    private final U2 c;

    @Nullable
    private Ga d;

    @NotNull
    private Ya e;

    @Nullable
    private S2 f;

    @NotNull
    private final L0 g;

    @NotNull
    private final InterfaceC5090z0 h;

    @NotNull
    private final V2 i;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a implements V2 {
        public a() {
        }

        public void a() {
            Ga gaM = Ta.this.m();
            if (gaM != null) {
                gaM.onAdLeftApplication();
            }
        }

        public void b() {
            Ga gaM = Ta.this.m();
            if (gaM != null) {
                gaM.k();
            }
        }

        public void c() {
            Ga gaM = Ta.this.m();
            if (gaM != null) {
                gaM.i();
            }
        }

        @Override // com.ironsource.J0
        public void e() {
            Ga gaM = Ta.this.m();
            if (gaM != null) {
                gaM.onAdClicked();
            }
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
            Ta.this.l().b(ironSourceError);
        }

        @Override // com.ironsource.L0
        public void a(C5000u0 c5000u0) {
            c5000u0.getClass();
            Ta.this.l().a(c5000u0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class c implements InterfaceC5090z0 {
        public c() {
        }

        @Override // com.ironsource.InterfaceC5090z0
        public void c(IronSourceError ironSourceError) {
            Ga gaM = Ta.this.m();
            if (gaM != null) {
                gaM.d(ironSourceError);
            }
        }

        @Override // com.ironsource.InterfaceC5090z0
        public void a(LevelPlayAdInfo levelPlayAdInfo) {
            levelPlayAdInfo.getClass();
            Ga gaM = Ta.this.m();
            if (gaM != null) {
                gaM.onAdDisplayed(levelPlayAdInfo);
            }
        }
    }

    @Override // com.ironsource.Fa
    public void d() {
    }

    @Override // com.ironsource.Fa
    public void f() {
    }

    @Override // com.ironsource.Fa
    public void b() {
        this.e.b();
    }

    @Override // com.ironsource.Fa
    public void c() {
        this.e.c();
    }

    @NotNull
    public final V2 e() {
        return this.i;
    }

    @NotNull
    public final L0 g() {
        return this.g;
    }

    @NotNull
    public final InterfaceC5090z0 h() {
        return this.h;
    }

    @NotNull
    public final U2 i() {
        return this.c;
    }

    @NotNull
    public final C4699d3 j() {
        return this.b;
    }

    @Nullable
    public final S2 k() {
        return this.f;
    }

    @NotNull
    public final Ya l() {
        return this.e;
    }

    @Nullable
    public final Ga m() {
        return this.d;
    }

    public Ta(@NotNull C4911p0 c4911p0, @NotNull C4699d3 c4699d3, @NotNull U2 u2) {
        c4911p0.getClass();
        c4699d3.getClass();
        u2.getClass();
        this.a = c4911p0;
        this.b = c4699d3;
        this.c = u2;
        this.e = new Ua(this);
        this.g = new b();
        this.h = new c();
        this.i = new a();
    }

    public final void a(@NotNull C5000u0 c5000u0, @NotNull S2 s2) {
        Ga ga;
        c5000u0.getClass();
        s2.getClass();
        s2.a(this.b.getViewBinder(), this.h);
        LevelPlayAdInfo levelPlayAdInfoC = c5000u0.c();
        if (levelPlayAdInfoC != null && (ga = this.d) != null) {
            ga.onAdLoaded(levelPlayAdInfoC);
        }
    }

    public final void b(@Nullable Ga ga) {
        this.d = ga;
    }

    public final void a(@NotNull Ya ya) {
        ya.getClass();
        this.e = ya;
    }

    public final void a(@Nullable S2 s2) {
        this.f = s2;
    }

    public final void a(@NotNull String str) {
        str.getClass();
        this.a.f().h().f("Banner Single Ad Unit Strategy - ".concat(str));
    }

    @NotNull
    public final C4911p0 a() {
        return this.a;
    }

    public final void a(@Nullable IronSourceError ironSourceError) {
        Ga ga = this.d;
        if (ga != null) {
            ga.a(ironSourceError);
        }
    }

    @Override // com.ironsource.Fa
    public void a(@NotNull Ga ga) {
        ga.getClass();
        this.d = ga;
    }
}
