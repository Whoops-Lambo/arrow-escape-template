package io.p071bidmachine.rendering.internal.meanbackground;

import android.graphics.Bitmap;
import defpackage.fy;
import defpackage.sy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class u extends fy {
    public Object r;
    public sy s;
    public Bitmap t;
    public /* synthetic */ Object u;
    public final /* synthetic */ w v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar, fy fyVar) {
        super(fyVar);
        this.v = wVar;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.a(null, null, this);
    }
}
