package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import defpackage.cp0;
import defpackage.dy;
import defpackage.fy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class l extends fy {
    public /* synthetic */ Object r;
    public int s;
    public m t;
    public final /* synthetic */ m u;
    public cp0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, dy dyVar) {
        super(dyVar);
        this.u = mVar;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.u.emit(null, this);
    }
}
