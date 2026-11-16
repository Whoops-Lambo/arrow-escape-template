package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import defpackage.az2;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC5065xb
public final class Ea extends AbstractC4856m implements V2, Ga {

    @NotNull
    private final C4911p0 b;

    @NotNull
    private final Q2 c;

    @NotNull
    private final C4705d9 d;

    @NotNull
    private final WeakReference<H2> e;

    @NotNull
    private LevelPlayAdInfo f;

    @NotNull
    private final Fa g;

    private final U2 m() {
        return new defpackage.t5(this, 29);
    }

    private final LevelPlayAdInfo n() {
        String string = this.c.b().toString();
        string.getClass();
        String strC = this.c.c();
        String string2 = this.c.a().toString();
        string2.getClass();
        return new LevelPlayAdInfo(string, strC, string2, null, null, null, null, com.safedk.android.analytics.brandsafety.b.v, null);
    }

    @Override // com.ironsource.Ga
    public void a(@Nullable IronSourceError ironSourceError) {
        H2 h2 = this.e.get();
        if (h2 != null) {
            String string = this.c.b().toString();
            string.getClass();
            h2.a(new LevelPlayAdError(ironSourceError, string, this.c.c()));
        }
    }

    public final void b() {
        this.g.b();
    }

    public final void c() {
        this.g.c();
    }

    @Override // com.ironsource.Ga
    public void d(@Nullable IronSourceError ironSourceError) {
        H2 h2 = this.e.get();
        if (h2 != null) {
            LevelPlayAdInfo levelPlayAdInfo = this.f;
            String string = this.c.b().toString();
            string.getClass();
            h2.a(levelPlayAdInfo, new LevelPlayAdError(ironSourceError, string, this.c.c()));
        }
    }

    public final void f() {
        this.g.f();
    }

    @Override // com.ironsource.Ga
    public void i() {
        H2 h2 = this.e.get();
        if (h2 != null) {
            h2.a(this.f);
        }
    }

    @Override // com.ironsource.Ga
    public void k() {
        H2 h2 = this.e.get();
        if (h2 != null) {
            h2.c(this.f);
        }
    }

    @Override // com.ironsource.Ga
    public void onAdClicked() {
        H2 h2 = this.e.get();
        if (h2 != null) {
            h2.d(this.f);
        }
    }

    @Override // com.ironsource.Ga
    public void onAdLeftApplication() {
        H2 h2 = this.e.get();
        if (h2 != null) {
            h2.e(this.f);
        }
    }

    public Ea(@NotNull H2 h2, @NotNull C4911p0 c4911p0, @NotNull Q2 q2, @NotNull C4699d3 c4699d3, @NotNull C4705d9 c4705d9) {
        h2.getClass();
        c4911p0.getClass();
        q2.getClass();
        c4699d3.getClass();
        c4705d9.getClass();
        this.b = c4911p0;
        this.c = q2;
        this.d = c4705d9;
        this.e = new WeakReference<>(h2);
        this.f = n();
        this.g = Za.a(Za.a, c4911p0, c4699d3, c4911p0.d(q2.c()), this, m(), null, 32, null);
    }

    @Override // com.ironsource.J0
    public void e() {
        onAdClicked();
    }

    @Override // com.ironsource.V2
    public /* bridge */ /* synthetic */ az2 g() {
        o();
        return az2.a;
    }

    @Override // com.ironsource.V2
    public /* bridge */ /* synthetic */ az2 h() {
        q();
        return az2.a;
    }

    @Override // com.ironsource.V2
    public /* bridge */ /* synthetic */ az2 j() {
        p();
        return az2.a;
    }

    public void o() {
        onAdLeftApplication();
    }

    @Override // com.ironsource.Ga
    public void onAdDisplayed(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.f = levelPlayAdInfo;
        H2 h2 = this.e.get();
        if (h2 != null) {
            h2.b(this.f);
        }
    }

    @Override // com.ironsource.Ga
    public void onAdLoaded(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.f = levelPlayAdInfo;
        H2 h2 = this.e.get();
        if (h2 != null) {
            h2.a(levelPlayAdInfo, false);
        }
    }

    public void p() {
        k();
    }

    public void q() {
        i();
    }

    private final S2 a(C4911p0 c4911p0, Q2 q2, boolean z) {
        IronLog.INTERNAL.verbose();
        return new S2(c4911p0, T2.A.a(q2, l().a(), z), this, this.d);
    }

    public final void d() {
        this.g.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S2 a(Ea ea, boolean z) {
        return ea.a(ea.b, ea.c, z);
    }
}
