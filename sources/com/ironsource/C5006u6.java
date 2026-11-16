package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import defpackage.af0;
import defpackage.ax0;
import defpackage.az2;
import defpackage.e80;
import defpackage.ks0;
import defpackage.pv1;
import defpackage.uf0;
import defpackage.vk3;
import defpackage.we3;
import defpackage.xe0;
import defpackage.zr0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.u6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC5065xb
public final class C5006u6 implements InterfaceC4881n6 {

    @NotNull
    private final Pb a;

    @NotNull
    private final T0 b;

    @NotNull
    private final AbstractC5054x0 c;

    @NotNull
    private InterfaceC5060x6 d;

    @NotNull
    private final C4705d9 e;

    @Nullable
    private final zr0 f;

    @NotNull
    private final Ff g;

    @NotNull
    private final InterfaceC4986t4 h;

    @Nullable
    private C4899o6 i;

    @Nullable
    private b j;

    @Nullable
    private a k;

    @NotNull
    private final Hg l;

    @Nullable
    private Ff.a m;

    @Nullable
    private Long n;

    /* JADX INFO: renamed from: com.ironsource.u6$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface a {
        void a(@NotNull C5006u6 c5006u6, @Nullable IronSourceError ironSourceError);

        void a(@NotNull C5006u6 c5006u6, @NotNull LevelPlayAdInfo levelPlayAdInfo);
    }

    /* JADX INFO: renamed from: com.ironsource.u6$b */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface b {
        void a(@NotNull C5006u6 c5006u6);

        void b(@NotNull C5006u6 c5006u6, @Nullable IronSourceError ironSourceError);

        void b(@NotNull C5006u6 c5006u6, @NotNull LevelPlayAdInfo levelPlayAdInfo);

        void c(@NotNull C5006u6 c5006u6, @NotNull LevelPlayAdInfo levelPlayAdInfo);
    }

