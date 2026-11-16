package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class B5 implements Gb {

    @NotNull
    private final RewardedAdRequest a;

    @NotNull
    private final C4728ee b;

    @NotNull
    private final InterfaceC4947r1 c;

    @NotNull
    private final IronSourceError d;

    @NotNull
    public final IronSourceError a() {
        return this.d;
    }

    @Override // com.ironsource.Gb
    public void start() {
        C5041w5 c5041w5 = new C5041w5(this.c, this.a.getAdId$mediationsdk_release(), this.a.getProviderName$mediationsdk_release());
        c5041w5.a();
        c5041w5.a(this.d);
        this.b.a(this.d);
    }

    public B5(@NotNull RewardedAdRequest rewardedAdRequest, @NotNull C4728ee c4728ee, @NotNull InterfaceC4947r1 interfaceC4947r1, @NotNull IronSourceError ironSourceError) {
        rewardedAdRequest.getClass();
        c4728ee.getClass();
        interfaceC4947r1.getClass();
        ironSourceError.getClass();
        this.a = rewardedAdRequest;
        this.b = c4728ee;
        this.c = interfaceC4947r1;
        this.d = ironSourceError;
    }
}
