package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import defpackage.dy;
import defpackage.fy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class j extends fy {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ e t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(e eVar, dy dyVar) {
        super(dyVar);
        this.t = eVar;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.t.emit(null, this);
    }
}
