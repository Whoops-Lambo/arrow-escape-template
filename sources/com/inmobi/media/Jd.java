package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import defpackage.az2;
import defpackage.dy;
import defpackage.dz;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Jd extends Qk implements Pi, Om, InterfaceC4005f {
    public volatile Nk c;

    @Override // com.inmobi.media.InterfaceC4005f
    public final Object a(dy dyVar) {
        Object objA;
        az2 az2Var = az2.a;
        Nk nk = this.c;
        InterfaceC4005f interfaceC4005f = nk instanceof InterfaceC4005f ? (InterfaceC4005f) nk : null;
        return (interfaceC4005f == null || (objA = interfaceC4005f.a(dyVar)) != dz.a) ? az2Var : objA;
    }

    @Override // com.inmobi.media.Om
    public final void d() {
        Nk nk = this.c;
        Om om = nk instanceof Om ? (Om) nk : null;
        if (om != null) {
            om.d();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Jd(Ed ed) {
        ed.getClass();
        C4531y c4531y = ed.a;
        c4531y.getClass();
        super(c4531y.a.e);
        this.c = new Ud(ed, this);
    }

    @Override // com.inmobi.media.Qk
    public final Nk a() {
        return this.c;
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
