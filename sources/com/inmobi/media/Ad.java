package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Ad extends AbstractC4061h implements Pi, Om, Fq, InterfaceC4030fo {
    public volatile Nk c;

    @Override // com.inmobi.media.Fq
    public final String a(int i, double d) {
        Fd fd;
        String strA;
        Nk nk = this.c;
        if (nk instanceof Ce) {
            fd = ((Ce) nk).j;
        } else if (nk instanceof C4299pe) {
            fd = ((C4299pe) nk).h;
        } else if (nk instanceof C4411tf) {
            fd = ((C4411tf) nk).f;
        } else {
            fd = nk instanceof C4547yf ? ((C4547yf) nk).a : null;
        }
        return (fd == null || (strA = fd.a(i, d)) == null) ? "Ad not ready for Win/Loss notification. AdUnit must be inflated first." : strA;
    }

    @Override // com.inmobi.media.InterfaceC4030fo
    public final void b() {
        Nk nk = this.c;
        InterfaceC4030fo interfaceC4030fo = nk instanceof InterfaceC4030fo ? (InterfaceC4030fo) nk : null;
        if (interfaceC4030fo != null) {
            interfaceC4030fo.b();
        }
    }

    @Override // com.inmobi.media.Om
    public final void d() {
        Nk nk = this.c;
        Om om = nk instanceof Om ? (Om) nk : null;
        if (om != null) {
            om.d();
        }
    }

    @Override // com.inmobi.media.InterfaceC4030fo
    public final void f() {
        Nk nk = this.c;
        InterfaceC4030fo interfaceC4030fo = nk instanceof InterfaceC4030fo ? (InterfaceC4030fo) nk : null;
        if (interfaceC4030fo != null) {
            interfaceC4030fo.f();
        }
    }

    @Override // com.inmobi.media.InterfaceC4030fo
    public final void h() {
        Nk nk = this.c;
        InterfaceC4030fo interfaceC4030fo = nk instanceof InterfaceC4030fo ? (InterfaceC4030fo) nk : null;
        if (interfaceC4030fo != null) {
            interfaceC4030fo.h();
        }
    }

    @Override // com.inmobi.media.InterfaceC4030fo
    public final void i() {
        Nk nk = this.c;
        InterfaceC4030fo interfaceC4030fo = nk instanceof InterfaceC4030fo ? (InterfaceC4030fo) nk : null;
        if (interfaceC4030fo != null) {
            interfaceC4030fo.i();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ad(C4314q1 c4314q1, Hd hd) {
        super(c4314q1.e);
        c4314q1.getClass();
        hd.getClass();
        this.c = new Td(c4314q1, hd, this);
    }

    @Override // com.inmobi.media.Qk
    public final Nk a() {
        return this.c;
    }

    @Override // com.inmobi.media.Fq
    public final String a(double d) {
        Fd fd;
        String strA;
        Nk nk = this.c;
        if (nk instanceof Ce) {
            fd = ((Ce) nk).j;
        } else if (nk instanceof C4299pe) {
            fd = ((C4299pe) nk).h;
        } else if (nk instanceof C4411tf) {
            fd = ((C4411tf) nk).f;
        } else {
            fd = nk instanceof C4547yf ? ((C4547yf) nk).a : null;
        }
        return (fd == null || (strA = fd.a(d)) == null) ? "Ad not ready for Win/Loss notification. AdUnit must be inflated first." : strA;
    }

    @Override // com.inmobi.media.InterfaceC4030fo
    public final void a(boolean z) {
        Nk nk = this.c;
        InterfaceC4030fo interfaceC4030fo = nk instanceof InterfaceC4030fo ? (InterfaceC4030fo) nk : null;
        if (interfaceC4030fo != null) {
            interfaceC4030fo.a(z);
        }
    }

    @Override // com.inmobi.media.Pi
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        inMobiNativeViewData.getClass();
        Nk nk = this.c;
        Pi pi = nk instanceof Pi ? (Pi) nk : null;
        if (pi != null) {
            pi.a(inMobiNativeViewData);
        }
    }

    @Override // com.inmobi.media.Qk
    public final void a(Nk nk) {
        nk.getClass();
        this.c = nk;
    }
}
