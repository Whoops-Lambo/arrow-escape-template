package com.inmobi.media;

import defpackage.cm2;
import defpackage.cz;
import defpackage.gd1;
import defpackage.np1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Ee extends P2 {
    public final Ge h;
    public final gd1 i;

    public static final Pp a(Ee ee) {
        Ge ge = ee.h;
        ge.getClass();
        return new Pp(new Oh(ee.a, new Qh(ee.b.a), ge), new Rp(ee.a, ee.b.d));
    }

    @Override // com.inmobi.media.P2
    public final Pp c() {
        return (Pp) this.i.getValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Ee(cz czVar, C4179l6 c4179l6, np1 np1Var) {
        czVar.getClass();
        c4179l6.getClass();
        np1Var.getClass();
        Ip ip = c4179l6.a;
        Lp lp = c4179l6.b;
        super(czVar, ip, lp, np1Var);
        this.h = new Ge(new Xp(lp.b, lp.c), this.g.c);
        this.i = new cm2(new defpackage.s5(this, 21));
    }
}
