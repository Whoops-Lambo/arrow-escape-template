package com.inmobi.media;

import defpackage.az2;
import defpackage.bp0;
import defpackage.cp0;
import defpackage.dy;
import defpackage.dz;
import defpackage.lp1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Oe implements bp0 {
    public final /* synthetic */ lp1 a;

    public Oe(lp1 lp1Var) {
        this.a = lp1Var;
    }

    @Override // defpackage.bp0
    public final Object collect(cp0 cp0Var, dy dyVar) {
        Object objCollect = this.a.collect(new Ne(cp0Var), dyVar);
        return objCollect == dz.a ? objCollect : az2.a;
    }
}
