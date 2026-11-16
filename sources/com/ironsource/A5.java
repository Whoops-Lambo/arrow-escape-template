package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class A5 implements Gb {

    @NotNull
    private final InterstitialAdRequest a;

    @NotNull
    private final H9 b;

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

    public A5(@NotNull InterstitialAdRequest interstitialAdRequest, @NotNull H9 h9, @NotNull InterfaceC4947r1 interfaceC4947r1, @NotNull IronSourceError ironSourceError) {
        interstitialAdRequest.getClass();
        h9.getClass();
        interfaceC4947r1.getClass();
        ironSourceError.getClass();
        this.a = interstitialAdRequest;
        this.b = h9;
        this.c = interfaceC4947r1;
        this.d = ironSourceError;
    }
}
