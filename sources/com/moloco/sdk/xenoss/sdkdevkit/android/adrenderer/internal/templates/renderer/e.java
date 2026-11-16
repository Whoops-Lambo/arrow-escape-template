package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r0;
import defpackage.dy;
import defpackage.fy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends fy {
    public r0 r;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e s;
    public /* synthetic */ Object t;
    public final /* synthetic */ r0 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r0 r0Var, dy dyVar) {
        super(dyVar);
        this.u = r0Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.a(null, this);
    }
}
