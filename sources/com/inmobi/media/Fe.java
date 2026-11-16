package com.inmobi.media;

import defpackage.bp0;
import defpackage.cz;
import defpackage.np1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Fe implements InterfaceC3987e9 {
    public final InterfaceC3987e9 a;

    @Override // com.inmobi.media.InterfaceC3987e9
    public final void a() {
        this.a.a();
    }

    @Override // com.inmobi.media.InterfaceC3987e9
    public final bp0 b() {
        return this.a.b();
    }

    public Fe(cz czVar, Vc vc, np1 np1Var) {
        InterfaceC3987e9 je;
        czVar.getClass();
        vc.getClass();
        np1Var.getClass();
        if (vc instanceof C4179l6) {
            je = new Ee(czVar, (C4179l6) vc, np1Var);
        } else if (vc instanceof C3920bp) {
            je = new Je((C3920bp) vc);
        } else {
            io.p071bidmachine.ads.networks.adaptiverendering.e.b();
            throw null;
        }
        this.a = je;
    }
}