    /* JADX INFO: renamed from: com.ironsource.u6$d */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class d implements Pg {
        public d() {
        }

        @Override // com.ironsource.Pg
        public void a(int i, String str) {
            Long lValueOf;
            long jLongValue;
            str.getClass();
            Long l = C5006u6.this.n;
            if (l != null) {
                C5006u6 c5006u6 = C5006u6.this;
                lValueOf = Long.valueOf(c5006u6.h.a() - l.longValue());
            } else {
                lValueOf = null;
            }
            Cb cbE = C5006u6.this.b.f().e();
            if (lValueOf != null) {
                jLongValue = lValueOf.longValue();
            } else {
                jLongValue = 0;
            }
            cbE.a(jLongValue, i, str, C5006u6.this.c.v());
            b bVar = C5006u6.this.j;
            if (bVar != null) {
                bVar.b(C5006u6.this, new IronSourceError(i, str));
            }
        }

        @Override // com.ironsource.Pg
        public void b(A a) {
            Long lValueOf;
            long jLongValue;
            a.getClass();
            Long l = C5006u6.this.n;
            if (l != null) {
                C5006u6 c5006u6 = C5006u6.this;
                lValueOf = Long.valueOf(c5006u6.h.a() - l.longValue());
            } else {
                lValueOf = null;
            }
            Cb cbE = C5006u6.this.b.f().e();
            if (lValueOf != null) {
                jLongValue = lValueOf.longValue();
            } else {
                jLongValue = 0;
            }
            cbE.a(jLongValue, C5006u6.this.c.v());
            C5006u6.this.h();
            b bVar = C5006u6.this.j;
            if (bVar != null) {
                bVar.b(C5006u6.this, a.e());
            }
        }

        @Override // com.ironsource.Pg
        public void a(A a) {
            a.getClass();
            C5006u6.this.b.f().a().e(C5006u6.this.c());
            C5006u6.this.h();
            b bVar = C5006u6.this.j;
            if (bVar != null) {
                bVar.c(C5006u6.this, a.e());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u6$e */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public /* synthetic */ class e extends ks0 implements zr0 {
        public e(Object obj) {
            super(2, obj, C5006u6.class, "createAdInstance", "createAdInstance(Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstanceData;Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstancePayload;)Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/FullscreenAdInstance;", 0);
        }

        @Override // defpackage.zr0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4863m6 invoke(B b, H h) {
            b.getClass();
            h.getClass();
            return ((C5006u6) this.receiver).a(b, h);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u6$c */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public /* synthetic */ C5006u6(Pb pb, T0 t0, AbstractC5054x0 abstractC5054x0, InterfaceC5060x6 interfaceC5060x6, C4705d9 c4705d9, Jg jg, zr0 zr0Var, Ff ff, InterfaceC4986t4 interfaceC4986t4, int i, e80 e80Var) {
        this(pb, t0, abstractC5054x0, interfaceC5060x6, c4705d9, (i & 32) != 0 ? null : jg, (i & 64) != 0 ? null : zr0Var, (i & 128) != 0 ? new Ef(null, null, null, 7, null) : ff, (i & 256) != 0 ? new InterfaceC4986t4.a() : interfaceC4986t4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c() {
        return this.c.m();
    }

    private final InterfaceC4940qb<az2> g() {
        if (!this.l.g()) {
            return new InterfaceC4940qb.a(new IronSourceError(509, "show called while ad unit is not ready to show"));
        }
        if (this.a.p().a(c(), b()).d()) {
            return new InterfaceC4940qb.a(new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, pv1.n("placement ", c(), " is capped")));
        }
        return this.a.g().a(this.c.b().c()).d() ? new InterfaceC4940qb.a(new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, pv1.n("adUnitId ", this.c.b().c(), " is capped"))) : new InterfaceC4940qb.b(az2.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        Ff.a aVar = this.m;
        if (aVar != null) {
            aVar.a();
        }
        long jB = this.b.b(b());
        IronLog.INTERNAL.verbose(C4911p0.a(this.b, "scheduling load expiration for " + b() + " in " + jB + " ms", (String) null, 2, (Object) null));
        Ff ff = this.g;
        uf0 uf0Var = xe0.b;
        this.m = ff.a(this, vk3.x(jB, af0.MILLISECONDS), new ax0(jB, 2));
    }

    @Nullable
    public final LevelPlayAdInfo e() {
        A aD = this.l.d();
        if (aD != null) {
            return aD.e();
        }
        return null;
    }

    public final void finalize() {
        IronLog.INTERNAL.verbose(C4911p0.a(this.b, "finalizing ad unit", (String) null, 2, (Object) null));
        Ff.a aVar = this.m;
        if (aVar != null) {
            aVar.a();
        }
    }

    private final Dd f() {
        int i = c.a[b().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return this.a.H();
        }
        return this.a.C();
    }

    private final void i() {
        String strC = c();
        if (strC.length() > 0) {
            this.a.b().b(strC, b());
            L3 l3A = this.a.p().a(strC, b());
            if (l3A.d()) {
                this.b.f().a().b(strC, l3A.e());
            }
        }
    }

    public final void a(@NotNull Activity activity, @NotNull a aVar) {
        activity.getClass();
        aVar.getClass();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(C4911p0.a(this.b, (String) null, (String) null, 3, (Object) null));
        this.k = aVar;
        this.b.f().a().a(activity, c());
        InterfaceC4940qb<az2> interfaceC4940qbG = g();
        if (interfaceC4940qbG instanceof InterfaceC4940qb.a) {
            IronSourceError ironSourceErrorB = ((InterfaceC4940qb.a) interfaceC4940qbG).b();
            ironLog.verbose(C4911p0.a(this.b, ironSourceErrorB.getErrorMessage(), (String) null, 2, (Object) null));
            this.b.f().a().a(c(), ironSourceErrorB.getErrorCode(), ironSourceErrorB.getErrorMessage(), this.l.f());
            aVar.a(this, ironSourceErrorB);
            return;
        }
        Ff.a aVar2 = this.m;
        if (aVar2 != null) {
            aVar2.a();
        }
        C4899o6 c4899o6 = new C4899o6(activity);
        this.i = c4899o6;
        this.l.a((J) c4899o6, false);
    }

    @Override // com.ironsource.InterfaceC4881n6
    public void b(@NotNull C4863m6 c4863m6) {
        Dd ddF;
        c4863m6.getClass();
        if (c4863m6.A() && (ddF = f()) != null) {
            ddF.a(this.c.b().c(), true);
        }
        this.b.f().a().b(c());
        this.l.b();
        this.i = null;
        this.d.onClosed();
    }

    @NotNull
    public final InterfaceC5060x6 d() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A b(C5006u6 c5006u6, B b2, H h) {
        b2.getClass();
        h.getClass();
        zr0 eVar = c5006u6.f;
        if (eVar == null) {
            eVar = new e(c5006u6);
        }
        C4863m6 c4863m6 = (C4863m6) eVar.invoke(b2, h);
        c4863m6.a(c5006u6);
        return c4863m6;
    }

    public C5006u6(@NotNull Pb pb, @NotNull T0 t0, @NotNull AbstractC5054x0 abstractC5054x0, @NotNull InterfaceC5060x6 interfaceC5060x6, @NotNull C4705d9 c4705d9, @Nullable Jg jg, @Nullable zr0 zr0Var, @NotNull Ff ff, @NotNull InterfaceC4986t4 interfaceC4986t4) {
        pb.getClass();
        t0.getClass();
        abstractC5054x0.getClass();
        interfaceC5060x6.getClass();
        c4705d9.getClass();
        ff.getClass();
        interfaceC4986t4.getClass();
        this.a = pb;
        this.b = t0;
        this.c = abstractC5054x0;
        this.d = interfaceC5060x6;
        this.e = c4705d9;
        this.f = zr0Var;
        this.g = ff;
        this.h = interfaceC4986t4;
        this.l = a(jg);
    }

    @Override // com.ironsource.E
    public void b(@NotNull A a2) {
        a2.getClass();
        this.l.d(a2);
        this.e.a(a2.e());
        this.b.f().a().g(c());
        this.a.i().b(com.unity3d.mediation.a.a(b()));
    }

    private final LevelPlay.AdFormat b() {
        return this.c.b().e();
    }

    public final void a(@NotNull InterfaceC5060x6 interfaceC5060x6) {
        interfaceC5060x6.getClass();
        this.d = interfaceC5060x6;
    }

    public final void a(@NotNull b bVar) {
        bVar.getClass();
        IronLog.INTERNAL.verbose(C4911p0.a(this.b, (String) null, (String) null, 3, (Object) null));
        this.j = bVar;
        this.n = Long.valueOf(this.h.a());
        this.b.a(new C4964s0(this.c.b()));
        we3 we3Var = new we3(this, 4);
        this.b.f().e().a(this.c.v());
        this.l.a(we3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4863m6 a(B b2, H h) {
        return new C4863m6(new T0(this.b, E0.b.PROVIDER), b2, h);
    }

    private final Hg a(Jg jg) {
        Pg pgA = a();
        if (jg != null) {
            return jg.a(pgA, this);
        }
        return new Hg(this.b, this.c, Pb.w.c().h().x(), pgA, f(), this);
    }

    private final Pg a() {
        return new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final az2 a(long j, C5006u6 c5006u6) {
        c5006u6.getClass();
        b bVar = c5006u6.j;
        if (bVar != null) {
            bVar.a(c5006u6);
        }
        c5006u6.l.a(new Z4.a(j));
        return az2.a;
    }

    @Override // com.ironsource.InterfaceC4881n6
    public void a(@NotNull C4863m6 c4863m6) {
        c4863m6.getClass();
        this.l.b();
        this.i = null;
        a aVar = this.k;
        if (aVar != null) {
            aVar.a(this, c4863m6.e());
        }
        i();
        this.a.l().b(this.c.b().c());
    }

    @Override // com.ironsource.E
    public void a(@NotNull A a2, @NotNull IronSourceError ironSourceError) {
        Dd ddF;
        a2.getClass();
        ironSourceError.getClass();
        IronLog.INTERNAL.verbose(C4911p0.a(this.b, ironSourceError.toString(), (String) null, 2, (Object) null));
        if (a2.A() && (ddF = f()) != null) {
            ddF.a(this.c.b().c(), true);
        }
        C4899o6 c4899o6 = this.i;
        Pd pdF = this.l.f();
        a(pdF);
        if (pdF == Pd.CAN_RECOVER && c4899o6 != null) {
            this.l.a((J) c4899o6, true);
            return;
        }
        this.l.b();
        this.i = null;
        this.b.f().a().a(c(), ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), pdF);
        a aVar = this.k;
        if (aVar != null) {
            aVar.a(this, ironSourceError);
        }
    }

    private final void a(Pd pd) {
        if (pd == Pd.CAN_RECOVER || pd == Pd.NO_LOADED_ADS) {
            this.b.f().h().a(pd);
        }
    }

    @Override // com.ironsource.InterfaceC4881n6
    public void a(@NotNull C4863m6 c4863m6, @NotNull LevelPlayReward levelPlayReward) {
        c4863m6.getClass();
        levelPlayReward.getClass();
        IronLog.INTERNAL.verbose(C4911p0.a(this.b, c4863m6.q(), (String) null, 2, (Object) null));
        this.d.a(levelPlayReward);
    }

    @Override // com.ironsource.E
    public void a(@NotNull A a2) {
        a2.getClass();
        this.b.f().a().a(c());
        this.d.e();
    }
}
