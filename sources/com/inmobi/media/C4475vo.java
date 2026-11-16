package com.inmobi.media;

import defpackage.az2;
import defpackage.bp0;
import defpackage.cp0;
import defpackage.dy;
import defpackage.dz;

/* JADX INFO: renamed from: com.inmobi.media.vo, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4475vo implements bp0 {
    public final /* synthetic */ bp0 a;

    public C4475vo(bp0 bp0Var) {
        this.a = bp0Var;
    }

    @Override // defpackage.bp0
    public final Object collect(cp0 cp0Var, dy dyVar) {
        Object objCollect = this.a.collect(new C4448uo(cp0Var), dyVar);
        return objCollect == dz.a ? objCollect : az2.a;
    }
}
