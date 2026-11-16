package com.inmobi.media;

import defpackage.az2;
import defpackage.bp0;
import defpackage.cp0;
import defpackage.dy;
import defpackage.dz;
import defpackage.np1;
import defpackage.xi2;

/* JADX INFO: renamed from: com.inmobi.media.jp, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4142jp implements bp0 {
    public final /* synthetic */ np1 a;

    public C4142jp(np1 np1Var) {
        this.a = np1Var;
    }

    @Override // defpackage.bp0
    public final Object collect(cp0 cp0Var, dy dyVar) throws Throwable {
        Object objCollect = ((xi2) this.a).collect(new C4114ip(cp0Var), dyVar);
        return objCollect == dz.a ? objCollect : az2.a;
    }
}
