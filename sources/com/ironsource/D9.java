package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdInfo;
import defpackage.d40;
import defpackage.e80;
import defpackage.g20;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class D9 implements InterfaceC4774h6 {

    @NotNull
    private R9 a;

    @NotNull
    private InterfaceC4660b0 b;

    @NotNull
    private InterfaceC4770h2 c;

    @NotNull
    private InterfaceC4947r1 d;

    @NotNull
    private InterfaceC4958rc e;

    @NotNull
    private InterfaceC4784hg f;

    @NotNull
    private Q8 g;

    @NotNull
    private Q8.a h;

    @NotNull
    private final Map<String, D9> i;

    @NotNull
    private InterstitialAdInfo j;

    @Nullable
    private E9 k;

    @Override // com.ironsource.InterfaceC4774h6
    public void onAdInstanceDidReward(@Nullable String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(D9 d9) {
        E9 e9 = d9.k;
        if (e9 != null) {
            e9.onAdInstanceDidClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(D9 d9) {
        E9 e9 = d9.k;
        if (e9 != null) {
            e9.onAdInstanceDidDismiss();
        }
    }

    public final boolean d() {
        boolean zA = this.b.a(this.a);
        InterfaceC4822k1.a.a.a(zA).a(this.d);
        return zA;
    }

    @Override // com.ironsource.InterfaceC4774h6
    public void onAdInstanceDidBecomeVisible() {
        InterfaceC4822k1.a.a.f(new InterfaceC4894o1[0]).a(this.d);
    }

    @Override // com.ironsource.InterfaceC4774h6
    public void onAdInstanceDidClick() {
        InterfaceC4822k1.a.a.a().a(this.d);
        this.f.a(new d40(this, 3));
    }

    @Override // com.ironsource.InterfaceC4774h6
    public void onAdInstanceDidDismiss() {
        this.i.remove(this.j.getAdId());
        InterfaceC4822k1.a.a.a(new InterfaceC4894o1[0]).a(this.d);
        this.f.a(new d40(this, 2));
    }

    @Override // com.ironsource.InterfaceC4774h6
    public void onAdInstanceDidShow() {
        Q8 q8 = this.g;
        IronSource.a aVar = IronSource.a.INTERSTITIAL;
        InterfaceC4822k1.a.a.b(new C4876n1.w(q8.a(aVar))).a(this.d);
        this.h.b(aVar);
        this.c.b("onAdInstanceDidShow");
        this.f.a(new d40(this, 0));
    }

    public D9(@NotNull R9 r9, @NotNull InterfaceC4660b0 interfaceC4660b0, @NotNull InterfaceC4770h2 interfaceC4770h2, @NotNull InterfaceC4947r1 interfaceC4947r1, @NotNull InterfaceC4958rc interfaceC4958rc, @NotNull InterfaceC4784hg interfaceC4784hg, @NotNull Q8 q8, @NotNull Q8.a aVar, @NotNull Map<String, D9> map) {
        r9.getClass();
        interfaceC4660b0.getClass();
        interfaceC4770h2.getClass();
        interfaceC4947r1.getClass();
        interfaceC4958rc.getClass();
        interfaceC4784hg.getClass();
        q8.getClass();
        aVar.getClass();
        map.getClass();
        this.a = r9;
        this.b = interfaceC4660b0;
        this.c = interfaceC4770h2;
        this.d = interfaceC4947r1;
        this.e = interfaceC4958rc;
        this.f = interfaceC4784hg;
        this.g = q8;
        this.h = aVar;
        this.i = map;
        String strF = r9.f();
        strF.getClass();
        String strE = this.a.e();
        strE.getClass();
        this.j = new InterstitialAdInfo(strF, strE);
        C4738f6 c4738f6 = new C4738f6();
        this.a.a(c4738f6);
        c4738f6.a(this);
    }

    public final void a(@NotNull Activity activity) {
        activity.getClass();
        this.i.put(this.j.getAdId(), this);
        if (!this.b.a(this.a)) {
            a(C5095z5.a.t());
        } else {
            InterfaceC4822k1.a.a.d(new InterfaceC4894o1[0]).a(this.d);
            this.b.a(activity, this.a);
        }
    }

    public final void finalize() {
        a();
    }

    @NotNull
    public final InterstitialAdInfo b() {
        return this.j;
    }

    @Nullable
    public final E9 c() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(D9 d9) {
        E9 e9 = d9.k;
        if (e9 != null) {
            e9.onAdInstanceDidShow();
        }
    }

    public final void a(@Nullable E9 e9) {
        this.k = e9;
    }

    public final void a(@NotNull InterstitialAdInfo interstitialAdInfo) {
        interstitialAdInfo.getClass();
        this.j = interstitialAdInfo;
    }

    @Override // com.ironsource.InterfaceC4774h6
    public void a(@Nullable String str) {
        a(C5095z5.a.c(new IronSourceError(0, str)));
    }

    private final void a(IronSourceError ironSourceError) {
        this.i.remove(this.j.getAdId());
        InterfaceC4822k1.a.a.a(new C4876n1.j(ironSourceError.getErrorCode()), new C4876n1.k(ironSourceError.getErrorMessage())).a(this.d);
        this.f.a(new g20(12, this, ironSourceError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(D9 d9, IronSourceError ironSourceError) {
        E9 e9 = d9.k;
        if (e9 != null) {
            e9.onAdInstanceDidFailedToShow(ironSourceError);
        }
    }

    public final void a() {
        InterfaceC4784hg.a(this.f, new d40(this, 1), 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(D9 d9) {
        InterfaceC4822k1.d.a.b().a(d9.d);
        d9.e.a(d9.a);
    }

    public /* synthetic */ D9(R9 r9, InterfaceC4660b0 interfaceC4660b0, InterfaceC4770h2 interfaceC4770h2, InterfaceC4947r1 interfaceC4947r1, InterfaceC4958rc interfaceC4958rc, InterfaceC4784hg interfaceC4784hg, Q8 q8, Q8.a aVar, Map map, int i, e80 e80Var) {
        this(r9, interfaceC4660b0, interfaceC4770h2, interfaceC4947r1, (i & 16) != 0 ? new C4976sc() : interfaceC4958rc, (i & 32) != 0 ? V7.a : interfaceC4784hg, (i & 64) != 0 ? Pb.w.d().s() : q8, (i & 128) != 0 ? Pb.w.a().i() : aVar, map);
    }
}
