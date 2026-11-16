package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ironsourceads.rewarded.RewardedAdInfo;
import defpackage.e80;
import defpackage.oa3;
import defpackage.y93;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.ae, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4656ae implements InterfaceC4774h6 {

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
    private final Map<String, C4656ae> i;

    @NotNull
    private RewardedAdInfo j;

    @Nullable
    private InterfaceC4674be k;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4656ae c4656ae) {
        InterfaceC4674be interfaceC4674be = c4656ae.k;
        if (interfaceC4674be != null) {
            interfaceC4674be.onRewardedAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4656ae c4656ae) {
        InterfaceC4674be interfaceC4674be = c4656ae.k;
        if (interfaceC4674be != null) {
            interfaceC4674be.onRewardedAdDismissed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C4656ae c4656ae) {
        InterfaceC4674be interfaceC4674be = c4656ae.k;
        if (interfaceC4674be != null) {
            interfaceC4674be.onRewardedAdShown();
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
        this.f.a(new oa3(this, 3));
    }

    @Override // com.ironsource.InterfaceC4774h6
    public void onAdInstanceDidDismiss() {
        this.i.remove(this.j.getAdId());
        InterfaceC4822k1.a.a.a(new InterfaceC4894o1[0]).a(this.d);
        this.f.a(new oa3(this, 1));
    }

    @Override // com.ironsource.InterfaceC4774h6
    public void onAdInstanceDidReward(@Nullable String str, int i) {
        C4876n1.u uVar = new C4876n1.u("Virtual Item");
        C4876n1.t tVar = new C4876n1.t(1);
        C4876n1.q qVar = new C4876n1.q("DefaultRewardedVideo");
        String strA = IronSourceUtils.a(System.currentTimeMillis(), this.a.g());
        strA.getClass();
        InterfaceC4822k1.a.a.c(uVar, tVar, qVar, new C4876n1.y(strA)).a(this.d);
        this.f.a(new oa3(this, 4));
    }

    @Override // com.ironsource.InterfaceC4774h6
    public void onAdInstanceDidShow() {
        Q8 q8 = this.g;
        IronSource.a aVar = IronSource.a.REWARDED_VIDEO;
        InterfaceC4822k1.a.a.b(new C4876n1.w(q8.a(aVar))).a(this.d);
        this.h.b(aVar);
        this.c.b("onAdInstanceDidShow");
        this.f.a(new oa3(this, 2));
    }

    public C4656ae(@NotNull R9 r9, @NotNull InterfaceC4660b0 interfaceC4660b0, @NotNull InterfaceC4770h2 interfaceC4770h2, @NotNull InterfaceC4947r1 interfaceC4947r1, @NotNull InterfaceC4958rc interfaceC4958rc, @NotNull InterfaceC4784hg interfaceC4784hg, @NotNull Q8 q8, @NotNull Q8.a aVar, @NotNull Map<String, C4656ae> map) {
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
        this.j = new RewardedAdInfo(strF, strE);
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
    public final RewardedAdInfo b() {
        return this.j;
    }

    @Nullable
    public final InterfaceC4674be c() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C4656ae c4656ae) {
        InterfaceC4674be interfaceC4674be = c4656ae.k;
        if (interfaceC4674be != null) {
            interfaceC4674be.onUserEarnedReward();
        }
    }

    public final void a(@Nullable InterfaceC4674be interfaceC4674be) {
        this.k = interfaceC4674be;
    }

    public final void a(@NotNull RewardedAdInfo rewardedAdInfo) {
        rewardedAdInfo.getClass();
        this.j = rewardedAdInfo;
    }

    @Override // com.ironsource.InterfaceC4774h6
    public void a(@Nullable String str) {
        a(C5095z5.a.c(new IronSourceError(0, str)));
    }

    private final void a(IronSourceError ironSourceError) {
        this.i.remove(this.j.getAdId());
        InterfaceC4822k1.a.a.a(new C4876n1.j(ironSourceError.getErrorCode()), new C4876n1.k(ironSourceError.getErrorMessage())).a(this.d);
        this.f.a(new y93(4, this, ironSourceError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4656ae c4656ae, IronSourceError ironSourceError) {
        InterfaceC4674be interfaceC4674be = c4656ae.k;
        if (interfaceC4674be != null) {
            interfaceC4674be.onRewardedAdFailedToShow(ironSourceError);
        }
    }

    public final void a() {
        InterfaceC4784hg.a(this.f, new oa3(this, 0), 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4656ae c4656ae) {
        InterfaceC4822k1.d.a.b().a(c4656ae.d);
        c4656ae.e.a(c4656ae.a);
    }

    public /* synthetic */ C4656ae(R9 r9, InterfaceC4660b0 interfaceC4660b0, InterfaceC4770h2 interfaceC4770h2, InterfaceC4947r1 interfaceC4947r1, InterfaceC4958rc interfaceC4958rc, InterfaceC4784hg interfaceC4784hg, Q8 q8, Q8.a aVar, Map map, int i, e80 e80Var) {
        this(r9, interfaceC4660b0, interfaceC4770h2, interfaceC4947r1, (i & 16) != 0 ? new C4976sc() : interfaceC4958rc, (i & 32) != 0 ? V7.a : interfaceC4784hg, (i & 64) != 0 ? Pb.w.d().s() : q8, (i & 128) != 0 ? Pb.w.a().i() : aVar, map);
    }
}
